package br.com.alura.leilao.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.dao.PagamentoDao;
import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Pagamento;
import br.com.alura.leilao.model.Usuario;


class GeradorDePagamentoTest {
	
	private GeradorDePagamento gerador;
	
	@Mock
	private PagamentoDao pagamentoDao;
	
	@Captor
	private ArgumentCaptor <Pagamento> captor;
	@Mock
	private Clock clock;
	
	 @BeforeEach
	    public void beforeEach() {
	    MockitoAnnotations.initMocks(this);
	    this.gerador = new GeradorDePagamento(pagamentoDao, clock);
	    }

	@Test
	void deveriaCriarPagamentoParaVencedorDoLeilao() {
		Leilao leilao = leiloes();
		Lance vencedor = leilao.getLanceVencedor();
		
		LocalDate data = LocalDate.of(2020, 12, 7);

		Instant instant = data.atStartOfDay(ZoneId.systemDefault()).toInstant();

		Mockito.when(clock.instant()).thenReturn(instant);
		Mockito.when(clock.getZone()).thenReturn(ZoneId.systemDefault());

		gerador.gerarPagamento(vencedor);
		
		Mockito.verify(pagamentoDao).salvar(captor.capture());
		
		Pagamento pagamento = captor.getValue();
		assertEquals(data.plusDays(1), pagamento.getVencimento());
		Assert.assertEquals(vencedor.getValor(), pagamento.getValor());
		Assert.assertFalse(pagamento.getPago());
		Assert.assertEquals(vencedor.getUsuario(), pagamento.getUsuario());
		Assert.assertEquals(leilao, pagamento.getLeilao());
	}
	
	   private Leilao leiloes() {
	        List<Leilao> lista = new ArrayList<>();

	        Leilao leilao = new Leilao("Celular",
	                        new BigDecimal("500"),
	                        new Usuario("Fulano"));

	        Lance lance = new Lance(new Usuario("Ciclano"),
	                        new BigDecimal("900"));

	        leilao.propoe(lance);
	        leilao.setLanceVencedor(lance);

	        return leilao;
	
	
	   }
}


