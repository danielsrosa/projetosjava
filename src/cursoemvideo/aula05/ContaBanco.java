package cursoemvideo.aula05;

public class ContaBanco {
	
	//Atributos da Classe
	
	private int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	
	
		
    //M�todo Construtor - Recebe o mesmo nome da Classe

    public ContaBanco() {
        this.saldo=0;
        this.status=false;
    }
	
	
    
    public void statusAtual() {
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------------------");
        
    }
    
    
	
	public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com Sucesso");
         
    }
	
	
	
	public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta tem dinheiro - N�o pode ser fechada");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta negativa - N�o pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
        
        
    }
	
	

	
	public void depositar(float v){
        if (this.getStatus()){
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Dep�sito realizado na conta " + this.getDono() + " Saldo total = " + this.getSaldo());
        } else {
            System.out.println("Imposs�vel depositar em uma conta fechada");
                    }

    }
	
	
	
	
	public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saldo realizado na conta de" + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente para saque");
            }
        } else {
            System.out.println("Imposs�vel sacar de uma conta fechada");
        }
          
    }
	
	
	
	
	public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {                     
        } else if (this.getSaldo() > 0){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
                System.out.println("Saldo Insuficiente");
        } 
	}
	
	
	
	
	
	
	
	//----------------------------------------------------------------------------
	//M�todos Acessadores e Modificadores
	//----------------------------------------------------------------------------
	
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	

}
