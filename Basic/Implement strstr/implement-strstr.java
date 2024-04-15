//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
    //   if(s.length() == 0 || x.length()==0 || s.length()<x.length()){
    //       return -1;
    //   }
       
    //   for(int i = 0; i<(s.length()-x.length()); i++){
    //       boolean isfound = true;
    //       for(int j = 0; j<x.length(); j++){
    //           if(s.charAt(i+j) != x.charAt(j)){
    //               isfound = false;
    //               break;
    //           }
    //       }
    //       if(isfound){
    //           return i;
    //       }
    //   }
    //   return -1;
    
    return s.indexOf(x);
    }
}
