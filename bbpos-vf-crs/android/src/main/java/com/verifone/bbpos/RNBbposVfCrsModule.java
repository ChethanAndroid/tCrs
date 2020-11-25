
package com.verifone.bbpos;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNBbposVfCrsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNBbposVfCrsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNBbposVfCrs";
  }
}