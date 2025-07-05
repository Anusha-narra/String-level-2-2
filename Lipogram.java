import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine().toLowerCase();
        char ch=in.nextLine().charAt(0);
        if(s.indexOf(ch)==-1){
            System.out.print("Lipogram");
        }
        else{
             System.out.print("Not a Lipogram");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}