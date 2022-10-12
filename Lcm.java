import java.util.*;
public class Lcm{
  public static void main(String[] args) {
System.out.println("Enter Two value to find out LCM");
Scanner mn=new Scanner(System.in);

    int n1 = mn.nextInt(), n2 =mn.nextInt(), lcm;

    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}