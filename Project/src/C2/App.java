package C2;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static void preencher (ArrayList<Castelo> arr)
    {
        String str;
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Nome do " + (i+1) + "º Castelo Europeu: ");
            str = scanner.nextLine();
            arr.add(new Europeu(3, 2, str, 10));

            System.out.println("Nome do " + (i+1) + "º Castelo Japones: ");
            str = scanner.nextLine();
            arr.add(new Japones(2, 2, str, 15));
        }
    }

    public static void jogar (ArrayList<Castelo> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println("Vez de Castelo: " + arr.get(i).getNome());
            atacar(arr.get(i), arr);

        }
    }

    private static void atacar (Castelo castelo, ArrayList<Castelo> arr)
    {
        int i = 0, option, num;
        System.out.println("Escolha um castelo para atacar: ");
        for(Castelo item : arr) {
            if(item.getNome().equals(castelo.getNome())) {
                continue;
            } else {
                i++;
                System.out.println("Index: " + (arr.indexOf(arr.get(i)) + 1) + " | Nome: " + item.getNome());
            }
        }
        option = Integer.parseInt(scanner.nextLine());
        num = dado.lancar();
        if(num == 0)
        {
            System.out.println("Passa a vez...");
        } else {
            arr.get(option - 1).ataque(num);
            System.out.println(arr.get(i).situacao());
        }
    }
}
