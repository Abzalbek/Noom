package noom;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class UserTest extends BaseTest {

    @Test
    public void testWelcomePage() {
        helper.check("Sign up");
    }

    @Test
    public void testOnboardingNewAccount(){
        helper.click("Sign up");

        helper.click("Sign up with Email, Facebook, or Google");

        // Add new account credentials
        helper.click("Male");
        helper.setText("First name","John");
        helper.setText("Age","30");
        helper.setText("Height","6");
        helper.click("cm");

        helper.click("NEXT");
    }
}
