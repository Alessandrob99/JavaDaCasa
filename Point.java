
public class Point {
	private float x;
	private float y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(float xin , float yin) { //OVERLOADING DEL COSTRUTTORE
		this.x = xin;
		this.y = yin;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public float distance(float xx , float yy) { // DISTANZA DA UN PUNTO DATE LE COORDINATE
		float d =	(float) Math.sqrt(Math.pow((this.x - xx),2)+Math.pow((this.y - yy),2));
		return d;
	}
	
	public float distance(Point p) { // DISTANZA DA UN PUNTO DATO IL PUNTOI STESSO
		float d =	(float) Math.sqrt(Math.pow((this.x - p.getX()),2)+Math.pow((this.y - p.getY()),2));
		return d;
	}
	public void Stampa() {
		System.out.println("x : "+this.x+"\t y : "+this.y);
	}
	
}
