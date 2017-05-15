package originePoint;

public class Point {
	//propriétés
	private int abscisse;
	private int ordonne;
	
	//constructeurs
	public Point(){
		abscisse = 0;
		ordonne = 0;
	}
	public Point(int abscisse, int ordonne){
		this.abscisse = abscisse;
		this.ordonne = ordonne;
	}
	
	//accesseurs et mutateurs
	public int getAbscisse(){
		return abscisse;
	}
	public void setAbscisse(int abscisse){
		this.abscisse = abscisse;
	}
	public int getOrdonne(){
		return ordonne;
	}
	public void setOrdonne(int ordonne){
		this.ordonne = ordonne;
	}
	
	//méthodes
	public double distance(){
		return Math.sqrt(Math.pow(this.getAbscisse(),2) + Math.pow(this.getOrdonne(),2));
	}
	public String toString(){
		return "La distance entre l’origine et le Point ("+this.abscisse+","+this.ordonne+") est : "+this.distance();  
	}
}
