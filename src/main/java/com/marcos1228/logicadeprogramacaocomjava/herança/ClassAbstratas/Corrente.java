package com.marcos1228.logicadeprogramacaocomjava.herança.ClassAbstratas;

public class Corrente extends Conta{

    public Corrente() {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo conta corrente " + this.getSaldo());
    }
}
