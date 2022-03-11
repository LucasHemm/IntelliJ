import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();
    Assert.assertEquals("ce@brentford.co.uk", t.generateEmail());
  }
}