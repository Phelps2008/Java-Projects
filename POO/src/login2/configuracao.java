package login2;

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
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class configuracao extends JFrame implements ActionListener {
    JTextField txtUser;
    JLabel lblUsuario;
    JPasswordField txtSenha;
    JLabel lblSenha;
    JButton btnOk;
    JButton btnCancel;
    Font fntDefault;

    private String usuarioCorreto;
    private String senhaCorreta;
    private int tentativasRestantes = 3;

    public configuracao(String usuario, String senha) {
        super("Login");
        this.usuarioCorreto = usuario;
        this.senhaCorreta = senha;

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        fntDefault = new Font("serif", Font.PLAIN, 25);
        
        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(fntDefault);
        txtUser = new JTextField();
        
        lblSenha = new JLabel("Senha:");
        lblSenha.setFont(fntDefault);
        txtSenha = new JPasswordField();
        
        btnOk = new JButton("Login");
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
            String usuarioDigitado = txtUser.getText();
            String senhaDigitada = new String(txtSenha.getPassword());
            
            if (usuarioDigitado.trim().isEmpty() || senhaDigitada.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                        "Erro: Ambos os campos (usuário e senha) devem estar preenchidos!", 
                        "Campos Vazios", 
                        JOptionPane.WARNING_MESSAGE);
                txtUser.setText("");
                txtSenha.setText("");
                txtUser.requestFocus();
                return;
            }
            
            if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(this, 
                        "Login validado com sucesso!", 
                        "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                tentativasRestantes--;
                
                if (tentativasRestantes > 0) {
                    JOptionPane.showMessageDialog(this, 
                            "Login inválido! Tentativas restantes: " + tentativasRestantes, 
                            "Erro de Autenticação", 
                            JOptionPane.ERROR_MESSAGE);
                    txtUser.setText("");
                    txtSenha.setText("");
                    txtUser.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, 
                            "Número máximo de tentativas excedido. Acesso bloqueado!", 
                            "Acesso Bloqueado", 
                            JOptionPane.ERROR_MESSAGE);
                    txtUser.setEnabled(false);
                    txtSenha.setEnabled(false);
                    btnOk.setEnabled(false);
                }
            }
            
        } else if (e.getSource() == btnCancel) {
            txtUser.setText("");
            txtSenha.setText("");
            txtUser.requestFocus();
        }
    }
}