package application;

import java.util.Scanner;
import originePoint.Point;

public class TestDistance {

	public static void main(String[] args) {
		Point[] points = new Point[3];
		for(int i =0; i< points.length; i++ ){	
		Scanner clavier = new Scanner(System.in);
		System.out.println("la position "+(i+1)+" de x est :");
		double abscisse = clavier.nextDouble();
		System.out.println("la position "+(i+1)+" de Y est :");
		double ordonne = clavier.nextDouble();
		points[i]= new Point(abscisse, ordonne);
		}
		//clavier.close();

}
}
