package app.sms.com.smsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import app.sms.com.smsapp.Smsadapter.SmsAdapter;
import app.sms.com.smsapp.modal.SMS;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    SmsAdapter smsAdapter;
    List<SMS> smss = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500700","Hi I exactly remember about customizing"));
        smss.add(new SMS("012500800","Hi bro"));
        smss.add(new SMS("012500900","Hi bro"));
        smss.add(new SMS("012500100","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500700","Hi bro"));
        smss.add(new SMS("012500600","Hi bro"));
        smss.add(new SMS("012500400","Hi bro"));
        smss.add(new SMS("012500200","Hi bro"));

        listView = findViewById(R.id.listSMS);
        smsAdapter = new SmsAdapter(smss);
        listView.setAdapter(smsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sender =smss.get(position).getSender();
                String message =smss.get(position).getMessag();
                Intent intent = new Intent(MainActivity.this,ReadmessageActivity.class);
                intent.putExtra("sender",sender);
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });


    }


}
