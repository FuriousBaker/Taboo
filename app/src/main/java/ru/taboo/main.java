package ru.taboo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;


public class main extends ActionBarActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnStart = (Button) findViewById(R.id.btnStart);
        Button btnCards = (Button) findViewById(R.id.btnCards);
        Button btnPref = (Button) findViewById(R.id.btnPreferences);
        Button btnRules = (Button) findViewById(R.id.btnRules);
        btnStart.setOnClickListener(this);
        btnCards.setOnClickListener(this);
        btnPref.setOnClickListener(this);
        btnRules.setOnClickListener(this);
    }

    public void onClick (View v){
        if(v.getId() == R.id.btnStart){
            //
        }else if (v.getId() == R.id.btnCards){
            //
        }else if (v.getId() == R.id.btnPreferences){
            //
        }else if (v.getId() == R.id.btnRules){
            Intent intOpenForm = new Intent(main.this,rules.class);
            startActivity(intOpenForm);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }
        */
        return super.onOptionsItemSelected(item);
    }

}
