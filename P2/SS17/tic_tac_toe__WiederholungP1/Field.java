package tic_tac_toe__WiederholungP1;

public class Field extends GeometricObject{
	
	public Field(int x, int y, int breite, int hoehe) {
		super(x, y, breite, hoehe);
	}
	private String x= "X";
	private String o= "O";
	
	public String getSymbolX(){
		return x;
	}
	
	public String getSymbolO(){
		return o;
	}
	
	public void setSymbolX(String symbolX){
		if(x == "X"){
			this.x = symbolX;
		}
	}
	
	public void setSymbolY(String symbolO){
		if(o == "O"){
			this.o = symbolO;
		}
	}
	
	public String toString(){
		return this.getSymbolO() + " " + this.getSymbolX() + " " + this.getX() + " " 
				+ this.getY() + " " + this.getBreite() + " " + this.getHoehe();
	}
	
}
