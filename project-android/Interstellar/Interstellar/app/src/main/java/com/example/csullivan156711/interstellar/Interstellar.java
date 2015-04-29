package com.example.csullivan156711.interstellar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class Interstellar extends ActionBarActivity {
    private Button Login;
    private Button Create;
    private Button Cancel;
    private Button Left;
    private Button Right;
    private ImageView ship;
    public  boolean won = false;
    private EditText TextField;
    private String name;
    private String LoinInfo;
    private  EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstellar);
        Login = (Button) findViewById(R.id.button);
        Create = (Button) findViewById(R.id.button2);
        Cancel = (Button) findViewById(R.id.button3);
        Left = (Button) findViewById(R.id.button4);
        Right = (Button) findViewById(R.id.button5);
        TextField = (EditText) findViewById(R.id.editText);
        ship = (ImageView) findViewById(R.id.imageView);
        input =  new EditText(Interstellar.this);


        Left.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.DARKEN);

        Right.getBackground().setColorFilter(Color.WHITE, PorterDuff.Mode.DARKEN);



        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    name =  String.valueOf(TextField .getText());

                    if (true == name.equals(LoinInfo)) {
                        won = true;

                        v.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.DARKEN);
                        LinearLayout bgElement = (LinearLayout) findViewById(R.id.container);
                        bgElement.setBackgroundColor(Color.BLACK);

                        Create.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.DARKEN);
                        Cancel.getBackground().setColorFilter(Color.BLACK, PorterDuff.Mode.DARKEN);
                        Left.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.DARKEN);

                        Right.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.DARKEN);
                        // new AlertDialog.Builder(Interstellar.this)
                        // .setTitle("YOU did it")
                        //  .setMessage("YOU did it")
                        // .show();

                    }
                    else
                        new AlertDialog.Builder(Interstellar.this)
                                .setTitle("Try again")
                                .setMessage("Try again")
                                .show();


                } catch (NullPointerException exception) {
                    new AlertDialog.Builder(Interstellar.this)
                            .setTitle("NO Username")
                            .setMessage("no Username")
                            .show();

                }
            }
        });
        final AlertDialog ad = new AlertDialog.Builder(Interstellar.this)
                .setTitle("Update Username")
                .setMessage("Enter in your user name")
                .setView(input)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        LoinInfo = String.valueOf(input.getText());
                        // deal with the editable
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Do nothing.
                    }
                }).create();
        Create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ad.show();


            }
        });
        Cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interstellar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
