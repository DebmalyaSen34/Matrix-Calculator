package com.example.finalproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplcationOfMatrices extends AppCompatActivity {
    private EditText a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
    private EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16;
    private TextView w1, w2, w3, w4, w5, w6, w7, w8, w9, w10, w11, w12, w13, w14, w15, w16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplcation_of_matrices);
        Button Multiplied = findViewById(R.id.MultiplyButton);
        a1=findViewById(R.id.mina1);
        a2=findViewById(R.id.mina2);
        a3=findViewById(R.id.mina3);
        a4=findViewById(R.id.mina4);
        a5=findViewById(R.id.mina5);
        a6=findViewById(R.id.mina6);
        a7=findViewById(R.id.mina7);
        a8=findViewById(R.id.mina8);
        a9=findViewById(R.id.mina9);
        a10=findViewById(R.id.mina10);
        a11=findViewById(R.id.mina11);
        a12=findViewById(R.id.mina12);
        a13=findViewById(R.id.mina13);
        a14=findViewById(R.id.mina14);
        a15=findViewById(R.id.mina15);
        a16=findViewById(R.id.mina16);
        e1=findViewById(R.id.mrid1);
        e2=findViewById(R.id.mrid2);
        e3=findViewById(R.id.mrid3);
        e4=findViewById(R.id.mrid4);
        e5=findViewById(R.id.mrid5);
        e6=findViewById(R.id.mrid6);
        e7=findViewById(R.id.mrid7);
        e8=findViewById(R.id.mrid8);
        e9=findViewById(R.id.mrid9);
        e10=findViewById(R.id.mrid10);
        e11=findViewById(R.id.mrid11);
        e12=findViewById(R.id.mrid12);
        e13=findViewById(R.id.mrid13);
        e14=findViewById(R.id.mrid14);
        e15=findViewById(R.id.mrid15);
        e16=findViewById(R.id.mrid16);
        w1=findViewById(R.id.heer1);
        w2=findViewById(R.id.heer2);
        w3=findViewById(R.id.heer3);
        w4=findViewById(R.id.heer4);
        w5=findViewById(R.id.heer5);
        w6=findViewById(R.id.heer6);
        w7=findViewById(R.id.heer7);
        w8=findViewById(R.id.heer8);
        w9=findViewById(R.id.heer9);
        w10=findViewById(R.id.heer10);
        w11=findViewById(R.id.heer11);
        w12=findViewById(R.id.heer12);
        w13=findViewById(R.id.heer13);
        w14=findViewById(R.id.heer14);
        w15=findViewById(R.id.heer15);
        w16=findViewById(R.id.heer16);
        
        Multiplied.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1=a1.getText().toString();
                String s2=a2.getText().toString();
                String s3=a3.getText().toString();
                String s4=a4.getText().toString();
                String s5=a5.getText().toString();
                String s6=a6.getText().toString();
                String s7=a7.getText().toString();
                String s8=a8.getText().toString();
                String s9=a9.getText().toString();
                String s10=a10.getText().toString();
                String s11=a11.getText().toString();
                String s12=a12.getText().toString();
                String s13=a13.getText().toString();
                String s14=a14.getText().toString();
                String s15=a15.getText().toString();
                String s16=a16.getText().toString();

                String p1=e1.getText().toString();
                String p2=e2.getText().toString();
                String p3=e3.getText().toString();
                String p4=e4.getText().toString();
                String p5=e5.getText().toString();
                String p6=e6.getText().toString();
                String p7=e7.getText().toString();
                String p8=e8.getText().toString();
                String p9=e9.getText().toString();
                String p10=e10.getText().toString();
                String p11=e11.getText().toString();
                String p12=e12.getText().toString();
                String p13=e13.getText().toString();
                String p14=e14.getText().toString();
                String p15=e15.getText().toString();
                String p16=e16.getText().toString();

                double i1=Double.parseDouble(s1);
                double i2=Double.parseDouble(s2);
                double i3=Double.parseDouble(s3);
                double i4=Double.parseDouble(s4);
                double i5=Double.parseDouble(s5);
                double i6=Double.parseDouble(s6);
                double i7=Double.parseDouble(s7);
                double i8=Double.parseDouble(s8);
                double i9=Double.parseDouble(s9);
                double i10=Double.parseDouble(s10);
                double i11=Double.parseDouble(s11);
                double i12=Double.parseDouble(s12);
                double i13=Double.parseDouble(s13);
                double i14=Double.parseDouble(s14);
                double i15=Double.parseDouble(s15);
                double i16=Double.parseDouble(s16);

                double o1=Double.parseDouble(p1);
                double o2=Double.parseDouble(p2);
                double o3=Double.parseDouble(p3);
                double o4=Double.parseDouble(p4);
                double o5=Double.parseDouble(p5);
                double o6=Double.parseDouble(p6);
                double o7=Double.parseDouble(p7);
                double o8=Double.parseDouble(p8);
                double o9=Double.parseDouble(p9);
                double o10=Double.parseDouble(p10);
                double o11=Double.parseDouble(p11);
                double o12=Double.parseDouble(p12);
                double o13=Double.parseDouble(p13);
                double o14=Double.parseDouble(p14);
                double o15=Double.parseDouble(p15);
                double o16=Double.parseDouble(p16);

                double[][] m1 = new double[4][4];
                double[][] m2 = new double[4][4];
                m1[0][0]=i1;
                m1[0][1]=i2;
                m1[0][2]=i3;
                m1[0][3]=i4;
                m1[1][0]=i5;
                m1[1][1]=i6;
                m1[1][2]=i7;
                m1[1][3]=i8;
                m1[2][0]=i9;
                m1[2][1]=i10;
                m1[2][2]=i11;
                m1[2][3]=i12;
                m1[3][0]=i13;
                m1[3][1]=i14;
                m1[3][2]=i15;
                m1[3][3]=i16;

                m2[0][0]=o1;
                m2[0][1]=o2;
                m2[0][2]=o3;
                m2[0][3]=o4;
                m2[1][0]=o5;
                m2[1][1]=o6;
                m2[1][2]=o7;
                m2[1][3]=o8;
                m2[2][0]=o9;
                m2[2][1]=o10;
                m2[2][2]=o11;
                m2[2][3]=o12;
                m2[3][0]=o13;
                m2[3][1]=o14;
                m2[3][2]=o15;
                m2[3][3]=o16;

                double[][] resultantMatrix = new double[4][4];

                for(int i=0; i<4; i++){
                    for(int j=0; j<4; j++){
                        for(int k=0; k<4; k++){
                            resultantMatrix[i][j]+=m1[i][k]*m2[k][j];
                        }
                    }
                }

                String t1=Double.toString(resultantMatrix[0][0]);
                String t2=Double.toString(resultantMatrix[0][1]);
                String t3=Double.toString(resultantMatrix[0][2]);
                String t4=Double.toString(resultantMatrix[0][3]);
                String t5=Double.toString(resultantMatrix[1][0]);
                String t6=Double.toString(resultantMatrix[1][1]);
                String t7=Double.toString(resultantMatrix[1][2]);
                String t8=Double.toString(resultantMatrix[1][3]);
                String t9=Double.toString(resultantMatrix[2][0]);
                String t10=Double.toString(resultantMatrix[2][1]);
                String t11=Double.toString(resultantMatrix[2][2]);
                String t12=Double.toString(resultantMatrix[2][3]);
                String t13=Double.toString(resultantMatrix[3][0]);
                String t14=Double.toString(resultantMatrix[3][1]);
                String t15=Double.toString(resultantMatrix[3][2]);
                String t16=Double.toString(resultantMatrix[3][3]);

                w1.setText(t1);
                w2.setText(t2);
                w3.setText(t3);
                w4.setText(t4);
                w5.setText(t5);
                w6.setText(t6);
                w7.setText(t7);
                w8.setText(t8);
                w9.setText(t9);
                w10.setText(t10);
                w11.setText(t11);
                w12.setText(t12);
                w13.setText(t13);
                w14.setText(t14);
                w15.setText(t15);
                w16.setText(t16);
                
            }
        });

    }
}