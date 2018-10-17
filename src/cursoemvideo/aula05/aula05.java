package cursoemvideo.aula05;

public class aula05 {

	public static void main(String[] args) {
		
		 ContaBanco p1 = new ContaBanco();
	        p1.setNumConta(1979);
	        p1.setDono("Daniel Rosa");
	        p1.abrirConta("CC");
	        p1.depositar(2000);
	        p1.sacar(5000);
	        p1.statusAtual();
		

	}

}
