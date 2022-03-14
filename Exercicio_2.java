import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um Número: ");
        Double num = Double.parseDouble(input.nextLine());

        if(num == 10){
            System.out.println("O Número informado é DEZ");
        }
        else if(num > 10){
            System.out.println("O Número informado é Maior que DEZ");
        }
        else{
            System.out.println("O Número informado é Menor que DEZ");
        }
    }
}

