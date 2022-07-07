package chapter8;

public class areaclass {

	public static int getArea(int length, int width) {
		return width * length;

	}
	
	public static double getArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
		
	}
	
	public static double getArea(double radius, double height) {
		return Math.PI * Math.pow(radius,  2) * height;
	}
}
