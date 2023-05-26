package com.example.qrcodegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    EditText editText;
    Button btn;
    String data = "Your data to encode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imgView);
        editText  = findViewById(R.id.editText);
        btn =findViewById(R.id.btn1);
//        QRCodeGenerator.generateQRCode(data, imageView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = editText.getText().toString();
                QRCodeGenerator.generateQRCode(data, imageView);
            }
        });
    }
}