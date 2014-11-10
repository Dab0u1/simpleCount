package simpleCount;

import java.awt.Button;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class makeButt extends Button implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public makeButt(String str) {
		super(str);
		this.name = str;
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		GradientPaint gp = new GradientPaint(0, 0, Color.BLUE, 0, 20, Color.CYAN, true);
		g2d.setPaint(gp);
		g2d.setColor(Color.BLACK);
		g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2), (this.getHeight() / 2) + 5);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
