package net.unesc.controledegastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.criarConta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Intent(LoginActivity.this, CriarContaActivity.class);
            }
        });
    }
}