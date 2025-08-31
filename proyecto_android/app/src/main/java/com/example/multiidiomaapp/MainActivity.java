package com.example.multiidiomaapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar los botones de idioma
        setupLanguageButtons();
    }

    private void setupLanguageButtons() {
        Button btnSpanish = findViewById(R.id.btnSpanish);
        Button btnEnglish = findViewById(R.id.btnEnglish);
        Button btnFrench = findViewById(R.id.btnFrench);
        Button btnGerman = findViewById(R.id.btnGerman);

        btnSpanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("es");
            }
        });

        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("en");
            }
        });

        btnFrench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("fr");
            }
        });

        btnGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("de");
            }
        });
    }

    private void setLocale(String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);

        Resources resources = getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);

        Context context = createConfigurationContext(configuration);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());

        // Mostrar mensaje de confirmación
        String languageName = getLanguageName(languageCode);
        Toast.makeText(this, "Idioma cambiado a: " + languageName, Toast.LENGTH_SHORT).show();

        // Reiniciar la actividad para aplicar el cambio de idioma
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private String getLanguageName(String languageCode) {
        switch (languageCode) {
            case "es":
                return "Español";
            case "en":
                return "English";
            case "fr":
                return "Français";
            case "de":
                return "Deutsch";
            default:
                return "Unknown";
        }
    }
}
