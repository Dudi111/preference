package com.example.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {
    private static final String SHARED_PREFERENCE_KEY = "Praveen";

    public static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCE_KEY, Context.MODE_PRIVATE);
    }
    public static void writeStringToPreference(Context context, String key, String value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }
    public static String readString(Context context,String key){
        SharedPreferences sharedPreference = getSharedPreference(context);
        return sharedPreference.getString(key,"no key found");

    }

}
