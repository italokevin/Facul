package model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Evento> eventos = new ArrayList<>();
    
    static {
        usuarios.add(new Usuario(1, "Igor Admin", "admin@sistema.com", "admin123", "admin"));
        usuarios.add(new Usuario(2, "João Silva", "joao@email.com", "123456", "comum"));
        usuarios.add(new Usuario(3, "Maria Santos", "maria@email.com", "123456", "comum"));
        
        eventos.add(new Evento(1, "Festival de Música 2025", "Grande festival com bandas nacionais", 
                              java.time.LocalDate.of(2025, 12, 15), "Arena São Paulo", 5000));
        eventos.add(new Evento(2, "Workshop de Tecnologia", "Palestra sobre IA e futuro", 
                              java.time.LocalDate.of(2025, 11, 20), "Centro de Convenções", 300));
        eventos.add(new Evento(3, "Show Beneficente", "Arrecadação para instituições", 
                              java.time.LocalDate.of(2025, 11, 25), "Teatro Municipal", 800));
        
        eventos.get(0).venderIngresso(3500);
        eventos.get(1).venderIngresso(280);
        eventos.get(2).venderIngresso(650);
    }
    
    public Usuario autenticar(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.validarCredenciais(email, senha)) {
                return usuario;
            }
        }
        return null;
    }
    
    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos);
    }
    
    public List<Evento> listarEventosAtivos() {
        List<Evento> eventosAtivos = new ArrayList<>();
        for (Evento evento : eventos) {
            if (evento.getStatus().equals("Ativo")) {
                eventosAtivos.add(evento);
            }
        }
        return eventosAtivos;
    }
    
    public int getTotalEventos() {
        return eventos.size();
    }
    
    public int getTotalIngressosVendidos() {
        int total = 0;
        for (Evento evento : eventos) {
            total += evento.getIngressosVendidos();
        }
        return total;
    }
    
    public int getTotalUsuarios() {
        return usuarios.size();
    }
}
