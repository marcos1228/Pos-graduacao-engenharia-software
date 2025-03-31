package com.marcos1228.logicadeprogramacaocomjava.estruturaderepeticao;

import java.util.Scanner;

public class EstruturaRepeticaoDowhile {
//    O do while
//    é uma
//    estrutura de
//    repetição que
//    garante que
//    o bloco
//    de código
//    seja executado
//    pelo menos
//    uma vez, independentemente
//    da condição.
//    Isso acontece
//    porque a
//    verificação da
//    condição ocorre
//    após a
//    execução do bloco .

    public static void main(String[] args) {
        int opcao;
         do {
             System.out.println("Digite um valor ou 99 para sair!");
             Scanner entrada = new Scanner(System.in);
             opcao = entrada.nextInt();

         } while (opcao != 99);
    }
}
