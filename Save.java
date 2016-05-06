package com.example.lucas.todrobot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class Save extends Activity {
    TextView txtNomeArq;
    String code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Intent intent = getIntent();
        code = intent.getStringExtra("codigo");

        txtNomeArq = (TextView) findViewById(R.id.nomeArq);
    }
    public void salvar(View v) {
        String lstrNomeArq;
        File arq;
        byte[] dados;
        try {
            System.out.println("Tentano");
            txtNomeArq = (TextView) findViewById(R.id.nomeArq);
            lstrNomeArq = txtNomeArq.getText().toString();

            arq = new File(Environment.getExternalStorageDirectory(), lstrNomeArq);
            FileOutputStream fos;

            dados = code.getBytes();

            fos = new FileOutputStream(arq);
            fos.write(dados);
            fos.flush();
            fos.close();
            finish();
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
