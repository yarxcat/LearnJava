import java.util.Scanner;

public class OperacaoLogica {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Teste para carteira de motorista...");
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        int maiorIdade = 18;

        if(idade >= maiorIdade){
            System.out.println("Idade aprovada.");
        }
        else{
            System.out.println("Idade menor que perante a lei é permitida.");
        }
        
        input.close();

    }
}
