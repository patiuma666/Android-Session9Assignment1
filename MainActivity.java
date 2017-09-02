package com.example.iis5.submenuxml;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // thid is getting the widgets reference from the XML layout
        textView = (TextView) findViewById(R.id.textView);
    }
  /*   onCreateOptionsMenu() is called  When you add items to the menu, you can implement the Activity's
       onOptionsItemSelected(MenuItem) method to handle them there.
       In parameters the options menu in which we can place the items.*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater class is used to instantiate menu XML files into Menu objects.
           // public MenuInflater getMenuInflater ()
              //  Returns a MenuInflater with this context.
        getMenuInflater().inflate(R.menu.menu, menu);
      //  it return true for the menu which is to be displayed if we return false it will not be shown
        return true;
    }
//this adding the items to the menu to select the item we use this method
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //has we are using switch case to select the specific item to view the textview color
        switch (item.getItemId()) {//the menu item that is selected

            case R.id.redcolor:             //sets the text color to red
              textView.setTextColor(Color.RED);
                return true;

            case R.id.greencolor:           //sets the text color to green
                textView.setTextColor(Color.GREEN);
                return true;


            case R.id.bluecolor:            //sets the text color to blue
                textView.setTextColor(Color.BLUE);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}