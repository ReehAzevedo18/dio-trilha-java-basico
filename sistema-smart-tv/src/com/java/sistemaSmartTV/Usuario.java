package com.java.sistemaSmartTV;

public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTV smartTV = new SmartTV();
        System.out.println("A TV está ligada? "+smartTV.ligada);
        System.out.println("Qual o canal atual? "+smartTV.canal);
        System.out.println("Qual o volume da TV? "+smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada? "+smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV Ligada? "+smartTV.ligada);

        smartTV.aumentarVolume();

        smartTV.diminuirVolume();

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual: "+smartTV.canal);
    }
}
