package app;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\n1. Adicionar contato ");
        System.out.println("2. Remover contato ");
        System.out.println("3. Editar contato ");
        System.out.println("4. Listar contatos ");
        System.out.println("5. Sair ");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                agenda.adicionarContato(new Contato(nome, telefone, email));
                break;
            case 2:
                System.out.print("Nome do contato a remover: ");
                nome = scanner.nextLine();
                agenda.removerContato(nome);
                break;
            case 3:
                System.out.print("Nome do contato a editar: ");
                nome = scanner.nextLine();
                agenda.editarContato(nome);
                break;
            case 4:
                agenda.listarContatos();
                break;
            case 5:
                System.out.println("Saindo...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    }
}
