//Task 1

import java.util.Scanner;
public class ht_1{
  
  public static void main(String args []){
    Scanner sc= new Scanner(System.in);
   System.out.print("n= ");
   int n=sc.nextInt();
   
   int x = factorial(n);
   System.out.println(x);
  }
  
  
  public static int factorial(int n){
    if(n==0){
      return 1;}
    
    return n*factorial(n-1);
  }
  
  
}


//Task 2


import java.util.Scanner;
public class ht_2{
  
   public static void main(String args []){
    Scanner sc= new Scanner(System.in);
   System.out.print("Base= ");
   int b=sc.nextInt();
   System.out.print("Exponent= ");
   int e=sc.nextInt();
   
   
    int x = power(b,e);
    System.out.println(x);

  }
   
   
   public static int power(int base, int exponent){
     if(exponent==0){
       return 1;
     }
     
     return base*power(base,exponent-1);
   }
   
   
}


//Task 3

public class ht_3{
  
   public static void main(String args []){
     int[] arr = {5,6,2,1,8,7};
     int index = 2;
     
     print_element(arr, index);
   }
   
   
   public static void print_element(int [] arr, int index){
     if(index>=arr.length){
       return;}
     
     System.out.println(arr[index]);
     
     print_element(arr, index+1);
   }
   
   
}


//Task 4

public class ht_4{
  
  public static void main(String args []){
  System.out.println(fibonacci(0));
  System.out.println(fibonacci(1));
  System.out.println(fibonacci(5));
  System.out.println(fibonacci(9));
  
}

public static int fibonacci(int n){
  if(n==0){
    return 0;}
  if(n==1){
    return 1;}
  
  return fibonacci(n-1)+fibonacci(n-2);
}


}





        
