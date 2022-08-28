import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger(){ // read the user input for how many elements inside the array

        Scanner keyboard = new Scanner(System.in); // create the scanner to get user input
        int userInput = 0;
        System.out.println("Enter how many elements you need: ");
        userInput = keyboard.nextInt();
        return userInput;
    }

    private static int[] readElements(int sizeElements){ // read the user input for each element inside the array

        Scanner keyboard = new Scanner(System.in); // create the scanner to get user input
        int [] userArray = new int[sizeElements];

        System.out.println("Enter all the elements");
        for (int i = 0; i < sizeElements; i++){
            userArray[i] = keyboard.nextInt();
        }
        return userArray;
    }

    private static int findMin(int[] userArray){ // finding the minimum number inside the array
        int min = userArray[0];
        for (int i = 0; i < userArray.length; i++){
            if (userArray[i] < min){
                min = userArray[i];
            }
        }
        return min;
    }
}