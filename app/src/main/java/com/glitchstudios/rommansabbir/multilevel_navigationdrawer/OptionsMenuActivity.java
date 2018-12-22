package com.glitchstudios.rommansabbir.multilevel_navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_profile:{
                displayMessage("Profile selected");
                return true;
            }
            case R.id.nav_log:{
                displayMessage("Log Selected");
                return true;
            }
            case R.id.nav_logout:{
                displayMessage("Logout Selected");
                return true;
            }
            default:{
                return super.onOptionsItemSelected(item);
            }
        }
    }

    private void displayMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
