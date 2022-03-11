import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();

    Assert.assertEquals("initials", t.getInitials("any string"));
    Assert.assertEquals("country code", t.getCountryCode("any string"));
    Assert.assertEquals("cphbusiness", t.getOrganisation(0));


  }
}