// CURSO EM V�DEO 
//https://www.youtube.com/watch?v=x4JfzV0Wb5w&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=13



package cursoemvideo.aula06;

public class ControleRemoto implements Controlador {
   
	
	//Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    
    //M�todos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;    
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //M�todos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);
                
    }

    @Override
    public void abrirMenu() {
        System.out.println("------- M E N U --------");
        System.out.println("Est� ligado? " + this.getLigado());
        System.out.println("Est� tocando? " + this.getTocando());
        System.out.print("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println("__________________________");

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()+ 20);
            
        } else {
            System.out.println("TV DESLIGADA MAN�");
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado())
            this.setVolume(this.getVolume() - 5);
        
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }

    }
    
    
}
