package tic_tac_toe__WiederholungP1;

public class GeometricObject {
	
	private int x;
	private int y;
	private int breite;
	private int hoehe;
	
	public GeometricObject (int x, int y, int breite, int hoehe){
		this.x= x;
		this.y= y;
		this.breite= breite;
		this.hoehe= hoehe;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getHoehe(){
		return hoehe;
	}
	
	public int getBreite(){
		return breite;
	}
	
	
}
