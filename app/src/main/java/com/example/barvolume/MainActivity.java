package com.example.barvolume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtPanjang;
    private EditText txtTinggi;
    private EditText txtLebar;
    private Button btnHitung;
    private TextView txtHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPanjang = findViewById(R.id.txtPanjang);
        txtLebar = findViewById(R.id.txtLebar);
        txtTinggi = findViewById(R.id.txtTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btnHitung){
            Log.d("Capture", "Button Hitung di Clik");

            String inputPanjang = txtPanjang.getText().toString().trim();
            String inputLebar = txtLebar.getText().toString().trim();
            String inputTinggi = txtTinggi.getText().toString().trim();

            Double hasil = Double.valueOf(inputPanjang) * Double.valueOf(inputLebar) * Double.valueOf(inputTinggi);

            txtHasil.setText(String.valueOf(hasil));

        }
    }
}