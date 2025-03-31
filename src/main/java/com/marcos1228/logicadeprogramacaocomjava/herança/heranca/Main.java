package com.marcos1228.logicadeprogramacaocomjava.herança.heranca;

class Main {
    //    Herança em Java
//    A herança é um dos pilares da Programação Orientada a Objetos (POO) e permite que uma classe (subclasse ou classe filha) herde atributos e métodos de outra classe (superclasse ou classe pai). Isso promove a reutilização de código e facilita a manutenção do software.
//
//    Declaração de Herança
//    Em Java, utilizamos a palavra-chave extends para indicar que uma classe está herdando outra:


    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.name = "Marcos";
        vendedor.comissao = 89.1;

        System.out.println("O vendedor é " + vendedor.getName() + "comissao dele é " + vendedor.getComissao());
    }
}