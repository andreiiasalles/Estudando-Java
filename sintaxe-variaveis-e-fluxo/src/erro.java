
public class erro {
	
	    public static void main(String[] args) {
	        double salario = 3300.0;

	        /*     - De 1900.0 at� 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142.
	             - De 2800.00 at� 3751.0, o IR � de 15% e pode deduzir R$ 350.
	                - De 3751.00 at� 4664.00, o IR � de 22.5% e pode deduzir R$ 636.
	                - Acima de 4664.00, o IR � de 27.5% e pode deduzir R$ 1000.
	        */

	        if (salario >= 1900 && salario <= 2800) {
	            System.out.println("O seu IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142");
	        } else if (salario > 2800 && salario <= 3751) {
	            System.out.println("O seu IR � de 15% e pode deduzir R$ 350");
	        } else if (salario > 3750 && salario <= 4664.00) {
	            System.out.println("O seu IR � de 22.5% e pode deduzir R$ 636");
	        } else if (salario > 4664) {
	            System.out.println("O seu IR � de 27.5% e pode deduzir R$ 1000");
	        }
	    }
	}

