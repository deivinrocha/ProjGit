package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Classes.Banco;
import Classes.Cliente;
import Classes.Data;
import Classes.Funcionario;
import Classes.Usuario;

public class TelaCadUser extends JFrame {

	private JPanel contentPane;	
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textDataN;
	private JTextField textLogin;
	private JTextField textSenha;

	
	public TelaCadUser() {
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setBounds(100, 100, 443, 254);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarMembro = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastrarMembro.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCadastrarMembro.setBounds(137, 11, 213, 36);
		contentPane.add(lblCadastrarMembro);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(66, 58, 103, 14);
		contentPane.add(lbNome);		
		
		JButton btnEnviar = new JButton("Enviar >>");
		btnEnviar.setBounds(323, 186, 97, 31);
		contentPane.add(btnEnviar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(219, 186, 94, 31);
		contentPane.add(btnCancelar);
		
		JLabel lbCpf = new JLabel("CPF:");
		lbCpf.setBounds(66, 83, 46, 14);
		contentPane.add(lbCpf);
		
		JLabel lbDataN = new JLabel("Data de Nascimento:");
		lbDataN.setBounds(66, 108, 141, 14);
		contentPane.add(lbDataN);
		
		JLabel lbLogin = new JLabel("Login:");
		lbLogin.setBounds(66, 133, 132, 14);
		contentPane.add(lbLogin);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setBounds(66, 158, 141, 14);
		contentPane.add(lbSenha);
		
		textNome = new JTextField();
		textNome.setBounds(195, 58, 239, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		textNome.setText("Digite seu Nome");
		
		textCpf = new JTextField();
		textCpf.setText("XXX-XXX-XXX-XX");
		textCpf.setBounds(195, 80, 239, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textDataN = new JTextField();
		textDataN.setText("DD/MM/AAAA");
		textDataN.setBounds(195, 105, 239, 20);
		contentPane.add(textDataN);
		textDataN.setColumns(10);
		
		textLogin = new JTextField();
		textLogin.setText("Digite seu login de acesso");
		textLogin.setBounds(195, 130, 239, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setText("Digite sua senha");
		textSenha.setBounds(195, 155, 240, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Enviar >>")){										
					/*Usuario novo = new Usuario(textNome.getText(), textCpf.getText(),
							new Data(textDataN.getText()), textLogin.getText(),textSenha.getText());*/
					Usuario novo = new Usuario(textLogin.getText(), textSenha.getText(),textNome.getText());
					if(Banco.inserir(novo)){
						JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");					
					}
					setVisible(false);
					new TelaPrincipal().setVisible(true);
								
				}				
			}
			
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Cancelar")){
					new TelaCadCliente().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);						
					new TelaCadastro().setVisible(true);
					
				}
				
			}
		});
	}	

}
