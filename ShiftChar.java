/*
	Write a Program to take a user-defined input in which 
	1. All Upper Case letters should be shifted left by 2 characters
	2.All Lower Case letters should be shifted left by 3 characters
*/

import java.util.Scanner;

public class ShiftChar 
{
    public static void main(String[] args) 
	{
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string : ");
        String str = sc.nextLine(); // Read the input string

        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (char character : str.toCharArray()) 
		{
            // Check if the character is an uppercase letter
            if (Character.isUpperCase(character)) 
			{
                // Shift the character by 2 positions in the ASCII table
                result.append((char) (character - 2));
            } 
			
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(character)) 
			{
                // Shift the character by 3 positions in the ASCII table
                result.append((char) (character - 3));
            } 
			
            // If the character is not a letter, keep it unchanged
            else 
			{
                result.append(character);
            }
        }

        // Display the modified string
        System.out.println("Output         : " + result.toString());
    }
}
