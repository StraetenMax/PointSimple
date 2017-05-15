package originePoint;

public class Point {
	//propriétés
	private double abscisse;
	private double ordonne;
	
	//constructeurs
	public Point(){
		abscisse = 00.00;
		ordonne = 00.00;
	}
	public Point(double abscisse, double ordonne){
		this.abscisse = abscisse;
		this.ordonne = ordonne;
	}
	
	//accesseurs et mutateurs
	public double getAbscisse(){
		return abscisse;
	}
	public void setAbscisse(double abscisse){
		this.abscisse = abscisse;
	}
	public double getOrdonne(){
		return ordonne;
	}
	public void setOrdonne(double ordonne){
		this.ordonne = ordonne;
	}
	
	//méthodes
	public double distance(){
		return Math.sqrt(Math.pow(this.getAbscisse(), this.getOrdonne()));
	}
	public String toString(){
		return "La distance entre l’origine et le Point ("+this.abscisse+","+this.ordonne+") est : "+this.distance();  
	}
}
