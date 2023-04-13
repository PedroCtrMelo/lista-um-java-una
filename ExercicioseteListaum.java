import java.util.Scanner;


public class ExercicioseteListaum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Escreva o salario fixo :");
        double salariofixo = scanner.nextDouble();

        System.out.println("Digite o valor total de vendas neste mes : ");
        double totaldevendas = scanner.nextDouble();
   
   
        System.out.println("Digite o percentual recebido por vendas : ");
        double percentualdevendas = scanner.nextDouble();
        
        percentualdevendas = percentualdevendas /100;

        
        
   
    }
}
