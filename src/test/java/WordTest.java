import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testToString() throws Exception {
    Word word = new Word("Hello");
    System.out.println(word);
  }

  @Test
  public void testEquals() throws Exception {
    Word word = new Word("Evian");
    Word word2 = new Word("Niave");
    Word word3 = new Word("appLe");
    
    assertTrue(word.equals(word2));
    assertFalse(word.equals(word3));
  }
  
}