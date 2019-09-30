package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{
	
	private JPanel contentPane;
	private JTextField codTextField;
	private JTextField nameTextField;
	private JTextField cpfTextField;
	private JTextField phoneTextField;
	private JTextField andressTextField;
	private JTextField numberTextField;
	private JTextField neighborhoodTextField;
	private JTextField cityTextField;
	private JTextField stateTextField;
	
	public TelaCadastro() {
		setTitle("Cadastrar");
		setSize(800, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();

	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		JLabel codLabel = new JLabel();
		codLabel.setText("Código:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(15, 15, 15, 15);
		contentPane.add(codLabel, gbc);

		codTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(codTextField, gbc);

		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(nameLabel, gbc);

		nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(nameTextField, gbc);

		JLabel cpflLabel = new JLabel();
		cpflLabel.setText("CPF:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(cpflLabel, gbc);

		cpfTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(cpfTextField, gbc);
		
		JLabel phoneLabel = new JLabel();
		phoneLabel.setText("Telefone:");
		gbc.gridx = 2;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(phoneLabel,gbc);
		
		phoneTextField = new JTextField();
		gbc.gridx = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(phoneTextField, gbc);
		
		JLabel andressLabel = new JLabel();
		andressLabel.setText("Endereço:");
		gbc.gridy = 3;
		gbc.gridx = 0;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(andressLabel,gbc);
		
		andressTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(andressTextField,gbc);
		
		JLabel numberLabel = new JLabel();
		numberLabel.setText("Nº:");
		gbc.gridx = 2;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(numberLabel,gbc);
		
		numberTextField = new JTextField();
		gbc.gridx = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(numberTextField,gbc);
			
		JLabel neighborhoodLabel = new JLabel();
		neighborhoodLabel.setText("Bairro:");
		gbc.gridy = 4;
		gbc.gridx = 0;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(neighborhoodLabel,gbc);
		
		neighborhoodTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(neighborhoodTextField,gbc);
		
		JLabel cityLabel = new JLabel();
		cityLabel.setText("Cidade:");
		gbc.gridy = 5;
		gbc.gridx = 0;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(cityLabel,gbc);
		
		cityTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(cityTextField,gbc);
		
		JLabel stateLabel = new JLabel();
		stateLabel.setText("Estado:");
		gbc.gridx = 2;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(stateLabel,gbc);
		
		stateTextField = new JTextField();
		gbc.gridx = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(stateTextField,gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(saveButton, gbc);
		
		JButton backButton = new JButton();
		backButton.setText("Voltar");
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tela2 = new TelaPrincipal();
				tela2.setVisible(true);
			}
		});
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(backButton,gbc);
		
		JButton clearButton = new JButton();
		saveButton.setText("Limpar");
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				codTextField.setText(null);
				nameTextField.setText(null);
				cpfTextField.setText(null);
				phoneTextField.setText(null);
				andressTextField.setText(null);
			    numberTextField.setText(null);
				neighborhoodTextField.setText(null);
				cityTextField.setText(null);
				stateTextField.setText(null);
			}
		});
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(saveButton, gbc);
	}

}
