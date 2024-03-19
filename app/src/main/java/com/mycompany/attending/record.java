package com.mycompany.attending;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class record extends AppCompatActivity {

    LinearLayout l1,main;
    static String mainRecord,mainSub;
    Button c1,r1;
    ArrayList<String> mainArray,subArray;
    TextView s1,test;
    EditText a1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        main = findViewById(R.id.main);


        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        mainRecord = sharedPreferences.getString("mainRecord", "");
     mainArray = getArrayList(mainRecord);
//        a1 = findViewById(R.id.d);
//        s1 = findViewById(R.id.s);
//        a1.setText(mainArray[0]);
        mainSub = sharedPreferences.getString("mainSub", "");
       subArray = getArrayList(mainSub);
       // s1.setText(subArray[0]);

        editor.putString("mainRecord",record.mainRecord);
        editor.putString("mainSub",record.mainSub);
        if(mainRecord.length()<=2)
        {
            test=findViewById(R.id.test);
            test.setText("NO RECORD FOUND");
        }
      else {
            for (int i = 0; i < mainArray.size();i++)
{
                View externalLayout = LayoutInflater.from(this).inflate(R.layout.data, null);
                TextView subject = externalLayout.findViewById(R.id.subject);
                TextView datas = externalLayout.findViewById(R.id.data);
                subject.setText(subArray.get(i));
                datas.setText(mainArray.get(i));
                editor.putString("mainRecord", record.mainRecord);
                editor.putString("mainSub", record.mainSub);
                Button c = externalLayout.findViewById(R.id.c), delete = externalLayout.findViewById(R.id.delete),edit=externalLayout.findViewById(R.id.edit);
                int finalI1 = i;
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                        ClipData clip = ClipData.newPlainText("label", datas.getText().toString());
                        clipboard.setPrimaryClip(clip);
                        mainRecord.replace(mainArray.get(finalI1),datas.getText().toString());





                        Toast.makeText(getApplicationContext(), "Roll No. copied to clipboard", Toast.LENGTH_SHORT).show();

                    }
                });
                int finalI = i;
                Log.d("xdbhs", "" + finalI);
                delete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

showConfirmationDialog(finalI,externalLayout);

                    }
                });
    int finalI2 = i;
    edit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showCustomAlertDialog(finalI2,datas);
                    }
                });


                editor.putString("mainRecord", record.mainRecord);
                editor.putString("mainSub", record.mainSub);
                editor.apply();
                if(mainRecord.length()<=2)
                {
                    test=findViewById(R.id.test);
                    test.setText("NO RECORD FOUND");
                }
                main.addView(externalLayout);
            }


        }



    }
    public void save(String key,String value)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("attendance",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();


    }
    public ArrayList<String> getArrayList(String main)
    {
       String str[]=main.split("#");
        for(String s:str)
        {
            s=s.trim();
        }
       return  new ArrayList<>(Arrays.asList(str));

    }
    public String arrayListToString(ArrayList<String> str)
    {
        String n="";
        for(String s:str)
        {
            n+=s.trim()+"#";
        }
        return n;
    }
    private void showCustomAlertDialog(int i,TextView t) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.editalert, null);
        dialogBuilder.setView(dialogView);

        // Custom title and button
        TextView titleTextView = dialogView.findViewById(R.id.subject);EditText data=dialogView.findViewById(R.id.data);
        titleTextView.setText(subArray.get(i));
data.setText(mainArray.get(i));
        Button closeButton = dialogView.findViewById(R.id.cancel),save=dialogView.findViewById(R.id.save);


        // Create and show the dialog
        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog
                alertDialog.dismiss();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog
                t.setText(data.getText());
                mainArray.set(i,data.getText().toString());
                mainRecord=arrayListToString(mainArray);
                SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString("mainRecord", mainRecord);
                editor.putString("mainSub", mainSub);
                editor.apply();
                alertDialog.dismiss();
            }
        });
    }
    private void showConfirmationDialog(int finalI,View externalLayout) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to delete?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked Yes button
                        deleteItem(finalI,externalLayout);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User clicked No button
                        dialog.dismiss();
                    }
                });
        // Create and show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void deleteItem(int finalI,View externalLayout) {
        mainRecord = "";
        mainSub = "";
//
        try {
            mainArray.remove(finalI);
            subArray.remove(finalI);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        mainRecord=arrayListToString(mainArray);
        mainSub=arrayListToString(subArray);



        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("mainRecord", mainRecord);
        editor.putString("mainSub", mainSub);
        editor.apply();
        mainSub = sharedPreferences.getString("mainSub", ":");
        mainRecord = sharedPreferences.getString("mainRecord", ":");


        main.removeView(externalLayout);
    }
}