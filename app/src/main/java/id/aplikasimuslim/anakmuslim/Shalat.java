package id.aplikasimuslim.anakmuslim;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class Shalat extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlipper;
    ViewFlipper contentFlipper;
    ImageButton next;
    ImageButton previous;
    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat);

        myToolbar = (Toolbar) findViewById(R.id.shalat_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("");
        myToolbar.setNavigationIcon(R.drawable.shalat_text);


        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        contentFlipper = (ViewFlipper)findViewById(R.id.contentFlipper);
        next = (ImageButton) findViewById(R.id.next);
        previous = (ImageButton) findViewById(R.id.previous);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if (v == next){
            viewFlipper.showNext();
            contentFlipper.showNext();

        }
        else if (v==previous){
            viewFlipper.showPrevious();
            contentFlipper.showPrevious();
        }
    }
}
