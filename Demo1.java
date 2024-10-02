package demo1;

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	int GetX() {
		return x;
	}
	
	int GetY() {
		return y;
	}
	
	public static double distence(Point a, Point b) {
		double d;
		d = Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
		return d;
	}

	
}
public class Demo1 {
	public static void main(String args[]) {
		Point p1;
		Point p2;
		p1 = new Point(10,10);
		p2 = new Point(12,12);
		
		System.out.println("Point1 x:" + p1.GetX());
		System.out.println("Point2 y:" + p2.GetY());
		System.out.println("Distence between p1,p2:" + Point.distence(p1, p2));
	}
}
