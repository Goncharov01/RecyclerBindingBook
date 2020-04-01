package com.example.recyclerbinding;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;

public class AdapterToString {

    private static int val;
    private Context context;

    public AdapterToString(Context context) {
    }

    @BindingAdapter("android:text")
    public static void bindIntegerInText(EditText editText, int value)
    {
     editText.setText(String.valueOf(value));
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getIntegerFromBinding(EditText editText)
    {
        String value = editText.getText().toString();

        try {
            val = Integer.parseInt(value);
            return val;

        }
        catch (NumberFormatException e)
        {
            val = 100;
        }
        return val;
    }


}
