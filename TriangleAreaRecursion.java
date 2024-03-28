/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * Hamza Khan 
 * Date; December 4, 2023 
 * Desc. Calculates the area of a triangle using pixels (units) of
 *       area = 1 using recursion
 */
public class TriangleAreaRecursion {

	
	/*
	 * Method to calculate the area of the width of the base 
	 */
	
	public static int getArea(int width) {
		int area = 0;
		
		if (width == 0) {
			area = 0;
		}
		
		else if (width == 1){
			area = 1;
		}
		
		else {
			area = width + getArea(width - 1);
		}
		
		
		return area;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int w = Integer.parseInt(JOptionPane.showInputDialog(null, "Width of Base"));
			
		//call the getArea
		int area = TriangleAreaRecursion.getArea(w);
		
		JOptionPane.showMessageDialog(null, "The area is " + area + " Pixels");
		
	}

}
