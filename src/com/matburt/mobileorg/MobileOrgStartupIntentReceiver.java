package com.matburt.mobileorg;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

public class MobileOrgStartupIntentReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		Intent serviceIntent = new Intent();
		serviceIntent.setAction("com.matburt.mobileorg.SYNC_SERVICE");
		context.startService(serviceIntent);
	}
}