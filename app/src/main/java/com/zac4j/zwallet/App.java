package com.zac4j.zwallet;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Customize App
 * Created by zac on 16-7-3.
 */

public class App extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Fresco.initialize(this);
  }
}
