import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Insira a operação(+,-,*,/):");
            String op = input.nextLine();

            System.out.println("Insira o primeiro número:");
            int num1 = input.nextInt();

            System.out.println("Insira o segundo número:");
            int num2 = input.nextInt();

            int calc = Calculo(op, num1, num2);
            System.out.println("O resultado é: " + calc);
        }
    }
    public static Integer Calculo(String a, Integer b, Integer c){
        int result = 0;
            switch (a) {
                case "+":
                    result = b+c;
                    break;
                case "-":
                    result = b-c;
                    break;
                case "*":
                    result = b*c;
                    break;
                case "/":
                    result = b/c;
                    break;
                default:

                    break;
            }
        return result;
    }
}