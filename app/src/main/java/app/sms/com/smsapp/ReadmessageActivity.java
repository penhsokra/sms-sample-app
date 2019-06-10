package app.sms.com.smsapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class ReadmessageActivity extends AppCompatActivity {
    TextView txtReadermessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readmessage);
        txtReadermessage = findViewById(R.id.txtReadmessage);

        setTitle(getIntent().getExtras().getString("sender"));
        txtReadermessage.setText(getIntent().getExtras().getString("message"));


    }
}
