package controller;

import model.Evento;
import model.UsuarioDAO;
import java.util.List;

public class RelatorioController {
    private UsuarioDAO usuarioDAO;
    
    public RelatorioController() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public List<Evento> getTodosEventos() {
        return usuarioDAO.listarEventos();
    }
    
    public String gerarRelatorioCompleto() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== RELATÓRIO GERAL DE EVENTOS ===\n\n");
        
        List<Evento> eventos = usuarioDAO.listarEventos();
        
        for (Evento evento : eventos) {
            relatorio.append("Evento: ").append(evento.getNome()).append("\n");
            relatorio.append("Data: ").append(evento.getData()).append("\n");
            relatorio.append("Local: ").append(evento.getLocal()).append("\n");
            relatorio.append("Capacidade: ").append(evento.getCapacidade()).append("\n");
            relatorio.append("Vendidos: ").append(evento.getIngressosVendidos()).append("\n");
            relatorio.append("Disponíveis: ").append(evento.getIngressosDisponiveis()).append("\n");
            relatorio.append("Ocupação: ").append(String.format("%.2f", evento.getPercentualOcupacao())).append("%\n");
            relatorio.append("Status: ").append(evento.getStatus()).append("\n");
            relatorio.append("-----------------------------------\n\n");
        }
        
        return relatorio.toString();
    }
}
