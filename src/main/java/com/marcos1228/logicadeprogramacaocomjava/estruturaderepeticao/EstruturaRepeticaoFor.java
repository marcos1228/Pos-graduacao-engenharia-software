package com.marcos1228.logicadeprogramacaocomjava.estruturaderepeticao;

public class EstruturaRepeticaoFor {
    public static void main(String[] args) {
//        A estrutura de repetição for é utilizada para repetir um bloco de código um número determinado de
//        vezes.Sua sintaxe segue a estrutura:

//        for (inicialização; condição; incremento) {
//            // Bloco de código a ser repetido
//        }

        // Repetir ou seja faz a interação
        for (int cont = 0; cont < 10; cont++) {
            System.out.println("oi " + cont);
        }

        int[] numeros = {10, 20, 30, 40};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
