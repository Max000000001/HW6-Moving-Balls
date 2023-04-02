package classes;

public class Racer1 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<=100; i+=10) {
			System.out.println("Rider 1 passed " + i + "% of the way.");
		}
		System.out.println("Rider 1 reached the finish.");
	}
}
