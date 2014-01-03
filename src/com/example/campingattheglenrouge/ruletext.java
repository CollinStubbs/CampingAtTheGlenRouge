package com.example.campingattheglenrouge;

import java.io.*;
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class ruletext extends Activity {
	private TextView activityText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ruletext_activity);
        
        AssetManager am = this.getAssets();
        ArrayList<String> readData = new ArrayList<String>();
        try {
			InputStream is = am.open("rulestxt.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String dataHolder = br.readLine();
			String holder;
			int it = -1;
			while(dataHolder!= null){
				if(dataHolder.startsWith("-")){
					readData.add(dataHolder);
					it++;
					dataHolder = br.readLine();
				}
				else{
					holder = readData.remove(it);
					holder = holder+dataHolder;
					readData.add(holder);
					dataHolder = br.readLine();
				}
				//readData+="\n"; or manually place them in the .txt
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        LinearLayout lview = (LinearLayout)findViewById(R.id.ruTe);
        activityText = new TextView(this);
        activityText.setText(" ");
        
        for(int i = 0; i<readData.size(); i++){
        	activityText.setText(activityText.getText()+"\n\n" + readData.get(i));
        }
        activityText.setTextColor(Color.BLACK);
        lview.addView(activityText);
        lview.setPadding(30,30,30,30);
    }
 
    

}