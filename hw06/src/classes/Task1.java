package classes;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task1 {
	public static void main(String[] args) {
		
//		Racer1 racer1 = new Racer1();
//		Racer2 racer2 = new Racer2();
//		Racer3 racer3 = new Racer3();
//		Thread threadForRacer3 = new Thread(racer3);
//		racer1.start();
////		try {
////			racer1.join();
////		} catch (InterruptedException e) {
////			e.printStackTrace();
////		}
//		racer2.start();
//		threadForRacer3.start();
		
//		int n_racers = 5;
//		for (int i=1; i<=n_racers; i++) {
//			Racer nextRacer = new Racer(i);
//			nextRacer.start();
//		}	
		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 500);
//		frame.setLocation(200, 200);
//		frame.setLayout(new GridLayout());
//		JPanel panel = new JPanel();
//		frame.add(panel);
//		frame.setVisible(true);
//		Ball ball1 = new Ball(panel, 2, 50, 200, 40);
//		Ball ball2 = new Ball(panel, 10, 10, 100, 50);
//		Ball ball3 = new Ball(panel, 5, 20, 30, 30);
//		ball1.start();
//		ball2.start();
//		ball3.start();
		
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(800, 800);
//		frame.setLocation(200, 200);
//		frame.setLayout(new GridLayout(0, 2));
//		JPanel panel1 = new JPanel();
//		JPanel panel2 = new JPanel();
//		JPanel panel3 = new JPanel();
//		JPanel panel4 = new JPanel();		
//		panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//		panel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));		
//		frame.add(panel1);
//		frame.add(panel2);
//		frame.add(panel3);
//		frame.add(panel4);		
//		frame.setVisible(true);		
//		Ball ball1 = new Ball(panel1, 2, 50, 200, 40);
//		Ball ball2 = new Ball(panel2, 10, 10, 100, 50);
//		Ball ball3 = new Ball(panel3, 5, 20, 30, 30);
//		Ball ball4 = new Ball(panel4, 2, 50, 200, 40);
//		ball1.start();
//		ball2.start();
//		ball3.start();
//		ball4.start();
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setLocation(150, 150);
		frame.setLayout(new GridLayout());
		JTextArea panel = new JTextArea();
		Hero hero = new Hero(panel);
		
		frame.add(panel);
		frame.setVisible(true);
		
		Ball ball1 = new Ball(panel, 2, 50, 200, 40);
		Ball ball2 = new Ball(panel, 10, 10, 100, 50);
		Ball ball3 = new Ball(panel, 5, 20, 30, 30);
		Ball ball4 = new Ball(panel, 3, 40, 300, 20);
		ball1.start();
		ball2.start();
		ball3.start();
		ball4.start();
		hero.start();
		
	}
}
















