package co.edu.unipiloto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class BuscarRazaActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        TextView brands = findViewById(R.id.razas);
        Spinner color = findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        Razas beer = new Razas();
        ArrayList<String> beers = beer.getBrands(beerType);
        StringBuilder recomendaciones= new StringBuilder();

        for(String c : beers){
            recomendaciones.append(c).append("\n");
        }
        brands.setText(recomendaciones);
    }
}
