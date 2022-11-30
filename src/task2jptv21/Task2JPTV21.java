//Создать программу, которая вычисляет сумму цифр введенного трехзначного числа.
package task2jptv21;

import java.util.Scanner;

public class Task2JPTV21 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write number: ");
        int n = input.nextInt();
        System.out.println("Summa is writed number's = " + sumDigits(n));
    }

    private static int sumDigits(int n) {
        int sum = 0; 
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
}
