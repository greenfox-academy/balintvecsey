/**
 * Created by Bálint on 2017. 03. 22..
 */
public class Doubling {
  public static void main(String[] args) {
// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter
// - Print the result of `doubling(ak)`
    int ak = 123;
    System.out.print(doublingFunction(ak));
  }

  public static int doublingFunction(int doubling) {
    return doubling * 2;
  }
}
