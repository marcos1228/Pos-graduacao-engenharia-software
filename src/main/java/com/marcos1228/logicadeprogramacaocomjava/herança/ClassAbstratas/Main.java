package com.marcos1228.logicadeprogramacaocomjava.herança.ClassAbstratas;

public class Main {
//    Classe Abstrata
//    em Java
//    Uma classe
//    abstrata em
//    Java é
//    uma classe
//    que não
//    pode ser
//    instanciada diretamente
//    e serve
//    como um
//    modelo para
//    outras classes.
//    Ela pode
//    conter métodos
//
//    abstratos(sem implementação) e métodos concretos (
//    com implementação).

    public static void main(String[] args) {
//        Conta cp = new Poupanca();
//        cp.setSaldo(500);
//        cp.imprimirExtrato();

        Conta corrente = new Corrente();
        corrente.setSaldo(5000);
        corrente.imprimirExtrato();
    }

}
