
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      int num1 = sc.nextInt();
      System.out.print("Digite o segundop número: ");
      int num2 = sc.nextInt();

      Calculadora calculadora = new Calculadora();
      int soma = calculadora.somar(num1, num2);

      System.out.println("A soma é: "+ soma);
      sc.close();
    }
}