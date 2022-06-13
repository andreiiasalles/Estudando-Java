
public class TesteExercicio {
	

	    public static void main(String[] args) {

	        double salario = 3750.0;

	        if(salario < 2600.0) {
	            System.out.println("A sua aliquota é de 15%");
	            System.out.println("Você pode deduzir até R$ 350");
	        } else {
	        if(salario < 3750.0) 
	            System.out.println("A sua aliquota é de 22,5%");
	            System.out.println("Você pode deduzir até R$ 636");
	        }
	    }
}

