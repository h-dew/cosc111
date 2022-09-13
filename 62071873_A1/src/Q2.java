
public class Q2 {
	// calculates area and perimeter of a rectangle given an integer width and height 
	public static void main(String[] args) {
		// modifiable width and height
		int width = 7;
		int height = 9;
		
		// calculates perimeter and area
		int perimeter = width * 2 + height * 2;
		int area = width * height;
		
		//prints width, height, area and perimeter
		System.out.println("A rectangle with a width of " + width + " and a height of " + height +
				" has an area of " + area + " and a perimeter of " + perimeter);
		
		
	}
}
