package com.pdprogramer.galerycars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterCar extends BaseAdapter {
    private Context context;

    public AdapterCar(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Car.CARS.length;
    }

    @Override
    public Car getItem(int position) {
        return Car.CARS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.grid_item,parent,false);


        }
        ImageView imageCar=(ImageView)view.findViewById(R.id.image_car);
        TextView carName=(TextView)view.findViewById(R.id.car_name);

        final Car item =getItem(position);
        Glide.with(imageCar.getContext())
                .load(item.getIdDrawable())
                .into(imageCar);

        carName.setText(item.getName());


        return view;
    }
}
