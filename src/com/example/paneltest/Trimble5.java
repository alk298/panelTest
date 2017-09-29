package com.example.paneltest;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class Trimble5 extends Activity {
	
	private int TimerInt;
	private String TimerString;	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		 setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); 
	       requestWindowFeature(Window.FEATURE_NO_TITLE);
	        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		setContentView(R.layout.activity_trimble5);
		

			  Bundle TimerSetting =this.getIntent().getExtras();

		       TimerString = TimerSetting.getString("Timer");
		       
		       TimerInt = Integer.parseInt(TimerString);
		    
		       
		       new Thread(new Runnable(){
		    	    @Override
		    	    public void run() {
		    	    	
		    	    	
		    	    	try{
		    	     	    // delay 1 second
		    	     	    Thread.sleep(TimerInt);
		    	     	        
		    	     	} catch(InterruptedException e){
		    	     	    e.printStackTrace();
		    	     	        
		    	     	}
		    	    	
		    	    	jump();
		    	    	
		    	    	
		    	    	
		    	    	
		    	    }
		    	 
		    	}).start();
		   
		}
		
		
		public void jump()
		{
			
			Intent JumptopanelCheck = new Intent (this,CheckPanel.class);
			   
			   startActivity(JumptopanelCheck); 

		}
		

	}
