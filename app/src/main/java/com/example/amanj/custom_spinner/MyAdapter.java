package com.example.amanj.custom_spinner;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.System.in;

public class MyAdapter extends ArrayAdapter {
    String title[],des[];
    int img[];
    Context context;
    public MyAdapter(Context cont,String titl[],String desc[],int im[])
    {
        super(cont,R.layout.row,R.id.srlt,titl);
        context=cont;
        title=titl;
        img=im;
        des=desc;

    }

    @Override
    public View getDropDownView(int positon, View convertView, ViewGroup parent)
    {
        return getMyView(positon,convertView,parent);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        return getMyView(position, convertView, parent);
    }
    public View getMyView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater=(LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View obj=inflater.inflate(R.layout.row,parent,false);
        ImageView iv=(ImageView) obj.findViewById(R.id.srspinner);
        TextView t1=(TextView) obj.findViewById(R.id.srlt);
        TextView t2=(TextView) obj.findViewById(R.id.srmt);
        iv.setImageResource(img[position]);
        t1.setText(title[position]);
        t2.setText(des[position]);
        return  obj;
    }

}
