import java.util.Random;

public class View {

	public static void main(String[] args) {
		Random num = new Random();
		int vetor[] = new int[1000];
		
		for (int i = 0; i < 1000; i++){
			vetor[i] = num.nextInt(100)+1;
		}
		
		Thread t1 = new Controller(vetor, 1);
		t1.start();
		Thread t2 = new Controller(vetor, 2);
		t2.start();
	}

}
