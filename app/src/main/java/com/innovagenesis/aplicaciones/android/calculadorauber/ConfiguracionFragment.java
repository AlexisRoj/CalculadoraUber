package com.innovagenesis.aplicaciones.android.calculadorauber;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

/**
 * Administra las configuraciones del las preferencias
 * Created by alexi on 23/04/2017.
 */

public class ConfiguracionFragment extends PreferenceFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.configuracion);
    }


}


