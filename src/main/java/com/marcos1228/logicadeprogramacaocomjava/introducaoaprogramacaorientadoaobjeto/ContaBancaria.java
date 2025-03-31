package com.marcos1228.logicadeprogramacaocomjava.introducaoaprogramacaorientadoaobjeto;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        System.out.println("meu saldo é" + saldo);
        return saldo;
    }
}