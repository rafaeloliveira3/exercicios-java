import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe seu Peso: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.println("Informe sua Altura: ");
        double altura = Double.parseDouble(input.nextLine());

        double alturaQuad = Math.pow(altura, 2);

        double imc = peso / alturaQuad;
        double imcArred = Math.round(imc);

        if(imc < 17){
            System.out.println("Você está MUITO Abaixo do Peso! (imc = " +imcArred +")");
        }
        else if(imc >= 17 && imc <= 18.49){
            System.out.println("Você está Abaixo do Peso! (imc = " +imcArred +")");
        }
        else if(imc >= 18.5 && imc <= 24.99){
            System.out.println("Você está com o Peso normal! (imc = " +imcArred +")");
        }
        else if(imc >= 25 && imc <= 29.99){
            System.out.println("Você está levemente acima do Peso! (imc = " +imcArred +")");
        }
        else if(imc >= 30 && imc <= 34.99){
            System.out.println("Você está com Obesidade I! (imc = " +imcArred +")");
        }
        else if(imc >= 35 && imc <= 39.99){
            System.out.println("Você está com Obesidade II! (imc = " +imcArred +")");
        }
        else{
            System.out.println("Você está com Obesidade III! Cuidado (imc = " +imcArred +")");
        }
    }
}
