package controller;

import model.Evento;
import model.UsuarioDAO;
import java.util.List;

public class DashboardController {
    private UsuarioDAO usuarioDAO;
    
    public DashboardController() {
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public int getTotalEventos() {
        return usuarioDAO.getTotalEventos();
    }
    
    public int getTotalIngressosVendidos() {
        return usuarioDAO.getTotalIngressosVendidos();
    }
    
    public int getTotalUsuarios() {
        return usuarioDAO.getTotalUsuarios();
    }
    
    public List<Evento> getEventosAtivos() {
        return usuarioDAO.listarEventosAtivos();
    }
}
