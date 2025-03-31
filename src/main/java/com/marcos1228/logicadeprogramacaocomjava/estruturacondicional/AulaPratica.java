package com.marcos1228.logicadeprogramacaocomjava.estruturacondicional;

import java.util.Scanner;
import java.util.Random;

public class AulaPratica {
    public static void main(String[] args) {
        //
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        System.out.println("ADIVINHE O NUMERO QUE ESTOU PESANDO");

        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero == x) {
            System.out.println("Parabéns, vc acertou, eu pensei no " + x);
        } else {
            System.out.println(
                    "Você errouuuuu, eu pensei no " + x
            );
        }
    }
}
