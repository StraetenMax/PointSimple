package application;

import java.util.Scanner;
import originePoint.Point;

public class TestDistance {

	public static void main(String[] args) {
		Point[] points = new Point[3];
		Scanner clavier = new Scanner(System.in);
		for (int i = 0; i < points.length; i++) {	
			System.out.print("la position " + (i + 1) + " de x est :");
			double abscisse = clavier.nextDouble();
			System.out.print("la position " + (i + 1) + " de Y est :");
			double ordonne = clavier.nextDouble();
			points[i] = new Point(abscisse, ordonne);
		}
		clavier.close();
		
		for(Point dist : points)
		System.out.println(dist);
		
		
	}
}
