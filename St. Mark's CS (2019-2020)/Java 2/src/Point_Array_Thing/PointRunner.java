package Point_Array_Thing;

import javax.swing.JFrame;

public class PointRunner {

	public static void main(String[] args) {
		int sWidth = 1000;
		int sHeight = 1000;
		JFrame f = new JFrame("Point Array Thingy");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(sWidth, sHeight);
		
		PointPanel p = new PointPanel(sWidth, sHeight-22,15);
		
		f.add(p);
		f.setVisible(true);
		

	}

}
