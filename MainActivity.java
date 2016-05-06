package com.example.lucas.todrobot;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;
import android.widget.TextView;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    /* Definição dos objetos que serão usados na Activity Principal
        statusMessage mostrará mensagens de status sobre a conexão
        counterMessage mostrará o valor do contador como recebido do Arduino
        connect é a thread de gerenciamento da conexão Bluetooth
     */
    //WebView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*texto = (WebView) findViewById(R.id.webView);
        String text = "<html><body>"
                + "<p align=\"justify\">"
                + getString(R.string.caracteristicas)
                + "</p> "
                + "</body></html>";
        texto.loadData(text, "text/html", "utf-8");*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.help){
            Intent sob = new Intent(this, About.class);
            startActivity(sob);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void modoLivre(View view){
        Intent livre = new Intent(this, ModoLivre.class);
        livre.putExtra("codigo","");
        livre.putExtra("status","1");
        startActivity(livre);
    }
}
