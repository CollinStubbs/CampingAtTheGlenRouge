package com.example.campingattheglenrouge;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
 
public class maps extends Activity implements OnItemSelectedListener{
    static final LatLng base = new LatLng(43.804871, -79.137248);
    GoogleMap googleMap;
    Marker BD;
    Marker WD;
    Marker MB;
    Marker MC;
    Marker NF;
    Marker M;
    Marker FC;
    Marker RB;
    Marker LP;
    Marker BP;
    Marker CTS;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_activity);
        
        
        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.the_map)).getMap();
        
        Spinner spinner = (Spinner) findViewById(R.id.mapList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.mapOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        Marker TP = googleMap.addMarker(new MarkerOptions().
        position(base).title("Glenrouge Campground"));
        try{
        MapsInitializer.initialize(this);
        LatLng blackDog = new LatLng(43.797896, -79.139111);
		BD = googleMap.addMarker(new MarkerOptions().
	            position(blackDog).title("The Black Dog Pub"));
		
		LatLng wimpys = new LatLng(43.797234, -79.149837);
		WD = googleMap.addMarker(new MarkerOptions().
				position(wimpys).title("Wimpys Diner"));
		
		LatLng muchoBurrito = new LatLng(43.797538,-79.149169);
		MB = googleMap.addMarker(new MarkerOptions().
				position(muchoBurrito).title("Mucho Burrito "));
		
		LatLng mcd = new LatLng(43.800225, -79.143521);
		MC = googleMap.addMarker(new MarkerOptions().
				position(mcd).title("McDonalds"));
		
		//grocery
		LatLng noFrills = new LatLng(43.798149, -79.141233);
	    NF = googleMap.addMarker(new MarkerOptions().
	            position(noFrills).title("No Frills"));
	    
	    LatLng metro = new LatLng(43.788651, -79.139576);
	    M = googleMap.addMarker(new MarkerOptions().
	            position(metro).title("Metro"));
	    
	    LatLng freshCo = new LatLng(43.818446, -79.118172);
	    FC = googleMap.addMarker(new MarkerOptions().
	            position(freshCo).title("FreshCo"));
	    
	    LatLng rougeB = new LatLng(43.793557, -79.117920);
	    RB = googleMap.addMarker(new MarkerOptions().
	            position(rougeB).title("Rouge Beach"));
	    
	    LatLng liverB = new LatLng(43.811955, -79.076850);
	    LP = googleMap.addMarker(new MarkerOptions().
	            position(liverB).title("Liverpool Beach"));
	    
	    LatLng beachB = new LatLng(43.812543, -79.090883);
	    BP = googleMap.addMarker(new MarkerOptions().
	            position(beachB).title("Beachpoint Beach"));
	    
	    LatLng canT = new LatLng(43.812543, -79.090883);
	    CTS = googleMap.addMarker(new MarkerOptions().
	            position(canT).title("Canadian Tire"));
        }catch(Exception e){
        	
        }
    }

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		//restaurants
		
		// TODO Auto-generated method stub
		switch((int) arg2){
		case 0:
		   NF.setVisible(true);
		   M.setVisible(true);
		   FC.setVisible(true);
		   BD.setVisible(false);
		   WD.setVisible(false);
		   MB.setVisible(false);
		   MC.setVisible(false);
			break;
		case 1:
			MC.setVisible(true);
			MB.setVisible(true);
			WD.setVisible(true);
			BD.setVisible(true);
			NF.setVisible(false);
			M.setVisible(false);
			FC.setVisible(false);
			break;
		case 2:
			RB.setVisible(true);
			LP.setVisible(true);
			BP.setVisible(true);
			NF.setVisible(false);
			NF.setVisible(false);
			M.setVisible(false);
			FC.setVisible(false);
			BD.setVisible(false);
			WD.setVisible(false);
			MB.setVisible(false);
			MC.setVisible(false);
			break;
		case 3:
			break;
		}
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}


}