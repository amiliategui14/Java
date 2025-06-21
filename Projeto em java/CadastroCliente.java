import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====Cadastro de Cliente====");

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa quebra de linha

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("\n=== Dados Cadastrados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + "anos");
        System.out.println("Email: " + email);

        sc.close();
    }
}