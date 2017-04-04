package AnotherTry;

import java.util.Scanner;
import java.util.TreeSet;




class Comp implements Comparable {

	static Scanner in = new Scanner(System.in);
	static int n = in.nextInt() ;
	
       String str;
       int number;
       
       Comp(String str, int number) {
             this.str = str;
             this.number = number;
       }
       @Override

       public int compareTo(Object obj) {
    	   
             Comp entry = (Comp) obj;
             int result = number ;
             
             if(result != 0) {
            	 if(result>n){
                    return (int) result / Math.abs( result );
             }}
             return 0;
       }
}