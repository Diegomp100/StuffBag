package com.example.diego.stuffbag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Obesidade3Activity extends AppCompatActivity {

    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_obesidade3);

        Intent intent = getIntent();
        Double resultado = intent.getDoubleExtra("resultado",0);

        Resultado = (TextView) findViewById(R.id.textView_resultado);
        Resultado.setText(resultado.toString());

        //Volta Menu
        Button MENU = (Button) findViewById(R.id.button_menu);
        MENU.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Obesidade3Activity.this,
                        MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
