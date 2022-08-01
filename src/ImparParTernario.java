import java.util.Scanner;

public class ImparParTernario {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para saber se é ímpar ou par: ");
        int numero = input.nextInt();

        String resultado = numero%2 == 0 ? "O número é par!" : "O número é ímpar!";
        System.out.println(resultado);

         input.close();

    }
}
