//Task 1

import java.util.Scanner;
public class ht_1{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    
    String x=sc.nextLine();
    
    int boro= -1;
    int sonkha= 0;
    int c= 0;
    
    for(int soro=0; soro<x.length(); soro++){
      char m=x.charAt(soro);
      
      if(m>='0' && m<='9'){
        sonkha=sonkha*10+(m-'0');
        c++;}
      else{
        if(c==2){
          if(sonkha>boro){
            boro=sonkha;}
          else{}
        }
        else{}
        
      sonkha=0;
      c=0;}
    
    }
    
    if(c==2){
      if(sonkha>boro){
        boro=sonkha;}
    }
    if(boro==-1){
      boro=0;
    }
    
    System.out.println("2-Digit PIN: "+boro);
    
  }
}


//Task 2

import java.util.Scanner;
public class ht_2{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    
    String x=sc.nextLine();
    String v="";
    String rv="";
    String rt="";
    int ix=0;
    
    for(int srt=0; srt<x.length(); srt++){
      char m=x.charAt(srt);
      
      if(m=='a' || m=='A' || m=='e' || m=='E' || m=='i' || m=='I' || m=='o' || m=='O' || m=='u' || m=='U' ){
        v=v+m;}
    }
    
    for(int srt=v.length()-1; srt>=0; srt--){
      rv=rv+v.charAt(srt);
    }
    
    for(int srt=0; srt<x.length(); srt++){
      char m=x.charAt(srt);
      
      if(m=='a' || m=='A' || m=='e' || m=='E' || m=='i' || m=='I' || m=='o' || m=='O' || m=='u' || m=='U' ){
        rt=rt+rv.charAt(ix);
        ix++;}
      else{
        rt=rt+m;
      }
    }
    
    System.out.println(rt);
  }
}


//Task 3

import java.util.Scanner;
public class ht_3{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Names of the spells:");
    String s="";
    int l= 0;
    
    while(true){
      String x=sc.nextLine();
      
      if(x.equals("stop")){
        break;}
      
      String up="";
      
      for(int srt=0; srt<x.length(); srt++){
        char m=x.charAt(srt);
        
       if(m>='a' && m<='z'){
          up=up+(char)(m-32);}
       else if(m>='A' && m<='Z'){
          up=up+m;}
      }
      
      if(up.length()>l){
        l=up.length();
        s=up;}
    }
    
    int p=0;
    for(int srt=0; srt<s.length(); srt++){
      p=p+s.charAt(srt);
    }
    
    System.out.println("Largest Spell : " +s);
    System.out.println("Power Level : " +p);
    
    
  }
}


//Task 4

import java.util.Scanner;
public class ht_4{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Fan Message:");
    String x=sc.nextLine();
    String w="";
    int mc=0;
    int bc=0;
    
    for(int srt=0; srt<x.length(); srt++){
      char y=x.charAt(srt);
    
      if((y>='A' && y<='Z') || (y>='a' && y<='z')){
        w=w+y;}
      else{
        if(w.equals("Madrid") || w.equals("MADRID")){
          mc++;}
        if(w.equals("Bayern") || w.equals("BAYERN")){
          bc++;}
        w="";}
    }
    
    if(w.equals("Madrid") || w.equals("MADRID")){
          mc++;}
    if(w.equals("Bayern") || w.equals("BAYERN")){
          bc++;}
    
    if(mc>bc){
      System.out.println("Madrid Supporter");}
    else if(mc<bc){
      System.out.println("Bayern Supporter");}
    else{
      if(mc>bc){
      System.out.println("Neutral");}
    }
      
      
      boolean c=false;
      boolean d=false;
      
     for(int srt=0; srt<x.length(); srt++){
       if(srt+4<x.length()){
         if(x.charAt(srt)=='c' && x.charAt(srt+1)=='l' &&
            x.charAt(srt+2)=='o' && x.charAt(srt+3)=='s' &&
            x.charAt(srt+4)=='e' ){
           c=true;}
       }
       
       if(srt+6<x.length()){
         if(x.charAt(srt)=='d' && x.charAt(srt+1)=='e' && x.charAt(srt+2)=='s' &&
            x.charAt(srt+3)=='t' && x.charAt(srt+4)=='r' && x.charAt(srt+5)=='o' &&
            x.charAt(srt+6)=='y' ){
           d=true;}
       }
     }
     
     if (c){
       System.out.println("Fan expect a close match");}
     else if(d){
       System.out.println("Fan expects a dominating victory!");}
     else{
       System.out.println("Hard to read the fan sentiment");}
     
    
  }
}


//Task 5

import java.util.Scanner;
public class ht_5{
  public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    
    String x=sc.nextLine();
    
    int y=x.length()-1;
    int c=0;
    
    while(y>=0 && x.charAt(y)==' '){
      y--;
    }
    
    while(y>=0 && x.charAt(y)!=' '){
      c++;
      y--;
    }
    
    System.out.println(c);
    
  }
}
