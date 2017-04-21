package ToDoApp;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by Bálint on 2017. 04. 21..
 */
public class ToDoApp {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("l"); // list
    parser.accepts("a"); // add
    parser.accepts("r"); // remove
    parser.accepts("c"); // check
    parser.accepts("u"); // update
    OptionSet optionSet = parser.parse(args);

    CSVReader reader = null;
    try {
      reader = new CSVReader(new FileReader("~/assets/todolist.csv"));
      List<String[]> lines = reader.readAll();

      if (optionSet.has("l")) {}

      if (optionSet.has("a")) {}

      if (optionSet.has("r")) {}

      if (optionSet.has("c")) {}

      if (optionSet.has("r")) {}

      if (optionSet.has("u")) {}

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
