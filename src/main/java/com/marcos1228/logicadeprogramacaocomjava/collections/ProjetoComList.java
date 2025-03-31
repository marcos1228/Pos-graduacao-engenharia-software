package com.marcos1228.logicadeprogramacaocomjava.collections;

import java.util.ArrayList;

class ProjetoComList {
    public static void main(String[] args) {
        ArrayList<String> linguagem = new ArrayList<>();
        linguagem.add("JAVA");
        linguagem.add("CSharp");
        linguagem.add("Python");
        linguagem.add("JavaScript");

        String[] strings = new String[linguagem.size()];
        System.out.println(linguagem + "List");
        linguagem.toArray(strings);

        for (String num : linguagem) {
            System.out.println(num + ",");
        }

    }
}
