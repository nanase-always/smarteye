package com.smarteye.smarteye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        PushManager.startWork(getApplicationContext(), PushConstants.LOGIN_TYPE_API_KEY, "");
    }
}
