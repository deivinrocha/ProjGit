package Telas;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Classes.Cliente;
import Classes.Usuario;
import Classes.Funcionario;
import Classes.Banco;
import Classes.Venda;

public class TelaVendas extends JFrame implements ActionListener {
	
	Usuario users;
    Container p = getContentPane();
    JButton btnInserir,btnListar,btnRemover,btnVoltar;
    JScrollPane bRolagem;
    JPanel pnNorte,pnCentro;
    JTable bD;        
    String[] colunas = {"ID","Nome do Funcionário","Nome do Cliente","Nome do Produto","valor $"};
    Object[][] dados = new String[40][5];
    public TelaVendas(Usuario users){
    	this.users = users;
    	setTitle("Gerenciamento de Vendas");
        setLayout(new BorderLayout());
        setResizable(false);
        pnNorte = new JPanel(new GridLayout(1,4,10,10));
        pnCentro = new JPanel(new FlowLayout());
        
        JButton btnInserir = new JButton("Inserir");
        JButton btnListar = new JButton("Listar");
        JButton btnRemover = new JButton("Remover");
        JButton btnVoltar = new JButton("Voltar");
        
        pnNorte.add(btnInserir); 
        pnNorte.add(btnListar);
        pnNorte.add(btnRemover);        
        pnNorte.add(btnVoltar);
        
        p.add(pnNorte,BorderLayout.NORTH);
        p.add(pnCentro,BorderLayout.CENTER);

        btnInserir.addActionListener(this);
        btnInserir.setActionCommand("Inserir");
        btnListar.addActionListener(this);
        btnListar.setActionCommand("Listar");
        btnRemover.addActionListener(this);
        btnRemover.setActionCommand("Remover");
        btnVoltar.addActionListener(this);
        btnVoltar.setActionCommand("Voltar");

        setVisible(true);  
        setLocationRelativeTo(null);
        setSize(500,100);        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void listTab(){
    	pnCentro.setLayout(new FlowLayout());
    	pnCentro.removeAll();
               
        List bDados = Banco.ListVendas();        
        Iterator listUs = bDados.iterator();
        int i = 0;
            while(listUs.hasNext()){            	
                Venda v = (Venda)listUs.next();
                /*Object[][] dados= {{""+v.getId(), ""+v.getFuncionario().getNome(), ""+v.getCliente().getNome(),""+v.getNomeProd(),""+v.getValor()},
				{"", "", "","",""},
				{"","","","",""},
				{"", "", "","",""}*/
                dados[i][0] = ""+v.getId();
                dados[i][1] = ""+v.getFuncionario().getNome();
                dados[i][2] = ""+v.getCliente().getNome();
                dados[i][3] = ""+v.getNomeProd();
                dados[i][4] = ""+v.getValor();
                i++;
            }
            
            DefaultTableModel model = new DefaultTableModel(dados,colunas);
            bD = new JTable(model);
            bD.setEnabled(false);           
            bD.getColumnModel().getColumn(0).setMaxWidth(3);
            bD.setPreferredScrollableViewportSize(new Dimension(450,150));
            bD.setFillsViewportHeight(true);
            this.bRolagem = new JScrollPane(bD);               
            pnCentro.add(bRolagem);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pnCentro.setVisible(true);
            setSize(500,300);
            setVisible(true);
    }   
    
    public void actionPerformed(ActionEvent e) {
    	 
        if(e.getActionCommand().equals("Inserir")){
        	setVisible(false);
			new TelaInsVenda().setVisible(true);
        }
        if(e.getActionCommand().equals("Listar")){
            pnCentro.setVisible(false);
            listTab();
        }
        if(e.getActionCommand().equals("Remover")){  
        	 pnCentro.removeAll();
             pnCentro.setVisible(false);
            String id = JOptionPane.showInputDialog("Digite o ID da Venda");
            Venda delVenda = Banco.alterarVenda(id);    
            Banco.ListVendas().remove(delVenda);                      
        }
        if(e.getActionCommand().equals("Voltar")){
    			setVisible(false);
    			new TelaPrincipal().setVisible(true);
    	}
    			
   	}
    			
    	
       
        
        
}
    

