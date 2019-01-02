import 'dart:async';

import 'package:flutter/services.dart';

class SimpleStepHistory {
  static const MethodChannel _channel =
      const MethodChannel('simple_step_history');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
