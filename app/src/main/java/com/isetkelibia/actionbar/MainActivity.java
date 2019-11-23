package com.isetkelibia.actionbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myText = findViewById(R.id.menu_message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                myText.setText(getString(R.string.action_settings));
                return true;

            case R.id.action_home:
                // User chose the "Home" action, ...
                myText.setText(getString(R.string.action_home));
                return true;

            case R.id.action_search:
                // User chose the "Search" action, ...
                myText.setText(getString(R.string.action_search));
                return true;

            case R.id.action_item_a:
                // User chose the "item2" action, ...
                myText.setText(getString(R.string.action_item_a));
                return true;

            case R.id.action_item_b:
                // User chose the "item2" action, ...
                myText.setText(getString(R.string.action_item_b));
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}