package noom.helper;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
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

    public void click(String text) {
        UiObject2 elm = device.wait(Until.findObject(By.text(text)),TIMEOUT);
        elm.click();
        device.waitForIdle();
    }

    public void setText(String withText, String text){
        UiObject2 editText = device.wait(Until.findObject(By.text(withText)),TIMEOUT);
        editText.setText(text);
        device.waitForIdle();
    }

}
