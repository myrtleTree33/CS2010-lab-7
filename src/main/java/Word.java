import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joel on 3/5/15.
 */
public class Word {

  public Map<Character, Integer> getLetters() {
    return letters;
  }

  private Map<Character,Integer> letters;

  public String getWord() {
    return word;
  }

  private String word;
  
  public Word(String target) {
    letters = new HashMap<Character, Integer>(30);
    word = target;
    populate(target);
  }

  private void populate(String target) {
    Character c;
    for (int i = 0; i < target.length(); i++) {
      c = Character.toLowerCase(target.charAt(i));
      if (letters.containsKey(c)) {
        letters.put(c, letters.get(c) + 1);
      } else {
        letters.put(c, 1);
      }
    }
  }

  @Override
  public String toString() {
    return "Word=" + word + " Letters=" + letters.toString();
  }

  public Boolean equals(Word b) {
    return this.letters.equals(b.letters);
  }
}
