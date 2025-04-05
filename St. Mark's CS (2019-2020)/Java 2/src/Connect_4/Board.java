package Connect_4;

import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;

public class Board extends JPanel implements MouseListener, MouseMotionListener {

	final ImageIcon redIcon = new ImageIcon("redDisk.png");
	final ImageIcon yelIcon = new ImageIcon("yellowDisk.png");

	public static final int ROWS = 6;
	public static final int COLS = 7;
	public static final int RED_DISK = 1;
	public static final int YEL_DISK = -1;

	public int currentTurn = 1;

	private int winner = 0;
	private boolean endGame = false;
	private int pWidth, pHeight;

	private Color bColor = new Color(255, 199, 199);
	private double sideM = 0.05;
	private double topM = 0.15;
	private double arrowM = 0.05;

	private int matrix[][] = new int[6][7];

	private Image blueBoard;
	private Image arrow;
	private Image redDisk;
	private Image yellowDisk;

	private int boardW;
	private int boardH;
	private int boardStartX, boardStartY;
	private int diskX, diskY;

	// coordinates for the Arrow key
	private int arrowX, arrowY, arrowW, arrowH;

	public Board(int w, int h) {
		pWidth = w;
		pHeight = h;
		this.setSize(pWidth, pHeight);
		this.setBackground(bColor);

		try {
			blueBoard = ImageIO.read(new File("connect4Board2.png"));
			arrow = ImageIO.read(new File("arrow.png"));
			redDisk = ImageIO.read(new File("redDisk.png"));
			yellowDisk = ImageIO.read(new File("yellowDisk.png"));

			System.out.println("files are open -- have fun");
		} catch (Exception e) {
			System.out.println("problem opening files...");
		}

		// drawing the arrow
		arrowY = (int) (pHeight * (arrowM));
		arrowX = (int) (pWidth * (arrowM));
		arrowH = 90;
		arrowW = 90;

		// enable moiuseListening and clicking
		this.addMouseListener(this);
		this.setFocusable(true);
		this.addMouseMotionListener(this);

		boardW = pWidth - (int) (pWidth * 2 * sideM);
		boardH = pHeight - (int) (pHeight * 2 * topM);
		boardStartX = (int) (pWidth * sideM);
		boardStartY = (int) (pHeight * topM);

	}

