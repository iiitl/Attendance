package com.mycompany.attending;

import android.annotation.SuppressLint;
import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class stats extends Activity {
    Button copyButton;
    static String mainRecord="",mainSub="";
    int branch;

    TextView t, t1;
    String a = "", p = "",sub="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        getActionBar();
        // Date date=new Date();
        t = findViewById((R.id.mt));
        t1 = findViewById(R.id.rn);
        Intent il = getIntent();
        String b = "";
        branch = il.getIntExtra("branch", 0);

        students st = new students();
//        branch=st.branch;
        boolean u[] = new boolean[60];
        String name[] =new students().name[branch];
        u = il.getBooleanArrayExtra("true");



        String s = "  ABSENTEES ARE : \n ";
        for (int i = 1; i < name.length; i++) {
            if (!u[i]) {
                s += " " + i + ". " + name[i] + "\n";
            }
        }





        a = b + " PRESENT STUDENTS ARE : ";
        for (int i = 1; i < name.length; i++) {
            if (!u[i]) {
                p += i + ", ";
            } else {
                a += i + ", ";
            }

        }

        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
       //editor.putString("current", "");
        mainRecord=sharedPreferences.getString("mainRecord","");
        mainSub=sharedPreferences.getString("mainSub","");

        t.setText(s);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Format the current date using the specified format
        String formattedDate = dateFormat.format(date);
        p = "DATE: " + formattedDate + "\n";
        p += sharedPreferences.getString("current", "");
        t1.setText(p+"\n");
        p=new FunUse().remove(p,49,branch,0);
        sub=sharedPreferences.getString("subject",""); mainSub=sub+"#"+mainSub;

//        mainRecord=t1.getText().toString()+"#"+mainRecord;
//        editor.putString("mainRecord",mainRecord);
        editor.putString("mainSub",mainSub);


























        editor.apply();
    }

    public void copy(View v) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("label",new FunUse().remove(t1.getText().toString(),49,branch,0) );
        clipboard.setPrimaryClip(clip);
        mainRecord=new FunUse().remove(t1.getText().toString(),49,branch,0).trim()+"#"+mainRecord;


        SharedPreferences sharedPreferences=getSharedPreferences("attendance",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =sharedPreferences.edit();
        //mainRecord=t1.getText().toString()+"#"+mainRecord;
        editor.putString("mainRecord",mainRecord);
        editor.putString("mainSub",mainSub);


        Toast.makeText(getApplicationContext(), "Roll No. copied to clipboard", Toast.LENGTH_SHORT).show();








        editor.putString("current", "");
        editor.apply();



    }


    public void copy2(View v) {

        if (!a.contains("49"))
            a += "49";

        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("label", a);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(), "Roll No. copied to clipboard", Toast.LENGTH_SHORT).show();
//    }
//
    }
    public void copyToClipboard(String text) {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

        if (clipboardManager != null) {
            // Create a ClipData object to hold the text
            ClipData clipData = ClipData.newPlainText("Copied Text", text);

            // Set the ClipData to the clipboard
            clipboardManager.setPrimaryClip(clipData);
        }
    }
    public  void toast(String n){


        Toast.makeText(getApplicationContext(), n, Toast.LENGTH_SHORT).show();
    }
    public void done(View v)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("attendance", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        mainRecord=new FunUse().remove(t1.getText().toString(),49,branch,0).trim()+"#"+mainRecord;
        editor.putString("mainRecord",mainRecord);
        editor.putString("current", "");
        toast("SAVED");
        editor.apply();
         startActivity(new Intent(this, MainActivity.class));

    }
}

