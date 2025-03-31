package com.marcos1228.logicadeprogramacaocomjava.introducaoaprogramacaorientadoaobjeto;

public class Construtores {
    String name;
    String sobreName;
    String title;
    //É um método que vai inicializar um objeto ou construir

    // É recomendado que ele seja declarado logo depois dos atributos


    public Construtores(String name, String sobreName, String title) {
        this.name = name;
        this.sobreName = sobreName;
        this.title = title;
    }

    public Construtores(String name) {
        this.name = name;
    }
}
