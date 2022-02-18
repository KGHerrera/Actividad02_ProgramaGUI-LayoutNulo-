import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;

class VentanaInicio extends JFrame{
	public VentanaInicio() {
		
		getContentPane().setLayout(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setSize(950, 650);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		//panel1.setBackground(new Color(250,250,250));
		panel1.setBounds(20, 20, 270, 560);
		
		JLabel txtTitulo = new JLabel("The Classic Form includes all visible fields");
		JLabel txtTitulo2 = new JLabel("for the list");
		txtTitulo.setBounds( 10, 10, 250, 20);
		txtTitulo2.setBounds( 10, 30, 250, 20);
		
		JLabel txtOpciones = new JLabel("Form Options");
		txtOpciones.setBounds( 10, 65, 250, 25);
		txtOpciones.setFont(new Font("Calibri",Font.PLAIN, 20));
		
		JLabel txtInclude = new JLabel("Include the following");
		txtInclude.setBounds( 10, 90, 250, 20);
		
		JCheckBox checkTitulo = new JCheckBox("a title for your form");
		checkTitulo.setBounds(10, 140, 250, 20);
		
		JTextField cajaNombre = new JTextField(8);
		cajaNombre.setBounds(10, 165, 220, 30);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioOnly = new JRadioButton("only requiered fields");
		JRadioButton radioAll = new JRadioButton("all fields");
		
		radioOnly.setBounds(10, 210, 250, 20);
		radioAll.setBounds(10, 230, 250, 20);
		
		JLabel txtEdit = new JLabel("<html><body>(edit requiered fields <b style=\"color:#00AAE4\";>in the form builder</b>)</body></html>");
		txtEdit.setBounds(20, 250, 250, 20);
		txtEdit.setFont(new Font("Calibri", Font.PLAIN, 11));
		
		JCheckBox checkInterest = new JCheckBox("interest group fields");
		checkInterest.setBounds(10, 300, 250, 20);
		
		JCheckBox checkIndi = new JCheckBox("required field indicators");
		checkIndi.setBounds(10, 320, 250, 20);
		
		JLabel txtSet = new JLabel("Set form width");
		txtSet.setBounds(10, 350, 250, 20);
		
		JTextField cajaWidth = new JTextField(10);
		cajaWidth.setBounds(10, 375, 220, 30);
		
		
		
		JLabel txtEn = new JLabel("Enhance your form");
		txtEn.setBounds(10, 420, 250, 20);
		
		JCheckBox checkEnable = new JCheckBox("enable evil popup mode");
		checkEnable.setBounds(10, 450, 250, 20);
		
		JCheckBox checkDisable = new JCheckBox("disable all JavaScript");
		checkDisable.setBounds(10, 475, 150, 20);
		
		JCheckBox checkInclude = new JCheckBox("include archive link");
		checkInclude.setBounds(10, 500, 140, 20);
		
		JCheckBox checkMonkey = new JCheckBox("<html><body> include <b style=\"color:#00AAE4\";> MonkeyRewards link </p></body></html>");
		checkMonkey.setBounds(10, 525, 350, 20);
		
		ImageIcon iconInfo = new ImageIcon("src/Icon/i2.png");
		JLabel txtInfo = new JLabel("info");
		txtInfo.setIcon(iconInfo);
		txtInfo.setBounds(160, 475, 70, 20);
		
		
		
		JLabel txtInfo2 = new JLabel("info");
		txtInfo2.setIcon(iconInfo);
		txtInfo2.setBounds(150, 500, 70, 20);
		
		panel1.add(txtInfo);
		panel1.add(txtInfo2);
		
		panel1.add(txtInfo);
		panel1.add(checkEnable);
		panel1.add(checkDisable);
		panel1.add(checkInclude);
		panel1.add(checkMonkey);
		
		panel1.add(cajaWidth);
		panel1.add(txtEn);
		bg.add(radioAll);
		panel1.add(radioAll);
		bg.add(radioOnly);
		panel1.add(radioOnly);
		panel1.add(checkInterest);
		panel1.add(checkIndi);
		panel1.add(txtEdit);
		panel1.add(checkTitulo);
		panel1.add(cajaNombre);
		panel1.add(txtTitulo);
		panel1.add(txtTitulo2);
		panel1.add(txtOpciones);
		panel1.add(txtInclude);
		panel1.add(txtSet);
		
		
		add(panel1);
		
		JLabel txtPre = new JLabel("Preview");
		txtPre.setBounds(320, 30, 200, 25);
		txtPre.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		//panel2.setBackground(new Color(250, 250 , 250));
		panel2.setBounds(320, 60, 580, 280);
		panel2.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		
		
		JLabel txtEmail = new JLabel("Email Addres");
		txtEmail.setBounds(20, 20, 200, 25);
		txtEmail.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JFormattedTextField cajaEmail = new JFormattedTextField();
		cajaEmail.setBounds(20, 40, 500, 35);
		
		JLabel txtFirst = new JLabel("First Name");
		txtFirst.setBounds(20, 90, 200, 25);
		txtFirst.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JTextField cajaFirst = new JTextField(8);
		cajaFirst.setBounds(20, 110, 500, 35);
		
		JLabel txtLast = new JLabel("Last Name");
		txtLast.setBounds(20, 160, 200, 25);
		txtLast.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		JTextField cajaLast = new JTextField(8);
		cajaLast.setBounds(20, 180, 500, 35);
		
		JButton botonSus = new JButton("Suscribe");
		botonSus.setBounds(20, 230, 125, 35);
		
		ImageIcon iconobtn = new ImageIcon("src/Icon/i1.png");
		botonSus.setBackground(new Color(150,150,150));
		botonSus.setForeground(Color.white);
		botonSus.setFont(new Font("Calibri", Font.PLAIN, 18));
		botonSus.setBorder(null);
		
		botonSus.setIcon(iconobtn);
		
		JLabel txtReq = new JLabel("* indicates required");
		txtReq.setBounds(400, 10, 200, 25);
		txtReq.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		panel2.add(txtReq);
		panel2.add(cajaEmail);
		panel2.add(txtEmail);
		
		panel2.add(cajaFirst);
		panel2.add(txtFirst);
		
		panel2.add(cajaLast);
		panel2.add(txtLast);
		
		panel2.add(botonSus);
		
		JLabel txtCopy = new JLabel("Copy/paste onto your site");
		txtCopy.setBounds(320, 380, 250, 20);
		txtCopy.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		JTextArea areaCodigo = new JTextArea();
		areaCodigo.setText("<form action=\"/my-handling-form-page\" method=\"post\">\r\n"
				+ " <ul>\r\n"
				+ "  <li>\r\n"
				+ "    <label for=\"name\">Nombre:</label>\r\n"
				+ "    <input type=\"text\" id=\"name\" name=\"user_name\">\r\n"
				+ "  </li>\r\n"
				+ "  <li>\r\n"
				+ "    <label for=\"mail\">Correo electrónico:</label>\r\n"
				+ "    <input type=\"email\" id=\"mail\" name=\"user_mail\">\r\n"
				+ "  </li>\r\n"
				+ "  <li>\r\n"
				+ "    <label for=\"msg\">Mensaje:</label>\r\n"
				+ "    <textarea id=\"msg\" name=\"user_message\"></textarea>\r\n"
				+ "  </li>\r\n"
				+ " </ul>\r\n"
				+ "</form>");
		
		
		areaCodigo.setLineWrap(true);
		areaCodigo.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		areaCodigo.setWrapStyleWord(true);
	
		areaCodigo.setFont(new Font("Calibri", Font.PLAIN, 16));
		areaCodigo.setBackground(new Color(250, 250, 250));
		
		
		JScrollPane scroll = new JScrollPane(areaCodigo);
		scroll.setBounds(320, 410, 580, 170);	
		scroll.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		
		
		
		add(scroll);
		
		add(txtCopy);
		
		
		add(panel2);
		add(txtPre);
		
		
	}
}

public class PruebaActividad2 {
	public static void main(String[] args) {
			
			
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {				
				// TODO Auto-generated method stub
				new VentanaInicio();
				
			}
		});
	}
}
