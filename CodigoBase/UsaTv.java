package eletrodomestico;

import io.InOut;

/*
 * Fazer uma classe AppTv que vai
 * 
 * Criar uma TV simples de 21 polegadas e 110 V, 
 * e uma do modelo SDX, de 110 V e 42 polegadas.
 * Ligue as duas TVs, coloque a TV1 no canal que o usuário solicitar
 * Aumente o volume da TV2 de 5 unidades
 * Desligue a TV1.
 * Verifique qual das TVs está ligada, mostre na tela que ela 
 * está ligada e desligue.
 */
public class UsaTv {

	public static void main(String[] args) {
		Tv001 tv1 = new Tv001(110, 30);
		TvSdx tv2 = new TvSdx(110, 50);
		int canal;
		
		tv1.ligaDesliga();
		tv2.ligaDesliga();
		canal = InOut.leInt("digite o canal");
		tv1.mudarCanal(canal);
		for (int i=1; i<= 5; i++) {
			tv2.aumentaVol();
		}
		tv1.ligaDesliga();
		

		if (tv1.isLigado()) {
			System.out.println("TV 1 esta ligada");
			tv1.ligaDesliga();
		}
		if (tv2.isLigado()) {
			System.out.println("TV 2 esta ligada");
			tv2.ligaDesliga();
		}


	}

}
