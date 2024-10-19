package eletrodomestico;
/*
 * Faça uma classe TV que herda de Eletrodomestico que contem 
 * os atributos inteiros:
 * canal, volume, tamanho
 * 
 * Faça seu construtor, os métodos gets (ou is) e sets e 
 * implemente os métodos abstratos – ligar() e desligar(). 
 * 
 * Obs.: Ao desligar uma TV, o canal e o volume serão setados 
 * em zero. Ao ligar, o canal será setado em 1 e o volume em 10.
 */
public class Tv extends Eletrodomestico{
	private int canal, volume, tamanho;

	public Tv(int voltagem, int tamanho) {
		super(voltagem);
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
        String str = super.toString() + "\nTamanho: " + this.tamanho;
        if (super.isLigado()){
        	str += "\nCanal: " + this.canal + "  Volume: " + this.volume;
        }
        return str;	
	}

    /* implementacao dos metodos abstratos 
     * da classe Eletrodomestico*/
	@Override
	public void ligar() {
		if (!this.isLigado()) {
			this.setLigado(true);
			this.canal = 1;
			this.volume = 10;
		}
	}

	@Override
	public void desligar() {
		if ((this.isLigado())) {
			this.canal=0;
			this.volume=0;
			this.setLigado(false);
		}
		
	}
	
	
	
	
	

}
