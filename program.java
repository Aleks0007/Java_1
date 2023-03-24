import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // находим сумму чисел от 1 до n
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) triangleNumber += i;
                
        System.out.print("Треугольное число 1");
        for (int i = 2; i <= n; i++) System.out.print(" + " + i);
        
        System.out.println(" = " + triangleNumber);

        // находим n!
        int factorial = 1;
        for (int i = 1; i <= n; i++) factorial *= i; 
        
        System.out.print(String.format("%d! = 1", n));
        for (int i = 2; i <= n; i++) System.out.print(" * " + i);

        System.out.print(" = " + factorial);
        scanner.close();
    }
}