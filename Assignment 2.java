// Task 1

import java.util.Scanner;

public class ht_1{
  public static void main (String args []){
 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter num: ");
  
  int n1=sc.nextInt();
  
  if(n1%5==0 && n1%7==0){
    System.out.println("Invalid: Divisible by both");
  }
  else if(n1%5==0){
      System.out.println("Divisible by 5 Only");
  }
  else if(n1%7==0){
      System.out.println("Divisible by 7 Only");
  }
  else{
    System.out.println("No");
  }
  
  }
}


//Task 2

import java.util.Scanner;

public class ht_2{
  public static void main (String args []){
 
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter your age: ");
  int a=sc.nextInt();
  System.out.println("Enter electricity consumed: ");
  int b=sc.nextInt();
  int bi=(b*15);
  
  if(b<=100){
    
    if(a<18){
      System.out.println("Final Bill: "+ (bi-(bi*0.20))+ " taka");}
    else if (a>=18 && a<=60){
      System.out.println("Final Bill: "+ bi+ " taka");}
    else{
      System.out.println("Final Bill: "+ (bi-(bi*0.10))+ " taka");}
  }
      
  else {
    
     if(a<18){
      System.out.println("Final Bill: "+ (bi-(bi*0.20)+(bi*0.05))+ " taka");}
    else if (a>=18 && a<=60){
      System.out.println("Final Bill: "+ (bi+(bi*0.05))+ " taka");}
    else{
      System.out.println("Final Bill: "+ ((bi-(bi*0.10))+(bi*0.05))+ " taka");}
   // System.out.println("Final Bill: "+ (bi+(bi*0.50)));}
  
  }
}
}

//Task 3

import java.util.Scanner;

public class ht_3{
  public static void main(String args []){
 
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter float number: ");
    float n1=sc.nextFloat();
    System.out.println("Enter float number: ");
    float n2=sc.nextFloat();
    System.out.println("Enter float number: ");
    float n3=sc.nextFloat();
    
    if(n1>n2 && n1>n3){
      System.out.println("Maximum number is " + n1);
    }
    else if(n2>n1 && n2>n3){
      System.out.println("Maximum number is " + n2);
    }
    else{
      System.out.println("Maximum number is " + n3);
    }
      
     if(n1<n2 && n1<n3){
      System.out.println("Minimum number is " + n1);
    }
    else if(n2<n1 && n2<n3){
      System.out.println("Minimum number is " + n2);
    }
    else{
      System.out.println("Minimum number is " + n3);
    }
    
    
  }
}


//Task 4

import java.util.Scanner;

public class ht_4{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter side length: ");
    int s1=sc.nextInt();
    System.out.println("Enter side length: ");
    int s2=sc.nextInt();
    System.out.println("Enter side length: ");
    int s3=sc.nextInt();
    
    if(s1==s2 && s1==s3){
      System.out.println("This is a Equilateral triangle");
    }
    else if(s1!=s2 && s1!=s3){
      System.out.println("This is a Scalen triangle");
    }
    else{
     System.out.println("This is a Isosceles triangle");
    }    
      
  }
}


//Task 5

import java.util.Scanner;

public class ht_5{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka): ");
    int p=sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka): ");
    int g=sc.nextInt();
    
    if(p<g){
      int r=(g-p);
      System.out.println("The returned amount is " + r + "taka.");
      
      int t1=r/100;
      r=r%100;
      
      int t2=r/50;
      r=r%50;
      
      int t3=r/20;
      r=r%20;
      
      int t4=r/10;
      r=r%10;
      
      int t5=r/5;
      r=r%5;
      
      int t6=r/2;
      r=r%2;
      
      int t7=r;
      
      System.out.println("100 taka note: " + t1);
      System.out.println("50 taka note: " + t2);
      System.out.println("20 taka note: " + t3);
      System.out.println("10 taka note: " + t4);
      System.out.println("5 taka note: " + t5);
      System.out.println("2 taka note: " + t6);
      System.out.println("1 taka note: " + t7);
      
      }

    else if(p>g){
      int r=(p-g);
      System.out.println("Please pay " + r + "taka more.");
    }
    
    else{
      System.out.println("The returned amount is 0 taka.");
    }
    
    }
}
  

//Task 6

import java.util.Scanner;

public class ht_6{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Input the 1st number: ");
    int x=sc.nextInt();
    System.out.println("Input the 2nd number: ");
    int y=sc.nextInt();
    System.out.println("Input the 3rd number: ");
    int z=sc.nextInt();
    
    if(x==y && x==z){
      System.out.println("All numbers are equal");
    }
    else if(x!=y && x!=z){
      System.out.println("All numbers are different");
    }
    else{
     System.out.println("Neither all are equal or different");
    }  
    
  }
}   
      
      
      