	// override JPanel paintComponent
	public void paintComponent(Graphics g) {
		g.setColor(bColor);
		g.fillRect(0, 0, pWidth, pHeight);
		g.setColor(Color.BLACK);

		// drawing the board
		g.drawImage(blueBoard, boardStartX, // x-coordinate
				boardStartY, // y-coordinate
				boardW, // width
				boardH, // height
				this);

		g.drawImage(arrow, (int) (arrowX - (arrowW / 2)), arrowY, arrowH, arrowW, this);

		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				if (matrix[row][col] == 1) {
					diskX = (int) ((boardStartX) + boardW / 7 * col);
					diskY = (int) ((boardStartY) + boardH / 6 * row);
					// pseudo code
					// Draw red circle
					g.drawImage(redDisk, diskX, // x-coordinate
							diskY, // y-coordinate
							(int) (boardW / 7), // width
							(int) (boardH / 6), // height
							this);
					repaint();
				} else if (matrix[row][col] == -1) {
					diskX = (int) ((boardStartX) + boardW / 7 * col);
					diskY = (int) ((boardStartY) + boardH / 6 * row);
					// pseudo code
					// Draw yellow circle
					g.drawImage(yellowDisk, diskX, // x-coordinate
							diskY, // y-coordinate
							(int) (boardW / 7), // width
							(int) (boardH / 6), // height
							this);
					repaint();
				} else {
					continue;
				}
			}
		}

	}

	private int getClickedColumn(int xLocation) {
		int whichCOL = -1;
		int LengthCOL = boardW / 7;
		if (xLocation > boardStartX && xLocation < boardStartX + LengthCOL) {
			whichCOL = 0;
		}
		if (xLocation > boardStartX + LengthCOL && xLocation < boardStartX + LengthCOL * 2) {
			whichCOL = 1;
		}
		if (xLocation > boardStartX + LengthCOL * 2 && xLocation < boardStartX + LengthCOL * 3) {
			whichCOL = 2;
		}
		if (xLocation > boardStartX + LengthCOL * 3 && xLocation < boardStartX + LengthCOL * 4) {
			whichCOL = 3;
		}
		if (xLocation > boardStartX + LengthCOL * 4 && xLocation < boardStartX + LengthCOL * 5) {
			whichCOL = 4;
		}
		if (xLocation > boardStartX + LengthCOL * 5 && xLocation < boardStartX + LengthCOL * 6) {
			whichCOL = 5;
		}
		if (xLocation > boardStartX + LengthCOL * 6 && xLocation < boardStartX + LengthCOL * 7) {
			whichCOL = 6;
		}

		return whichCOL;
	}

	private boolean winOrNot() {

		return false;

	}

	public void changeTurn() {
		currentTurn *= -1;
	}

	private void markMatrix(int newRow, int newCol) {
		if (matrix[newRow][newCol] == 0) {
			matrix[newRow][newCol] = currentTurn;

			if (currentTurn == 1) {
				System.out.println("Red Disk\t\tCOL: " + newCol + "\tROW: " + newRow);

			}

			else {
				System.out.println("Yellow Disk\t\tCOL: " + newCol + "\tROW: " + newRow);
			}
		} else {
			System.out.println("ERROR ---- Problem with matrix[" + newRow + "][" + newCol + "]");
		}

		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				System.out.print("" + matrix[r][c] + "\t");
			}
			System.out.println();
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				if (matrix[row][col] == 0) {
					endGame = false;
					break;
				}
			}
		}

		if (!endGame) {
			int whichCOL = getClickedColumn(e.getX());
			if (whichCOL >= 0) {
				for (int i = 5; i >= 0; i--) {
					if (matrix[i][whichCOL] == 0) {
						markMatrix(i, whichCOL);
						break;
					} else if (i == 0) {
						if (currentTurn == RED_DISK) {
							JOptionPane.showMessageDialog(this, "Column is full", "Problem",
									JOptionPane.INFORMATION_MESSAGE, redIcon);
						} else {
							JOptionPane.showMessageDialog(this, "Column is full", "Problem",
									JOptionPane.INFORMATION_MESSAGE, yelIcon);
						}

						System.out.println("ERROR ---- Place [" + i + "][" + whichCOL + "] taken");
						changeTurn();
					}

				}
				changeTurn();
			} else {
				if (currentTurn == RED_DISK) {
					JOptionPane.showMessageDialog(this, "You can't place a disk here", "Problem",
							JOptionPane.INFORMATION_MESSAGE, redIcon);
				} else {
					JOptionPane.showMessageDialog(this, "You can't place a disk here", "Problem",
							JOptionPane.INFORMATION_MESSAGE, yelIcon);
				}
			}
		} else {
			if (winner == 1) {
				JOptionPane.showMessageDialog(this, "Winner is RED", "Winner", JOptionPane.INFORMATION_MESSAGE,
						redIcon);
			} else if (winner == -1) {
				JOptionPane.showMessageDialog(this, "Winner is YELLOW", "Winner", JOptionPane.INFORMATION_MESSAGE,
						yelIcon);
			} else {
				JOptionPane.showMessageDialog(this, "TIE", "Winner", JOptionPane.INFORMATION_MESSAGE, redIcon);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		arrowX = e.getX();

		if (arrowX < boardStartX + (arrowW / 2)) {
			arrowX = (int) (boardStartX + (arrowW / 2));
		}

		if (arrowX > boardStartX + boardW - (arrowW / 2)) {
			arrowX = (int) (boardStartX + boardW - (arrowW / 2));
		}
		repaint();
	}

}
