package org.example.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Bate_papo implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println(usuario.getNome() + " entrou no bate-papo.");
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        if (!usuarios.contains(remetente)) {
            System.out.println("Erro: " + remetente.getNome() + " não está permitido no bate-papo.");
            return;
        }

        for (Usuario usuario : usuarios) {
            if (usuario != remetente) {
                usuario.receberMensagem(mensagem, remetente);
            }
        }
    }
}
