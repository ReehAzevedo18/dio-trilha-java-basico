package edu.java.tipoVariaveis;

public class TiposVariaveis {

    public static void main(String[] args) {

        double salarioMinimo = 2.500;
        //Casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println("O número é: "+numeroCurto2);

    }
}
