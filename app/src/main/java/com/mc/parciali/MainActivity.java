package com.mc.parciali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtSalrio;
    EditText txtMes;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSalrio = findViewById(R.id.txtSalario);
        txtMes = findViewById(R.id.txtMes);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() ==  R.id.btnCalcular ){

                //int mes = Integer.parseInt(txtMes.getText().toString());
                int dayString;

                switch (Integer.parseInt(txtMes.getText().toString()))
                {
                    case 1:  dayString = 31;
                        break;
                    case 2:  dayString = 28;
                        break;
                    case 3:  dayString = 31;
                        break;
                    case 4:  dayString = 30;
                        break;
                    case 5:  dayString = 31;
                        break;
                    case 6:  dayString = 30;
                        break;
                    case 7:  dayString = 31;
                        break;
                    case 8:  dayString = 31;
                        break;
                    case 9:  dayString = 30;
                        break;
                    case 10:  dayString = 31;
                        break;
                    case 11:  dayString = 30;
                        break;
                    case 12:  dayString = 31;
                        break;
                    default: dayString = 0;
                        break;
                }
                double salario = Double.parseDouble(txtSalrio.getText().toString());
                double prima = ((salario + 106454) * dayString)/360;
                double cesantias = ((salario + 106454) * dayString)/360;
                double vacaciones = (salario * dayString) / 720;
                double salud = (salario * 0.125);
                double pension = (salario * 0.16);
                double salarioReal = (salario - pension ) - prima;
                Toast.makeText(this, "Su prima es: " + prima + ",sus cesantías son: "+ cesantias + ",sus vacaciones son: "+ vacaciones +
                        " su salario real es: " + salarioReal , Toast.LENGTH_SHORT).show();

        }
    }
}