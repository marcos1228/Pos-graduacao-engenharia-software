package com.marcos1228.logicadeprogramacaocomjava.polimorfismo;

public class SobreCargaDeMetodos {
//    Sobrecarga de Métodos (Method Overloading)
//
//    A sobrecarga de métodos é um conceito em Programação Orientada a Objetos (POO) que permite que uma classe tenha múltiplos métodos com o mesmo nome, mas com diferentes assinaturas (ou parâmetros). Isso é feito para que um método possa ser chamado com diferentes tipos e números de parâmetros, oferecendo flexibilidade ao programador.
//
//    Características da Sobrecarga de Métodos:
//    Nome do Método: O nome do método deve ser o mesmo para todos os métodos sobrecarregados.
//
//    Parâmetros: Os métodos devem ter um número diferente de parâmetros ou tipos de parâmetros diferentes.
//
//    Tipo de Retorno: Não é permitido sobrecarregar métodos apenas pelo tipo de retorno. A assinatura do método deve mudar em relação aos parâmetros.
//
//    Resolução em Tempo de Compilação: A sobrecarga é resolvida em tempo de compilação, com base nos tipos e na quantidade dos parâmetros passados durante a chamada do método.

    public int soma(int a, int b) {
        return a + b;
    }

    // Sobrecarga do método soma para somar três números inteiros
    public int soma(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga do método soma para somar dois números de ponto flutuante
    public double soma(double a, double b) {
        return a + b;
    }

    public void mostrar() {
        for (int i = 0; i <10; i++) {
            System.out.println(" **** " + i);
        }
    }

    public void mostrar(char oi) {
        for (int i = 0; i <10; i++) {
            System.out.println(" **** " + i + "parametros" + oi);
        }
    }
}

