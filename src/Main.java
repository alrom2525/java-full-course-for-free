// import java.util.Scanner;
// import javax.swing.JOptionPane;
// import java.util.Random;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // #17 (01:52:59)  String methods 💬
        String name = "Bro";
        // boolean result = name.equalsIgnoreCase("bro");
        // int result = name.length();
        // char result = name.charAt(1); // get the a character at 0 positions
        // int result = name.indexOf("A"); // return the position if the character is not found return (-1)
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim();
        String result = name.replace('o','a');

        System.out.println(result);

        // #16 (01:44:54)  2D arrays 🚚
        /* String[][] cars = new String[3][3];
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Ford Mustang";
        cars[1][1] = "Ford Ranger";
        cars[1][2] = "Ford F-150";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        String[][] cars2 = {
                            {"Chevrolet Camaro", "Corvette", "Chevrolet Silverado"},
                            {"Ford Mustang", "Ford Ranger", "Ford F-150"},
                            {"Ferrari", "Lambo", "Tesla"}
                    };

        for (int i = 0; i < cars2.length; i++) {
            System.out.println();
            for (int j = 0; j < cars2[i].length; j++) {
                System.out.print(cars2[i][j] + " - ");
            }
        } */
        
        // #15 (01:38:28)  arrays 🚗
        /* String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }*/
        
        // #14 (01:32:23)  nested loops ➿
        /* Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol = "";
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();
        for(int index = 1; index <= rows; index++) {
            System.out.println("");
            for(int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        } */

        // #13 (01:28:13)  for loop ➰
        /*
        for (int index = 10; index >= 1; index--){

            System.out.println(index);
        } */

        // #12 (01:24:33)  while loop 🔄
        /*
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());
        System.out.print("Hello " + name);
        */

        // #1   (00:00:00)  Java tutorial for beginners ☕
		/*

		System.out.println("\tI like pizza");
		System.out.println("It's really good!");
		*/

        // #2   (00:20:26)  variables ❌
		/*
		int x = 123;

		System.out.println("My number is " +x);

		long l = 123456789012345L;
		System.out.println(l);

		float f = 3.1415f;
		System.out.println(f);

		double d = 3.141516;
		System.out.println(d);

		char symbol = '@';
		System.out.println(symbol);

		String name = "Bro";
		System.out.println("Hello " + name);
		*/

        // #3   (00:32:58)  swap two variables 💱
		/* String x = "water";
		String y = "Kool-Aid";
		String temp = null;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: "+x);
		System.out.println("y: "+y);*/

        // #4   (00:36:42)  user input ⌨
        /*try(Scanner scanner = new Scanner(System.in)){
            System.out.println("What's your name? ");
            String name = scanner.nextLine();
            System.out.println("How old are you? ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What is your favorite food?");
            String food = scanner.nextLine();

            System.out.println("Hello " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("You like " + food);
        }*/

        // #5   (00:44:40)  expressions 🧮 operands, operators, values, variables, numbers, quantity
        /* double friends = 10;
        friends = friends / 3;
        System.out.println(friends); */

        // 6   (00:49:13)  GUI intro
        /* String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is " + age +" years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Your are in " + height +" cm tall");*/

        // 7   (00:55:01)  Math class 📐
        /* double x = 3.14, y = -10;
        // compare the values
        double z = Math.min(x, y);
        System.out.println(z);
        System.out.println(Math.abs(y)); */

        /*double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter side b: ");
        b = scanner.nextDouble();
        c = Math.sqrt ( a * a + b * b);
        System.out.println("The hypotenuse is: " + c);
        scanner.close(); */

        // #8   (01:01:08)  random numbers 🎲
        /* Random random = new Random();
        int randomInt = random.nextInt(6);
        double randomDouble = random.nextDouble(6);
        boolean randomBoolean = random.nextBoolean();

        System.out.println(randomBoolean);*/

        // #9   (01:05:39)  if statements 🚧
        /*int age = 14;
        if (age >= 75) {
            System.out.println("Ok Boomer!");
        } else if (age >= 18){
            System.out.println("You are an adult!");
        }
        else if (age >= 13){
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }*/

        // 10 (01:11:51)  switches ⬇
        /* String day = "Wows";
        switch (day){
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Shabat":
                System.out.println("It is Shabat!");
                break;
            default :
                System.out.println("That is not a day!");
        } */

        // #11 (01:16:36)  logical operators ❗

        /* && operator
        int temperature = 31;
        if(temperature > 30){
            System.out.println("It is hot outside");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }*/

        // OR operator
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();
        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!");
        } else {
            System.out.println("You are quit the game!");
        }
        */




    }
}



