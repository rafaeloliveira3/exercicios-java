import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor em Metros: ");
        double metro = Double.parseDouble(input.nextLine());

        double mm = metro * 1000;
        double cm = metro * 100;
        double dm = metro * 10;
        double dam = metro / 10;
        double hm = metro / 100;
        double km = metro / 1000;
        System.out.println("Resultados das Conversões \nMilímetro: " +mm +"\nCentímetro: " +cm +"\nDecímetro: " +dm);
        System.out.println("Decâmetro: " +dam +"\nHectômetro: " +hm +"\nQuilômetro: " +km);
    }
    
}
