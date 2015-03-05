import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnanagramsTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testReadDict() throws Exception {
    Ananagrams ana = new Ananagrams("./in/input02.txt");
  }
}