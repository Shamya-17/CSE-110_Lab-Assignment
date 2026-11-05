// Task 1

import java.util.Scanner;
public class ht_1{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter Positive Integer Number: ");
    int sonkha=sc.nextInt();
    
    for(int soro=0; soro<=sonkha; soro++){
      if(soro%5==0 && soro%3!=0){
       System.out.println(soro);
      }
    }
       
  }
}


// Task 2

import java.util.Scanner;
public class ht_2{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Please Enter number of Herbs (H): ");
    int m=sc.nextInt();  
    System.out.println("Please Enter number of Crystals (C): ");
    int s=sc.nextInt(); 
    int i=0;
 
    while(m>=3 && s>=2){
      i++;
      m-=3;
      s-=2;
      System.out.println("Potion-" +i+ " created");
       System.out.println("Remaining Herbs:" +m+ ", Remaining Crystals: " +s);
    }
    System.out.println("Potions created: " +i);
    
    if(i%2==0){
      System.out.println("Stable Elixir");}
    else{
      System.out.println("Volatile Brew");
    }
    
    
  }
}


// Task 3

import java.util.Scanner;
public class ht_3{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Energy (E): ");
    int shokti=sc.nextInt();  
    System.out.println("Number of River (N): ");
    int nodi=sc.nextInt(); 
    boolean kalnto=false;
    int rr=0;
    
    for(int soro=1; soro<=nodi; soro++){
      System.out.println("Enter River Distance D" +soro+ ": ");
      int km=sc.nextInt();
      int tk;
      
      if(km<=5){
        tk=2;}
      else{
        tk=km/2;
      }
      
     shokti-=tk;
     
     if(shokti<0){
       kalnto=true;
       rr=soro;
       break;}
    }
    
    if(kalnto){
      System.out.println("Tired at River " +rr);}
    else{
      System.out.println("All Done");
      System.out.println(shokti + " energy left");
    }
    
  }
}


// Task 4

import java.util.Scanner;
public class ht_4{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter a Number: ");
    int sonkha=sc.nextInt();
    
    while(sonkha>0){
      int x=sonkha%10;
      System.out.print(x);
      sonkha=sonkha/10;
      
      if(sonkha==0){
        break;
      }
      else{
        System.out.print(",");
      }
      
    }
      
  }
}


// Task 5

import java.util.Scanner;
public class ht_5{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the N-digit vault code: ");
    int x=sc.nextInt();
    int t=x;
    int c=0;
    
    while(t>0){
      c++;
      t/=10;
    }
      
    int d=1;
    for(int soro=1; soro<c; soro++){
      d=d*10;
    }
    
    while(d>0){
      int y=x/d;
      System.out.print(y);
      x=x%d;
      d=d/10;
      
      if(d==0){
        break;
      }
      else{
        System.out.print(",");
      }
    
  }
}
}


// Task 6

import java.util.Scanner;
public class ht_6{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter an Integer: ");
    int onko=sc.nextInt();  
    int g=0;
    int j=0;
    
    for(int srt=1; srt<=onko; srt++){
      if(onko%srt==0){
        g++;
        if(srt!=onko){
          j+=srt;}
      }
    }
      if(g==2){
        System.out.println(onko + " is a prime number.");}
      else{
        System.out.println(onko + " is not a prime number.");}
      
        if(j==onko){
        System.out.println(onko + " is a perfect number.");}
      else{
        System.out.println(onko + " is not a perfect number.");}
    
  }
}


// Task 7

public class ht_7{
  public static void main(String [] args){
    int jogfol=0;

    for(int st=1; st<=600; st++){
      if(st%7==0 || st%9==0){
        jogfol+=st;
      }
      if(st%7==0 && st%9==0){
        jogfol-=st;
      }
    }
    System.out.println(jogfol);
    
  }
}


// Task 8
    
import java.util.Scanner;
public class ht_8{
  public static void main(String [] args){
 
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter an integer: ");
    int r=sc.nextInt();
      int c1=0;
      int c2=0;
    for(int soro=1; soro<=r; soro++){
      System.out.println("Enter number " + soro + ":");
       int s=sc.nextInt();
       
       if(s>=0){
         c1++;}
       else{
         c2++;
       } 
    }
    
    System.out.println(c1 + " Non-negative Numbers");
    System.out.println(c2 + " Negative Numbers");
  }
}
      
       
        
        
     
