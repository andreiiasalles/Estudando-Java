
public class testaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		Conta conta2 = new Conta(1320, 24296);
		Conta conta3 = new Conta(1347, 24926);
		
		System.out.println(Conta.getTotal());
	}
}
