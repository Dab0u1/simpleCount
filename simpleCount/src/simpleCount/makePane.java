package simpleCount;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class makePane extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int posX = -50;
	private int posY = -50;

	public void paintComponent (Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.RED);
		g.fillOval(posX, posY, 50, 50);
	}
	
	public int getPosX() {
		return posX;
	}
	
	public void setPosX(int pos) {
		this.posX = pos;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public void setPosY(int pos) {
		this.posY = pos;
	}
	
	public void setBaseX() {
		posX = -50;
	}
	
	public void setBaseY() {
		posY = -50;
	}
}
