import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Zero{
public static void main(String[]args){

System.out.println("Enter three digit number");

Scanner mn=new Scanner(System.in);
int N=mn.nextInt();


int a,b,c,d,e,i=1;
do{
a=N;
a=N%10;
b=N/10;
c=b%10;
d=b/10;
e=N-(a+c+d);
N=e;



System.out.println("done in operation "+ i);
i++;
}while(e!=0);

System.out.println("done"+e);
}
}