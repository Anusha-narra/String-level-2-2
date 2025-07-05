import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine().toLowerCase();
        String w[]=s.split(" ");
        char ch=w[0].charAt(0);
        int f=0;
        for(int i=1;i<w.length;i++){
            if(w[i].charAt(0)!=ch){
                f++;
                break;
            }
        }
                if(f==0){
                System.out.print("Tautogram");
            }
            else{
                 System.out.print("Not a Tautogram");
            }
            
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}