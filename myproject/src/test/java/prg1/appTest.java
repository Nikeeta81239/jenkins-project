package prg1;
import org.testng.Assert;
import org.testng.annotations.Test;
public class appTest {
@Test
public void passTest() {
	Assert.assertEquals(app.display(55), "pass");
}
@Test
public void failTest() {
	Assert.assertEquals(app.display(30), "fail");
}
@Test
public void invalidTest() {
	Assert.assertEquals(app.display(-1), "invalid");
}

}
	