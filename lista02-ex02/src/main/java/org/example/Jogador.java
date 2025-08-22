package org.example;

public class Jogador {
    String nome;
    String sobrenome;
    String clube;
    String posicao;
    Short idade;

    Jogador(String nome, String sobrenome, String clube, String posicao, Short idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.clube = clube;
        this.posicao = posicao;
        this.idade = idade;
    }

    void exibeJogador() {
        System.out.println(this.nome + " " + this.sobrenome + " é um futebolista brasileiro de " + this.idade + " anos que atua como " + this.posicao + ". Atualmente defende o " + this.clube);
    }
}