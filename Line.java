
public class Line {
	Point inizio ,fine;
	public Line(float x1, float y1, float x2, float y2 ) {
		this.inizio.setX(x1);
		this.fine.setX(x2);
		this.inizio.setX(y1);
		this.fine.setX(y2);
	}
	public Line(Point ini, Point fin) {
		this.inizio = ini;
		this.fine = fin;
	}
	public Point getInizio() {
		return inizio;
	}
	public void setInizio(Point inizio) {
		this.inizio = inizio;
	}
	public Point getFine() {
		return fine;
	}
	public void setFine(Point fine) {
		this.fine = fine;
	}
	
	public float getInizioX() {
		return inizio.getX();
	}
	public void setInizioX(float xx) {
		this.inizio.setX(xx);
	}
	public float getFineX() {
		return fine.getX();
	}
	public void setFineX(float xx) {
		this.fine.setX(xx);
	}
	public float getInizioY() {
		return inizio.getY();
	}
	public void setInizioY(float yy) {
		this.inizio.setY(yy);
	}
	public float getFineY() {
		return fine.getY();
	}
	public void setFineY(float yy) {
		this.fine.setY(yy);
	}
	
	public float getLength() {
		return this.inizio.distance(this.fine);
	}
	
	public void Stampa() {
		System.out.println("Inizio");
		System.out.println("x : "+this.inizio.getX()+"\t y : "+this.inizio.getY());
		System.out.println("Fine");
		System.out.println("x : "+this.fine.getX()+"\t y : "+this.fine.getY());

	}
}
