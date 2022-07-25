package Giris;
import java.util.Scanner;
public class GelismisHesapMakinesi {
    static  void plus(){
        Scanner input = new Scanner(System.in);
        int a, results=0, b;
        char controlValue;
        boolean control = true;
        do {
            System.out.println("Enter your first value");
            a = input.nextInt();
            System.out.println("Enter your second value");
            b = input.nextInt();
            results =  a + b ;
            System.out.println("Results:\t" + results);
            System.out.println("if you want to exit Press E or if you want to continue press C.");
            controlValue = input.next().charAt(0);
            if ( controlValue == 'E')
                control = false;
        }
        while (control);

    }
    static  void minus(){
        int number, result=0, counter;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        counter = input.nextInt();
        for (int i=1 ; i <= counter ; i++){
            System.out.println(i + ". Number:\t");
            number = input.nextInt();
            if (i==1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Results:\t" + result);
    }

    static void multiply(){
        int a, results, b;
        Scanner input = new Scanner(System.in);
        char controlValue;
        boolean control = true;
        do {
            System.out.println("Enter your first value");
            a = input.nextInt();
            System.out.println("Enter your second value");
            b = input.nextInt();
            results =  a * b ;
            System.out.println("Results:\t" + results);
            System.out.println("if you want to exit Press E or if you want to continue press C.");
            controlValue = input.next().charAt(0);
            if ( controlValue == 'E')
                control = false;
        }
        while (control);
    }
    static void divide () {
        int  counter;
        double results = 0.0 , number;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        counter = input.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number:\t");
            number = input.nextInt();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter a divisor 0.");
                continue;
            }
                if (i == 1) {
                    results = results + number;
                    continue;
                }
                results = results / number;
        }
        System.out.println("Results:\t" + results);
    }
    static void power() {
        Scanner input = new Scanner(System.in);
        int base, exponent, results = 1;
        boolean control = true;
        char controlValue;
        do {
            System.out.print("Please enter the base value:\t");
            base = input.nextInt();
            System.out.print("Please enter the exponent value:\t");
            exponent = input.nextInt();
            for (int i = 1; i <= exponent; i++) {
                results *= base;
            }
            System.out.println("Results:\t" + results);
            System.out.println("if you want to exit Press E or if you want to continue press C.");
            controlValue = input.next().charAt(0);
            if ( controlValue == 'E')
                control = false;
        }
        while (control);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int results = 1, number;
        boolean control = true;
        char controlValue;
        do {
            System.out.print("Please enter your value:\t");
            number = input.nextInt();
            for (int i = 1; i <= number; i++) {
                results *= i;
            }
            System.out.println("Results:\t" + results);
            System.out.println("if you want to exit Press E or if you want to continue press C.");
            controlValue = input.next().charAt(0);
            if ( controlValue == 'E')
                control = false;
        }
        while(control);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        int results, a, b;
        char controlValue;
        boolean control = true;
        do {
            System.out.println("Enter your first value");
            a = input.nextInt();
            System.out.println("Enter your second value");
            b = input.nextInt();
            results =  a % b ;

            if (b== 0) {
                System.out.println("You cannot enter a divisor 0.");
            }
            System.out.println("Results:\t" + results);
            System.out.println("if you want to exit Press E or if you want to continue press C.");
            controlValue = input.next().charAt(0);
            if ( controlValue == 'E')
                control = false;
        }
        while (control);
    }
    static  void rectangle(){
        Scanner input = new Scanner(System.in);
        int area, perimeter, a, b;
        char controlValue;
        boolean control = true;
        while (control){
            System.out.println("Enter your first value");
            a = input.nextInt();
            System.out.println("Enter your second value");
            b = input.nextInt();
            if ( a == 0 || b == 0){
                System.out.println("You cannot enter a value 0.");
                break;
            }
            area = a * b ;
            perimeter = 2 * ( a + b );
            System.out.println("Area is :\t" + area + "\nPerimeter is:\t" + perimeter);
            System.out.println("if you want to exit Press E or if you want to continue press C.");
            controlValue = input.next().charAt(0);
            if ( controlValue == 'E')
                control = false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  select;
        String mainScreen = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiply\n"
                + "4- Division\n"
                + "5- Power Calculate\n"
                + "6- Factorial Calculate\n"
                + "7- Get a mod\n"
                + "8- rectangular area and perimeter calculation\n\n"
                + "0- Exit";
        do {
            System.out.println(mainScreen);
            System.out.println("Please choose from the screen.");
            select = input.nextInt();
            switch (select)
            {
                case 1: plus();
                break;
                case 2: minus();
                break;
                case 3: multiply();
                break;
                case 4: divide();
                break;
                case 5: power();
                break;
                case 6: factorial();
                break;
                case 7: mod();
                break;
                case 8: rectangle();
            }
        }
        while(select != 0);
    }
}
