package c.loginscreenwithdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle username =getIntent().getExtras();
        string= username.getString("Username");

        textView=(TextView)findViewById(R.id.usrnm);
        textView.setText("Username:- "+ string);

    }
}
