package co.edu.unimagdalena.apmoviles.tallerunimag1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Scanner;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button suma, resta, mult, div, mcm, mcd;
    int m, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        suma = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);
        mult = findViewById(R.id.btnmult);
        div = findViewById(R.id.btndiv);
        mcm = findViewById(R.id.btnmcm);
        mcd = findViewById(R.id.btnmcd);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        mcm.setOnClickListener(this);
        mcd.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        switch(v.getId()){
            case R.id.btnsumar:
             Toast.makeText(this,"Suma = " + (num1 + num2), Toast.LENGTH_LONG).show();
            break;
            case R.id.btnrestar:
                Toast.makeText(this,"Resta = " + (num1 - num2), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnmult:
                Toast.makeText(this,"mul = " + (num1 * num2), Toast.LENGTH_LONG).show();
                break;
            case R.id.btndiv:
                Toast.makeText(this,"div = " + (num1 / num2), Toast.LENGTH_LONG).show();
                break;
            case R.id.btnmcm:
                m=1;
                i=2;
                while(i <= num1 || i <= num2)
                {
                    if(num1%i==0 || num2%i==0)
                    {
                        m=m*i;
                        if(num1%i==0) num1=num1/i;
                        if(num2%i==0) num2=num2/i;
                    }
                    else
                        i=i+1;

                }
                System.out.println("El MCM es =" +m);
                break;
            case R.id.btnmcd:

                while(num1 != num2)
                    if(num1>num2)
                        num1= num1-num2;
                    else
                        num2= num2 -num1;

                System.out.println(“El MCD es =” +num1);





        }
    }
}
