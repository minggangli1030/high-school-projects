package Point_Array_Thing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.Timer;

public class PointPanel extends JPanel implements ActionListener{

	OurPoint_Orbiter_Copy[] pList;
	int pWidth;
	int pHeight;
	int numPoints;
	
	Timer t;

	Color bColor = Color.BLACK;
	Color pColor = Color.WHITE;
	Color randColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));

	int nums[] = new int[5];
	
	// Constructor
	public PointPanel(int w, int h, int howManyPoints) {

		pWidth = w;
		pHeight = h;
		numPoints = howManyPoints;
		pList = new OurPoint_Orbiter_Copy[numPoints];
		
		t= new Timer(50, this);
		t.restart();
		generatePoints();
	}

	private void generatePoints() {

		for (int i = 0; i < numPoints; i++) {
			pList[i] = new OurPoint_Orbiter_Copy(new Point((int)
					(Math.random() * pWidth), 
					(int) (Math.random() * pHeight)));
		}
	}

	public void paintComponent(Graphics g) {
		g.setColor(bColor);
		g.fillRect(0, 0, pWidth, pHeight);

		int pointR = 4;
		g.setColor(pColor);
		for (int i = 0; i < numPoints; i++) {
			g.fillOval(pList[i].getX() - pointR, pList[i].getY() - pointR, pointR * 2, pointR * 2);

		}

		
		for(int i = 0; i < numPoints; i++) {
			OurPoint_Orbiter_Copy startPoint = pList[i];
			for (int j = 0; j < numPoints; j++) {
				//Color randColor = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
				g.setColor(pColor);
				g.drawLine(startPoint.getX(), startPoint.getY(), pList[j].getX(), pList[j].getY());
			}
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// System.out.println("Hey, I am awake!");
		// Pseudo Code
		// Move all of points by some factor [x and y coordinates] 
		// Redraw
		moveAllPoints();
		repaint();
		
	}
	
	private void moveAllPoints() {
		// move all the point on pList
		for(int i=0; i<pList.length;i++) {
			pList[i].movePoint();
			repaint();
		}
	}

}
