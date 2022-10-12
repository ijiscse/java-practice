class SuperSubCatch {
public static void main(String args[]) {
try {
int a = 0;
int b = 42 / a;
} 
/* This catch is never reached because
ArithmeticException is a subclass of Exception. */

catch(Exception e) {


System.out.println("Generic Exception catch.");
}
catch(ArithmeticException e) { // ERROR - unreachable//reverse it to see what is happpening
System.out.println("This is never reached.");
}
}
}