package eletrodomestico;
/*
 * A TV modelo 001 é uma TV simples, sem muitos recursos que quando 
 * acionarmos o comando ligar/desligar irá simplesmente ligar se estiver 
 * desligado ou desligar se estiver ligado. Como essa classe irá 
 * implementar a interface ControleRemoto, então, no corpo dela deve 
 * conter todos os métodos da interface.
 */
public class Tv001 extends Tv implements iControleRemoto {

	public Tv001(int voltagem, int tamanho) {
		super(voltagem, tamanho);
	}

	@Override
	public void mudarCanal(int num) {
		super.setCanal(num);
	}

	@Override
	public void aumentaVol() {
		if (super.getVolume()<100) {
			super.setVolume(getVolume()+1);
		}
	}

	@Override
	public void diminuiVol() {
		if (super.getVolume()>0) {
			super.setVolume(getVolume()-1);
		}
	}

	@Override
	public void ligaDesliga() {
		if (super.isLigado()) {
			super.desligar();
		}else {
			super.ligar();
		}
	}

}
