package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroFisico extends JFrame {

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

	
	
	/**
	 * Create the frame.
	 */
	public CadastroFisico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCdigo);
		
		codTextField = new JTextField();
		codTextField.setBounds(73, 8, 79, 20);
		contentPane.add(codTextField);
		codTextField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNome);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(73, 33, 601, 20);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel);
		
		cpfTextField = new JTextField();
		cpfTextField.setBounds(73, 58, 264, 20);
		contentPane.add(cpfTextField);
		cpfTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(347, 61, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		phoneTextField = new JTextField();
		phoneTextField.setBounds(403, 58, 271, 20);
		contentPane.add(phoneTextField);
		phoneTextField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 111, 89, 14);
		contentPane.add(lblEndereo);
		
		andressTextField = new JTextField();
		andressTextField.setBounds(73, 108, 449, 20);
		contentPane.add(andressTextField);
		andressTextField.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setBounds(532, 111, 12, 14);
		contentPane.add(lblN);
		
		numberTextField = new JTextField();
		numberTextField.setBounds(554, 108, 120, 20);
		contentPane.add(numberTextField);
		numberTextField.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(10, 136, 46, 14);
		contentPane.add(lblBairro);
		
		neighborhoodTextField = new JTextField();
		neighborhoodTextField.setBounds(73, 133, 601, 20);
		contentPane.add(neighborhoodTextField);
		neighborhoodTextField.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 161, 46, 14);
		contentPane.add(lblCidade);
		
		cityTextField = new JTextField();
		cityTextField.setBounds(73, 158, 199, 20);
		contentPane.add(cityTextField);
		cityTextField.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(509, 164, 86, 14);
		contentPane.add(lblEstado);
		
		stateTextField = new JTextField();
		stateTextField.setBounds(554, 158, 120, 20);
		contentPane.add(stateTextField);
		stateTextField.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 272, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(109, 272, 89, 23);
		btnLimpar.addActionListener(new ActionListener() {
			
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
		contentPane.add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(585, 272, 89, 23);
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PrincipalView tela2 = new PrincipalView();
				tela2.setVisible(true);dispose();
			}
		});
		contentPane.add(btnVoltar);
	}
}
