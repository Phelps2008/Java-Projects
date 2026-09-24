package exemploListen;

	import java.awt.Container;
	import java.awt.Font;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class ex1 extends JFrame implements ActionListener{
		
		JTextField txtNome;
		JLabel lblNome;
		JButton btnNome;
		Font fntDefault;
		
		public ex1() {
			Container c = getContentPane();
			setLayout(new GridLayout(3, 1));
			fntDefault = new Font("serif", 10, 25);
			lblNome = new JLabel("Olá, ");
			lblNome.setFont(fntDefault);
			txtNome = new JTextField();
			btnNome = new JButton("Ok");
			btnNome.addActionListener(this);
			c.add(lblNome);
			c.add(txtNome);
			c.add(btnNome);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300, 200);
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			lblNome.setText(lblNome.getText() + txtNome.getText() + "!");
			txtNome.setText("");
		}
		
		public static void main(String[] args) {
			new ex1();
			
		}
	}
