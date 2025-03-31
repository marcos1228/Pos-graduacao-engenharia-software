package com.marcos1228.logicadeprogramacaocomjava.introducaoaprogramacaorientadoaobjeto;

public class ModificadoresAcessos extends Animal{
    //Acessos é o que é permitido ou liberado etc
    // public --> PPermite acesso de qualquer lugar do código, dentro ou fora do pacote.
    // pivate --> Permite acesso apenas dentro da mesma classe.
    //É usado para encapsular dados, protegendo atributos.
    // protected --> Permite acesso dentro do mesmo pacote e também em subclasses, mesmo que estejam em outro pacote.

//
//    Use public para permitir acesso livre.
//
//    Use private para encapsular dados sensíveis.
//
//    Use protected se precisar de acesso em subclasses.
//
//    **Use (default) se quiser limitar o acesso ao mesmo pacote.


    /// Exemplos
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.dizerOla();

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.getSaldo();

    }
    public void latir(){
    fazerSom();
        System.out.println("O cachorro está latindo");
    }
}

