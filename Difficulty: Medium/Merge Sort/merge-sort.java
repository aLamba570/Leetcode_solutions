//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int a = m+1-l;
         int b = r-m;
         
         int[] a1 = new int[a];
         int[] b1 = new int[b];
         
         for(int i = 0; i<a; i++){
             a1[i] = arr[l+i];
         }
         
         for(int i = 0; i<b; i++){
             b1[i] = arr[m+1+i];
         }
         
         int i = 0; 
         int j = 0;
         int k = l;
         
         while(i<a && j<b){
             if(a1[i]<b1[j]){
                 arr[k++] = a1[i++];
             }else{
                 arr[k++] = b1[j++];
             }
         }
         
         while(i<a){
             arr[k++] = a1[i++];
         }
         while(j<b){
             arr[k++] = b1[j++];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r){
            return;
        }
        
        int mid = l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
}
