import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by joel on 3/5/15.
 */
public class AnagramSet extends HashSet {

  public AnagramSet() {

  }

  @Override
  public boolean contains(Object o) {
    Word b = (Word) o;
    Iterator itr = this.iterator();
    while (itr.hasNext()) {
      Word curr = (Word) itr.next();
      if (curr.equals(b)) {
        return true;
      }
    }
    return false;
  }
  
  public void removeSimilar(Word similarWord) {
    Iterator itr = this.iterator();
    while (itr.hasNext()) {
      Word curr = (Word) itr.next();
      if (curr.equals(similarWord)) {
        System.out.println("Word removed.");
        itr.remove();
      }
    }
  }
  
  
  public void display() {
    Iterator itr = this.iterator();
    System.out.print("Results=");
    
    if (this.size() == 0) {
      System.out.println("");
      return;
    }
    
    while (itr.hasNext()) {
      Word curr = (Word) itr.next();
      System.out.print(curr.getWord() + ",");
    }
    System.out.println("");
  }
  

}
