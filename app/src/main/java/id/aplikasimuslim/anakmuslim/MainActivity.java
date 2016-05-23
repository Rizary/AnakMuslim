package id.aplikasimuslim.anakmuslim;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wudhuButton();
        shalatButton();
    }

    public void wudhuButton(){
        final Context context = this;
        button = (ImageButton) findViewById(R.id.wudhu_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Wudhu.class);
                startActivity(intent);
            }
        });

    }

    public void shalatButton(){
        final Context context = this;
        button = (ImageButton) findViewById(R.id.shalat_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Shalat.class);
                startActivity(intent);
            }
        });

    }


}
