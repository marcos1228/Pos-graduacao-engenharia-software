package com.marcos1228.logicadeprogramacaocomjava.estruturaderepeticao;

public class Metodos {

//    O que são métodos em programação?
//    Métodos são blocos de código que executam uma tarefa específica dentro de um programa. Eles são usados para organizar, reutilizar e estruturar melhor o código.
//
//    Em linguagens como Java, os métodos fazem parte das classes e geralmente operam sobre os dados da classe ou realizam alguma lógica específica.
//
//            🎯 Características principais de um método:
//    Nome → Identifica o método.
//
//    Tipo de retorno → Define o que o método retorna (ou void se não retorna nada).
//
//    Parâmetros (opcional) → Valores que o método recebe para processar.
//
//    Bloco de código → O que o método faz quando chamado.
//
//    Modificadores de acesso (opcional) → Controlam a visibilidade do método (public, private, protected).
//

    // Método que soma dois números e retorna o resultado
    public int somar(int a, int b) {
        return a + b;
    }

    // Método que não retorna nada (void)
    public void exibirMensagem() {
        System.out.println("Bem-vindo à Calculadora!");
    }

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int somar = metodos.somar(5, 3);
        System.out.println("Soma: " + somar);
        metodos.exibirMensagem();
    }
}
