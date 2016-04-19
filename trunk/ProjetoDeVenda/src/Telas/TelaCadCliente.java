package Telas;
import Classes.Cliente;
import Classes.Banco;
import Classes.Data;
import Classes.Pessoa;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TelaCadCliente extends JFrame{
	
	private JPanel contentPane;	
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textDataN;
	private JTextField textFormaP;
	private JTextField textTipoC;
	private JTextField textUltimaC;			
		
		public TelaCadCliente() {
			setResizable(false);			
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setToolTipText("");
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			setVisible(true);
			
			JLabel lblCadastrarMembro = new JLabel("Cadastro de Cliente");
			lblCadastrarMembro.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblCadastrarMembro.setBounds(137, 11, 202, 36);
			contentPane.add(lblCadastrarMembro);
			
			JLabel lblNome = new JLabel("Nome: ");
			lblNome.setBounds(66, 58, 103, 14);
			contentPane.add(lblNome);			
			
			JButton btnEnviar = new JButton("Enviar >>");
			btnEnviar.setBounds(327, 220, 97, 31);
			contentPane.add(btnEnviar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(219, 220, 94, 31);
			contentPane.add(btnCancelar);
			
			JLabel lblCpf = new JLabel("CPF: ");
			lblCpf.setBounds(66, 83, 46, 14);
			contentPane.add(lblCpf);
			
			JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
			lblDataDeNascimento.setBounds(66, 108, 141, 14);
			contentPane.add(lblDataDeNascimento);
			
			JLabel lblFormaDePagamento = new JLabel("Forma de Pagamento: ");
			lblFormaDePagamento.setBounds(66, 133, 132, 14);
			contentPane.add(lblFormaDePagamento);
			
			JLabel lblTipoDeCliente = new JLabel("Tipo de Cliente: ");
			lblTipoDeCliente.setBounds(66, 158, 141, 14);
			contentPane.add(lblTipoDeCliente);
			
			JLabel lblltimaCompra = new JLabel("\u00DAltima Compra: ");
			lblltimaCompra.setBounds(66, 183, 103, 14);
			contentPane.add(lblltimaCompra);
			
			textNome = new JTextField();
			textNome.setBounds(195, 58, 240, 20);
			contentPane.add(textNome);
			textNome.setColumns(10);
			textNome.setText("Digite seu Nome");
			
			textCpf = new JTextField();
			textCpf.setBounds(195, 80, 240, 20);
			contentPane.add(textCpf);
			textCpf.setColumns(10);
			textCpf.setText("XXX-XXX-XXX-XX");
			
			textDataN = new JTextField();
			textDataN.setBounds(195, 105, 239, 20);
			contentPane.add(textDataN);
			textDataN.setColumns(10);
			textDataN.setText("DD/MM/AAAA");
			
			textFormaP = new JTextField();
			textFormaP.setBounds(195, 130, 239, 20);
			contentPane.add(textFormaP);
			textFormaP.setColumns(10);
			textFormaP.setText("Cartão ou Dinheiro?");
			
			textTipoC = new JTextField();
			textTipoC.setBounds(195, 155, 240, 20);
			contentPane.add(textTipoC);
			textTipoC.setColumns(10);
			
			textUltimaC = new JTextField();
			textUltimaC.setBounds(195, 180, 239, 20);
			contentPane.add(textUltimaC);
			textUltimaC.setColumns(10);
			textUltimaC.setText("DD/MM/AAAA");
			//btnProximo.setVisible(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			btnEnviar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand().equals("Enviar >>")){						
						Cliente novo = new Cliente(textNome.getText(), textCpf.getText(), new Data(textDataN.getText()),
								textFormaP.getText(), textTipoC.getText(), new Data(textUltimaC.getText()));						
						if(Banco.inserir(novo)){
							JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!");
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
						//new TelaCadCliente().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);						
						//setVisible(false);
						new TelaCadastro().setVisible(true);
						setVisible(false);
						
					}
					
				}
			});
		}
	}


