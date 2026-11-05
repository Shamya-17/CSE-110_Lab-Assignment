//Task 01

import java.util.Scanner;
public class ht_1{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.print("N: ");
    int n=sc.nextInt();
    int arr []= new int[n];
    
    for(int st=0; st<n; st++){
      arr[st]=sc.nextInt();
    }
    
    for(int p=0; p<n; p++){
      System.out.print(arr[p] + " ");
    }
    
    for(int lt=0; lt<n; lt++){
      if(arr[lt]>0){
        arr[lt]=1;}
      else if(arr[lt]<0){
        arr[lt]=0;}
    }
    
    System.out.println();
    System.out.println("After modifying: ");
    for(int lt=0; lt<n; lt++){
      System.out.print(arr[lt]+ " ");
    }
    
  }
}


//Task 02

import java.util.Scanner;
public class ht_2{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.print("N= ");
    int n=sc.nextInt();
    int arr []= new int[n];
    
    for(int st=0; st<n; st++){
      System.out.print("Enter a number: ");
      arr[st]=sc.nextInt();
    }
    
    System.out.println();
    int t=sc.nextInt();
    boolean f=false;
    
    for(int s=0; s<n; s++){
      if(arr[s]==t){
        System.out.print(t + " is at index " + s);
        f=true;
        break;}
    }
    
    if(!f){
      System.out.print("Element not found");
    }
    
  }
}


//Task 03

import java.util.Scanner;
public class ht_3{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array:");
    int n=sc.nextInt();
    double arr []= new double[n];
    
    for(int st=0; st<n; st++){
      System.out.print("Enter a number: ");
      arr[st]=sc.nextDouble();
    }
    
    double mx=arr[0];
    double mn=arr[0];
    int xd=0;
    int xn=0;
    double s=0;
    double  avg=0;
    
    for(int a=0; a<n; a++){
      if(arr[a]>mx){
        mx=arr[a];
        xd=a;}
      if(arr[a]<mn){
        mn=arr[a];
        xn=a;}
      
      s+=arr[a];
    }
    
    avg=s/n;
    
    System.out.println("Maximum element " + mx + " found at index " + xd);
    System.out.println("Minimum element " + mn + " found at index " + xn);
    System.out.println("Summation: "+s);
    System.out.println("Average: "+avg);
    
  }
}


//Task 04

import java.util.Scanner;
public class ht_4{
  public static void main(String args []){
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter the length of array 1:");
    int m=sc.nextInt();
    int arr1 []= new int[m];
    
    System.out.println("Please enter the elements of the arr1: ");
    for(int st=0; st<m; st++){
      arr1[st]=sc.nextInt();
    }
    
    System.out.print("Please enter the length of array 2:");
    int n=sc.nextInt();
    int arr2 []= new int[n];
    
    System.out.println("Please enter the elements of the arr2: ");
    for(int st=0; st<n; st++){
      arr2[st]=sc.nextInt();
    }
    
    boolean sub=false;
    
    for(int st=0; st<n; st++){
      boolean f=false;
      
      for(int lt=0; lt<m; lt++){
        if(arr2[st]==arr1[lt]){
          f=true;
          break;}
      }
      
      if(!f){
        sub=true;
        break;}
    }
    
    if(!sub){
      System.out.println("Array 2 is a subset of Array 1. ");}
    else{
      System.out.println("Array 2 is not a subset of Array 1. ");}
      
      
    
  }
}


//Task 05

public class ht_5{
  public static void main(String args []){
    
    int [] marks = {85, 90, 75, 44, 99};
    String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    //int [] marks = {100, 47, 85, 94, 5, 50};
    //String [] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};

    
    for(int a=0; a<marks.length-1; a++){
      
      for(int b=0; b<marks.length-1-a; b++){
        if(marks[b]>marks[b+1]){
          int temp=marks[b];
          marks[b]=marks[b+1];
          marks[b+1]=temp;
          
          String temp_s=names[b];
          names[b]=names[b+1];
          names[b+1]=temp_s;}
      }
    }
    
    System.out.println("Sorted Array: ");
    
    for(int a=0; a<marks.length; a++){
      System.out.print(marks[a]+" ");
    }
    System.out.println();
    for(int a=0; a<marks.length; a++){
      System.out.print(names[a]+" ");
    }
    

    
  }
}
    
    
      
      
