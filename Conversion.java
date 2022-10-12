class Conversion {
public static void main(String args[]) {
int a=0,b=1,i, c;
System.out.println(a+"\n"+b);

for(i=2;i<10;i++){
c=a+b;
a=b;
b=c;
System.out.println(c);

}
}
}