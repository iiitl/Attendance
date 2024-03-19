package com.mycompany.attending;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void it(View b)
    {

        tosubject(0);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",0);
        editor.apply();
    }
    public void cs(View b)
    {
 tosubject(1);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",1);
        editor.apply();
    }
    public void csb(View b)
    {
       tosubject(2);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",2);
        editor.apply();
    }
    public void csai(View b)
    {
        tosubject(3);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",3);
        editor.apply();
    }
    public void itcs(View b)
    {
        tosubject(4);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",4);
        editor.apply();
    }
    public void csbcsai(View b)
    {

        tosubject(5);
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",5);
        editor.apply();
    }
    public void tosubject(int n)
    {
        Intent i=new Intent(this,subject.class);
        i.putExtra("branching",n);

        startActivity(i);
    }
    public void rec(View v)
    {
        Intent i=new Intent(this,record.class);
        startActivity(i);
    }
    public void share(int n){
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("branch",n);
        editor.apply();

    }
    public   int getString(String key) {
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        // Provide a default value in case the key is not found
        int hg=sharedPreferences.getInt(key,0);
        return hg;
    }

}