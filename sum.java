// WAP to find the sum of the odd numbers between 7 to 21 using for loop.Display the odd numbers and print the sum as an output.

package firstJavaApp;
public class FirstJavaApp {
public static void main(String[] args) {
	
	int sumOfOdds = 0;
//Initialization, Condition, Increment
    for (int num = 7; num <= 21; num++) { 
        //Only for Odd number     
        if (num % 2 != 0) {    
            //Output               
            System.out.println(num);   
             //Increment the value
            sumOfOdds += num;                  
        }
    }

}
    System.out.println("Sum of odd numbers: " + sumOfOdds);  
}