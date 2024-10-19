package eletrodomestico;
/*
 * O modelo SDX é uma TV mais moderna, que quando acionarmos o 
 * comando desligar irá apresentar uma mensagem dizendo "tchau!" 
 * e quando acionarmos o comando ligar irá apresentar uma 
 * mensagem dizendo "Olá!"
 */
public class TvSdx extends Tv001{
	
	public TvSdx(int voltagem, int tamanho) {
		super(voltagem, tamanho);
	}

	public void ligaDesliga() {
		if (this.isLigado()) {
			System.out.println("TCHAU!");
			super.desligar();
		} else {
			super.ligar();
			System.out.println("OLA!");
		}
	}
}
