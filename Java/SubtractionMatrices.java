package com.example.finalproduct;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubtractionMatrices extends AppCompatActivity {
    private EditText q1, q2, q3, q4, q5, q6, q7, q8,q9;
    private TextView l1, l2, l3, l4, l5, l6, l7, l8, l9;
    private EditText achu1, achu2, achu3, achu4;
    private TextView vamsi1, vamsi2, vamsi3, vamsi4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_matrices);
        Button b1=findViewById(R.id.InverseButton);
        Button b2=findViewById(R.id.order2);
        q1=findViewById(R.id.m1);
        q2=findViewById(R.id.m2);
        q3=findViewById(R.id.m3);
        q4=findViewById(R.id.m4);
        q5=findViewById(R.id.m5);
        q6=findViewById(R.id.m6);
        q7=findViewById(R.id.m7);
        q8=findViewById(R.id.m8);
        q9=findViewById(R.id.m9);

        l1=findViewById(R.id.q1);
        l2=findViewById(R.id.q2);
        l3=findViewById(R.id.q3);
        l4=findViewById(R.id.q4);
        l5=findViewById(R.id.q5);
        l6=findViewById(R.id.q6);
        l7=findViewById(R.id.q7);
        l8=findViewById(R.id.q8);
        l9=findViewById(R.id.q9);


        achu1=findViewById(R.id.deb1);
        achu2=findViewById(R.id.deb2);
        achu3=findViewById(R.id.deb3);
        achu4=findViewById(R.id.deb4);

        vamsi1=findViewById(R.id.abhi1);
        vamsi2=findViewById(R.id.abhi2);
        vamsi3=findViewById(R.id.abhi3);
        vamsi4=findViewById(R.id.abhi4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=q1.getText().toString();
                String s2=q2.getText().toString();
                String s3=q3.getText().toString();
                String s4=q4.getText().toString();
                String s5=q5.getText().toString();
                String s6=q6.getText().toString();
                String s7=q7.getText().toString();
                String s8=q8.getText().toString();
                String s9=q9.getText().toString();

                double x1=Double.parseDouble(s1);
                double x2=Double.parseDouble(s2);
                double x3=Double.parseDouble(s3);
                double x4=Double.parseDouble(s4);
                double x5=Double.parseDouble(s5);
                double x6=Double.parseDouble(s6);
                double x7=Double.parseDouble(s7);
                double x8=Double.parseDouble(s8);
                double x9=Double.parseDouble(s9);

                double[][] InverseMatrix = new double[3][3];

                InverseMatrix[0][0]=x1;
                InverseMatrix[0][1]=x2;
                InverseMatrix[0][2]=x3;
                InverseMatrix[1][0]=x4;
                InverseMatrix[1][1]=x5;
                InverseMatrix[1][2]=x6;
                InverseMatrix[2][0]=x7;
                InverseMatrix[2][1]=x8;
                InverseMatrix[2][2]=x9;

                double[] temp = new double[36];

                int var1=0;

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        for(int k=0; k<3; k++){
                            if(k!=i){
                                for(int l=0; l<3; l++){
                                    if(l!=j){
                                        temp[var1]=InverseMatrix[k][l];
                                        var1++;
                                    }
                                }
                            }
                        }
                    }
                }

                double[][][] matrixBubble = new double[9][2][2];

                int var2=0;

                for(int i=0; i<9; i++){
                    for(int j=0; j<2; j++){
                        for(int k=0; k<2; k++){
                            matrixBubble[i][j][k]=temp[var2];
                            var2++;
                        }
                    }
                }

                double[][] cofactor = new double[3][3];

                int var3=0;

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        if(var3%2==0){
                            cofactor[i][j]=((matrixBubble[var3][0][0]*matrixBubble[var3][1][1])-(matrixBubble[var3][0][1]*matrixBubble[var3][1][0]));
                        }else{
                            cofactor[i][j]=(-1)*((matrixBubble[var3][0][0]*matrixBubble[var3][1][1])-(matrixBubble[var3][0][1]*matrixBubble[var3][1][0]));
                        }
                        var3++;
                    }
                }

                double determinant;

                determinant=((InverseMatrix[0][0]*((InverseMatrix[1][1]*InverseMatrix[2][2])-(InverseMatrix[2][1]*InverseMatrix[1][2])))-(InverseMatrix[0][1]*((InverseMatrix[1][0]*InverseMatrix[2][2])-(InverseMatrix[2][0]*InverseMatrix[1][2])))+(InverseMatrix[0][2]*((InverseMatrix[1][0]*InverseMatrix[2][1])-(InverseMatrix[2][0]*InverseMatrix[1][1]))));

                double[][] transCofactor = new double[3][3];

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        transCofactor[i][j]=cofactor[j][i];
                    }
                }

                double[][] actualMatrix = new double[3][3];

                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        actualMatrix[i][j]=(1/determinant)*transCofactor[i][j];
                    }
                }

                String c1=Double.toString(actualMatrix[0][0]);
                String c2=Double.toString(actualMatrix[0][1]);
                String c3=Double.toString(actualMatrix[0][2]);
                String c4=Double.toString(actualMatrix[1][0]);
                String c5=Double.toString(actualMatrix[1][1]);
                String c6=Double.toString(actualMatrix[1][2]);
                String c7=Double.toString(actualMatrix[2][0]);
                String c8=Double.toString(actualMatrix[2][1]);
                String c9=Double.toString(actualMatrix[2][2]);

                l1.setText(c1);
                l2.setText(c2);
                l3.setText(c3);
                l4.setText(c4);
                l5.setText(c5);
                l6.setText(c6);
                l7.setText(c7);
                l8.setText(c8);
                l9.setText(c9);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=achu1.getText().toString();
                String s2=achu2.getText().toString();
                String s3=achu3.getText().toString();
                String s4=achu4.getText().toString();

                double x1=Double.parseDouble(s1);
                double x2=Double.parseDouble(s2);
                double x3=Double.parseDouble(s3);
                double x4=Double.parseDouble(s4);

                double[][] dinosaur = new double[2][2];

                dinosaur[0][0]=x1;
                dinosaur[0][1]=x2;
                dinosaur[1][0]=x3;
                dinosaur[1][1]=x4;

                double[][] temp = new double[2][2];

                temp[0][0]=dinosaur[1][1];
                temp[0][1]=(-1)*dinosaur[0][1];
                temp[1][0]=(-1)*dinosaur[1][0];
                temp[1][1]=dinosaur[0][0];

                double det = (dinosaur[0][0]*dinosaur[1][1])-(dinosaur[0][1]*dinosaur[1][0]);

                double[][] result = new double[2][2];

                for(int i=0; i<2; i++){
                    for(int j=0; j<2; j++){
                        result[i][j]=(1/det)*temp[i][j];
                    }
                }

                String a1=Double.toString(result[0][0]);
                String a2=Double.toString(result[0][1]);
                String a3=Double.toString(result[1][0]);
                String a4=Double.toString(result[1][1]);

                vamsi1.setText(a1);
                vamsi2.setText(a2);
                vamsi3.setText(a3);
                vamsi4.setText(a4);
            }
        });
    }
}