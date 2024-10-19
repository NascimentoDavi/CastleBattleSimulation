package eletrodomestico;

import java.util.ArrayList;

/*
 * Faça um aplicativo que instancie
 * uma TV de 29 polegadas e 110 volts
 * um Radio de 110 volts.
 * uma MaquinaDeLavar de 110 volts
 * 
 * O aplicativo deve:
 * ligar todos os eletrodomésticos,
 * alterar o volume do radio para 15, a sintonia para 101.5 e a voltagem para 220,
 * alterar o canal da TV para 12
 * imprimir todos os Eletrodomesticos
 * desligar a MaquinaDeLavar
 */
public class UsaEletrodomestico {

	public static void main(String[] args) {
		ArrayList<Eletrodomestico> vetor = new ArrayList<Eletrodomestico>();
		
		preencher(vetor);
		ligar(vetor);
		volumeRadio (vetor);
		canalTv(vetor);
		imprimir(vetor);
		desligarLavadora(vetor);

	}

	private static void preencher(ArrayList<Eletrodomestico> vetor) {
		vetor.add(new Tv(110, 40));
		vetor.add(new Radio(110));
		vetor.add(new MaquinaDeLavar(110));
	}

	private static void ligar(ArrayList<Eletrodomestico> vetor) {
		for (Eletrodomestico e: vetor) {
			e.ligar();
		}
		
	}

	private static void volumeRadio(ArrayList<Eletrodomestico> vetor) {
		for (Eletrodomestico e: vetor) {
			if (e instanceof Radio) {
				Radio r = (Radio)e;
				r.setVolume(15);
				r.setSintonia(101.5);
				r.setVoltagem(220);
			}
		}
		
	}

	private static void canalTv(ArrayList<Eletrodomestico> vetor) {
		for (Eletrodomestico e: vetor) {
			if (e instanceof Tv) {
				Tv tv = (Tv)e;
				tv.setCanal(12);
			}
		}
		
	}

	private static void imprimir(ArrayList<Eletrodomestico> vetor) {
		for (Eletrodomestico e: vetor) {
			System.out.println(e.toString());
		}
		
	}

	private static void desligarLavadora(ArrayList<Eletrodomestico> vetor) {
		for (Eletrodomestico e: vetor) {
			if (e instanceof MaquinaDeLavar) {
				e.desligar();
			}
		}
		
	}

}
