package com.voicechanger;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class VoiceChangingModule extends ReactContextBaseJavaModule {
  VoiceChangingModule(ReactApplicationContext context) {
    super(context);
  }
  
  @Override
  public String getName() {
    return "VoiceChangingModule";
  }
}
