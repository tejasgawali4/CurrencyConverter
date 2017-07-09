package in.techdrop.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mbtnCheck;
    EditText mtxtCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtnCheck = (Button) findViewById(R.id.btnCheck);
        mtxtCurrency = (EditText) findViewById(R.id.txtCurrency);

        mbtnCheck.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                convert();
            }
        });
    }

    void convert()
    {
        Double ind = Double.parseDouble(mtxtCurrency.getText().toString());

        Double usd = ind/64;

        Toast.makeText(getApplicationContext(),"USD $:- " + String.format("%.2f",usd) ,Toast.LENGTH_SHORT).show();
    }
}
