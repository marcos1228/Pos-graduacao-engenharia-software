package com.marcos1228.logicadeprogramacaocomjava.vetoresematrizes;

import java.util.ArrayList;

public class ExemploDeArrayList {
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<>();
        bandas.add("Kiss");
        bandas.add("Beartles");
        bandas.add("Iron Maiden");
        System.out.println("Bandas = " + bandas);

        bandas.add(bandas.indexOf("Kiss"), "Capital inicial");
        System.out.println(bandas);

        bandas.remove("Kiss");
        System.out.println(bandas);

        bandas.clear();
        System.out.println("Limpando a bandas" +  bandas);
    }
}
