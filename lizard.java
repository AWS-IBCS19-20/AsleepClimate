import java.util.*;

public class lizard {
  public static void main(String[] args) {
    int n = 0;
    System.out.println("Lizards are cool\n\n1)Yes\n\n2)No\n");
    Scanner reader = new Scanner(System.in);
    n = reader.nextInt();
    if(n == 1) {
      System.out.println("I approve");
    }
    if(n == 2) {
      System.out.println("I disapprove");
    }
    System.out.println("Cats are better than dogs\n3)Yes\n4)No\n5)They taste the same");

    if(n == 3) {
      System.out.println("Opininated");
    }
    if (n == 4) {
      System.out.println("Opininated");
    }
    if(n == 5) {
      System.out.println("What is wrong with you");
    }
  }
}
