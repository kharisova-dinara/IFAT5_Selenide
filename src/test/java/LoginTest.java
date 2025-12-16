import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void personalAccountIsOpen() {
        loginPage.openPage()
                .login();
        personalAccountPage.waitOpen();
    }
}
