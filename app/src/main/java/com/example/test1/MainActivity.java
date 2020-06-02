package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mylibrary.Plus;

public class MainActivity extends AppCompatActivity {
    Button btnComulate;
    EditText edtA,edtB;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnComulate=findViewById(R.id.btn_comulate);
        edtA=findViewById(R.id.edt_a);
        edtB=findViewById(R.id.edt_b);
        txtResult=findViewById(R.id.txt_result);
        btnComulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(Plus.sum(Integer.parseInt(edtA.getText().toString()),Integer.parseInt(edtB.getText().toString()))+"");
            }
        });

    }
}
