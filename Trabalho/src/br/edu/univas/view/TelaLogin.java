package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {
	private JPanel contentPane;
	private JTextField userTextField;
	private JPasswordField passwordField;

	public TelaLogin() {
		setTitle("Login");
		setSize(400, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		initialize();

	}

	private void initialize() {
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);

		GridBagConstraints gbc = new GridBagConstraints();

		JLabel userLabel = new JLabel();
		userLabel.setText("Usuário:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(15, 15, 15, 15);
		contentPane.add(userLabel, gbc);

		userTextField = new JTextField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(userTextField, gbc);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Senha :");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.NONE;
		contentPane.add(passwordLabel, gbc);

		passwordField = new JPasswordField();
		gbc.gridx = 1;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		contentPane.add(passwordField, gbc);

		JButton enterButton = new JButton();
		enterButton.setText("Entrar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;

		enterButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (userTextField.getText().equals("Admin") && passwordField.getText().equals("Admin")) {
					PrincipalView tela1 = new PrincipalView();
					tela1.setVisible(true);dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Usuario ou Senha INCORRETOS!");
				}

			}
		});

		contentPane.add(enterButton, gbc);

	}

}
