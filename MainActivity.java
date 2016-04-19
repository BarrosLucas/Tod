package com.example.lucas.todrobot;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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

public class MainActivity extends Activity {

    /* Definição dos objetos que serão usados na Activity Principal
        statusMessage mostrará mensagens de status sobre a conexão
        counterMessage mostrará o valor do contador como recebido do Arduino
        connect é a thread de gerenciamento da conexão Bluetooth
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void modoLivre(View view){
        Intent livre = new Intent(this, ModoLivre.class);
        startActivity(livre);
    }
}
