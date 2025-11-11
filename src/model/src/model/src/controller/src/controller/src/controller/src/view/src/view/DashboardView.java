package view;

import controller.DashboardController;
import model.Evento;
import model.Usuario;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class DashboardView extends JFrame {
    private Usuario usuarioLogado;
    private DashboardController controller;
    private JLabel lblTotalEventos;
    private JLabel lblTotalIngressos;
    private JLabel lblTotalUsuarios;
    private JTable tabelaEventos;
    
    public DashboardView(Usuario usuario) {
        this.usuarioLogado = usuario;
        this.controller = new DashboardController();
        initComponents();
        carregarDados();
    }
    
    private void initComponents() {
        setTitle("Sistema de Eventos - Dashboard");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        painelPrincipal.setBackground(Color.WHITE);
        
        JPanel painelHeader = new JPanel(new BorderLayout());
        painelHeader.setBackground(new Color(51, 102, 255));
        painelHeader.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        JLabel lblTitulo = new JLabel("Dashboard - Bem-vindo, " + usuarioLogado.getNome());
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.WHITE);
        painelHeader.add(lblTitulo, BorderLayout.WEST);
        
        JButton btnSair = new JButton("Sair");
        btnSair.setBackground(Color.WHITE);
        btnSair.setForeground(new Color(51, 102, 255));
        btnSair.setFont(new Font("Arial", Font.BOLD, 12));
        btnSair.setFocusPainted(false);
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSair.addActionListener(e -> {
            new LoginView().setVisible(true);
            dispose();
        });
        painelHeader.add(btnSair, BorderLayout.EAST);
        
        painelPrincipal.add(painelHeader, BorderLayout.NORTH);
        
        JPanel painelStats = new JPanel();
        painelStats.setLayout(new GridLayout(1, 3, 15, 0));
        painelStats.setBackground(Color.WHITE);
        painelStats.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        
        JPanel card1 = criarCard("Total de Eventos", "0", new Color(52, 152, 219));
        lblTotalEventos = (JLabel) ((JPanel) card1.getComponent(1)).getComponent(0);
        painelStats.add(card1);
        
        JPanel card2 = criarCard("Ingressos Vendidos", "0", new Color(46, 204, 113));
        lblTotalIngressos = (JLabel) ((JPanel) card2.getComponent(1)).getComponent(0);
        painelStats.add(card2);
        
        JPanel card3 = criarCard("Usuários Cadastrados", "0", new Color(155, 89, 182));
        lblTotalUsuarios = (JLabel) ((JPanel) card3.getComponent(1)).getComponent(0);
        painelStats.add(card3);
        
        painelPrincipal.add(painelStats, BorderLayout.CENTER);
        
        JPanel painelEventos = new JPanel(new BorderLayout(10, 10));
        painelEventos.setBackground(Color.WHITE);
        
        JLabel lblEventosAtivos = new JLabel("Eventos Ativos");
        lblEventosAtivos.setFont(new Font("Arial", Font.BOLD, 16));
        painelEventos.add(lblEventosAtivos, BorderLayout.NORTH);
        
        String[] colunas = {"ID", "Nome", "Data", "Local", "Vendidos", "Capacidade", "Ocupação %"};
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        tabelaEventos = new JTable(modeloTabela);
        tabelaEventos.setFont(new Font("Arial", Font.PLAIN, 12));
        tabelaEventos.setRowHeight(25);
        tabelaEventos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        tabelaEventos.getTableHeader().setBackground(new Color(51, 102, 255));
        tabelaEventos.getTableHeader().setForeground(Color.WHITE);
        
        JScrollPane scrollPane = new JScrollPane(tabelaEventos);
        painelEventos.add(scrollPane, BorderLayout.CENTER);
        
        JButton btnRelatorios = new JButton("Gerar Relatório Completo");
        btnRelatorios.setFont(new Font("Arial", Font.BOLD, 14));
        btnRelatorios.setBackground(new Color(52, 152, 219));
        btnRelatorios.setForeground(Color.WHITE);
        btnRelatorios.setFocusPainted(false);
        btnRelatorios.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRelatorios.setPreferredSize(new Dimension(0, 40));
        btnRelatorios.addActionListener(e -> {
            new RelatorioView().setVisible(true);
        });
        
        painelEventos.add(btnRelatorios, BorderLayout.SOUTH);
        
        painelPrincipal.add(painelEventos, BorderLayout.SOUTH);
        
        add(painelPrincipal);
    }
    
    private JPanel criarCard(String titulo, String valor, Color cor) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout(10, 10));
        card.setBackground(cor);
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel lblTitulo = new JLabel(titulo, SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        lblTitulo.setForeground(Color.WHITE);
        card.add(lblTitulo, BorderLayout.NORTH);
        
        JPanel painelValor = new JPanel();
        painelValor.setBackground(cor);
        JLabel lblValor = new JLabel(valor, SwingConstants.CENTER);
        lblValor.setFont(new Font("Arial", Font.BOLD, 36));
        lblValor.setForeground(Color.WHITE);
        painelValor.add(lblValor);
        card.add(painelValor, BorderLayout.CENTER);
        
        return card;
    }
    
    private void carregarDados() {
        lblTotalEventos.setText(String.valueOf(controller.getTotalEventos()));
        lblTotalIngressos.setText(String.valueOf(controller.getTotalIngressosVendidos()));
        lblTotalUsuarios.setText(String.valueOf(controller.getTotalUsuarios()));
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaEventos.getModel();
        modelo.setRowCount(0);
        
        List<Evento> eventos = controller.getEventosAtivos();
        for (Evento evento : eventos) {
            Object[] linha = {
                evento.getId(),
                evento.getNome(),
                evento.getData(),
                evento.getLocal(),
                evento.getIngressosVendidos(),
                evento.getCapacidade(),
                String.format("%.1f%%", evento.getPercentualOcupacao())
            };
            modelo.addRow(linha);
        }
    }
}
