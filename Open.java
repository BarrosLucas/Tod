package com.example.lucas.todrobot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Open extends Activity {
    private Spinner SpnListarArquivos;
    private ArrayList<String> Arquivos = new ArrayList<String>();
    private String txtLer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        SpnListarArquivos = (Spinner) findViewById(R.id.spListarArquivos);
        Listar();


    }
    private String ObterDiretorio()
    {
        File root = android.os.Environment.getExternalStorageDirectory();
        return root.toString();
    }

    public void Listar()
    {
        File diretorio = new File(ObterDiretorio());
        File[] arquivos = diretorio.listFiles();
        if(arquivos != null)
        {
            int length = arquivos.length;
            for(int i = 0; i < length; ++i)
            {
                File f = arquivos[i];
                if (f.isFile())
                {Arquivos.add(f.getName());
                }
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                    (this,android.R.layout.simple_dropdown_item_1line, Arquivos);
            SpnListarArquivos.setAdapter(arrayAdapter);
        }
    }
    public void click_Carregar(View v)
    {
        String lstrNomeArq;
        File arq;
        String lstrlinha;
        try
        {
            lstrNomeArq = SpnListarArquivos.getSelectedItem().toString();
            txtLer = "";
            arq = new File(Environment.getExternalStorageDirectory(), lstrNomeArq);
            BufferedReader br = new BufferedReader(new FileReader(arq));
            while ((lstrlinha = br.readLine()) != null)
            {
                if (!txtLer.equals(""))
                {
                    txtLer += "\n";
                }
                txtLer += lstrlinha;
            }

            Toast.makeText(getApplicationContext(), "Texto Carregado com sucesso!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ModoLivre.class);
            intent.putExtra("codigo",txtLer);
            intent.putExtra("status","0");
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "Erro : " + e.getMessage(), Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
