package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PrincipalView extends JFrame {

	private JPanel contentPane;


	/*
	 * Create the frame.
	 */
	public PrincipalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSejaBemvindo = new JLabel("Bem-Vindo");
		lblSejaBemvindo.setFont(new Font("Arial", 1, 22));
		lblSejaBemvindo.setBounds(145, 33, 164, 31);
		contentPane.add(lblSejaBemvindo);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setBounds(31, 100, 150, 23);
		btnCadastrarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cadastro1 cadastro = new Cadastro1();
				cadastro.setVisible(true);dispose();;
			}
		});
		contentPane.add(btnCadastrarCliente);
		
		JButton btnExit = new JButton("Sair");
		btnExit.setBounds(31, 134, 150, 23);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		contentPane.add(btnExit);
	}

}
