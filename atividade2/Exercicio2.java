import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Converter para (C/F):");
            String dir = input.nextLine();

            System.out.println("Insira a temperatura:");
            int temp = input.nextInt();
            int temperatura = Temperatura(dir, temp);
            System.out.println("O resultado é: " + temperatura);
        }
    }
    public static Integer Temperatura(String a, Integer b){
        int result = 0;
        switch (a) {
            case "F":
                result = (b * 9/5) + 32;
                break;
            case "C":
                result = (b - 32) * 5/9;
                break;
            default:

                break;
        }
        return result;
    }
}