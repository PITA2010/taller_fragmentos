package org.vpitac.fragmentsapptaller;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        Principal fragmentoprincipal=new Principal();
        mitransaccion.add(R.id.contenedor,fragmentoprincipal);
        mitransaccion.commit();
    }

    public void aggact (View view){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        AgregarActualizar fragmentoagregar=new AgregarActualizar();
        mitransaccion.replace(R.id.contenedor,fragmentoagregar);
        mitransaccion.commit();
    }


    public void bobus (View view){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        BuscarBorrar fragmentobuscar=new BuscarBorrar();
        mitransaccion.replace(R.id.contenedor,fragmentobuscar);
        mitransaccion.commit();

    }

    public void aceptar (View view){
        FragmentManager mimanejador=getSupportFragmentManager();
        FragmentTransaction mitransaccion=mimanejador.beginTransaction();
        Principal fragmentoprincipal=new Principal();
        mitransaccion.replace(R.id.contenedor,fragmentoprincipal);
        mitransaccion.commit();

    }

    public void salir (View view){
        finish();

    }


}
