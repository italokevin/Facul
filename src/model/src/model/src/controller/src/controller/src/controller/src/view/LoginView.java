package view;

import controller.LoginController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {
    private JTextField txtEmail;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnSair;
    private LoginController controller;
    
    public LoginView() {
        controller = new LoginController();
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Sistema de Eventos - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));
        painelPrincipal.setBackground(new Color(240, 240, 240));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel lblTitulo = new JLabel("SISTEMA DE EVENTOS", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(51, 102, 255));
        painelPrincipal.add(lblTitulo, BorderLayout.NORTH);
        
        JPanel painelForm = new JPanel();
        painelForm.setLayout(new GridLayout(3, 2, 10, 10));
        painelForm.setBackground(new Color(240, 240, 240));
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        txtSenha = new JPasswordField();
        txtSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        
        painelForm.add(lblEmail);
        painelForm.add(txtEmail);
        painelForm.add(lblSenha);
        painelForm.add(txtSenha);
        
        painelPrincipal.add(painelForm, BorderLayout.CENTER);
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        painelBotoes.setBackground(new Color(240, 240, 240));
        
        btnLogin = new JButton("Entrar");
        btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
        btnLogin.setBackground(new Color(51, 102, 255));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.setPreferredSize(new Dimension(120, 35));
        
        btnSair = new JButton("Sair");
        btnSair.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSair.setBackground(new Color(200, 200, 200));
        btnSair.setFocusPainted(false);
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSair.setPreferredSize(new Dimension(120, 35));
        
        painelBotoes.add(btnLogin);
        painelBotoes.add(btnSair);
        
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);
        
        JLabel lblDica = new JLabel("Dica: admin@sistema.com / admin123", SwingConstants.CENTER);
        lblDica.setFont(new Font("Arial", Font.ITALIC, 11));
        lblDica.setForeground(Color.GRAY);
        painelPrincipal.add(lblDica, BorderLayout.AFTER_LAST_LINE);
        
        add(painelPrincipal);
        
        btnLogin.addActionListener((ActionEvent e) -> {
            realizarLogin();
        });
        
        btnSair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        txtSenha.addActionListener((ActionEvent e) -> {
            realizarLogin();
        });
    }
    
    private void realizarLogin() {
        String email = txtEmail.getText();
        String senha = new String(txtSenha.getPassword());
        controller.processarLogin(email, senha, this);
    }
}
