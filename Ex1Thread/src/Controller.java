public class Controller extends Thread {
	
	int vetorNumeros[];
	int modo;
	int soma;
	double tempoInicial;
	double tempoFinal;
	double tempoTotal;
	
	
	public Controller(int vetor[], int modo){
		this.vetorNumeros = vetor;
		this.modo = modo;		
	}
	
	@Override
	public void run() {
		switch (this.modo){
		case 1:
			
			tempoInicial = System.nanoTime();
			
			for (int i = 0; i < this.vetorNumeros.length; i++){
				soma += this.vetorNumeros[i];
			}
			
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			
			//tempoTotal está em nanosegundo = 10 ^ -9 segundo. Converter em segundos
			tempoTotal /= Math.pow(10, 9);
			System.out.println("Modo 1 (lenght) ==> " + tempoTotal + " segundos");
			break;
			
		case 2:
			
			tempoInicial = System.nanoTime();
			
			for (int num:this.vetorNumeros){
				soma += num;
			}
			
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			
			//tempoTotal está em nanosegundo = 10 ^ -9 segundo. Converter em segundos
			tempoTotal /= Math.pow(10, 9);
			System.out.println("Modo 2 (for each) ==> " + tempoTotal + " segundos");
			break;
			
		}
	}
	
	

}