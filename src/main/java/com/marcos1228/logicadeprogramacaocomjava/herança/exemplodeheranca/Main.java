package com.marcos1228.logicadeprogramacaocomjava.herança.exemplodeheranca;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bidu");

        Gata gata = new Gata();
        gata.setNome("Lola");

        cachorro.mostrar();
        gata.mostrar();
    }
}
