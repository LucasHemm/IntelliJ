import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();
    String[] expecteds= {"CPHBusiness","SpaceX","Brentford"};
    Assert.assertArrayEquals(expecteds, t.organisations);
   // Assert.assertEquals("CE@Brentford.co.uk",t.generateEmail());
  }

}