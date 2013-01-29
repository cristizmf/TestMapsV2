
package com.test.maps.testmapsv2;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        final TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        tabHost.addTab(tabHost.newTabSpec("0").setIndicator("tab1").setContent(new Intent(this, Tab1Activity.class)));
        tabHost.addTab(tabHost.newTabSpec("1").setIndicator("tab2").setContent(new Intent(this, Tab2Activity.class)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
