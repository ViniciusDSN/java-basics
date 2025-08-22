package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = { "Lucas", "Pedro", "Gabriel", "Renato", "Bruno", "Jorge" };
        String[] sobrenomes = { "Araújo", "Júnior", "Silveira", "Pereira", "Alves", "Ribeiro" };
        String[] clubes = { "Criciúma", "Palmeiras", "Paysandu", "Vasco", "Internacional", "Joinville" };
        String[] posicoes = { "meia", "atacante", "goleiro", "centro-avante", "zagueiro", "lateral" };

        Random random = new Random();

        Integer indiceNome = random.nextInt(nomes.length);
        Integer indiceSobrenome = random.nextInt(sobrenomes.length);
        Integer indiceClube = random.nextInt(clubes.length);
        Integer indicePosicao = random.nextInt(posicoes.length);

        System.out.println("Quantos jogadores você deseja gerar? ");

        Scanner leitor = new Scanner(System.in);
        int num = Integer.parseInt(leitor.nextLine());

        Jogador[] jogadores = new Jogador[num];

        for (int i = 0; i < num; i++) {
            System.out.println(jogadores[0].nome + " " + jogadores[0].sobrenome + " é um futebolista brasileiro de " + jogadores[0].idade + " anos que atua como " + jogadores[0].posicao + ". Atualmente defende o " + jogadores[0].clube);
        }

        /*
        String nome = nomes[indiceNome];
        String sobrenome = sobrenomes[indiceSobrenome];
        String clube = clubes[indiceClube];
        String posicao = posicoes[indicePosicao];
        Short idade = (short) random.nextInt(18, 65);
         */

    }
}