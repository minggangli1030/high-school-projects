package Point_Array_Thing;
import java.awt.*;

public class OurPoint_PointArray {

	Point xyCoords; // normal x, y coords
	int dx;			// speed along x axis 5 and -5
	int dy;			// speed along y axis 5 and -5
	
	// We would include ellipse equation for the movement of the points
	
	// constructor...
	public OurPoint_PointArray(Point p) {
		
		xyCoords = p;
		dx = (int)(Math.random()*11)-5;
		dy = (int)(Math.random()*11)-5;
	}
	
	public int getX() {
		return xyCoords.x;	
	}
	public int getY() {
		return xyCoords.y;	
	}
	public int getdX() {
		return dx;	
	}
	public int getdY() {
		return dy;	
	}
	// Set up mutator methods - setters
	public void setX(int newX) {
		xyCoords.x = newX;
	}
	public void setY(int newY) {
		xyCoords.y = newY;
	}	
	// changes the x and y value by dx and dy
	public void movePoint() {
		xyCoords.x += dx;
		xyCoords.y += dy;
	}
	
}
