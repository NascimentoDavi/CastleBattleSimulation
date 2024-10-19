package C2;

import java.util.Scanner;
import java.util.ArrayList;

/*
    O seu grupo deve:
    1) Implementar cada uma dessas classes.
    2) Implementar um aplicativo que crie 2 castelos japoneses (com 15 samurais, 2 vidas e 2
    defesas) e 2 europeus (com 10 paladinos, 2 vidas e 3 defesas), armazene-os em uma 
    lista.
    Jogar até que 3 castelos sejam destruídos.
    O mecanismo do jogo é: 
    1. O primeiro castelo da lista (por exemplo C1) escolhe outro castelo (Por exemplo C2)
    para atacar (você pode pedir para o usuário ou escolher de modo aleatório)
    2. Ele sorteia um número de 0 a 10. Se tirar zero, ele passa a vez. Caso contrário, C1 
    destrói essa quantidade de guerreiros de C2. Em seguida, mostra na tela a 
    situação do castelo C2. 
    3. Agora é a vez do segundo castelo jogar. Ele deve escolher outro castelo para atacar
    e voltar ao passo 2.
    4. Após o último castelo da lista jogar, a vez volta para o primeiro castelo.
    Quando um castelo for completamente destruído, deve mostrar na tela a situação dele e a
    mensagem   “CASTELO   ___     DESTRUÍDO”,   então   ele   é   retirado   da   lista.   O   jogo   acaba
    quando  sobrar   apenas   um   castelo   na   lista,  que   será   o   vencedor   e   mostrará   na   tela
    “CASTELO ___ VENCEDOR”
 */

public class App {
    static Scanner scanner = new Scanner(System.in);
    static Dado dado = new Dado();

    public static void main(String[] args) throws Exception {
        ArrayList<Castelo> vetor = new ArrayList<Castelo>();

        preencher(vetor);
        jogar(vetor);
    }

    public static void preencher(ArrayList<Castelo> arr) {
        String str;
        for (int i = 0; i < 2; i++) {
            System.out.print("Nome do " + (i + 1) + "º Castelo Europeu: ");
            str = scanner.nextLine();
            arr.add(new Europeu(0, 0, str, 1));

            System.out.print("Nome do " + (i + 1) + "º Castelo Japones: ");
            str = scanner.nextLine();
            arr.add(new Japones(0, 0, str, 1));
        }
    }

    public static void jogar(ArrayList<Castelo> arr) {
        while (arr.size() > 1) {  // Continua o jogo até restar apenas um castelo
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("\nVez de Castelo: " + arr.get(i).getNome() + "\n");
                atacar(arr.get(i), arr);

                // Verifica se o jogo acabou
                if (arr.size() == 1) {
                    System.out.println("CASTELO " + arr.get(0).getNome() + " VENCEDOR!");
                    return;
                }
            }
        }
    }

    private static void atacar(Castelo castelo, ArrayList<Castelo> arr) {
        int i = 0, option, num;
        System.out.println("Escolha um castelo para atacar: ");
        for (Castelo item : arr) {
            System.out.println("Index: " + (arr.indexOf(item)) + " | Nome: " + item.getNome());
            i++;
        }

        System.out.print(": ");
        option = Integer.parseInt(scanner.nextLine());

        num = dado.lancar();
        System.out.println("Valor dado: " + num);

        if (num == 0) {
            System.out.println("Passa a vez...");
        } else {
            boolean destruido = !arr.get(option).ataque(num);  // Ataca e verifica se foi destruído
            System.out.println(arr.get(option).situacao());

            if (destruido) {
                System.out.println("CASTELO " + arr.get(option).getNome() + " DESTRUÍDO!");
                arr.remove(option);  // Remove o castelo da lista
            }
        }
    }
}
