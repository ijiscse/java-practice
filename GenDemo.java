class Gen<T> {
T ob; // declare an object of type T
// Pass the constructor a reference to
// an object of type T.
Gen(T o) {
ob = o;
}
// Return ob.
T getob() {
return ob;
}
// Show type of T.
void showType() {
System.out.println("Type of T is " +
ob.getClass().getName());
}
}
class GenDemo{
	public static void main(String args[]){
		Gen<Integer>iob;
		iob=new Gen<Integer>(88);
		iob.showType();
		int v = iob.getob();
System.out.println("value: " + v);
System.out.println();
// Create a Gen object for Strings.
Gen<String> strOb = new Gen<String>("Generics Test");
// Show the type of data used by strOb.
strOb.showType();
// Get the value of strOb. Again, notice
// that no cast is needed.
String str = strOb.getob();
System.out.println("value: " + str);
}
}