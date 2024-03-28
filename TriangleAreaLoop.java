/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * Hamza Khan 
 * Date; December 4, 2023 
 * Desc. Calculates the area of a triangle using pixels (units) of
 *       area = 1  
 */
public class TriangleAreaLoop {

	
	/*
	 * Method to calculate the area of the width of the base 
	 */
	
	public static int getArea(int width) {
		int area = 0;
		
		//count the pixels



for (int i = width; i >= 1; i--) {
			area += i;
		}
		
		return area;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int w = Integer.parseInt(JOptionPane.showInputDialog(null, "Width of Base"));
			
		//call the getArea
		int area = TriangleAreaLoop.getArea(w);
		
		JOptionPane.showMessageDialog(null, "The area is " + area + " Pixels");
		
	}

}
