package gui;

	import java.awt.BorderLayout;
	import java.awt.Container;
	import java.awt.Dimension;
	import java.awt.FlowLayout;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class ViewEtec extends JFrame {

	    JButton btnCurtir;
	    JButton btnCompartilhar;
	    JButton btnSair;
	    JButton btnAjuda;
	    JButton btnConfig;
	    JButton btnOk;

	    public ViewEtec() {

	        super("Atividade Layout");

	        Container c = getContentPane();
	        c.setLayout(new BorderLayout());

	        JPanel painelEsquerdo = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
	        JPanel painelDireito = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 10));

	        painelEsquerdo.setLayout(new java.awt.GridLayout(2, 1, 5, 5));
	        painelDireito.setLayout(new java.awt.GridLayout(4, 1, 5, 5));

	        btnCurtir = new JButton("Curtir");
	        btnCompartilhar = new JButton("Compartilhar");

	        btnSair = new JButton("Sair");
	        btnAjuda = new JButton("Ajuda");
	        btnConfig = new JButton("Config");
	        btnOk = new JButton("Ok");

	        btnCurtir.setPreferredSize(new Dimension(100, 100));
	        btnCompartilhar.setPreferredSize(new Dimension(100, 100));

	        btnSair.setPreferredSize(new Dimension(80, 80));
	        btnAjuda.setPreferredSize(new Dimension(80, 80));
	        btnConfig.setPreferredSize(new Dimension(80, 80));
	        btnOk.setPreferredSize(new Dimension(80, 80));

	        painelEsquerdo.add(btnCurtir);
	        painelEsquerdo.add(btnCompartilhar);

	        painelDireito.add(btnSair);
	        painelDireito.add(btnAjuda);
	        painelDireito.add(btnConfig);
	        painelDireito.add(btnOk);

	        c.add(painelEsquerdo, BorderLayout.CENTER);
	        c.add(painelDireito, BorderLayout.EAST);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(550, 500);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }
	}