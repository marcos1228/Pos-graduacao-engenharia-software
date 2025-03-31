package com.marcos1228.logicadeprogramacaocomjava.herança.interfaces;

public class Poupanca implements Conta{
    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= saldo;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
}
