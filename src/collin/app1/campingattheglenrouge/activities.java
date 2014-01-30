package collin.app1.campingattheglenrouge;

import java.io.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.*;
import collin.app1.campingattheglenrouge.R;

public class activities extends Activity implements OnClickListener{
    PopupWindow pw;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_activity);
        
       Button map =(Button)findViewById(R.id.mappop);
       map.setOnClickListener(this);
       
       Button bb =(Button)findViewById(R.id.beachpop);
       bb.setOnClickListener(this);
       
       Button cp =(Button)findViewById(R.id.cedarpop);
       cp.setOnClickListener(this);
       
       Button ep =(Button)findViewById(R.id.eaglepop);
       ep.setOnClickListener(this);
       
       Button msp =(Button)findViewById(R.id.mastpop);
       msp.setOnClickListener(this);
       
       Button meap =(Button)findViewById(R.id.meanderpop);
       meap.setOnClickListener(this);
       
       Button op =(Button)findViewById(R.id.orchardpop);
       op.setOnClickListener(this);
       
       Button vp =(Button)findViewById(R.id.vistapop);
       vp.setOnClickListener(this);
       
       Button wp =(Button)findViewById(R.id.woodlandpop);
       wp.setOnClickListener(this);
       
       
       Button gp =(Button)findViewById(R.id.guidepop);
       gp.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        LayoutInflater inflater = (LayoutInflater) activities.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.imagepop,
        (ViewGroup) findViewById(R.id.im));
        pw = new PopupWindow(layout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT, true);
        pw.setBackgroundDrawable(new BitmapDrawable());
        pw.showAtLocation(layout, Gravity.TOP, 0, 0);
      
        TouchImageView touch = (TouchImageView)layout.findViewById(R.id.imageView1);
        
        switch(v.getId()){
        case R.id.mappop:
                touch.setImageResource(R.drawable.map);
            break;
        case R.id.beachpop:
                touch.setImageResource(R.drawable.beach);
            break;
        case R.id.cedarpop:
                touch.setImageResource(R.drawable.cedartrail);
            break;
        case R.id.eaglepop:
                touch.setImageResource(R.drawable.eaglesvista);
            break;
        case R.id.mastpop:
                touch.setImageResource(R.drawable.mast);
            break;
        case R.id.meanderpop:
                touch.setImageResource(R.drawable.meander);
            break;
        case R.id.orchardpop:
                touch.setImageResource(R.drawable.orchard);
            break;
        case R.id.vistapop:
                touch.setImageResource(R.drawable.vista);
            break;
        case R.id.woodlandpop:
                touch.setImageResource(R.drawable.woodland);
            break;
        case R.id.guidepop:
        		touch.setImageResource(R.drawable.parkguide);
        	break;
            
        }
        // TODO Auto-generated method stub
        
    }


}