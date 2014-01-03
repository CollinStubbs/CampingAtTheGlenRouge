package com.example.campingattheglenrouge;

import java.io.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class activities extends Activity {
	private TextView activityText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_activity);
        
        AssetManager am = this.getAssets();
        String readData = "";
        try {
			InputStream is = am.open("test.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String dataHolder = br.readLine();
			
			while(dataHolder!= null){
				readData+= dataHolder;
				dataHolder = br.readLine();
				//readData+="\n"; or manually place them in the .txt
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        LinearLayout lview = (LinearLayout)findViewById(R.id.actLay);
        activityText = new TextView(this);
        activityText.setText(readData);
        activityText.setBackgroundColor(0x66FFFFFF);
        lview.addView(activityText);
    }


}