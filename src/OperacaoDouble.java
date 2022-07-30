import java.util.Locale;
import java.util.Scanner;

public class OperacaoDouble {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Calculado a media de notas ");
        System.out.print("Digite sua nota em matematica: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite sua nota em ingles: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite sua nota em lingua portuguesa: ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        System.out.printf("Sua media foi de %.2f", media);
        
        input.close();
    }
}
