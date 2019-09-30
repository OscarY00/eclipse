package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroJuridico extends JFrame {

	private JPanel contentPane;
	private JTextField codTextField;
	private JTextField rSocialTextField;
	private JTextField cnpjTextField;
	private JTextField phoneTextField;
	private JTextField andressTextField;
	private JTextField numberTextField;
	private JTextField neighborhoodTextField;
	private JTextField cityTextField;
	private JTextField stateTextField;

	
	
	/**
	 * Create the frame.
	 */
	public CadastroJuridico() {
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
		codTextField.setBounds(86, 8, 66, 20);
		contentPane.add(codTextField);
		codTextField.setColumns(10);
		
		JLabel lblRScoial = new JLabel("Razão Social");
		lblRScoial.setBounds(10, 36, 76, 14);
		contentPane.add(lblRScoial);
		
		rSocialTextField = new JTextField();
		rSocialTextField.setBounds(86, 33, 588, 20);
		contentPane.add(rSocialTextField);
		rSocialTextField.setColumns(10);
		
		JLabel lblcnpj = new JLabel("CNPJ");
		lblcnpj.setBounds(10, 61, 46, 14);
		contentPane.add(lblcnpj);
		
		cnpjTextField = new JTextField();
		cnpjTextField.setBounds(86, 58, 251, 20);
		contentPane.add(cnpjTextField);
		cnpjTextField.setColumns(10);
		
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
		andressTextField.setBounds(86, 108, 436, 20);
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
		neighborhoodTextField.setBounds(86, 133, 588, 20);
		contentPane.add(neighborhoodTextField);
		neighborhoodTextField.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 161, 46, 14);
		contentPane.add(lblCidade);
		
		cityTextField = new JTextField();
		cityTextField.setBounds(86, 158, 186, 20);
		contentPane.add(cityTextField);
		cityTextField.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(508, 161, 86, 14);
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
				rSocialTextField.setText(null);
				cnpjTextField.setText(null);
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
