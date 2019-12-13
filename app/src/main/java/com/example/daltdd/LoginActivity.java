package com.example.daltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    EditText editText;
    TextInputLayout textInputLayout;
    Boolean isShowPassword=false;
    Button btnLogin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText= findViewById(R.id.txtPassword);

        textInputLayout= findViewById(R.id.txtInputLayout);

        btnLogin =findViewById(R.id.btnLogin);
        final Intent intent = new Intent(this,DashBoardActivity.class);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable show = getResources().getDrawable(R.drawable.ic_remove_red_eye_black_24dp);
                Drawable hide = getResources().getDrawable(R.drawable.ic_visibility_off_black_24dp);

                if(isShowPassword==true){
                    textInputLayout.setEndIconDrawable(hide);
                    editText.setInputType (0x00000081);
                    isShowPassword=false;
                }else{
                    textInputLayout.setEndIconDrawable(show);
                    editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    isShowPassword=true;
                }
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

}
