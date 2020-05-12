package com.reactnativecommunity.webview

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.ReactApplicationContext


class RNCWebViewPackage : ReactPackage {
  var viewManager: RNCWebViewManager? = null

  override fun createNativeModules(reactContext: ReactApplicationContext) = listOf(
    RNCWebViewModule(reactContext).apply { setWebViewPackage(this@RNCWebViewPackage) }
  )

  override fun createViewManagers(reactContext: ReactApplicationContext) = listOf(
    RNCWebViewManager().apply { viewManager = this }
  )

}
