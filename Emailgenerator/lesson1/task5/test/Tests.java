import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    //test the getCountryCode method
    Task t = new Task();
    Assert.assertEquals("dk", t.getCountryCode("Denmark"));
    Assert.assertEquals("co.uk", t.getCountryCode("Great Britain"));
    Assert.assertEquals("com", t.getCountryCode("USA"));
    Assert.assertEquals(null, t.getCountryCode("Greece"));
  /*test the generateEmail method
    String expectedIntials = t.getInitials(t.test_fullName);
    String expectedContryCode = t.getCountryCode(t.test_country);
    String expectedOrganisation = t.getOrganisation(t.test_organisation);
    String expected = expectedIntials+"@"+expectedOrganisation+"."+expectedContryCode;
    Assert.assertEquals(expected, t.generateEmail());*/

  }
}