package com.marcos1228.logicadeprogramacaocomjava.estruturacondicional;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class EstruturaDeMultiplaEscolha {
    // TODO

//    Resumo: Estrutura de Múltipla Escolha (switch-case) em Java
//    A estrutura de múltipla escolha (switch-case) permite tomar decisões com base
//    no valor de uma variável, oferecendo uma alternativa mais organizada em comparação
//    com o uso de múltiplos if-else.

    public static void main(String[] args) {
        System.out.println("Informe o dia da semana");

        Scanner entrada = new Scanner(System.in);

        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }
    }
}
