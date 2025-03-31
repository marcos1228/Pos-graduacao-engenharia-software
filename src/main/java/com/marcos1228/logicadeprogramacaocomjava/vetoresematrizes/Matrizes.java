package com.marcos1228.logicadeprogramacaocomjava.vetoresematrizes;

public class Matrizes {
//    Resumo sobre
//    Matrizes em
//    Java
//    Em Java, matrizes
//    são representadas
//    por arrays
//    multidimensionais,
//    sendo mais
//    comum o
//    uso de
//
//    arrays bidimensionais(int[][] matriz),que funcionam como tabelas (
//    linhas e
//    colunas).

    public static void main(String[] args) {
//        int[][] matriz = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        for (int i = 0; i < matriz.length; i++) { // Percorre as linhas
//            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println(); // Nova linha para formatação
//        }
        int valor;
        int[][] dados = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                dados[i][j] = j;


        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                System.out.println(dados[i][j]);


    }
}
