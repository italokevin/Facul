package controller;

import model.Usuario;
import model.UsuarioDAO;
import view.DashboardView;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginController {
    private UsuarioDAO usuarioDAO;
    
    public LoginController() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public boolean processarLogin(String email, String senha, JFrame frameAtual) {
        if (email.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(frameAtual, 
                "Por favor, preencha todos os campos!", 
                "Campos Vazios", 
                JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        Usuario usuario = usuarioDAO.autenticar(email, senha);
        
        if (usuario != null) {
            JOptionPane.showMessageDialog(frameAtual, 
                "Bem-vindo, " + usuario.getNome() + "!", 
                "Login Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            DashboardView dashboard = new DashboardView(usuario);
            dashboard.setVisible(true);
            frameAtual.dispose();
            return true;
        } else {
            JOptionPane.showMessageDialog(frameAtual, 
                "Email ou senha incorretos!", 
                "Erro de Autenticação", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
