import java.util.Scanner;

public class processingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create an array to hold the numbers 1-10.
        int sum = 0;
        int total = 0;
        int average = 0;
        int[] array = new int[10];

//Loop through that array and sum the numbers 1-10, then print that total to the screen.
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        System.out.println("The sum of the index 1-10 " + sum);

//Create an array to hold 10 number inputs from the user and print that total to the screen.
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter a number ");
            number[i] = scanner.nextInt();
            total += number[i];
        }
        System.out.println("The sum of the number 1-10 as total = " + total);


//Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        int[] numbers = new int[10];
        double total1=0;
        for (int i = 0; i < 10; i++) {

            System.out.print("Please enter a number ");
            numbers[i] = scanner.nextInt();
            total1 += number[i];
        }
        System.out.println("The average of the number 1-10  = " + total1 / numbers.length);


//5.Create an array to store 3 names, loop through that array to print out the names.
        String[] name = {"Tewolgn", "Chekole", "Desta"};
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
//6.Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
        int[] num = {2, 5, 9, 0, 2, 1, 8, 5, 4};

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 5) {
                System.out.print("Number 5 found at index " + i + " , ");
            }
        }
        System.out.println();
//7 Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.
        int[] n = new int[10];
        for (int i = 1; i < n.length; i++) {
            n[i] = i;
        }
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }

        System.out.println();
//8. Given the following array: ["w",   "t",  "y",  "h",  "k"]
//Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        String[] c = {"w", "t", "y", "h", "k"};
        for (int i = 0; i < c.length; i++) {
            if (c[i].equalsIgnoreCase("t")) {
                c[i] = "hello";
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
/*
9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
Write a program that will print out all matching pairs from arrays 1 and 2.
Expected output:
(7,7) and (6,6)
         */
        int[] arr1 = {1, 7, 6, 5, 9};
        int[] arr2 = {2, 7, 6, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.print("(" + arr1[i] + "," + arr2[i] + ")");
            }

        }
    }


}


