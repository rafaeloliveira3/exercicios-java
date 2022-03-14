import java.util.Scanner;

public class Exercicio_1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um n°:");
        double num = Double.parseDouble(input.nextLine());

        if(num == 0){
            System.out.println("O Número informado é ZERO");
        }
        else if(num > 0){
            System.out.println("O Número informado é Maior que Zero");
        }
        else{
            System.out.println("O Número informado é NEGATIVO");
        }
    }
}