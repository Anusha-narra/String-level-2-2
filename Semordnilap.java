import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        StringBuilder ob=new StringBuilder(s2);
        if(s1.equals(ob.reverse().toString())&&!(s1.equals(s2))){
            System.out.print("Semordnilap");
        }
        else{
            System.out.print("Not a Semordnilap");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}