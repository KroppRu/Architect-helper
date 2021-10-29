package ru.kropp.pandus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etHeight;
    EditText etPercent;
    Button btnGetLength;
    TextView tvLenght;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = (EditText) findViewById(R.id.etHeight);
        etPercent = (EditText) findViewById(R.id.etPercent);
        btnGetLength = (Button) findViewById(R.id.bthGetLength);
        tvLenght = (TextView) findViewById(R.id.tvLenght);

        btnGetLength.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bthGetLength:
                float height = Float.parseFloat(etHeight.getText().toString());
                float percent = Float.parseFloat(etPercent.getText().toString());
                float lenght = height / percent * 100;
                tvLenght.setText(Float.toString(lenght));
                break;
        }
    }
}