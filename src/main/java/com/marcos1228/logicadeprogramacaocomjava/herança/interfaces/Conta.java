package com.marcos1228.logicadeprogramacaocomjava.herança.interfaces;

public interface Conta {
//    Interface em
//    Java
//    Uma
//
//    interface em Java define um contrato que as classes devem seguir.
//    Ela contém
//    apenas a
//    definição de
//
//    métodos(sem implementação),sendo implementada por classes que precisam desse comportamento.
//    A partir do Java 8,
//    interfaces podem
//    ter métodos
//    com implementação
//    usando default methods .

    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
}
