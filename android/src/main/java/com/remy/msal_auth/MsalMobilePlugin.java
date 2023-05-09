package com.remy.msal_auth;

import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;

/** MsalMobilePlugin */
public class MsalMobilePlugin implements FlutterPlugin, ActivityAware {
  private AuthMethodHandler mMethodHandler;

  @Override
  public void onAttachedToActivity(@NonNull ActivityPluginBinding binding) {
    if (mMethodHandler != null) {
      mMethodHandler.setActivity(binding.getActivity());
    }
  }

  @Override
  public void onDetachedFromActivityForConfigChanges() {}

  @Override
  public void onDetachedFromActivity() {}

  @Override
  public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding binding) {}

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {}

  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {
    final MethodChannel channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.remy.msal_auth");
    mMethodHandler = new AuthMethodHandler();
    channel.setMethodCallHandler(mMethodHandler);
  }
}