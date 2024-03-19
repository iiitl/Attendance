package com.mycompany.attending;

import android.content.Context;
import android.content.SharedPreferences;

public class FunUse {

    public String br[]={
            "INFORMATION TECHNOLOGY",
            "COMPUTER SCIENCE",
            "COMPUTER SCIENCE AND BUSINESS",
            "COMPUTER SCIENCE AND ARTIFICIAL INTELIGENCE",
    };
    public void saveData(String key,String data)
    {
// Get a reference to SharedPreferences



    }
    public String remove(String abs,int rn,int currentBranch,int branch)
    {
        if(currentBranch==branch)
           return abs.replace(" "+rn+",","");
        else
            return abs;
    }

}
