package app;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;
public class Agenda {
    private List<Contato> contatos;
    private final String arquivo = "contatos.ser";

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso! ");
    }

    public void removerContato(String nome) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso! ");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void editarContato(String nome) {
        Contato contato = buscarContato(nome);
        if ( contato != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Novo nome; ");
            contato.setNome(scanner.nextLine());
            System.out.println("Novo telefone: ");
            contato.setTelefone(scanner.nextLine());
            System.out.println("Novo email: ");
            contato.setEmail(scanner.nextLine());
            System.out.println("Contato editado com sucesso! ");
        } else {
            System.out.println("Contato não encontrado! ");
        }
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato na agenda. ");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    private Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }
}
