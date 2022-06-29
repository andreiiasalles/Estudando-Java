 class Conta {
	 private double saldo;
	 private int agencia;
	 private int numero;
	 public Cliente titular;
   
   

    void  deposita(double valor) {
    	this.saldo = this.saldo + valor;
    }
    
    public boolean saca(double valor) {
    	if (this.saldo >= valor) {
    		this.saldo = this.saldo -= valor;
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public boolean transfere (double valor, Conta destino) {
    	if (this.saldo >= valor) {
    		this.saldo -= valor;
    		destino.deposita(valor);
    		return true;
    	}else {
    		return false;
    	}
    }
    	public double getSaldo() { 
            return this.saldo;
    	
        }
    	public int getAgencia() {
    		return this.agencia;
    	}
    	public void setAgencia(int agencia) {
    		this.agencia = agencia;
    	}
    	public int getnumero() {
    		return this.numero;
    	}
    	public void setNumero(int novoNumero) {
    		this.numero = novoNumero;
    	}
 }
 