package com.marcos1228.logicadeprogramacaocomjava.estruturaderepeticao;

import java.util.Scanner;

public class EstruturaRepeticaoWhile {
    //    Estrutura de
//    Repetição while
//    A estrutura
//    de repetição while
//    é utilizada
//    quando não
//    sabemos previamente
//    quantas vezes
//    o bloco
//    de código
//    será executado.
//    A repetição
//    ocorre enquanto
//    a condição
//    especificada for verdadeira .
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 99) {
            System.out.println("Digite um valor qualquer ou 99 para sair");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        }
    }
}
