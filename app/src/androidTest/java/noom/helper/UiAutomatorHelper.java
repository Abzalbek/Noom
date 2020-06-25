package noom.helper;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.Until;

public class UiAutomatorHelper {

    public final int TIMEOUT = 5000;

    public UiDevice device;

    public UiAutomatorHelper() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    public void pressHome() {
        device.pressHome();
    }

    public String getLauncherPackageName() {
        return device.getLauncherPackageName();
    }

    public void check(String str) {
        device.wait(Until.hasObject(By.pkg(str).depth(0)), TIMEOUT);
    }
}
