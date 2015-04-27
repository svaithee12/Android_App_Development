package com.example.vaithee.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView maintextview;
    Button mainButton;
    EditText mainEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maintextview= (TextView) findViewById(R.id.main_textView);
        maintextview.setText("Enter the Text and press the button : ");

        mainButton = (Button) findViewById(R.id.main_button);
        mainButton.setOnClickListener( this);

        mainEditText =(EditText) findViewById(R.id.main_EditText);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        maintextview.setText(mainEditText.getText().toString());

    }
}
