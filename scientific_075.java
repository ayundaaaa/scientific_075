package Calculator01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class scientific_075 {

	private JFrame frame;
	private JTextField T;

	Double first;
	Double second;
	Double result;
	String operation;
	String answer;
	String kosong;
	boolean banding;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientific_075 window = new scientific_075();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scientific_075() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(42, 47, 79));
		frame.getContentPane().setLayout(null);
		
		T = new JTextField();
		T.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		T.setForeground(new Color(253, 240, 240));
		T.setHorizontalAlignment(SwingConstants.RIGHT);
		T.setBackground(new Color(42, 47, 79));
		T.setBounds(24, 30, 370, 83);
		frame.getContentPane().add(T);
		T.setColumns(10);
		
		JButton btnclear = new JButton("C");
		btnclear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnclear.setBackground(new Color(8, 131, 149));
		btnclear.setForeground(new Color(253, 240, 240));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T.setText(null);
				return;
			}
		});
		btnclear.setBounds(24, 146, 66, 66);
		frame.getContentPane().add(btnclear);
		
		JButton btnbackspace = new JButton("←");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (T.getText().length() > 0) {
					String text = T.getText();
			        if (text.length() > 0) {
			            StringBuilder str = new StringBuilder(text);
			            str.deleteCharAt(text.length() - 1);
			            backspace = str.toString();
			            T.setText(backspace); 
				}
				}
			}
		});
		btnbackspace.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnbackspace.setBackground(new Color(42, 47, 79));
		btnbackspace.setForeground(new Color(175, 211, 226));
		btnbackspace.setBounds(100, 146, 66, 66);
		frame.getContentPane().add(btnbackspace);
		
		JButton btnpangkat = new JButton("x^y");
		btnpangkat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				second = Double.parseDouble(T.getText());
				T.setText("");
				operation = "x^y";

			}
		});
		btnpangkat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnpangkat.setBackground(new Color(42, 47, 79));
		btnpangkat.setForeground(new Color(175, 211, 226));
		btnpangkat.setBounds(176, 148, 66, 66);
		frame.getContentPane().add(btnpangkat);
		
		JButton btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				T.setText("");
				operation="%";
			}
		});
		btnmod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnmod.setBackground(new Color(42, 47, 79));
		btnmod.setForeground(new Color(175, 211, 226));
		btnmod.setBounds(252, 146, 66, 66);
		frame.getContentPane().add(btnmod);
		
		JButton btnbagi = new JButton("/");
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				T.setText("");
				operation="/";
			}
		});
		btnbagi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnbagi.setBackground(new Color(42, 47, 79));
		btnbagi.setForeground(new Color(175, 211, 226));
		btnbagi.setBounds(328, 146, 66, 66);
		frame.getContentPane().add(btnbagi);
		
		JButton btnsdsd = new JButton("==");
		btnsdsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				second = Double.parseDouble(T.getText());
				
				T.setText("");
				operation = "==";
			}
		});
		btnsdsd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnsdsd.setBackground(new Color(42, 47, 79));
		btnsdsd.setForeground(new Color(175, 211, 226));
		btnsdsd.setBounds(24, 223, 66, 66);
		frame.getContentPane().add(btnsdsd);
		
		JButton angka7 = new JButton("7");
		angka7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka7.getText();
				T.setText(number);
			}
		});
		angka7.setBackground(new Color(42, 47, 79));
		angka7.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka7.setForeground(new Color(253, 240, 240));
		angka7.setBounds(100, 223, 66, 66);
		frame.getContentPane().add(angka7);
		
		JButton angka8 = new JButton("8");
		angka8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka8.getText();
				T.setText(number);
			}
		});
		angka8.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka8.setBackground(new Color(42, 47, 79));
		angka8.setForeground(new Color(253, 240, 240));
		angka8.setBounds(176, 223, 66, 66);
		frame.getContentPane().add(angka8);
		
		JButton angka9 = new JButton("9");
		angka9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka9.getText();
				T.setText(number);
			}
		});
		angka9.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka9.setBackground(new Color(42, 47, 79));
		angka9.setForeground(new Color(253, 240, 240));
		angka9.setBounds(252, 223, 66, 66);
		frame.getContentPane().add(angka9);
		
		JButton angka9_1 = new JButton("*");
		angka9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				T.setText("");
				operation="*";
			}
		});
		angka9_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		angka9_1.setBackground(new Color(42, 47, 79));
		angka9_1.setForeground(new Color(175, 211, 226));
		angka9_1.setBounds(328, 223, 66, 66);
		frame.getContentPane().add(angka9_1);
		
		JButton btntidaksd = new JButton("!=");
		btntidaksd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				second = Double.parseDouble(T.getText());
				
				T.setText("");
				operation = "!=";
			}
		});
		btntidaksd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btntidaksd.setBackground(new Color(42, 47, 79));
		btntidaksd.setForeground(new Color(175, 211, 226));
		btntidaksd.setBounds(24, 300, 66, 66);
		frame.getContentPane().add(btntidaksd);
		
		JButton angka4 = new JButton("4");
		angka4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka4.getText();
				T.setText(number);
			}
		});
		angka4.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka4.setBackground(new Color(42, 47, 79));
		angka4.setForeground(new Color(253, 240, 240));
		angka4.setBounds(100, 300, 66, 66);
		frame.getContentPane().add(angka4);
		
		JButton angka5 = new JButton("5");
		angka5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka5.getText();
				T.setText(number);
			}
		});
		angka5.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka5.setBackground(new Color(42, 47, 79));
		angka5.setForeground(new Color(253, 240, 240));
		angka5.setBounds(176, 300, 66, 66);
		frame.getContentPane().add(angka5);
		
		JButton angka6 = new JButton("6");
		angka6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka6.getText();
				T.setText(number);
			}
		});
		angka6.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka6.setBackground(new Color(42, 47, 79));
		angka6.setForeground(new Color(253, 240, 240));
		angka6.setBounds(252, 300, 66, 66);
		frame.getContentPane().add(angka6);
		
		JButton btnkurang = new JButton("-");
		btnkurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				T.setText("");
				operation="-";
			}
		});
		btnkurang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnkurang.setBackground(new Color(42, 47, 79));
		btnkurang.setForeground(new Color(175, 211, 226));
		btnkurang.setBounds(328, 300, 66, 66);
		frame.getContentPane().add(btnkurang);
		
		JButton btnlebihdari = new JButton(">");
		btnlebihdari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				second = Double.parseDouble(T.getText());
				
				T.setText("");
				operation = ">";
			}
		});
		btnlebihdari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnlebihdari.setBackground(new Color(42, 47, 79));
		btnlebihdari.setForeground(new Color(175, 211, 226));
		btnlebihdari.setBounds(24, 374, 66, 66);
		frame.getContentPane().add(btnlebihdari);
		
		JButton angka1 = new JButton("1");
		angka1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka1.getText();
				T.setText(number);
			}
		});
		angka1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka1.setBackground(new Color(42, 47, 79));
		angka1.setForeground(new Color(253, 240, 240));
		angka1.setBounds(100, 374, 66, 66);
		frame.getContentPane().add(angka1);
		
		JButton angka2 = new JButton("2");
		angka2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka2.getText();
				T.setText(number);
			}
		});
		angka2.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka2.setBackground(new Color(42, 47, 79));
		angka2.setForeground(new Color(253, 240, 240));
		angka2.setBounds(176, 374, 66, 66);
		frame.getContentPane().add(angka2);
		
		JButton angka3 = new JButton("3");
		angka3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka3.getText();
				T.setText(number);
			}
		});
		angka3.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka3.setBackground(new Color(42, 47, 79));
		angka3.setForeground(new Color(253, 240, 240));
		angka3.setBounds(252, 374, 66, 66);
		frame.getContentPane().add(angka3);
		
		JButton btntambah = new JButton("+");
		btntambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				T.setText("");
				operation="+";
			}
		});
		btntambah.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btntambah.setBackground(new Color(42, 47, 79));
		btntambah.setForeground(new Color(175, 211, 226));
		btntambah.setBounds(328, 374, 66, 66);
		frame.getContentPane().add(btntambah);
		
		JButton btnkurangdari = new JButton("<");
		btnkurangdari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				second = Double.parseDouble(T.getText());
				
				T.setText ("");
				operation = "<";
		}
		});
		btnkurangdari.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnkurangdari.setBackground(new Color(42, 47, 79));
		btnkurangdari.setForeground(new Color(175, 211, 226));
		btnkurangdari.setBounds(24, 449, 66, 66);
		frame.getContentPane().add(btnkurangdari);
		
		JButton btnlebihdarisd = new JButton(">=");
		btnlebihdarisd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(T.getText());
				second = Double.parseDouble(T.getText());
				
				T.setText ("");
				operation = ">=";
			}
		});
		btnlebihdarisd.setBackground(new Color(42, 47, 79));
		btnlebihdarisd.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 20));
		btnlebihdarisd.setForeground(new Color(253, 240, 240));
		btnlebihdarisd.setBounds(100, 451, 66, 66);
		frame.getContentPane().add(btnlebihdarisd);
		
		JButton angka0 = new JButton("0");
		angka0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+angka0.getText();
				T.setText(number);
			}
		});
		angka0.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		angka0.setBackground(new Color(42, 47, 79));
		angka0.setForeground(new Color(253, 240, 240));
		angka0.setBounds(176, 451, 66, 66);
		frame.getContentPane().add(angka0);
		
		JButton btnkurangdarisd = new JButton("<=");
		btnkurangdarisd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(T.getText());
				second=Double.parseDouble(T.getText());
				
				T.setText("");
				operation = "<=";
			}
		});
		btnkurangdarisd.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnkurangdarisd.setBackground(new Color(42, 47, 79));
		btnkurangdarisd.setForeground(new Color(253, 240, 240));
		btnkurangdarisd.setBounds(252, 451, 66, 66);
		frame.getContentPane().add(btnkurangdarisd);
		
		JButton btntitik = new JButton(".");
		btntitik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=T.getText()+btntitik.getText();
				T.setText(number);
			}
		});
		btntitik.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btntitik.setBackground(new Color(42, 47, 79));
		btntitik.setForeground(new Color(175, 211, 226));
		btntitik.setBounds(328, 451, 66, 66);
		frame.getContentPane().add(btntitik);
		
		JButton btnHasil = new JButton("HASIL");
		btnHasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kosong = T.getText();
				if (kosong.isEmpty()) {
		            T.setText("Masukkan angka!");
		        }
				second = Double.parseDouble(kosong);
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					T.setText(answer);
				} else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					T.setText(answer);
				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					T.setText(answer);
				} else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					T.setText(answer);
				} else if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					T.setText(answer);

				} else if (operation.equals("==")) {
					banding = first.equals(second);
					T.setText(String.valueOf(banding));
				} else if (operation == "<=") {
					banding = first <= second;
					T.setText(String.valueOf(banding));
				} else if (operation == ">") {
					banding = first > second;
					T.setText(String.valueOf(banding));
				} else if (operation == ">=") {
					banding = first >= second;
					T.setText(String.valueOf(banding));
				} else if (operation == "<") {
					banding = first < second;
					T.setText(String.valueOf(banding));
				} else if (operation.equals("!=")) {
					banding = !first.equals(second);
					T.setText(String.valueOf(banding));
				} else if (operation == "x^y") {
					result = Math.pow(first, second);
					answer = String.format("%.2f", result);
					T.setText(answer);
				}else {
		            T.setText("Masukkan Operasi!");
		            return;
		        }
				operation = "";
				first = (double) 0;
				second = (double) 0;
			}
		});
		btnHasil.setFont(new Font("Sitka Text", Font.BOLD, 20));
		btnHasil.setBackground(new Color(159, 13, 127));
		btnHasil.setForeground(new Color(253, 240, 240));
		btnHasil.setBounds(24, 526, 370, 66);
		frame.getContentPane().add(btnHasil);
		
		JLabel lblScientificCalculator = new JLabel("Scientific Calculator");
		lblScientificCalculator.setForeground(new Color(253, 240, 240));
		lblScientificCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblScientificCalculator.setFont(new Font("Monospaced", Font.PLAIN, 16));
		lblScientificCalculator.setBounds(24, 5, 370, 14);
		frame.getContentPane().add(lblScientificCalculator);
		
		JLabel lblNewLabel = new JLabel("Create by Putu Ayunda - 075 🖤 ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(253, 240, 240));
		lblNewLabel.setBounds(24, 603, 370, 14);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 432, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
