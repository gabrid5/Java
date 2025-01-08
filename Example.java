import java.util.Scanner;

public class Name {

    // Método principal
    public static void main(String[] args) {
        // Exibindo a saudação inicial
        System.out.println("Bem-vindo ao programa de exemplo!");

        // Chama o método para exibir o nome
        String nome = obterNome();
        System.out.println("Olá, " + nome + "!");

        // Chama o método para calcular a idade em dias
        int idade = obterIdade();
        int idadeEmDias = calcularIdadeEmDias(idade);
        System.out.println("Sua idade em dias é: " + idadeEmDias);

        // Chama o método para fazer um simples cálculo de soma
        double numero1 = obterNumero("primeiro");
        double numero2 = obterNumero("segundo");
        double soma = somar(numero1, numero2);
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
    }

    // Método para obter o nome do usuário
    public static String obterNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira seu nome: ");
        return scanner.nextLine();
    }

    // Método para obter a idade do usuário
    public static int obterIdade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira sua idade: ");
        return scanner.nextInt();
    }

    // Método para calcular a idade do usuário em dias
    public static int calcularIdadeEmDias(int idade) {
        return idade * 365; // Aproximação simples, sem considerar anos bissextos
    }

    // Método para solicitar um número do usuário
    public static double obterNumero(String ordem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o " + ordem + " número: ");
        return scanner.nextDouble();
    }

    // Método para somar dois números
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }
}