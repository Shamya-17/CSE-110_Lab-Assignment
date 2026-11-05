//Task 1

import java.util.Scanner;
public class hw_1{
  
  public static boolean isPrime(int x){               //A
    if(x<=1)
      return false;
    for(int st=2; st<=Math.sqrt(x); st++){
      if(x%st==0){
        return false;}
    }
    return true;
  }
  
  public static boolean isPerfect(int x){              //B
    if(x<=1)
      return false;
    int s=0;
    for(int st=1; st<=x/2; st++){
      if(x%st==0){
        s+=st;}
    }
    return s==x;
   }
   
   public static int special_sum(int x){            //C
    int t=0;
    for(int st=2; st<=x; st++){
      if(isPrime(st) || isPerfect(st)){
        t+=st;}
    }
    return t;
   }
       
        
  public static void main(String args []){               //Main method
    Scanner sc=new Scanner(System.in);
    
    int x=sc.nextInt();
   //  boolean check = isPrime(x);
   //  System.out.println(check);
   //  boolean check = isPerfect(x);
   //  System.out.println(check);


    int result = special_sum(x);
    System.out.println(result);

    
  }
}


//Task 2

import java.util.Scanner;
public class hw_2{
  
  public static void showDots(int x){                //A
    for(int st=0; st<x; st++){
      System.out.print(".");
    }
  }
  
  
  public static void show_palindrome(int x){        //B
    for(int i=1; i<=x; i++){
      System.out.print(i);
    }
    for(int j=x-1; j>=1; j--){
       System.out.print(j);
    }
  }
  
  
  public static void showDiamond(int x){           //C
    for(int st=1; st<=x; st++){
      showDots(x-st);
      show_palindrome(st);
      showDots(x-st);
      System.out.println();
    }
    for(int st=x-1; st>=1; st--){
      showDots(x-st);
      show_palindrome(st);
      showDots(x-st);
      System.out.println();
    }
  }
  
  
  public static void main(String args []){            //Main method
    Scanner sc=new Scanner(System.in);
    
    int x=sc.nextInt();
    
    //showDots(x);
    //show_palindrome(x);
    showDiamond(x);
    
  }
}


//Task 3

import java.util.Scanner;
public class hw_3{
  
  public static double calcTax(int a, double s){         //A
    if((a<18) || (s<10000)){
      return 0.0;}                                   
    else if(s<=20000 && s>=10000){                         
      return s*0.07;}
    else{
      return s*0.14;}
  }                                                       
  
  
  public static void calcYearlyTax(){                   //B
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    double ft=0;
    
    for(int y=1; y<=12; y++){
      double s=sc.nextDouble();
      double t=calcTax(a,s);
      System.out.printf("Month%d tax: %.1f\n", y, t);
      ft+=t;
    }

    System.out.printf("Total Yearly Tax: %.1f\n" + ft);
  }
  
  
  public static void main(String args []){              //Main method
    calcYearlyTax();
    
    // double t = calcTax(16,20000);
   //  System.out.println(t);

  }
}



    
    
