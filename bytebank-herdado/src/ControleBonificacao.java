public class ControleBonificacao {
	private String registro;
    private double soma;

	public void registro(Funcionario f) {
		double boni = f.getBonificacao();
	    this.soma = this.soma + boni;
   
    }

    public String getRegistro() {
		return registro;
	}
    public double getSoma() {	
         return soma;
   }


	public void setRegistro(String registro) {
		this.registro = registro;
		
	}
  
        
}