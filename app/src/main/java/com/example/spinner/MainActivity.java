package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static com.github.johnpersano.supertoasts.library.Style.TYPE_BUTTON;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton boton_flotante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_flotante = findViewById(R.id.floatingActionButton3);
        boton_flotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuperActivityToast.create(MainActivity.this, new Style(), TYPE_BUTTON)
                        .setButtonText("UNDO")
                        .setButtonIconResource(R.drawable.ic_add_circle_black_24dp)
                       // .setOnButtonClickListener("good_tag_name", null, onButtonClickListener)
                        .setProgressBarColor(Color.WHITE)
                        .setText("Email deleted")
                        .setDuration(Style.DURATION_LONG)
                        .setFrame(Style.FRAME_LOLLIPOP)
                        .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_PURPLE))
                        .setAnimations(Style.ANIMATIONS_POP).show();
            }
        });
    }
}
