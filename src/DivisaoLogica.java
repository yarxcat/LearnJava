import java.util.Scanner;

public class DivisaoLogica {

        public static void main(String[] args) {
            // objeto Scanner para capturar o que foi digitado
            Scanner input = new Scanner(System.in);
            //mensagem para a inserção do primeiro valor
            System.out.println("Insira o valor do dividendo: ");

            //guarda o valor digitado pelo usuário na variável dividendo
            int dividendo = input.nextInt();
            //Imprime mensagem para a inserção do segundo valor
            System.out.println("Insira o valor do divisor: ");

            //Guarda o valor digitado pelo usuário na variável divisor
            int divisor = input.nextInt();
            //Verifica se o valor do cálculo da divisão é negativo
            if ((dividendo / divisor < 0)) {
                //Imprime o valor 0 caso o resultdo da divisão seja negativo
                System.out.println("Valor encontrado: 0");
            }
            //Verifica se o cálculo é positivo
            else if (dividendo / divisor > 0) {
                //Imprime o resultado do cálculo caso o resultado seja positivo
                System.out.println("Valor calculado: " + dividendo / divisor);
            }
            //Como o resultado não é positivo e nem negativo, podemos supor que o divisor é zero
            else {
                //Imprime o valor -1 pois o divisor é zero
                System.out.println("-1");
            }
        }
    }

