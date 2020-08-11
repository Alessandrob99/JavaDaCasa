
public class PointLine {
	public static void main(String[] args){
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		Line l1 = new Line(p1,p2);
		l1.Stampa();
		float dd = l1.getLength();
		System.out.println("Lunghezza : "+dd);
	}
}
