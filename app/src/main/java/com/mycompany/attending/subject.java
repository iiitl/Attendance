package com.mycompany.attending;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class subject extends AppCompatActivity {
    EditText editText;

    //SharedPreferences.Editor editor = sharedPreferences.edit();
    String subject[]={" ","DATA STRUCTURES","W.D.A.","OBJECT ORIENTED PROGRAMMING","COMPUTER ORGANISATION AND ARCHITECTURE","PROFESSIONAL COMMUNICATION","SPORTS","YOGA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_subject);

        editText = findViewById(R.id.editTextText);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
                int n=sharedPreferences.getInt("branch",0);
      //  editText.setText(""+n);
         

        // Set an OnEditorActionListener for the EditText
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if ((actionId == EditorInfo.IME_ACTION_DONE || (keyEvent != null && keyEvent.getAction() == KeyEvent.ACTION_DOWN && keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER))) {
                    // Handle the "Enter" key press

                    performAction();
                    return true; }// Consume the event

                return false;
            }

        });
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.apply();
    }
    public void ds(View v)
    {
        sub(1);
    }

    public void wda(View v)
    {
        sub(2);
    }

    public void oop(View v)
    {
        sub(3);
    }

    public void coa(View v)
    {
        sub(4);
    }

    public void pc(View v)
    {
        sub(5);
    }

    public void sp(View v)
    {
        sub(6);
    }
    public void yoga(View v)
    {
        sub(7);
    }
    public  void performAction()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent i=new Intent(this, students.class);
        editor.putString("subject",editText.getText().toString());
        editor.apply();
        //i.putExtra("subject",subject[n]);
        startActivity(i);
    }
    public void sub(int n)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent i=new Intent(this, students.class);
        editor.putString("subject",subject[n]);
        editor.apply();
        //i.putExtra("subject",subject[n]);
        startActivity(i);
    }
}