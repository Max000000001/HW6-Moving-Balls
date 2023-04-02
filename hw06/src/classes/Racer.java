package classes;

public class Racer extends Thread {
	private int n;
	public Racer(int n) {
		this.n = n;
	}
	@Override
	public void run() {
		for (int i=0; i<=100; i+=10) {
			System.out.println("Rider "+n+" passed " + i + "% of the way.");
		}
		System.out.println("Rider "+n+" reached the finish.");
	}
	
}
