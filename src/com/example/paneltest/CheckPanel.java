package com.example.paneltest;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class CheckPanel extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); 

	       requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_check_panel);
		
	
	       
	    
		
		
	}

	
	
	
	public void GohomeScreen (View v)
	{
		

		   Intent Home = new Intent (this,MainActivity.class);

			
		   
		   startActivity(Home); 

		
		
	}
	
	
}
