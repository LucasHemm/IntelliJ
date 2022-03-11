import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();
    Assert.assertEquals("cphbusiness",t.getOrganisation(0));
    Assert.assertEquals(null,t.getOrganisation(3));
    Assert.assertEquals(null,t.getOrganisation(-1));

  }
}