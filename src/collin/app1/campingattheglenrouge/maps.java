package collin.app1.campingattheglenrouge;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import collin.app1.campingattheglenrouge.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
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
    private static final String TAG = "MyActivity";
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
    Marker HD;
    //trca
    Marker petti;
    Marker alb;
    Marker boyd;
    Marker bruce;
    Marker glen;
    Marker heart;
    Marker blackcreek;
    Marker kourtright;
    Marker bathurst;
    Marker indianline;
    Marker claire;
    Marker tommy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_activity);
        
        getShaKey();
        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.the_map)).getMap();
        
        Spinner spinner = (Spinner) findViewById(R.id.mapList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.mapOptions, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        Marker TP = googleMap.addMarker(new MarkerOptions().
        position(base).title("Glen Rouge Campground").icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
        try{
        MapsInitializer.initialize(this);
        LatLng blackDog = new LatLng(43.797896, -79.139111);
		BD = googleMap.addMarker(new MarkerOptions().
	            position(blackDog).title("The Black Dog Pub").snippet("http://blackdogpub.tv/"));
		
		LatLng wimpys = new LatLng(43.797234, -79.149837);
		WD = googleMap.addMarker(new MarkerOptions().
				position(wimpys).title("Wimpys Diner").snippet("http://wimpysdiner.ca/"));
		
		LatLng muchoBurrito = new LatLng(43.797538,-79.149169);
		MB = googleMap.addMarker(new MarkerOptions().
				position(muchoBurrito).title("Mucho Burrito ").snippet("http://muchoburrito.ca/"));
		
		LatLng mcd = new LatLng(43.800225, -79.143521);
		MC = googleMap.addMarker(new MarkerOptions().
				position(mcd).title("McDonalds").snippet("http://www.mcdonalds.ca/ca/en.html"));
		
		//grocery
		LatLng noFrills = new LatLng(43.798149, -79.141233);
	    NF = googleMap.addMarker(new MarkerOptions().
	            position(noFrills).title("No Frills").snippet("http://www.nofrills.ca/LCLOnline/store_selector_map.jsp?_requestid=275626"));
	    NF.showInfoWindow();
	    LatLng metro = new LatLng(43.788651, -79.139576);
	    M = googleMap.addMarker(new MarkerOptions().
	            position(metro).title("Metro").snippet("http://www.metro.ca/home.en.html"));
	    M.showInfoWindow();
	    LatLng freshCo = new LatLng(43.818446, -79.118172);
	    FC = googleMap.addMarker(new MarkerOptions().
	            position(freshCo).title("FreshCo").snippet("http://www.freshco.com/Home.aspx"));
	    FC.showInfoWindow();
	    LatLng rougeB = new LatLng(43.793557, -79.117920);
	    RB = googleMap.addMarker(new MarkerOptions().
	            position(rougeB).title("Rouge Beach").snippet("http://www.rougepark.com/explore/interest/rouge_beach.php"));
	    
	    LatLng liverB = new LatLng(43.811955, -79.076850);
	    LP = googleMap.addMarker(new MarkerOptions().
	            position(liverB).title("Liverpool Beach").snippet("http://www.pickering.ca/en/discovering/beachfrontparkmillenniumsquare.asp"));
	    
	    LatLng beachB = new LatLng(43.812543, -79.090883);
	    BP = googleMap.addMarker(new MarkerOptions().
	            position(beachB).title("Beachpoint Beach").snippet("http://www.pickering.ca/en/discovering/rotaryfrenchmansbaywestpark.asp"));
	    
	    LatLng canT = new LatLng(43.797228, -79.154135);
	    CTS = googleMap.addMarker(new MarkerOptions().
	            position(canT).title("Canadian Tire").snippet("http://www.canadiantire.ca/en.html"));
	    
	    LatLng homeD = new LatLng(43.828652, -79.095277);
	    HD = googleMap.addMarker(new MarkerOptions().
	            position(homeD).title("Home Depot").snippet("http://www.homedepot.ca"));
	    
	    //TRCA PARKS
	    
	    LatLng pettiCoat = new LatLng(43.800112, -79.111113);
	    petti = googleMap.addMarker(new MarkerOptions().
	            position(pettiCoat)
	            .title("Petticoat Creek")
	            .snippet("http://www.trca.on.ca/enjoy/locations/petticoat-creek-conservation-area.dot#sthash.oe0iqEiO.dpbs")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng albionHills = new LatLng(43.930595, -79.827057);
	    alb = googleMap.addMarker(new MarkerOptions().
	            position(albionHills)
	            .title("Albion Hills Conservation Area")
	            .snippet("http://www.trca.on.ca/enjoy/locations/albion-hills.dot#sthash.k6WWb4a6.dpbs")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng boydConservation = new LatLng(43.809569, -79.588049);
	    boyd = googleMap.addMarker(new MarkerOptions().
	            position(boydConservation)
	            .title("Boyd Conservation Area")
	            .snippet("http://www.trca.on.ca/enjoy/locations/boyd-conservation-area.dot#sthash.bCcnRX4B.dpbs")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng bruces = new LatLng(43.948289, -79.350158);
	    bruce = googleMap.addMarker(new MarkerOptions().
	            position(bruces)
	            .title("Bruce's Mill Conservation Area")
	            .snippet("http://www.trca.on.ca/enjoy/locations/bruces-mill-conservation-area.dot#sthash.WksUJ2dh.dpbs")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng haffy = new LatLng(43.935717, -79.954514);
	    glen = googleMap.addMarker(new MarkerOptions().
	            position(haffy)
	            .title("Glen Haffy Conservation Area")
	            .snippet("http://www.trca.on.ca/enjoy/locations/glen-haffy-conservation-area.dot#sthash.I1io9pDj.zokMG3s2.dpbs")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng heartlake = new LatLng(43.741208, -79.787867);
	    glen = googleMap.addMarker(new MarkerOptions().
	            position(heartlake)
	            .title("Heart Lake Conservation Area")
	            .snippet("http://www.trca.on.ca/enjoy/locations/heart-lake-conservation-area.dot#sthash.4sIzRbfs.dpbs")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng bcpv = new LatLng(43.774259, -79.515567);
	    blackcreek = googleMap.addMarker(new MarkerOptions().
	            position(bcpv)
	            .title("Black Creek Pioneer Village")
	            .snippet("http://www.blackcreek.ca/")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng kcfc = new LatLng(43.832700, -79.592926);
	    kourtright = googleMap.addMarker(new MarkerOptions().
	            position(kcfc)
	            .title("Kourtright Centre for Conservation")
	            .snippet("http://www.kourtright.org/")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng bggc = new LatLng(43.927748, -79.470202);
	    bathurst = googleMap.addMarker(new MarkerOptions().
	            position(bggc)
	            .title("Bathurst Glen Golf Course")
	            .snippet("http://www.bathurstglengolf.ca/")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng ilcg = new LatLng(43.832700, -79.592926);
	    indianline = googleMap.addMarker(new MarkerOptions().
	            position(ilcg)
	            .title("Indian Line Campground")
	            .snippet("http://www.trca.on.ca/enjoy/locations/indian-line-campground.dot")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng cca = new LatLng(43.756721, -79.665482);
	    claire = googleMap.addMarker(new MarkerOptions().
	            position(cca)
	            .title("ClaireVille Conservation Area")
	            .snippet("http://www.trca.on.ca/enjoy/locations/claireville-conservation-area.dot")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
	    
	    LatLng ttp = new LatLng(43.620602, -79.337887);
	    tommy = googleMap.addMarker(new MarkerOptions().
	            position(ttp)
	            .title("Tommy Thompson Park")
	            .snippet("http://www.tommythompsonpark.ca/")
	            .icon(BitmapDescriptorFactory.fromResource(R.drawable.trcamark)));
        }catch(Exception e){
        	
        }
    }

    private void getShaKey() {

    	 try {
    	 PackageInfo info = getPackageManager().getPackageInfo("your.package.name",
    	 PackageManager.GET_SIGNATURES);
    	 for (Signature signature : info.signatures) {
    	 MessageDigest md = MessageDigest.getInstance("SHA");
    	 md.update(signature.toByteArray());
    	 Log.v(TAG, "KeyHash:" + Base64.encodeToString(md.digest(),
    	 Base64.DEFAULT));
    	 }
    	 } catch (NameNotFoundException e) {
    	 e.printStackTrace();

    	 } catch (NoSuchAlgorithmException e) {
    	 e.printStackTrace();

    	 }

    	 }
    
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		//restaurants
		
		// TODO Auto-generated method stub
		switch((int) arg2){
		case 0:
			petti.setVisible(false);
			boyd.setVisible(false);
			alb.setVisible(false);
			bruce.setVisible(false);
			glen.setVisible(false);
			blackcreek.setVisible(false);
			kourtright.setVisible(false);
			bathurst.setVisible(false);
			indianline.setVisible(false);
			claire.setVisible(false);
			tommy.setVisible(false);
			RB.setVisible(false);
			LP.setVisible(false);
			BP.setVisible(false);
		   NF.setVisible(true);
		   NF.showInfoWindow();
		   M.setVisible(true);
		   M.showInfoWindow();
		   FC.setVisible(true);
		   FC.showInfoWindow();
		   BD.setVisible(false);
		   WD.setVisible(false);
		   MB.setVisible(false);
		   MC.setVisible(false);
		   CTS.setVisible(false);
			HD.setVisible(false);
			break;
		case 1:
			petti.setVisible(false);
			boyd.setVisible(false);
			alb.setVisible(false);
			bruce.setVisible(false);
			glen.setVisible(false);
			blackcreek.setVisible(false);
			kourtright.setVisible(false);
			bathurst.setVisible(false);
			indianline.setVisible(false);
			claire.setVisible(false);
			tommy.setVisible(false);
			RB.setVisible(false);
			LP.setVisible(false);
			BP.setVisible(false);
			MC.setVisible(true);
			MB.setVisible(true);
			WD.setVisible(true);
			BD.setVisible(true);
			NF.setVisible(false);
			M.setVisible(false);
			FC.setVisible(false);
			CTS.setVisible(false);
			HD.setVisible(false);
			break;
		case 2:
			petti.setVisible(false);
			boyd.setVisible(false);
			alb.setVisible(false);
			bruce.setVisible(false);
			glen.setVisible(false);
			blackcreek.setVisible(false);
			kourtright.setVisible(false);
			bathurst.setVisible(false);
			indianline.setVisible(false);
			claire.setVisible(false);
			tommy.setVisible(false);
			RB.setVisible(true);
			LP.setVisible(true);
			BP.setVisible(true);
			NF.setVisible(false);
			M.setVisible(false);
			FC.setVisible(false);
			BD.setVisible(false);
			WD.setVisible(false);
			MB.setVisible(false);
			MC.setVisible(false);
			CTS.setVisible(false);
			HD.setVisible(false);
			break;
		case 3:
			petti.setVisible(false);
			boyd.setVisible(false);
			alb.setVisible(false);
			bruce.setVisible(false);
			glen.setVisible(false);
			blackcreek.setVisible(false);
			kourtright.setVisible(false);
			bathurst.setVisible(false);
			indianline.setVisible(false);
			claire.setVisible(false);
			tommy.setVisible(false);
			CTS.setVisible(true);
			HD.setVisible(true);
			RB.setVisible(false);
			LP.setVisible(false);
			BP.setVisible(false);
			NF.setVisible(false);
			NF.setVisible(false);
			M.setVisible(false);
			FC.setVisible(false);
			BD.setVisible(false);
			WD.setVisible(false);
			MB.setVisible(false);
			MC.setVisible(false);
			break;
		case 4:
			petti.setVisible(true);
			boyd.setVisible(true);
			alb.setVisible(true);
			bruce.setVisible(true);
			glen.setVisible(true);
			blackcreek.setVisible(true);
			kourtright.setVisible(true);
			bathurst.setVisible(true);
			indianline.setVisible(true);
			claire.setVisible(true);
			tommy.setVisible(true);
			CTS.setVisible(false);
			HD.setVisible(false);
			RB.setVisible(false);
			LP.setVisible(false);
			BP.setVisible(false);
			NF.setVisible(false);
			NF.setVisible(false);
			M.setVisible(false);
			FC.setVisible(false);
			BD.setVisible(false);
			WD.setVisible(false);
			MB.setVisible(false);
			MC.setVisible(false);
			break;
		}
		
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}


}