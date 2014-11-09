package simpleCount;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class makeWin extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pane = new JPanel();
	private addButt butt1;
	private rmButt butt2;
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("Le JLabel");
	private float compteur = 0;

	public makeWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("simpleCount");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.WHITE);
		container.setLayout(new BorderLayout());
		container.add(pane, BorderLayout.CENTER);
		butt1 = new addButt(this, "+");
		butt2 = new rmButt(this, "-");
		pane.add(butt1);
		pane.add(butt2);
		container.add(pane, BorderLayout.SOUTH);
		Font police = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(police);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(JLabel.CENTER);
		container.add(label, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		label.setText("Vous avez clické " + this.compteur + " fois");		
	}
	
	public void setLabel(String labelin) {
		label.setText(labelin);
	}
	
	public void setCompt(float x) {
		this.compteur = x;
	}
	
	public float getCompt() {
		return (this.compteur);
	}
}
