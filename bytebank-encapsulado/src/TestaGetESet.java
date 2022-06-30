
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1414, 33333);

		System.out.println(conta.getnumero());
	
		Cliente paulo = new Cliente(); 
        paulo.setNome("paulo silveira");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
	
	
	}
}
	