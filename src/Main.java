/*
In section, we will see how to find greater number inside array :
__________________________________________________________________
Question : write a code to find the greatest element in array for given value of x :
_______________________________________________________________________________________
Approach : first take the input from user for array size , values of arrays , than make a method that can calculate greater
            number inside the arrays than print the result.
 */
import java.util.Scanner;
class  greater{
    static int CheckCount(int arr[], int x ){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (i > arr[i]){
                count ++;
            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Give the number you wish to enter in arrays :");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("Now printing the index  : " + i);
            System.out.println("Now printing the result : " + arr[i]);
            System.out.println();
        }
        System.out.println("Enter the number you wish to check : ");
        int x = sc.nextInt();
        System.out.println("Now printing the result which is greater than given value x :" + greater.CheckCount(arr , x));
    }
}