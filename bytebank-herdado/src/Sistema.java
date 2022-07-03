
public class Sistema {
	
private int senha = 2222;
			
public void autentica(Autenticavel fg) {
	boolean auteticou = fg.autentica(this.senha);
	if(auteticou) {
		System.out.println("Pode entrar no sistema");
	} else {
		System.out.println("Não pode entrar no sistema");
		}
			
	}
		
}
	
	
	
