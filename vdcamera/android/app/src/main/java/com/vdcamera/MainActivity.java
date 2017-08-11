
package com.vdcamera;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.lwansbrough.RCTCamera.RCTCameraPackage;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "vdcamera";
    }

    protected List<ReactPackage> getPackages() {

    return Arrays.<ReactPackage>asList(
      new RCTCameraPackage()
    );
  }
}
