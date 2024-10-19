package eletrodomestico;
/*
 * Faça uma classe abstrata Eletrodomestico que contem os atributos:
 * ligado (booleano)
 * voltagem (inteiro).
 * 
 * Faça seu construtor, os métodos gets (ou is) e sets.
 * Faça dois métodos abstratos – ligar() e desligar(), que não retornam nada.
 */
public abstract class Eletrodomestico {
	private boolean ligado;
	private int voltagem;
	
	public Eletrodomestico(int voltagem) {
		this.ligado = false;
		this.voltagem = voltagem;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	public abstract void ligar ();
	public abstract void desligar ();
	
	

}
