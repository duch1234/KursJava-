package pl.developerpi91.mainMVC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.JEditorPane;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GeneratorView {

	private JFrame frame;
	private JRadioButton rdbtnCard26;
	private JRadioButton rdbtnCard30;
	private JRadioButton rdbtnCard50;
	private JCheckBox chckbxCheckSum;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JFormattedTextField textFieldIlosc;

	private JFormattedTextField ftfPrefixCard;
	private JFormattedTextField ftfEowCard;
	private JFormattedTextField ftfNumerPaczkiCard;
	private JFormattedTextField ftfZakresCard;
	private JFormattedTextField ftfRokCard;

	private JFormattedTextField ftfPrefixStb;
	private JFormattedTextField ftfRokStb;
	private JFormattedTextField ftfEowStb;
	private JFormattedTextField ftfNumerPaczkiStb;
	private JFormattedTextField ftfZakresStb;
	private JFormattedTextField ftfPrefixEsnSTB;
	
	private JLabel lblRok;
	private JLabel lblEow;
	private JLabel lblNumerPaczki;
	private JLabel lblZakres;
	private JLabel lblPrefixSn;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel lblPrefixEsn;
	private Panel  panel_2;
	private JButton btnGeneratujKarty;
	private JButton btnGeneratujStb;
	private JEditorPane console;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneratorView window = new GeneratorView();
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
	public GeneratorView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().setForeground(SystemColor.desktop);
		frame.setBounds(100, 100, 846, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 191, 830, 12);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(10, 24, 230, 39);
		frame.getContentPane().add(panel);
		
		rdbtnCard26 = new JRadioButton("PC2.6");
		rdbtnCard26.setBackground(Color.LIGHT_GRAY);
		panel.add(rdbtnCard26);
		buttonGroup.add(rdbtnCard26);


		
		rdbtnCard30 = new JRadioButton("PC3.0");
		rdbtnCard30.setBackground(Color.LIGHT_GRAY);
		panel.add(rdbtnCard30);
		buttonGroup.add(rdbtnCard30);

		
		rdbtnCard50 = new JRadioButton("PC5.0");
		rdbtnCard50.setSelected(true);
		rdbtnCard50.setBackground(Color.LIGHT_GRAY);
		panel.add(rdbtnCard50);
		buttonGroup.add(rdbtnCard50);

		
		chckbxCheckSum = new JCheckBox("Generuj Sum\u0119 kontroln\u0105");

		chckbxCheckSum.setBounds(261, 24, 200, 39);
		frame.getContentPane().add(chckbxCheckSum);
		
		textFieldIlosc = new JFormattedTextField();
		textFieldIlosc.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIlosc.setBounds(127, 74, 100, 23);
		frame.getContentPane().add(textFieldIlosc);
		
		JTextPane txtpnIlo = new JTextPane();
		txtpnIlo.setBackground(SystemColor.inactiveCaption);
		txtpnIlo.setForeground(Color.BLACK);
		txtpnIlo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnIlo.setEditable(false);
		txtpnIlo.setText("Ilosc");
		txtpnIlo.setBounds(41, 77, 62, 20);
		frame.getContentPane().add(txtpnIlo);
		
		console = new JEditorPane();
		console.setBounds(578, 301, 108, 113);
		frame.getContentPane().add(console);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(25, 115, 405, 71);
		frame.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{82, 62, 68, 99, 39, 69, 0};
		gbl_panel_1.rowHeights = new int[]{25, 20, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblPrefix = new JLabel("Prefix");
		GridBagConstraints gbc_lblPrefix = new GridBagConstraints();
		gbc_lblPrefix.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrefix.gridx = 0;
		gbc_lblPrefix.gridy = 0;
		panel_1.add(lblPrefix, gbc_lblPrefix);
		
		lblRok = new JLabel("Rok");
		GridBagConstraints gbc_lblRok = new GridBagConstraints();
		gbc_lblRok.insets = new Insets(0, 0, 5, 5);
		gbc_lblRok.gridx = 1;
		gbc_lblRok.gridy = 0;
		panel_1.add(lblRok, gbc_lblRok);
		
		lblEow = new JLabel("EOW");
		GridBagConstraints gbc_lblEow = new GridBagConstraints();
		gbc_lblEow.insets = new Insets(0, 0, 5, 5);
		gbc_lblEow.gridx = 2;
		gbc_lblEow.gridy = 0;
		panel_1.add(lblEow, gbc_lblEow);
		
		lblNumerPaczki = new JLabel("Numer Paczki");
		GridBagConstraints gbc_lblNumerPaczki = new GridBagConstraints();
		gbc_lblNumerPaczki.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumerPaczki.gridx = 3;
		gbc_lblNumerPaczki.gridy = 0;
		panel_1.add(lblNumerPaczki, gbc_lblNumerPaczki);
		
		lblZakres = new JLabel("Zakres");
		GridBagConstraints gbc_lblZakres = new GridBagConstraints();
		gbc_lblZakres.insets = new Insets(0, 0, 5, 0);
		gbc_lblZakres.gridx = 5;
		gbc_lblZakres.gridy = 0;
		panel_1.add(lblZakres, gbc_lblZakres);
		
		ftfPrefixCard = new JFormattedTextField();
		ftfPrefixCard.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfPrefixCard = new GridBagConstraints();
		gbc_ftfPrefixCard.insets = new Insets(0, 0, 0, 5);
		gbc_ftfPrefixCard.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfPrefixCard.gridx = 0;
		gbc_ftfPrefixCard.gridy = 1;
		panel_1.add(ftfPrefixCard, gbc_ftfPrefixCard);
		
		ftfRokCard = new JFormattedTextField();
		ftfRokCard.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfRokCard = new GridBagConstraints();
		gbc_ftfRokCard.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfRokCard.insets = new Insets(0, 0, 0, 5);
		gbc_ftfRokCard.gridx = 1;
		gbc_ftfRokCard.gridy = 1;
		panel_1.add(ftfRokCard, gbc_ftfRokCard);
		
		ftfEowCard = new JFormattedTextField();
		ftfEowCard.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfEowCard = new GridBagConstraints();
		gbc_ftfEowCard.insets = new Insets(0, 0, 0, 5);
		gbc_ftfEowCard.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfEowCard.gridx = 2;
		gbc_ftfEowCard.gridy = 1;
		panel_1.add(ftfEowCard, gbc_ftfEowCard);
		
		ftfNumerPaczkiCard = new JFormattedTextField();
		ftfNumerPaczkiCard.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfNumerPaczkiCard = new GridBagConstraints();
		gbc_ftfNumerPaczkiCard.insets = new Insets(0, 0, 0, 5);
		gbc_ftfNumerPaczkiCard.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfNumerPaczkiCard.gridx = 3;
		gbc_ftfNumerPaczkiCard.gridy = 1;
		panel_1.add(ftfNumerPaczkiCard, gbc_ftfNumerPaczkiCard);
		
		ftfZakresCard = new JFormattedTextField();
		ftfZakresCard.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfZakresCard = new GridBagConstraints();
		gbc_ftfZakresCard.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfZakresCard.gridx = 5;
		gbc_ftfZakresCard.gridy = 1;
		panel_1.add(ftfZakresCard, gbc_ftfZakresCard);
		
		panel_2 = new Panel();
		panel_2.setBounds(25, 219, 405, 71);
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{82, 62, 68, 99, 39, 69, 0};
		gbl_panel_2.rowHeights = new int[]{25, 20, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		lblPrefixSn = new JLabel("Prefix SN");
		GridBagConstraints gbc_lblPrefixSn = new GridBagConstraints();
		gbc_lblPrefixSn.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrefixSn.gridx = 0;
		gbc_lblPrefixSn.gridy = 0;
		panel_2.add(lblPrefixSn, gbc_lblPrefixSn);
		
		label_1 = new JLabel("Rok");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		panel_2.add(label_1, gbc_label_1);
		
		label_2 = new JLabel("EOW");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 0;
		panel_2.add(label_2, gbc_label_2);
		
		label_3 = new JLabel("Numer Paczki");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 0;
		panel_2.add(label_3, gbc_label_3);
		
		label_4 = new JLabel("Zakres");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 0);
		gbc_label_4.gridx = 5;
		gbc_label_4.gridy = 0;
		panel_2.add(label_4, gbc_label_4);
		
		ftfPrefixStb = new JFormattedTextField();
		ftfPrefixStb.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfPrefixStb = new GridBagConstraints();
		gbc_ftfPrefixStb.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfPrefixStb.insets = new Insets(0, 0, 0, 5);
		gbc_ftfPrefixStb.gridx = 0;
		gbc_ftfPrefixStb.gridy = 1;
		panel_2.add(ftfPrefixStb, gbc_ftfPrefixStb);
		
		ftfRokStb = new JFormattedTextField();
		ftfRokStb.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfRokStb = new GridBagConstraints();
		gbc_ftfRokStb.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfRokStb.insets = new Insets(0, 0, 0, 5);
		gbc_ftfRokStb.gridx = 1;
		gbc_ftfRokStb.gridy = 1;
		panel_2.add(ftfRokStb, gbc_ftfRokStb);
		
		ftfEowStb = new JFormattedTextField();
		ftfEowStb.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfEowStb = new GridBagConstraints();
		gbc_ftfEowStb.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfEowStb.insets = new Insets(0, 0, 0, 5);
		gbc_ftfEowStb.gridx = 2;
		gbc_ftfEowStb.gridy = 1;
		panel_2.add(ftfEowStb, gbc_ftfEowStb);
		
		ftfNumerPaczkiStb = new JFormattedTextField();
		ftfNumerPaczkiStb.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfNumerPaczkiStb = new GridBagConstraints();
		gbc_ftfNumerPaczkiStb.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfNumerPaczkiStb.insets = new Insets(0, 0, 0, 5);
		gbc_ftfNumerPaczkiStb.gridx = 3;
		gbc_ftfNumerPaczkiStb.gridy = 1;
		panel_2.add(ftfNumerPaczkiStb, gbc_ftfNumerPaczkiStb);
		
		ftfZakresStb = new JFormattedTextField();
		ftfZakresStb.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_ftfZakresStb = new GridBagConstraints();
		gbc_ftfZakresStb.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftfZakresStb.gridx = 5;
		gbc_ftfZakresStb.gridy = 1;
		panel_2.add(ftfZakresStb, gbc_ftfZakresStb);
		
		btnGeneratujKarty = new JButton("Generuj Karty");
		btnGeneratujKarty.setBounds(526, 157, 125, 23);
		frame.getContentPane().add(btnGeneratujKarty);
		
		btnGeneratujStb = new JButton("Generuj STB");
		btnGeneratujStb.setBounds(526, 267, 125, 23);
		frame.getContentPane().add(btnGeneratujStb);
		
		lblPrefixEsn = new JLabel("Prefix ESN");
		lblPrefixEsn.setBounds(25, 328, 62, 14);
		frame.getContentPane().add(lblPrefixEsn);
		
		ftfPrefixEsnSTB = new JFormattedTextField();
		ftfPrefixEsnSTB.setText("ORANICU1000001");
		ftfPrefixEsnSTB.setHorizontalAlignment(SwingConstants.CENTER);
		ftfPrefixEsnSTB.setBounds(25, 353, 125, 20);
		frame.getContentPane().add(ftfPrefixEsnSTB);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(181, 301, 376, 113);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setToolTipText("dg\r\nd\r\nd\r\nd\r\nd\r\nd\r\n\r\nd\r\nd\r\nd\r\ndd");
		textArea.setTabSize(30);
		textArea.setWrapStyleWord(true);
		

	}
	
	// =============================================================== METHODS AND LISTENERS ================================================================================
	
	public void addInputListenerValidator(ActionListener inputVerifier) {
		textFieldIlosc.addActionListener(inputVerifier);
		
		
//		ftfPrefixCard.getDocument().addDocumentListener(listener);
		//Card
		ftfPrefixCard.addActionListener(inputVerifier);			//diff in STB
		ftfRokCard.addActionListener(inputVerifier);
		ftfEowCard.addActionListener(inputVerifier);
		ftfNumerPaczkiCard.addActionListener(inputVerifier);
		ftfZakresCard.addActionListener(inputVerifier);
		
		//STB
		ftfPrefixStb.addActionListener(inputVerifier);			//diff in card
		ftfRokStb.addActionListener(inputVerifier);
		ftfEowStb.addActionListener(inputVerifier);
		ftfNumerPaczkiStb.addActionListener(inputVerifier);
		ftfZakresStb.addActionListener(inputVerifier);
	}
	public void addConsoleListener(ActionListener console) {
		 Timer timer = new Timer(1000, console);
		 timer.addActionListener(console);
		 timer.start();

	}
	
	public void addCheckSumListener(ActionListener checkSum) {
		chckbxCheckSum.addActionListener(checkSum);
	}
	
    public void addCardTypeListener(ActionListener cardType ) {
    	rdbtnCard26.addActionListener(cardType);		  //PC2.6
    	rdbtnCard30.addActionListener(cardType);		 //PC3.0
    	rdbtnCard50.addActionListener(cardType); 		//PC5.0
    }

	public boolean getChckbxCheckSum() {
		return chckbxCheckSum.isSelected();
	}

	public boolean setChckbxCheckSum(boolean checkSum) {
		chckbxCheckSum.setSelected(checkSum);
		chckbxCheckSum.updateUI();
		return true;		
	}
	
	public void addButtonListener(ActionListener buttonType) {
		btnGeneratujKarty.addActionListener(buttonType);
		btnGeneratujStb.addActionListener(buttonType);
	}
	
    //=============================================== GETTERs AND SETTERs FOR JFormattedTextField ELEMENTs ===================================================================
//	public JEditorPane getConsole() {
//		return textArea;
//	}
	public JFormattedTextField getTextFieldIlosc() {
		return textFieldIlosc;
	}
	
	public JFormattedTextField getFtfPrefixCard() {
		return ftfPrefixCard;
	}

	public JFormattedTextField getFtfEowCard() {
		return ftfEowCard;
	}

	public JFormattedTextField getFtfNumerPaczkiCard() {
		return ftfNumerPaczkiCard;
	}

	public JFormattedTextField getFtfZakresCard() {
		return ftfZakresCard;
	}

	public JFormattedTextField getFtfRokCard() {
		return ftfRokCard;
	}

	public JFormattedTextField getFtfPrefixStb() {
		return ftfPrefixStb;
	}

	public JFormattedTextField getFtfRokStb() {
		return ftfRokStb;
	}

	public JFormattedTextField getFtfEowStb() {
		return ftfEowStb;
	}

	public JFormattedTextField getFtfNumerPaczkiStb() {
		return ftfNumerPaczkiStb;
	}

	public JFormattedTextField getFtfZakresStb() {
		return ftfZakresStb;
	}

	public JFormattedTextField getFtfPrefixEsnSTB() {
		return ftfPrefixEsnSTB;
	}

	public void setFtfPrefixCard(String ftfPrefixCard) {
		this.ftfPrefixCard.setText(ftfPrefixCard) ;
	}

	public void setFtfEowCard(String ftfEowCard) {
		this.ftfEowCard.setText(ftfEowCard);
	}

	public void setFtfNumerPaczkiCard(String ftfNumerPaczkiCard) {
		this.ftfNumerPaczkiCard.setText(ftfNumerPaczkiCard);
	}

	public void setFtfZakresCard(String ftfZakresCard) {
		this.ftfZakresCard.setText(ftfZakresCard);
	}

	public void setFtfRokCard(String ftfRokCard) {
		this.ftfRokCard.setText(ftfRokCard);
	}

	public void setFtfPrefixStb(String ftfPrefixStb) {
		this.ftfPrefixStb.setText(ftfPrefixStb);
	}

	public void setFtfRokStb(String ftfRokStb) {
		this.ftfRokStb.setText(ftfRokStb);
	}

	public void setFtfEowStb(String ftfEowStb) {
		this.ftfEowStb.setText(ftfEowStb);
	}

	public void setFtfNumerPaczkiStb(String ftfNumerPaczkiStb) {
		this.ftfNumerPaczkiStb.setText(ftfNumerPaczkiStb);
	}

	public void setFtfZakresStb(String ftfZakresStb) {
		this.ftfZakresStb.setText(ftfZakresStb);
	}

	public void setFtfPrefixEsnSTB(String ftfPrefixEsnSTB) {
		this.ftfPrefixEsnSTB.setText(ftfPrefixEsnSTB);
	}
	public void setTextFieldIlosc(String textFieldIlosc) {
		this.textFieldIlosc.setText(textFieldIlosc) ;
	}

	public void setConsole(String console) {
		this.textArea.setText(console);
	}
	Timer timer = new Timer(100, new ActionListener() {
	     public void actionPerformed(ActionEvent e) {
	    	 System.out.println("dupa");
	     }
	});
	private JTextArea textArea;
}
