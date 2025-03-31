package com.marcos1228.logicadeprogramacaocomjava.herança.ClassAbstratas;

abstract class Conta {
    private double saldo;

    public Conta() {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimirExtrato();
}
