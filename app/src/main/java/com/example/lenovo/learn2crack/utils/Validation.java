package com.example.lenovo.learn2crack.utils;

/**
 * Created by lenovo on 28.11.2017.
 */

import android.text.TextUtils;
import android.util.Patterns;

import org.w3c.dom.Text;

public class Validation {

    public static boolean validateFields(String name){
        if(TextUtils.isEmpty(name)){
            return false;
        }else{
            return true;
        }
    }

    public static boolean validateEmail(String string){
        if(TextUtils.isEmpty(string) || !Patterns.EMAIL_ADDRESS.matcher(string).matches()){
            return false;
        }else{
            return true;
        }
    }

}
