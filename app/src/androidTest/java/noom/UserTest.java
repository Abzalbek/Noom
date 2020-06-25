package noom;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import noom.helper.UiAutomatorHelper;


@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class UserTest extends BaseTest {

    public UiAutomatorHelper helper = new UiAutomatorHelper();

    @Before
    public void setup(){
        launchApp();
    }

    @Test
    public void testWelcome() {
        helper.check("Sign up");
    }
}
