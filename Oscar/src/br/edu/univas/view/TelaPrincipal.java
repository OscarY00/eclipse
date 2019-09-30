package br.edu.univas.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	public TelaPrincipal() {
		setTitle("Inicio");
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

		JLabel welcomeLabel = new JLabel();
		welcomeLabel.setText("Olá Seja Bem-Vindo!");
		welcomeLabel.setFont(new Font("Arial", 1, 25));
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.CENTER;
		contentPane.add(welcomeLabel, gbc);

		JButton exitButtuon = new JButton();
		exitButtuon.setText("Sair");
		gbc.gridx = 0;
		gbc.gridy = 1;
		exitButtuon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		contentPane.add(exitButtuon, gbc);

		JButton cadastrarButton = new JButton();
		cadastrarButton.setText("Cadastrar");
		gbc.gridx = 1;
		gbc.gridy = 1;
		cadastrarButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFisico telacad = new CadastroFisico();
				telacad.setVisible(true);
			}
		});
		contentPane.add(cadastrarButton, gbc);

	}

}
