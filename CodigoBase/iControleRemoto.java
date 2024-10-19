package eletrodomestico;
// interface nao pode ter atributos nem 
// metodos concretos. Todos os seus metodos
// sao automaticamente abstratos

public interface iControleRemoto {
	public void mudarCanal(int num);
	public void aumentaVol ();
	public void diminuiVol();
	public void ligaDesliga();
}
