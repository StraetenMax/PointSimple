package application;

import java.util.Scanner;
import originePoint.Point;

public class TestDistance {

	public static void main(String[] args) {
		Point[] points = new Point[3];
		Scanner clavier = new Scanner(System.in);
		for (int i = 0; i < points.length; i++) {	
			System.out.print("la position " + (i + 1) + " de x est :");
			int abscisse = clavier.nextInt();
			System.out.print("la position " + (i + 1) + " de Y est :");
			int ordonne = clavier.nextInt();
			points[i] = new Point(abscisse, ordonne);
		}
		clavier.close();
		
		for(Point dist : points)
		System.out.println(dist);
		
		
	}
}
