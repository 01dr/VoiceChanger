package com.voicechanger;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.util.Log;

public class VoiceChangingModule extends ReactContextBaseJavaModule {
  VoiceChangingModule(ReactApplicationContext context) {
    super(context);
  }
  
  @Override
  public String getName() {
    return "VoiceChangingModule";
  }
  
  @RequiresApi(api = Build.VERSION_CODES.M)
  @ReactMethod
  public void changeToAlien(String file) {
    Log.d("VoiceChangingModule", "Called changeVoiceToAlien method");
    
    MediaPlayer mp = new MediaPlayer();
    PlaybackParams pp = new PlaybackParams();
    
    pp.setPitch(Float.parseFloat(String.valueOf(0.6f)));
    
    try {
      mp.setDataSource(file);
      mp.prepare();
      mp.setPlaybackParams(pp);
      mp.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @RequiresApi(api = Build.VERSION_CODES.M)
  @ReactMethod
  public void changeToChild(String file) {
    Log.d("VoiceChangingModule", "Called changeVoiceToChild method");
    
    MediaPlayer mp = new MediaPlayer();
    PlaybackParams pp = new PlaybackParams();
    
    pp.setPitch(Float.parseFloat(String.valueOf(1.8f)));
    
    try {
      mp.setDataSource(file);
      mp.prepare();
      mp.setPlaybackParams(pp);
      mp.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @RequiresApi(api = Build.VERSION_CODES.M)
  @ReactMethod
  public void speedUp(String file) {
    Log.d("VoiceChangingModule", "Called speedUpVoice method");
    
    MediaPlayer mp = new MediaPlayer();
    PlaybackParams pp = new PlaybackParams();
    
    pp.setSpeed(Float.parseFloat(String.valueOf(2.5)));
    
    try {
      mp.setDataSource(file);
      mp.prepare();
      mp.setPlaybackParams(pp);
      mp.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @RequiresApi(api = Build.VERSION_CODES.M)
  @ReactMethod
  public void slowDown(String file) {
    Log.d("VoiceChangingModule", "Called slowDownVoice method");
    
    MediaPlayer mp = new MediaPlayer();
    PlaybackParams pp = new PlaybackParams();
    
    pp.setSpeed(Float.parseFloat(String.valueOf(0.4)));
    
    try {
      mp.setDataSource(file);
      mp.prepare();
      mp.setPlaybackParams(pp);
      mp.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
