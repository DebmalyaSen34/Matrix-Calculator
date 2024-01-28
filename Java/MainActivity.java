package com.example.finalproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void opening(View view){
        Toast.makeText(this, "Replace empty cells with 0!", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, AddingMatrices.class);
        startActivity(intent);
    }
    public void inverse(View view){
        Toast.makeText(this, "Use only Non-Singular matrices", Toast.LENGTH_SHORT).show();
        Intent inverse=new Intent(this, SubtractionMatrices.class);
        startActivity(inverse);
    }
    public  void det(View view){
        Toast.makeText(this, "Only square matrices can have determinants!", Toast.LENGTH_SHORT).show();
        Intent determinant=new Intent(this, DeterminantOfaMatrix.class);
        startActivity(determinant);
    }
    public void multiplication(View view){
        Toast.makeText(this, "Remember to make sure that matrices can be multiplied!", Toast.LENGTH_SHORT).show();
        Intent multiply=new Intent(this, MultiplcationOfMatrices.class);
        startActivity(multiply);
    }
}