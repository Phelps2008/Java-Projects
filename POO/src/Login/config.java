package Login;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField; //JPasswordField serve para ocultar senhas;
import javax.swing.JPanel;

public class config extends JFrame implements ActionListener {
    JTextField txtUser;
    JLabel lblUsuario;
    JPasswordField txtSenha;
    JLabel lblSenha;
    JButton btnOk;
    JButton btnCancel;
    Font fntDefault;

    public config() {
        super("Login");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        fntDefault = new Font("serif", Font.PLAIN, 25);
        
        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(fntDefault);
        txtUser = new JTextField();
        
        lblSenha = new JLabel("Senha:");
        lblSenha.setFont(fntDefault);
        txtSenha = new JPasswordField();
        
        btnOk = new JButton("Ok");
        btnOk.addActionListener(this);
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(this);
        
        JPanel painelEsquerdo = new JPanel(new GridLayout(4, 1, 5, 5));
        painelEsquerdo.add(lblUsuario);
        painelEsquerdo.add(txtUser);
        painelEsquerdo.add(lblSenha);
        painelEsquerdo.add(txtSenha);

        JPanel painelDireito = new JPanel(new GridLayout(2, 1, 5, 5));
        btnOk.setPreferredSize(new Dimension(80, 80));
        btnCancel.setPreferredSize(new Dimension(80, 80));
        painelDireito.add(btnOk);
        painelDireito.add(btnCancel);

        c.add(painelEsquerdo, BorderLayout.CENTER);
        c.add(painelDireito, BorderLayout.EAST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            // Captura os dados digitados
            String usuarioDigitado = txtUser.getText();
            String senhaDigitada = new String(txtSenha.getPassword());
            
            // Compara as credenciais
            if (usuarioDigitado.equals("admin") && senhaDigitada.equals("123abc")) {
                // Mensagem de sucesso
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Login validado!", 
                        "Sucesso", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mensagem de erro
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Login inválido!", 
                        "Erro de Autenticação", 
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
            // Limpa os campos em ambos os casos (Sucesso ou Erro)
            txtUser.setText("");
            txtSenha.setText("");
            txtUser.requestFocus(); // Devolve o cursor para o campo de usuário
            
        } else if (e.getSource() == btnCancel) {
            // O botão Cancel apenas limpa sem exibir mensagens
            txtUser.setText("");
            txtSenha.setText("");
            txtUser.requestFocus();
        }
    }
}