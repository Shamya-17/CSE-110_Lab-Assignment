//Task 1

import java.util.Scanner;
public class Q_1{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
    
    for(int m=1; m<=x; m++){                     // upper part
                                                  
      for(int n=1; n<=x-m; n++){                    //spacing part
        System.out.print(" ");}
      for(int n=1; n<=(2*m-1); n++){                //number printing part
        System.out.print(n);}
      
      System.out.println(" ");
    }
    
    for(int m=x-1; m>=1; m--){                  // lower part
      
      for(int n=1; n<=x-m; n++){
        System.out.print(" ");}
      for(int n=1; n<=(2*m-1); n++){
        System.out.print(n);}
      
      System.out.println(" ");
    }
    
  }
}


//Task 2

import java.util.Scanner;
public class Q_2{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
    
    for(int soro=1; soro<=x; soro++){
      for(int sp=1; sp<=(x-soro); sp++){               //space 
        System.out.print("  ");}
      
      for(int shes=1; shes<=soro; shes++){             //coloumn printing
        
        if(soro==1 || shes==soro){                     //condition for inner space
          System.out.print(x);}
        else if(soro==x){
          System.out.print(shes);}
        else if(shes==1){
          System.out.print(x-soro+1);}
        else{
          System.out.print(" ");
        }
        if(shes<soro){
          System.out.print(" ");}
      }
        
      System.out.println();
    }
    
  }
}


//Task 3

import java.util.Scanner;
public class Q_3{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
    
    for(int soro=1; soro<=x; soro++){
      for(int sp=1; sp<=(x-soro); sp++){
        System.out.print(" ");}
        
        if(soro==1){                           //condition for 1st coloumn                         
          System.out.print(1);}
        else if(soro==x){                      //for last
          for(int m=1; m<=(2*x-1); m++){
          System.out.print(m);}
        }
        else{                                  // middle spacing and number print kora
          System.out.print(1); 
          for(int n=0; n<(2*(soro-1)-1); n++){                
          System.out.print(" ");
        }
          System.out.print(2*soro-1);
      }
        
      System.out.println();
    }
    
  }
}


//Task 4

import java.util.Scanner;
public class Q_4{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
    
    for(int soro=1; soro<=x; soro++){                 //upper part 
     for(int sp=1; sp<=(x-soro); sp++){
       System.out.print(" ");
     }
      
        if(soro==1){                                //1st print 
          System.out.print(1);}
        else{                                        //middle print
          System.out.print(1);
          for (int m=0;m<(2*(soro-1)-1); m++){
             System.out.print(" ");
          }
          
          System.out.print(2*soro-1);}

      System.out.println();
  }
  
    for(int soro=x-1; soro>=1; soro--){               //lower part
     for(int sp=1; sp<=(x-soro); sp++){
       System.out.print(" ");
     }
      
        if(soro==1){                                     
          System.out.print(1);}
        else{
          System.out.print(1);
          for (int m=0;m<(2*(soro-1)-1); m++){
             System.out.print(" ");
          }
          
          System.out.print(2*soro-1);}
        
      System.out.println();
  }
    
  }
}
  

//Task 5

import java.util.Scanner;
public class Q_5{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
    
    for(int strt=1; strt<=x; strt++){            
      
      for(int sp=0; sp<(x-strt); sp++){          // space 
        System.out.print(" ");}
      
      for (int num=1; num<=strt; num++){         //increament part
        System.out.print(num);}
      
      for (int num=strt-1; num>=1; num--){       //decrement part
        System.out.print(num);}
      
      System.out.println();
    
    }
    
  }
}


//Task 6

import java.util.Scanner;
public class Q_6{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
                                                 //mirror of no.5
    for(int strt=x; strt>=1; strt--){
      
      for(int sp=0; sp<(x-strt); sp++){
        System.out.print(" ");}
      
      for (int num=1; num<=strt; num++){
        System.out.print(num);}
      
      for (int num=strt-1; num>=1; num--){
        System.out.print(num);}
      
      System.out.println();
    
    }
    
  }
}


//Task 7

import java.util.Scanner;
public class Q_7{
  public static void main (String args [] ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input number: ");
    int x=sc.nextInt();
                                                 //combination of no.5 and no.6
    for(int strt=x; strt>1; strt--){             // >= hob na as middle line 1 ber print korte hobe
      
      for(int sp=0; sp<(x-strt); sp++){
        System.out.print(" ");}
      
      for (int num=1; num<=strt; num++){
        System.out.print(num);}
      
      for (int num=strt-1; num>=1; num--){
        System.out.print(num);}
      
      System.out.println();
    
    }
    
        for(int strt=1; strt<=x; strt++){
      
      for(int sp=0; sp<(x-strt); sp++){
        System.out.print(" ");}
      
      for (int num=1; num<=strt; num++){
        System.out.print(num);}
      
      for (int num=strt-1; num>=1; num--){
        System.out.print(num);}
      
      System.out.println();
    
    }
    
  }
}
