//Task 1


import java.util.Scanner;

public class ht_1{
  public static void main(String [] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter starting number: ");
    int st=sc.nextInt();
    System.out.println("Enter ending number: ");
    int lt=sc.nextInt();
    
    
    for(int soro=st; soro<=lt; soro++)
    {
      int d=soro;
      int c=0;
      
      if(d==0){
        c=1;}
      else{
      while (d>0){                      //digit count
        d=d/10;
        c++;}}
      
      d=soro;
      int jogfol=0;
      if(d==0){
        jogfol=0;}
      else{                              //calculation
      while(d>0){
        int sonkha=d%10;
        int pr=1;
        for(int shes=0; shes<c; shes++)
        {
          pr=pr*sonkha;
        }
        
        jogfol=jogfol+pr;
        d=d/10;}}
      
      if(jogfol==soro){                     //checking
        System.out.println(soro + " is an Armstrong number");}
      
    }
          
    
  }
}


//Task 2

import java.util.Scanner;

public class ht_2{
  public static void main(String [] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of students to check: ");
    int s=sc.nextInt();
    
    for(int st=0; st<s; st++){
      System.out.print("Enter student ID: ");
      int x=sc.nextInt();
      int ost=x;
      
      if(x<=0){
        System.out.println("Not Lucky");
        continue;}
      while(ost%2==0){
        ost=ost/2;
      }
      
      if(ost==1){
        System.out.println("Lucky ID");}
      else{
        System.out.println("Not Lucky");
      }
    }
    
  }
}
      

//Task 3

import java.util.Scanner;

public class ht_3{
  public static void main(String [] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of days: ");
    int din=sc.nextInt();
    
    for(int srt=1; srt<=din; srt++){
      System.out.println("Enter sales for Day " + srt + ":");
      
      double ponno_1=sc.nextDouble();
      double ponno_2=sc.nextDouble();
      double ponno_3=sc.nextDouble();
      
      double jogfol= ponno_1+ponno_2+ponno_3;
      double full;
      
      if(jogfol>=100){
        full=jogfol+(jogfol*0.02);}
      else if(jogfol>=200){
        full=jogfol+(jogfol*0.05);}
      else if(jogfol>=500){
        full=jogfol+(jogfol*0.10);}
      else{
        full=jogfol;}
      
      System.out.println("Day " +srt+ ": Total Sales with Tax: " +full);
    }
    
  }
}


//Task 4

import java.util.Scanner;

public class ht_4{
  public static void main(String [] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Number of Members: ");
    int din=sc.nextInt();
    
    for(int srt=1; srt<=din; srt++)
    {
      System.out.println("Exercises for Member- " + srt + ":");
      int p=sc.nextInt();
      
      double bm_1=0;
      double bm_2=0;
      double bm_3=0;
      int bm_U=p;
      
      if(p>3){         //limiting ex
        bm_U=3;
        System.out.println("(Can’t do more than 3 exercise)");}
      
      double jog=0;         //total cal.
      int c=0;              //num of ex<200
      
      for(int ed=1; ed<=p; ed++)
      {
        System.out.print("Exercise-" +ed+ ": ");
        double pr=sc.nextDouble();
        
        if(ed==1){
          bm_1=pr;}
        else if(ed==2){    // storing cal
          bm_2=pr;}
        else if(ed==3){
          bm_3=pr;}
        else{ 
        }
        
        if(ed<=3){      //count 3 ex
          jog+=pr;
          if(pr<200){
            c++;}
          if(pr>350){        //bonus
            jog+=pr*0.5;}
        }
      }
      
      if(c==bm_U){          //panalty
        jog=jog*0.9;}
      
      double gor=jog/bm_U;
      
      if(gor>400){          //50 bonus when avg>500
        jog+=50*bm_U;}
      
      double gor_pr=jog/bm_U;   //Final cal avg
      
      //System.out.print("Average calories earned per day for Member-" +srt+ ": " + gor_pr );
      System.out.printf("Average calories earned per day for Member-" +srt+ ": %.3f%n", gor_pr );
      
   
    }
    
  }
}
        
        
            
               
        
            
       
        
      
