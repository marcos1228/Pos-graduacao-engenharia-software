package com.marcos1228.logicadeprogramacaocomjava.polimorfismo;

class Linguagem {
    public void mostrarInformacao() {
        System.out.println("Mostra lingua portuguesa");
    }
}

class Java extends Linguagem {
    @Override
    public void mostrarInformacao() {
        System.out.println("Mostra lingua Java");
    }
}

class Principal {
    public static void main(String[] args) {

        Java java = new Java();
        java.mostrarInformacao();

        Linguagem linguagem = new Linguagem();

        linguagem.mostrarInformacao();
    }
}
