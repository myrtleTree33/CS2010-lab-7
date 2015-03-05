import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by joel on 3/5/15.
 */
public class Ananagrams {
  
  private AnagramSet results, dict; // 2 are needed: 1 to store results, the other for duplication.
                                    // if e.g. duplicates are found in same set and removed, then
                                    // duplications >= 3 will not work.  Hence need 2 sets.
                                    // dict is not always added, to save computational time.  only on new case
                                    // it adds.
                                    // results contains "unique" anagram.
  
  private void init() {
    results = new AnagramSet();
    dict = new AnagramSet();
  }
  
  public Ananagrams() {
    init();
  }
  
  public Ananagrams(String inFilename) {
    init();
    readDict(inFilename);
  }
  
  public void readDict(String inFilename) {
    Scanner inScanner = null;
    try {
      inScanner = new Scanner(new File(inFilename));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    while(inScanner.hasNext()) {
      String token = inScanner.next();
      if (token.equals("#")) {
        break;
      }
      System.out.println(token);
      processToken(token);
    }
    
    System.out.println("---------- Results ------------");
    results.display();
  }

  
  private void processToken(String token) {
    Word a = new Word(token);
    if (dict.contains(a)) {
      results.removeSimilar(a);
    } else {
      results.add(a);
      dict.add(a);
    }
  }
    

  public static void main(String args[]) {
    for (String arg : args) {
      System.out.println("-------------------------");
      System.out.println("Processing file=" + arg);
      Ananagrams ana = new Ananagrams(arg);
      System.out.println("-------------------------");
    }
  }
}
