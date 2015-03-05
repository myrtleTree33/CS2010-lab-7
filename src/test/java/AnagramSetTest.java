import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramSetTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testContains() throws Exception {
    Word word = new Word("Evian");
    Word word2 = new Word("Niave");
    Word word3 = new Word("appLe");
    
    AnagramSet set = new AnagramSet();
    
    set.add(word);
    
    assertTrue(set.contains(word2));
    assertFalse(set.contains(word3));

  }
}