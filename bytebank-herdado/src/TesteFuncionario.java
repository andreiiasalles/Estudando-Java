public class TesteFuncionario {

        public static void main(String[] args) {
        		
        	Autenticavel cliente = new Cliente ();
                Gerente nico = new Gerente();
                nico.setName("Nico Steppat");
                nico.setCpf("223355646-9");
                nico.setSalario(2600.00);

                System.out.println(nico.getName());
                System.out.println(nico.getBonificacao());

                //nico.salario = 300.0;

        }
}