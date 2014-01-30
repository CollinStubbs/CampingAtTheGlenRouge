package collin.app1.campingattheglenrouge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import collin.app1.campingattheglenrouge.R;

public class MainActivity extends Activity implements OnClickListener {
	PopupWindow pw;
	MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface t = Typeface.createFromAsset(getAssets(),
                "Fonts/Pinewood.ttf");
        TextView title = (TextView) findViewById(R.id.title2);
        TextView title2 = (TextView) findViewById(R.id.title1);
        title.setTypeface(t);
        title2.setTypeface(t);
        setupButtonClickListener();
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(this, R.raw.sound);
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    private void setupButtonClickListener(){
    	
    	Button ruleButton = (Button)findViewById(R.id.ruleButton);
    	ruleButton.setOnClickListener(this);
    	
    	
    	Button activityButton = (Button)findViewById(R.id.activityButton);
    	activityButton.setOnClickListener(this);
    	
    	
    	Button calendarButton = (Button)findViewById(R.id.calendarButton);
    	calendarButton.setOnClickListener(this);
    	
    	
    	Button campButton = (Button)findViewById(R.id.campButton);
    	campButton.setOnClickListener(this);
    	
    	
    	Button wildButton = (Button)findViewById(R.id.wildButton);
    	wildButton.setOnClickListener(this);

    	
    	Button touristButton = (Button)findViewById(R.id.touristButton);
    	touristButton.setOnClickListener(this);
    	
    	Button credit = (Button)findViewById(R.id.credit);
    	credit.setOnClickListener(this);
    	
    	ImageButton audio = (ImageButton) findViewById(R.id.audio);
    	audio.setOnClickListener(this);
    	
    	ImageButton call = (ImageButton) findViewById(R.id.phone);
    	call.setOnClickListener(this);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		case R.id.audio:
			if(mMediaPlayer.isPlaying()){
				mMediaPlayer.stop();
			}else{
		        mMediaPlayer = new MediaPlayer();
		        mMediaPlayer = MediaPlayer.create(this, R.raw.sound);
		        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
		        mMediaPlayer.setLooping(true);
		        mMediaPlayer.start();
		    
			}
			break;
		case R.id.phone:
			Intent callIntent = new Intent(Intent.ACTION_DIAL);
		    callIntent.setData(Uri.parse("tel:4162872267"));
		    startActivity(callIntent);
			break;
		case R.id.ruleButton:
			
			Intent intent = new Intent(v.getContext(), rules.class);
			startActivityForResult(intent, 0);
			
			break;
		case R.id.activityButton:
			
			Intent intent1 = new Intent(v.getContext(), activities.class);
			startActivityForResult(intent1, 0);
			
			break;
		case R.id.calendarButton:
			
			Intent intent2 = new Intent(v.getContext(), calendar.class);
			startActivityForResult(intent2, 0);
			
			break;
		case R.id.campButton:
			
			Intent intent3 = new Intent(v.getContext(), campingtips.class);
			startActivityForResult(intent3, 0);
			
			break;
		case R.id.wildButton:
			
			Intent intent4 = new Intent(v.getContext(), wildlife.class);
			startActivityForResult(intent4, 0);
			
			break;
		case R.id.touristButton:
			
			Intent intent6 = new Intent(v.getContext(), touristinfo.class);
			startActivityForResult(intent6, 0);
			
			break;
		case R.id.credit:
			
			LayoutInflater inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.creditpop,
			(ViewGroup) findViewById(R.id.cr));
			pw = new PopupWindow(layout, getApplicationContext().getResources().getDisplayMetrics().widthPixels, getApplicationContext().getResources().getDisplayMetrics().heightPixels, true);
	        pw.setBackgroundDrawable(new BitmapDrawable());

			pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
			

			
			
			AssetManager am = this.getAssets();
	        String readData = "";
	        try {
				InputStream is = am.open("credit.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String dataHolder = br.readLine();
				
				while(dataHolder!= null){
					readData+= dataHolder;
					dataHolder = br.readLine();
					readData+="\n";// or manually place them in the .txt
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
			TextView cred = (TextView) layout.findViewById(R.id.credview);
			cred.setText(readData);
		}
		}

		
	}
    

