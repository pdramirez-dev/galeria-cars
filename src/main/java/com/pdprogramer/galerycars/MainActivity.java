package com.pdprogramer.galerycars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private GridView gridView;
    private AdapterCar adapterCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        useToolbar();
        gridView = (GridView) findViewById(R.id.grid);
        adapterCar = new AdapterCar(this);
        gridView.setAdapter(adapterCar);
        gridView.setOnItemClickListener(this);


    }

    private void useToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Car car = (Car) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, DetalleCar.class);
        intent.putExtra(DetalleCar.EXTRA_PARAM_ID, car.getId());


       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation
                    (this, new Pair<View, String>(view.findViewById(R.id.image_car), DetalleCar.VIEW_NAME_HEADER_IMAGE));

            ActivityCompat.startActivity(this, intent, activityOptionsCompat.toBundle());
        } else*/
        startActivity(intent);
    }
}
