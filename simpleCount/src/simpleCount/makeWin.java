package simpleCount;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class makeWin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pane = new JPanel();
	private JPanel result = new JPanel();
	private JPanel total = new JPanel();
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("0");
	private JLabel labelhis = new JLabel("");
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
	private String sign = "";
	private String history = "";
	private String historytmp = "";
	private String historyfin = "";
	private float value = 0;
	private float compteur = 0;
	private int aft = 1;
	private boolean dot = false;
	private boolean plus = false;
	private boolean minus = false;
	private boolean mult = false;
	private boolean div = false;
	private boolean mod = false;
	private boolean lastnb = true;

	public makeWin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("simpleCount");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		// Font policehis = new Font("Tahoma", Font.BOLD, 6);
		// labelhis.setFont(policehis);
		// labelhis.setForeground(Color.BLUE);
		// labelhis.setHorizontalAlignment(JLabel.EAST);
		Font policelab = new Font("Tahoma", Font.BOLD, 16);
		label.setFont(policelab);
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(JLabel.CENTER);
		result.setLayout(new GridLayout(3, 1));
		result.add(labelhis, BorderLayout.EAST);
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
			dot = false;
			if (lastnb = true)
				value = compteur;
			compteur = 0;
			aft = 1;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
			sign = " + ";
			historytmp = history + sign;
			labelhis.setText(historytmp);
			lastnb = false;
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
			dot = false;
			if (lastnb = true)
				value = compteur;
			compteur = 0;
			aft = 1;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
			sign = " - ";
			historytmp = history + sign;
			labelhis.setText(historytmp);
			lastnb = false;
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
			dot = false;
			if (lastnb = true)
				value = compteur;
			compteur = 0;
			aft = 1;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
			sign = " * ";
			historytmp = history + sign;
			labelhis.setText(historytmp);
			lastnb = false;
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
			if (lastnb = true)
				value = compteur;
			compteur = 0;
			dot = false;
			aft = 1;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
			sign = " / ";
			historytmp = history + sign;
			labelhis.setText(historytmp);
			lastnb = false;
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
			if (lastnb = true)
				value = compteur;
			dot = false;
			compteur = 0;
			aft = 1;
			String Res;
			Res = Float.toString(value);
			label.setText(Res);
			sign = " % ";
			historytmp = history + sign;
			labelhis.setText(historytmp);
			lastnb = false;
		}
	}

	public class equButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			String Res;
			if (plus == true) {
				value = value + compteur;
				plus = false;
			} else if (minus == true) {
				value = value - compteur;
				minus = false;
			} else if (mult == true) {
				value = value * compteur;
				mult = false;
			} else if (div == true) {
				if (compteur == 0) {
					label.setText("Div par zéro impossible");
					div = false;
					return;
				}
				value = value / compteur;
				div = false;
			} else if (mod == true) {
				if (compteur == 0) {
					label.setText("Modulo par zéro impossible");
					mod = false;
					return;
				}
				value = value % compteur;
				mod = false;
			} else
				value = compteur;
			Res = Float.toString(value);
			historytmp = historyfin;
			label.setText(Res);
			labelhis.setText(historytmp);
			plus = false;
			minus = false;
			mod = false;
			div = false;
			mult = false;
			dot = false;
			lastnb = true;
			compteur = 0;
			value = 0;
			aft = 1;
			sign = "";
			history = "";
			historytmp = "";
			historyfin = "";
			lastnb = true;
		}
	}

	public class dotButt implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			dot = true;
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
			dot = false;
			lastnb = true;
			String Res;
			compteur = 0;
			value = 0;
			aft = 1;
			Res = Float.toString(compteur);
			sign = "";
			history = "";
			historytmp = "";
			historyfin = "";
			label.setText(Res);
			labelhis.setText("");
			lastnb = true;
		}
	}

	public class nbButt0 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 0;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)));
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = (float) ((compteur / Math.pow(10, aft)));
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 2);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt1 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 1;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 1);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 1;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 1);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt2 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 2;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 2);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 2;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 2);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt3 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 3;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 3);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 3;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 3);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt4 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 4;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 4);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 4;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 4);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt5 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 5;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 5);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 5;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 5);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt6 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 6;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 6);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 6;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 5);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt7 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 7;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 7);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 7;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 7);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt8 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 8;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 8);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 8;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 8);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}

	public class nbButt9 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			historytmp = "";
			if (compteur != 0) {
				if (dot == false) {
					compteur = compteur * 10;
					compteur += 9;
				} else if (dot == true) {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 9);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			} else if (compteur == 0) {
				if (dot == false) {
					compteur = 9;
				} else {
					compteur = (float) ((compteur * Math.pow(10, aft)) + 9);
					compteur = (float) (compteur / Math.pow(10, aft));
					aft++;
				}
			}
			String Res;
			Res = Float.valueOf(compteur).toString();
			label.setText(Res);
			if (sign != "") {
				historyfin = history + sign + Res;
				labelhis.setText(historyfin);
			} else {
				history = Res;
				labelhis.setText(historytmp);
			}
			lastnb = true;
		}
	}
}