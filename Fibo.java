import java.util.*;
import java.lang.*;

class Fibonacci{
void fibb(int n){
int a=0,b=1;
int data[]=new int[100];
data[0]=1;
data[1]=1;
for(i=2;i<=10;i++){
data[i]=data[i-1]+data[i-2];

}
for(i=0;i<=;i++){
System.out.println(data[i]);
}

}

void Palin(){
int r,sum=0,temp;    
  System.out.println("Enter a number to check it :");
  Scanner nt= new Scanner(System.in);
  
  int n=nt.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(temp+" is a palindrome number ");    
  else    
   System.out.println(temp+" is not a palindrome");   
}
}

class Fibo{
public static void main(String[]args){
Fibonacci obj=new Fibonacci();
System.out.println("hello");
System.out.println("Enter the length of Fibonacci series");
Scanner mn= new Scanner(System.in);
int b=mn.nextInt();
obj.fibb(b);
obj.Palin();
}}