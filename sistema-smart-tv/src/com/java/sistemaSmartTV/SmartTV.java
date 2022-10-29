package com.java.sistemaSmartTV;

public class SmartTV {
        boolean ligada = false;
	    int canal = 1;
	    int volume = 25;

	    public void ligar(){
	    	ligada = true;
		}

		public void desligar(){
			ligada = false;
		}

		public void aumentarVolume(){
	    	volume++;
			System.out.println("Aumentou o volume. Qual o volume atual? "+volume);
		}

		public void diminuirVolume(){
			volume++;
			System.out.println("Diminuiu o volume. Qual o volume atual? "+volume);
		}

		public void mudarCanal(int novoCanal){
	    	canal = novoCanal;
		}
		public void aumentarCanal(){
	    	canal++;
		}

		public void dimunirCanal(){
			canal--;
		}
}
