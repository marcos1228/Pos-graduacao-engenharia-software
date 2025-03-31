package com.marcos1228.logicadeprogramacaocomjava.estruturacondicional;

public class OperadoresLogicos {
    // TODO DO Operadores Lógicos
    public static void main(String[] args) {
        maior();
        menor();
        igual();
        diferente();
        maiorQueOuIgual();
        menorQueOuIgual();
    }

    private static Boolean maior() {
        int a = 7;
        int b = 6;

        if (a > b) {
            System.out.println(true);
        }
        return false;
    }

    private static Boolean menor() {
        int a = 5;
        int b = 6;

        if (a < b) {
            System.out.println(true);
        }
        return false;
    }

    private static Boolean igual() {
        int a = 5;
        int b = 5;

        if (a == b) {
            System.out.println(true);
        }
        return false;
    }

    private static Boolean diferente() {
        int a = 5;
        int b = 6;

        if (a != b) {
            System.out.println(true);
        }
        return false;
    }

    private static Boolean maiorQueOuIgual() {
        int a = 8;
        int b = 6;

        if (a >= b) {
            System.out.println(true);
        }
        return false;
    }

    private static Boolean menorQueOuIgual() {
        int a = 8;
        int b = 6;

        if (a <= b) {
            System.out.println(true);
        }
        return false;
    }
}
