package edu.java.tipoVariaveis;

public class Operadores {
    public static void main(String[] args) {
        //SOMA
        String nomeCurso = "LINGUAGEM" + "JAVA";
        System.out.println("Concatenação: "+nomeCurso);

        int numero = 5;
        System.out.println("Número negativo só visualmente: "+- numero);
        //Tornando um número negativo
        numero = -numero;
        System.out.println("Número negativo: "+numero);

        //Repetição
        numero++;
        System.out.println("Repetição: "+numero);

        //Lógica
        boolean variavel = true;
        boolean nova = !variavel;
        System.out.println("Lógica com negação: "+nova);

        //Ternário
        int a,b;
        a = 5;
        b = 6;
        String result = a==b ? "Verdadeiro" : "Falso";
        System.out.println("Ternário: "+result);

        //Outra forma de comparação
        int num1 = 1;
        int num2 = 2;
        //Iguais
        boolean simNao = num1 == num2;
        System.out.println("Comparação ==: "+simNao);
        //Diferente
        boolean simNaoDif = num1 != num2;
        System.out.println("Comparação !=: "+simNaoDif);

        //Operador Lógico
        boolean cond1 = true;
        boolean cond2 = false;
        if(cond1 && cond2)
            System.out.println("As duas condições são verdadeiras");
        else if(cond1 || cond2)
            System.out.println("Apenas uma das condições é verdadeira!");
        else
            System.out.println("As condições são falsas!");
    }
}
