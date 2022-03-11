import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Task t = new Task();
    String expectedIntials = t.getInitials(t.test_fullName);
    String expectedContryCode = t.getCountryCode(t.test_country);
    String expectedOrganisation = t.getOrganisation(t.test_organisation);
    String expected = expectedIntials+"@"+expectedOrganisation+"."+expectedContryCode;
    Assert.assertEquals(expected, t.generateEmail());
  }
}