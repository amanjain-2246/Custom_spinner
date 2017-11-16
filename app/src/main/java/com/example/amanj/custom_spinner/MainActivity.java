package com.example.amanj.custom_spinner;

import android.content.Intent;
import android.content.res.Resources;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    String longtext[], desc[], title[];
    int imgs[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        Resources res = getResources();
        title = res.getStringArray(R.array.title);
        longtext = res.getStringArray(R.array.desc_long);
        desc = res.getStringArray(R.array.desc_short);
        Images b = new Images();
        imgs = b.img;
        MyAdapter adapter = new MyAdapter(this, title, desc, imgs);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        TextView t1=(TextView)findViewById(R.id.srlt);
        if(position==0) {

        }
        else {
            Intent ob = new Intent(this, Second_Activity.class);
            ob.putExtra("title", t1.getText().toString());
            ob.putExtra("position", position);
            ob.putExtra("desc_l",longtext[position] );
            startActivity(ob);
        }
    }

    @Override    public void onNothingSelected(AdapterView<?> parent) {

    }
}

