/**
 * Created by Bálint on 2017. 03. 30..
 */
public class Bunnies {

  // We have a number of bunnies and each bunny has two big floppy ears.
  // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
  public static void main(String[] args) {
    System.out.println(bunnyEars(3));
  }

  public static int bunnyEars(int n) {
    if (n == 1) {
      return 2;
    }
    else {
      return 2 + bunnyEars(n-1);
    }
  }
}
