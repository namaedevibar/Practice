package com.activity.devibar.practice;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mBtnClick;
    private EditText mName;

    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnClick = (Button) findViewById(R.id.btnClickMe);
        mName = (EditText) findViewById(R.id.txtName);

        mImage= (ImageView) findViewById(R.id.txtImage);


        mName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mName.setTextColor(Color.RED);
                mName.setTypeface(null, Typeface.BOLD_ITALIC);
            }
        });






    }

    public void ClickMe(View v){

        try{

            String name = mName.getText().toString();




            Toast.makeText(this, "Hello, "+ name, Toast.LENGTH_SHORT).show();
            new AlertDialog.Builder(this).setTitle("Practice App").setMessage("Hello, "+name)
                    .setPositiveButton("Yes", null)
                    .setNegativeButton("No", null)
                    .setNeutralButton("Cancel", null)
                    .show();

        }catch(Exception e){

            new AlertDialog.Builder(this).setTitle("Practice App").setMessage("INVALID")
                    .show();


        };



    }


    public void Change(View v){

        Random i = new Random();
        int rand = i.nextInt(4)+1;

        switch (rand){
            case 1: mImage.setImageResource(R.drawable.img2);
                break;
            case 2: mImage.setImageResource(R.drawable.img);
                break;
            case 3: mImage.setImageResource(R.drawable.img3);
                break;
            case 4: mImage.setImageResource(R.drawable.img4);
                break;



        }



    }








}










