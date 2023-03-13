package ifElse;

import java.util.Scanner;

public class findMaxNum {
    public static void main(String[]arg){

    
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b &&a>c){
System.out.println("a is Greater");
    }
    else if(b>a &&b>c){
        System.out.println("b is Greater");
} 
else {
    System.out.println("c is Greater");
}
    }
}
