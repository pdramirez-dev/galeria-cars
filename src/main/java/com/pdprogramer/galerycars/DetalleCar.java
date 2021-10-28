package com.pdprogramer.galerycars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class DetalleCar extends AppCompatActivity {

    public static final String EXTRA_PARAM_ID = "com.pdprogramer.galerycars.extra.ID";
    public static final String VIEW_NAME_HEADER_IMAGE = "name_transition_image";
    private Car itemDetallado;
    private ImageView imagenExtendida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_det);

        usarToolbar();

        // Obtener el coche con el identificador establecido en la actividad principal
        itemDetallado = Car.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID,0));

        imagenExtendida = (ImageView) findViewById(R.id.imagen_extendida);

        cargarImagenExtendida();
    }

    private void cargarImagenExtendida() {
       Glide.with(imagenExtendida.getContext())
                .load(itemDetallado.getIdDrawable())
                .into(imagenExtendida);
    }

    private void usarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
