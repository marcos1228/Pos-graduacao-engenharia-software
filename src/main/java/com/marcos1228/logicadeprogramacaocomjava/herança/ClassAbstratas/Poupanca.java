package com.marcos1228.logicadeprogramacaocomjava.herança.ClassAbstratas;

public class Poupanca extends Conta{
    public Poupanca(double saldo) {
        super();
    }

    public Poupanca() {
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo " + this.getSaldo());
    }
}
