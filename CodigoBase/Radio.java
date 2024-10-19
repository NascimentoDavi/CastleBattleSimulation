package eletrodomestico;
/*
 * Faça uma classe Radio que herda de Eletrodomestico que 
 * contem os atributos:
 * banda (inteiro), volume (inteiro), sintonia(real)
 * 
 * além das constantes:
 * AM(1) e FM(2).
 * 
 * Faça seu construtor, os métodos gets e sets e implemente 
 * os métodos abstratos – ligar() e desligar().
 * 
 * Obs.: Ao desligar um Radio, a sintonia e o volume serão 
 * setados em zero. Ao ligar, a banda será setada em FM, 
 * a sintonia em 88.1 e o volume em 10. 
 */
public class Radio extends Eletrodomestico{
	private int banda, volume;
	private double sintonia;
	
	public static final int AM = 1;
	public static final int FM = 2;
	
	public Radio(int voltagem) {
		super(voltagem);
	}

	public int getBanda() {
		return banda;
	}

	public void setBanda(int banda) {
		this.banda = banda;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getSintonia() {
		return sintonia;
	}

	public void setSintonia(double sintonia) {
		this.sintonia = sintonia;
	}

	@Override
	public String toString() {
        String str = super.toString();
        if (super.isLigado()){
            str += "\nBanda: " + this.banda + "  Sintonia: " + this.sintonia +
                    "   Volume: " + this.volume;
        }
        return str;	
    }
	
	@Override
	public void ligar() {
		if (!this.isLigado()) {
			this.setLigado(true);
			this.banda = Radio.FM;
			this.sintonia = 88.1;
			this.volume = 10;
		}		
	}

	@Override
	public void desligar() {
		if ((this.isLigado())) {
			this.sintonia=0;
			this.volume=0;
			this.setLigado(false);
		}
	}
	
	
	
	

}
