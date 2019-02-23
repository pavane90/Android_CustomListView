package com.example.pavane.tutorial5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends ArrayAdapter<String> {

    ImageAdapter(Context context, String[] items){
        super(context, R.layout.image_layout, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View view = imageInflater.inflate(R.layout.image_layout, parent, false);
        String item = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        textView.setText(item);
        if(item.equals("오렌지 쥬스")){imageView.setImageResource(R.mipmap.orange_juice);}
        else if(item.equals("파인애플 쥬스")){imageView.setImageResource(R.mipmap.pineapple_juice);}
        else if(item.equals("딸기 쥬스")){imageView.setImageResource(R.mipmap.strawberry_juice);}
        else if(item.equals("포도 쥬스")){imageView.setImageResource(R.mipmap.grape_juice);}
        return view;
    }
}
