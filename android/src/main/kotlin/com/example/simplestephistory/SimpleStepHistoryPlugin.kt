package com.example.simplestephistory

import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.MethodCallHandler
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.PluginRegistry.Registrar

class SimpleStepHistoryPlugin: MethodCallHandler {
  companion object {
    @JvmStatic
    fun registerWith(registrar: Registrar) {
      val channel = MethodChannel(registrar.messenger(), "simple_step_history")
      channel.setMethodCallHandler(SimpleStepHistoryPlugin())
    }
  }

  override fun onMethodCall(call: MethodCall, result: Result) {
    if (call.method == "getTodaySteps") {
      result.success(0)
    } else if (call.method == "fetchSteps") {
      result.success(0)
    }
    else if (call.method == "checkStepsAvailability") {
      result.success(false)
    }
    else if (call.method == "requestStepsAuthorization") {
      result.success(false)
    }
    else {
      result.notImplemented()
    }
  }
}
