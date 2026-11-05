// Task 01

public class Hw01{
  public static void main(String args []){
    
    int min=3456789;
    int d= min/(24*60);
    int y= d/365;
    int rd= d%365;
    
    System.out.println("3456789 minutes is approximately " +y+ " years and " + rd + " days");
    
    
  }
}


// Task 02

public class Hw02{
  public static void main(String args []){
    
    int a=2;
    int b=5;
    int c=8;
    
    int d=(2*b*((c-a)/3))+7;
    
    System.out.println("Answer:" + d);
    
  }
}


// Task 03

public class Hw03{
  public static void main(String args []){
    
    int id= 1000054943;
     
    int a= id%10;
    int b= id%100;
    int c= b/10;
    
     System.out.print(a+ "" +c);
     //System.out.println(a);
     //System.out.println(c);
    
  }
}


// Task 04

public class Hw04{
  public static void main(String args []){
    
    int l= 10;
    int w= 13;
    
    double a= Math.sqrt((l*l)+(w*w));
    
    System.out.println(a);
    
  }
}


// Task 05

public class Hw05{
  public static void main(String args []){
    
    double a=4.5;
    double b=9.5;
    double c= Math.sqrt((a*a)+(b*b));
    
    double m=a/c;
    double n=b/c;
    //double o=b/c;
    //double p=a/c;
    
    
    System.out.println("SinA= "+ m);
    System.out.println("CosA= "+ n);
    System.out.println("SinB= "+ n);
    System.out.println("CosB= "+ m);
    
    
    
  }
}
