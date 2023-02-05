import java.util.Scanner;
//Program to print table of powers of 2
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,i=1;
        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        System.out.println("powers of two are: ");
        while (i <= number)                 //checking if i is less than or equal to input number
        { if(i == 1){
            System.out.println(i);
        } else if (i % 2 == 0) {
            System.out.println(i);
        }
        i++;
        }
    }
}