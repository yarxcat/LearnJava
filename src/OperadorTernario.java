import java.util.Locale;
import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Desconto de 20% valido apenas para compras acima de 200R$.");
        System.out.print("Qual foi o valor da compra? ");

        double compra = input.nextDouble();
        double calculoDesconto = compra * (compra > 200?.20:0);
        double resultadoFinal = compra - calculoDesconto;

        System.out.printf("O valor da sua compra foi de %.2f R$\n" +
                "O valor da sua compra com o desconto aplicado é de %.2f R$",compra, resultadoFinal);

        input.close();

    }
}
