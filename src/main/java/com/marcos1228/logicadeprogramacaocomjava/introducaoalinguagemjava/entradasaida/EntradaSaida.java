package com.marcos1228.logicadeprogramacaocomjava.introducaoalinguagemjava.entradasaida;

import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        System.out.println("Saida de dados");
        //System -> Sistema
        //out -> saida
        //print -> imprimir
        //ln pular a linha

        //Entrada de dados
        // Detatlhes que vou capturar o dado do teclado
        System.out.println("INFORME O SEU NOME");
        String nome;
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
        System.out.println("O seu nome é : " + nome);




        //TODO Saída de dados
        System.out.println("Sistema saida imprimir pular linha");
        System.out.print("Sistema saida imprimir não pular linha");
        System.out.printf("Olá mundo");
        System.err.println("Erro: Falha na conexão!");

    }
}
