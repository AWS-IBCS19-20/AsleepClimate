import java.util.*;

public class lizard {
  public static void main(String[] args) {
    int n = 0;
    System.out.println("Lizards are cool\n1)Yes\n2)No");
    Scanner reader = new Scanner(System.in);
    n = reader.nextInt();
    if(n == 1) {
      System.out.println("I approve");
    }
    if(n == 2) {
      System.out.println("I disapprove");
    }
  }
}
