package noom;

import android.content.Context;
import android.content.Intent;
import androidx.test.core.app.ApplicationProvider;


import noom.helper.UiAutomatorHelper;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class BaseTest {

    private final String PACKAGE = "com.wsl.noom";

    public UiAutomatorHelper helper = new UiAutomatorHelper();

    public void launchApp()  {

        // Start from the home screen
        helper.pressHome();

        // Wait for launcher
        final String launcherPackage = helper.getLauncherPackageName();
        assertThat(launcherPackage, notNullValue());
        helper.check(launcherPackage);

        // Launch the app
        Context context = ApplicationProvider.getApplicationContext();
        final Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(PACKAGE);
        // Clear out any previous instances
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);

        // Wait for the app to appear
        helper.check(PACKAGE);
    }
}
