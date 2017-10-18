package jenkins;

public class AreaCalculator {
	
	public static void main(String args[]) {   
	      double base = 20.0;
	      double height = 110.5;
	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);   
	      
	    }
	
	public double getArea(double base, double height) {
		return (base* height)/2;
	}
}


