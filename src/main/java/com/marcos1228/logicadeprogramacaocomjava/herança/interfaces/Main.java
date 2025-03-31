package com.marcos1228.logicadeprogramacaocomjava.herança.interfaces;

public class Main {
    public static void main(String[] args) {
        Conta poupanca = new Poupanca();
        poupanca.depositar(30);
        poupanca.sacar(10);
        poupanca.getSaldo();

        System.out.println("Meu saldo é " + poupanca.getSaldo());
    }
}
