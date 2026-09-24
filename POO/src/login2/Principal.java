package login2;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String usuarioCadastrado = null;
            String senhaCadastrada = null;

            while (true) {
                String u1 = JOptionPane.showInputDialog(null, "Digite o Nome de Usuário:", "Cadastro - 1ª Etapa", JOptionPane.QUESTION_MESSAGE);
                if (u1 == null) System.exit(0);

                String u2 = JOptionPane.showInputDialog(null, "Confirme o Nome de Usuário:", "Cadastro - 2ª Etapa", JOptionPane.QUESTION_MESSAGE);
                if (u2 == null) System.exit(0);

                if (u1.equals(u2) && !u1.trim().isEmpty()) {
                    usuarioCadastrado = u1;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, 
                            "Erro: Os nomes de usuário não conferem ou estão vazios. Tente novamente.", 
                            "Erro de Cadastro", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            while (true) {
                String s1 = JOptionPane.showInputDialog(null, "Digite a Senha:", "Cadastro - 1ª Etapa", JOptionPane.QUESTION_MESSAGE);
                if (s1 == null) System.exit(0);

                String s2 = JOptionPane.showInputDialog(null, "Confirme a Senha:", "Cadastro - 2ª Etapa", JOptionPane.QUESTION_MESSAGE);
                if (s2 == null) System.exit(0);

                if (s1.equals(s2) && !s1.trim().isEmpty()) {
                    senhaCadastrada = s1;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, 
                            "Erro: As senhas não conferem ou estão vazias. Tente novamente.", 
                            "Erro de Cadastro", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso! Abrindo tela de login...", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            new configuracao(usuarioCadastrado, senhaCadastrada);
        });
    }
}