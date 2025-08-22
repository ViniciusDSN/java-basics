package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        func1();
    }

    static void func1 () {
        String msg = "Insira os dados do seu cartão de crédito para ganhar robux de graça";
        System.out.println(msg);

        Scanner leitor = new Scanner(System.in);
        String var = leitor.nextLine();

        System.out.println("Você ganhou 5 robux! só deixa eu anotar o " + var + "pra testar um negócio aqui");
    }

    static void ex01 () {
        String msg = "Bem-vindo ao Sistema de Geração de Jogadores!";
        System.out.println(msg);
    }

    static void ex02 () {
        String nomeCompleto = "Mariana Silva";
        String cargo = "Analista de Sistemas";
        double salario = 4500;
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    static void ex03 () {
        String produto = "Teclado";
        int codigo = 12345;
        double preco = 99.9;
        boolean promocao = true;
        System.out.println("Produto: " + produto);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Promoção: " + promocao);
    }

    static void ex04 () {
        
    }
}