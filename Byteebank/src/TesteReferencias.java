
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
				primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta � R$ " + primeiraConta.saldo);
	
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta � R$ " + segundaConta.saldo);
	
		segundaConta.saldo +=100;
		System.out.println("Saldo da segunda conta � R$ " + segundaConta.saldo);
	
		System.out.println("Saldo da primeira conta � R$ " + primeiraConta.saldo); 
	
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} 
			System.out.println(primeiraConta);
			
			
		
	}
	
}
