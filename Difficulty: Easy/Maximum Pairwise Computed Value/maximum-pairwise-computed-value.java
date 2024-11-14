//{ Driver Code Starts
import java.util.ArrayList;
import java.util.Scanner;

class Height {
    int feet;
    int inches;

    // Constructor to initialize the Height object
    Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline after integer input

        Solution solution = new Solution();

        while (t-- > 0) {
            ArrayList<Height> arr = new ArrayList<>();
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            while (lineScanner.hasNextInt()) {
                int feet = lineScanner.nextInt();
                int inches = lineScanner.nextInt();
                arr.add(new Height(feet, inches));
            }
            lineScanner.close();
            Solution obj = new Solution();

            int res = obj.findMax(arr);
            System.out.println(res);
        
System.out.println("~");
}

        scanner.close();
    }
}

// } Driver Code Ends


/*
Class of the element of the array is as
class Height {
    int feet;
    int inches;
    public Height(int ft, int inc)
    {
        feet = ft;
        inches = inc;
    }
}
*/
// function must return the maximum Height
// return the height in inches
class Solution {
    public int findMax(ArrayList<Height> arr) {
        // your code here
        int res = 0;
        for(int i = 0; i<arr.size(); i++){
            int temp = 0;
            temp = arr.get(i).feet*12+arr.get(i).inches;
            if(temp > res){
                res = temp;
            }
        }
        return res;
        
    }
    
}