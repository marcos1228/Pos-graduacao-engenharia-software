package com.marcos1228.logicadeprogramacaocomjava.vetoresematrizes;

public class Exercicios {
    public static void main(String[] args) {
        int[] valores = {9,8,7,6,5};
        int aux;
        int count = 0;

        while (count < 2){
            aux = valores[count];
            valores[count] = valores[count+1];
            valores[count+1] = aux;
            count += 1;
        }

        for (int i = 0; i < 5; i++){
            System.out.println(valores[i]);
        }
    }
}
