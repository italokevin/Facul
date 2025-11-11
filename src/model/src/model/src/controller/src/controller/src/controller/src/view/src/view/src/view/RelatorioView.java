package view;

import controller.RelatorioController;
import javax.swing.*;
import java.awt.*;

public class RelatorioView extends JFrame {
    private RelatorioController controller;
    private JTextArea txtRelatorio;
    
    public RelatorioView() {
        this.controller = new RelatorioController();
        initComponents();
        carregarRelatorio();
    }
    
    private void initComponents() {
        setTitle("Sistema de Eventos - Relatórios");
        setSize(700, 600);
        setLocationRelativeTo(null);
        
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        JLabel lblTitulo = new JLabel("Relatório Completo de Eventos");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(new Color(51, 102, 255));
        painelPrincipal.add(lblTitulo, BorderLayout.NORTH);
        
        txtRelatorio = new JTextArea();
        txtRelatorio.setFont(new Font("Monospaced", Font.PLAIN, 12));
        txtRelatorio.setEditable(false);
        txtRelatorio.setMargin(new Insets(10, 10, 10, 10));
        
        JScrollPane scrollPane = new JScrollPane(txtRelatorio);
        painelPrincipal.add(scrollPane, BorderLayout.CENTER);
        
        JButton btnFechar = new JButton("Fechar");
        btnFechar.setFont(new Font("Arial", Font.BOLD, 14));
        btnFechar.setBackground(new Color(200, 200, 200));
        btnFechar.setFocusPainted(false);
        btnFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnFechar.addActionListener(e -> dispose());
        
        JPanel painelBotao = new JPanel();
        painelBotao.add(btnFechar);
        painelPrincipal.add(painelBotao, BorderLayout.SOUTH);
        
        add(painelPrincipal);
    }
    
    private void carregarRelatorio() {
        String relatorio = controller.gerarRelatorioCompleto();
        txtRelatorio.setText(relatorio);
        txtRelatorio.setCaretPosition(0);
    }
}
