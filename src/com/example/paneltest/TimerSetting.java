package com.example.paneltest;


import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class TimerSetting extends Activity {
	
	 private EditText TimerInput;
	  private String TimerSetting;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); 

		setContentView(R.layout.activity_timer_setting);
		

		TimerInput=(EditText)findViewById(R.id.InputTimer);  

		TimerInput.setInputType(EditorInfo.TYPE_CLASS_PHONE);

	}

	public void Home(View v)
	{
		
		TimerSetting= TimerInput.getText().toString();
	    Intent Home=new Intent();  
        Home.putExtra("MESSAGE",TimerSetting);  
        setResult(0,Home);  
        finish();//finishing activity  
		
		
	}
	
	
	
}
