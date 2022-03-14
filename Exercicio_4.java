import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um Número: ");
        Double num1 = Double.parseDouble(input.nextLine());

        if(num1 % 2 == 0){
            System.out.println("o número informado é par.");
        }
        else{
            System.out.println("o número informado é impar.");
        }
    }
}
