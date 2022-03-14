import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um Número: ");
        Double num1 = Double.parseDouble(input.nextLine());
        System.out.println("Informe outro Número: ");
        Double num2 = Double.parseDouble(input.nextLine());

        if(num1 > num2){
            System.out.println("O Primeiro número é maior que o Segundo.");
        }
        else if(num1 < num2){
            System.out.println("O Segundo número é maior que o Primeiro.");
        }
        else{
            System.out.println("Os dois Números são iguais.");
        }
    }
}
