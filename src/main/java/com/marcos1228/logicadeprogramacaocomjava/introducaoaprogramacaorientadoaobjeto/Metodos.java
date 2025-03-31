package com.marcos1228.logicadeprogramacaocomjava.introducaoaprogramacaorientadoaobjeto;

public class Metodos {
//    Um método em Java é um bloco de código que executa uma tarefa específica. Ele pode receber parâmetros, executar operações e retornar um valor.
//
//    Os métodos ajudam a organizar o código, tornando-o mais reutilizável e legível.

//    Estrutura de um método

//    [modificador] [tipo de retorno] nomeDoMetodo([parâmetros]) {
//        // Corpo do método
//        return valor; // Opcional (caso não seja void)
//    }

    private int idade;

    public Metodos(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
