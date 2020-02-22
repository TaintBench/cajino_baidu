package com.baidu.android.pushservice;

import android.app.PendingIntent;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class t implements OnClickListener {
    final /* synthetic */ PushTestActivity a;

    t(PushTestActivity pushTestActivity) {
        this.a = pushTestActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent(PushConstants.ACTION_METHOD);
        intent.putExtra("method", PushConstants.METHOD_COUNT);
        intent.putExtra(PushConstants.EXTRA_APP, PendingIntent.getBroadcast(this.a, 0, new Intent(), 0));
        intent.putExtra(PushConstants.EXTRA_ACCESS_TOKEN, PushConstants.rsaEncrypt(this.a.a));
        this.a.sendBroadcast(intent);
    }
}
