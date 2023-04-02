package classes;

public class Racer2 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<=100; i+=10) {
			System.out.println("Rider 2 passed " + i + "% of the way.");
		}
		System.out.println("Rider 2 reached the finish.");
	}
}
