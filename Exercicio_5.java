import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua Idade: ");
        int idade = Integer.parseInt(input.nextLine());

        if(idade  >= 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }   
    }
}
