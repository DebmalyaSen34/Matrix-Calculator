package com.example.finalproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DeterminantOfaMatrix extends AppCompatActivity {
    private EditText v1, v2, v3, v4, v5, v6, v7, v8, v9;
    private EditText h1, h2, h3, h4;
    private EditText superman;
    private TextView det_1, det_2, det_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinant_ofa_matrix);
        Button b3=findViewById(R.id.Det3Button);
        Button b2=findViewById(R.id.Det2Button);
        Button b1=findViewById(R.id.det1Button);

        v1=findViewById(R.id.a1);
        v2=findViewById(R.id.a2);
        v3=findViewById(R.id.a3);
        v4=findViewById(R.id.a4);
        v5=findViewById(R.id.a5);
        v6=findViewById(R.id.a6);
        v7=findViewById(R.id.a7);
        v8=findViewById(R.id.a8);
        v9=findViewById(R.id.a9);

        h1=findViewById(R.id.bat1);
        h2=findViewById(R.id.bat2);
        h3=findViewById(R.id.bat3);
        h4=findViewById(R.id.bat4);

        superman=findViewById(R.id.star);

        det_1=findViewById(R.id.ansDet1x1);
        det_2=findViewById(R.id.ansDet2x2);
        det_3=findViewById(R.id.ansDet3x3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DeterminantOfaMatrix.this, "You can't find det of this!\nSHAME ON YOU!", Toast.LENGTH_SHORT).show();
                String s=superman.getText().toString();
                det_1.setText(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st1=h1.getText().toString();
                String st2=h2.getText().toString();
                String st3=h3.getText().toString();
                String st4=h4.getText().toString();

                double x1=Double.parseDouble(st1);
                double x2=Double.parseDouble(st2);
                double x3=Double.parseDouble(st3);
                double x4=Double.parseDouble(st4);

                double resultDet=(x1*x4)-(x2*x3);

                String answerDet=Double.toString(resultDet);

                det_2.setText(answerDet);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k1=v1.getText().toString();
                String k2=v2.getText().toString();
                String k3=v3.getText().toString();
                String k4=v4.getText().toString();
                String k5=v5.getText().toString();
                String k6=v6.getText().toString();
                String k7=v7.getText().toString();
                String k8=v8.getText().toString();
                String k9=v9.getText().toString();

                double n1=Double.parseDouble(k1);
                double n2=Double.parseDouble(k2);
                double n3=Double.parseDouble(k3);
                double n4=Double.parseDouble(k4);
                double n5=Double.parseDouble(k5);
                double n6=Double.parseDouble(k6);
                double n7=Double.parseDouble(k7);
                double n8=Double.parseDouble(k8);
                double n9=Double.parseDouble(k9);

                double twobytwoDet = ((n1*((n5*n9)-(n8*n6)))-(n2*((n4*n9)-(n7*n6)))+(n3*((n4*n8)-(n7*n5))));

                String realans = Double.toString(twobytwoDet);

                det_3.setText(realans);
            }
        });
    }
}