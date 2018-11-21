package com.example.student.orwimalv5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.Parser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvHeaderText;
    Button btnWriteSmtngName, btnCalcSmtng;
    EditText etEnterAge;
    ImageView ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
    }

    private void initializeUI() {
        tvHeaderText =(TextView) findViewById(R.id.tvHeaderText);
        btnWriteSmtngName = (Button) findViewById(R.id.btnWriteSmtng);
        btnCalcSmtng = (Button) findViewById(R.id.btnCalcSmtng);
        etEnterAge = (EditText) findViewById(R.id.etEnterAge);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        btnCalcSmtng.setOnClickListener(this);
    }

    public void myClick(View view) {
        tvHeaderText.setText("Ferit is good enough!");
        Log.wtf("FERIT","Before toast is ready!");
        Toast.makeText(this,"The dean is the best!",Toast.LENGTH_SHORT).show();
        Log.d("FERIT","After toast!");
    }

    @Override
    public void onClick(View view) {
        try {
            int years = Integer.parseInt(etEnterAge.getText().toString());
            this.tvHeaderText.setText("Vi ste pre stari "+years);
        } catch (Exception e) {
            this.tvHeaderText.setText("Unesite godine");
        }
        ivImage.setVisibility(View.INVISIBLE);


    }
}
