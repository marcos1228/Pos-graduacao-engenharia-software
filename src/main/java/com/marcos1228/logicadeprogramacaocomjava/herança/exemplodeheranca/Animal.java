package com.marcos1228.logicadeprogramacaocomjava.herança.exemplodeheranca;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void comer(){
        System.out.println("Eu gosto de comer.");
    }
}
