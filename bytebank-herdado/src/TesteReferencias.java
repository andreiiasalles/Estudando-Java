
public  class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente ();
		
		
		
		g1.setName("Marcos");
		g1.setSalario(5000.0);
		g1.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.setRegistro("pkaskas");
	
		controle.registro(ev);
		controle.registro(d);
	
	System.out.println(controle.getSoma());
	}

}
