package simpleCount;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class addButt extends JButton implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private makeWin win;
	private float compteur = 0;
	
	addButt(String string) {
		// TODO Auto-generated constructor stub
	}

	public addButt(makeWin winin) {
		super();
		this.win = winin;
	}
	
	public addButt(makeWin winin, String str) {
		super(str);
		this.win = winin;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.win.setCompt(compteur + 1);
	}
}
