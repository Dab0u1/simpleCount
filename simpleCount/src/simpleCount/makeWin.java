package simpleCount;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class makeWin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pane = new JPanel();
	private JPanel result = new JPanel();
	private JPanel total = new JPanel();
	private JButton buttminus = new JButton("-");
	private JButton buttplus = new JButton("+");
	private JButton buttmult = new JButton("*");
	private JButton buttdiv = new JButton("/");
	private JButton buttmod = new JButton("%");
	private JButton butt0 = new JButton("0");
	private JButton butt1 = new JButton("1");
	private JButton butt2 = new JButton("2");
	private JButton butt3 = new JButton("3");
	private JButton butt4 = new JButton("4");
	private JButton butt5 = new JButton("5");
	private JButton butt6 = new JButton("6");
	private JButton butt7 = new JButton("7");
	private JButton butt8 = new JButton("8");
	private JButton butt9 = new JButton("9");
	private JButton buttdot = new JButton(".");
	private JButton buttequal = new JButton("=");
	private JButton buttreset = new JButton("CE");
	private float value;
	private boolean plus = false;
	private boolean minus = false;
	private boolean mult = false;
	private boolean div = false;
	private boolean mod = false;
	private boolean equal = false;
	// private boolean minus;
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("0");
	private JTextField text = new JTextField();
	private float compteur = 0;

	public makeWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("simpleCount");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		Font police = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(police);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(JLabel.CENTER);
		result.setLayout(new BorderLayout());
		result.add(label, BorderLayout.CENTER);
		container.setLayout(new GridLayout(6, 3));
		butt0.addActionListener(new nbButt0());
		butt1.addActionListener(new nbButt1());
		butt2.addActionListener(new nbButt2());
		butt3.addActionListener(new nbButt3());
		butt4.addActionListener(new nbButt4());
		butt5.addActionListener(new nbButt5());
		butt6.addActionListener(new nbButt6());
		butt7.addActionListener(new nbButt7());
		butt8.addActionListener(new nbButt8());
		butt9.addActionListener(new nbButt9());
		buttdot.addActionListener(new dotButt());
		buttequal.addActionListener(new equButt());
		buttdiv.addActionListener(new divButt());
		buttmod.addActionListener(new modButt());
		buttmult.addActionListener(new multButt());
		buttminus.addActionListener(new rmButt());
		buttplus.addActionListener(new addButt());
		buttreset.addActionListener(new resButt());
		container.add(butt7);
		container.add(butt8);
		container.add(butt9);
		container.add(butt4);
		container.add(butt5);
		container.add(butt6);
		container.add(butt1);
		container.add(butt2);
		container.add(butt3);
		container.add(butt0);
		container.add(buttdot);
		container.add(buttequal);
		container.add(buttmult);
		container.add(buttdiv);
		container.add(buttmod);
		container.add(buttminus);
		container.add(buttplus);
		container.add(buttreset);
		total.setLayout(new BoxLayout(total, BoxLayout.PAGE_AXIS));
		total.add(result);
		total.add(container);
		total.add(pane);
		this.setContentPane(total);
		this.setVisible(true);
	}

	public class addButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (mod == true || minus == true || mult == true || div == true) {
				mod = false;
				minus = false;
				mult = false;
				div = false;
			}
			plus = true;
			value = compteur;
			compteur = 0;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
		}
	}

	public class rmButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (plus == true || mod == true || mult == true || div == true) {
				plus = false;
				mod = false;
				mult = false;
				div = false;
			}
			minus = true;
			value = compteur;
			compteur = 0;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
		}
	}

	public class multButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (plus == true || minus == true || mod == true || div == true) {
				plus = false;
				minus = false;
				mod = false;
				div = false;
			}
			mult = true;
			value = compteur;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
		}
	}

	public class divButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (plus == true || minus == true || mult == true || mod == true) {
				plus = false;
				minus = false;
				mult = false;
				mod = false;
			}
			div = true;
			value = compteur;
			compteur = 0;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
		}
	}

	public class modButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (plus == true || minus == true || mult == true || div == true) {
				plus = false;
				minus = false;
				mult = false;
				div = false;
			}
			mod = true;
			value = compteur;
			compteur = 0;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class equButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			String Res;
			if (plus == true) {
				value = value + compteur;
				plus = false;
			}
			else if (minus == true) {
				value = value - compteur;
				minus = false;
			}
			else if (mult == true) {
				value = value * compteur;
				mult = false;
			}
			else if (div == true && compteur != 0) {
				value = value / compteur;
				div = false;
			}
			else if (mod == true && compteur != 0) {
				value = value % compteur;
				mod = false;
			}
			else
				value = compteur;
			Res = Float.toString(value);
			compteur = value;
			label.setText(Res);
		}
	}

	public class dotButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class resButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			plus = false;
			minus = false;
			mod = false;
			div = false;
			mult = false;
			String Res;
			compteur = 0;
			value = 0;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt0 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0)
				compteur = compteur * 10;
			compteur += 0;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt1 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 1;
			} else
				compteur = 1;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt2 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 2;
			} else
				compteur = 2;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt3 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 3;
			} else
				compteur = 3;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt4 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 4;
			} else
				compteur = 4;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt5 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 5;
			} else
				compteur = 5;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt6 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 6;
			} else
				compteur = 6;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt7 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 7;
			} else
				compteur = 7;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt8 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 8;
			} else
				compteur = 8;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}

	public class nbButt9 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			if (compteur != 0) {
				compteur = compteur * 10;
				compteur += 9;
			} else
				compteur = 9;
			String Res;
			Res = Float.toString(compteur);
			label.setText(Res);
		}
	}
}
