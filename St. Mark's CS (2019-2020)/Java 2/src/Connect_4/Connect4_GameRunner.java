package Connect_4;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;;

public class Connect4_GameRunner {
	
	public static void main(String[] arg) {
		
		int width = 800;
		int height = 975;
		
		JFrame g = new JFrame ("Welcome to Connect 4");
		
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(width, height);
		
		Board gb = new Board(width, height-22);
		g.add(gb);
		g.setVisible(true);
		
	}
}
