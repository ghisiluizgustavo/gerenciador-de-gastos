package net.unesc.controledegastos.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.unesc.controledegastos.R;
import net.unesc.controledegastos.database.dao.UsuarioDAO;
import net.unesc.controledegastos.database.model.Usuario;

public class CriarContaActivity extends AppCompatActivity {

    private Button btnCadastrar;
    private EditText nome, email, senha;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
        btnCadastrar = findViewById(R.id.cadastrar);
        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UsuarioDAO usuarioDAO = new UsuarioDAO(CriarContaActivity.this);
                usuario = new Usuario(nome.getText().toString(), email.getText().toString(), senha.getText().toString());
                long insert = usuarioDAO.insert(usuario);
                if (insert == -1){
                    Toast.makeText(CriarContaActivity.this, "Ocorreu um erro", Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(CriarContaActivity.this, "Usuario salvo", Toast.LENGTH_LONG).show();
            }
        });
    }
}