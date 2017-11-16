package com.example.amanj.custom_spinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amanj on 3/4/2017.
 */

public class Second_Activity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Images ob=new Images();
        int img[]=ob.img;
        ImageView imageView=(ImageView) findViewById(R.id.srlspinner);
        TextView t1=(TextView) findViewById(R.id.srllt);
        TextView t2=(TextView) findViewById(R.id.srlmt);
        Intent iob=getIntent();
        t1.setText(iob.getStringExtra("title"));
        t2.setText(iob.getStringExtra("desc_l"));
        int position=iob.getIntExtra("position",0);
        imageView.setImageResource(img[position]);
    }
    public void back(View view)
    {
        startActivity(new Intent(this, MainActivity.class));
    }
}
