package com.example.animacionesautomaticas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvInfo;
    private ImageView ivCheck;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = (TextView) findViewById(R.id.textViewInformacion);

        ivCheck = (ImageView) findViewById(R.id.imageView);
        ivCheck.setBackgroundResource(R.drawable.animacion_check);

        animationDrawable = (AnimationDrawable) ivCheck.getBackground();

        ivCheck.setOnClickListener(this);
    }

    public void cambiarVisibilidad(View view) {

        if(tvInfo.getVisibility() == View.VISIBLE){
            tvInfo.setVisibility(View.GONE);
        }else {
            tvInfo.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        animationDrawable.start();
    }
}
