import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class And{
    public static void main (String[] args) {
                      // Your code here
int a,b;
System.out.println("Enter value of a and b");
Scanner mn=new Scanner(System.in);
a=mn.nextInt();
b=mn.nextInt();
if(a<=10&&b>=10)
{
    System.out.println("true");
}
else{
    System.out.println("false");
}

    }
}