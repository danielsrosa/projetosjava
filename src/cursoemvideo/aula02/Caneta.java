package cursoemvideo.aula02;

public class Caneta {

	//Declaração dos atributos ou variaveis
	
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	public boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Uma caneta: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Carga: " + this.getCarga());
		System.out.println("Está tampada: " + this.getTampada());
	}
	
	
	public void rabiscar() {
		if (this.getTampada() == true) {
			System.out.println("ERRO: Não é possível rabiscar");
			
		} else {
			System.out.println("Estou Rabiscando");

		}
	}
	
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}
	
	
	
	//Metodos acessadores e modificadores
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean getTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	
	
}
