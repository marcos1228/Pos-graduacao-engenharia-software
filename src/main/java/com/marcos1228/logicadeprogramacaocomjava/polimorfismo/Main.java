package com.marcos1228.logicadeprogramacaocomjava.polimorfismo;

public class Main {
    public static void main(String[] args) {
        SobreCargaDeMetodos calc = new SobreCargaDeMetodos();

        // Chamadas para os métodos sobrecarregados
        System.out.println(calc.soma(1, 2)); // chama soma(int, int)
        System.out.println(calc.soma(1, 2, 3)); // chama soma(int, int, int)
        System.out.println(calc.soma(1.5, 2.5)); // chama soma(double, double)
        calc.mostrar();
        calc.mostrar('0');
    }
}
