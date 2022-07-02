
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente ();
		
		Funcionario f = new Funcionario();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		f.setSalario(2500.0);
		
		Designer d = new Designer();
		f.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(f);
		controle.registro(ev);
		controle.registro(d);
	
	System.out.println(controle.getSoma());
	}

}
