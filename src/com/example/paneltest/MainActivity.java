package com.example.paneltest;



import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
   
	private String Timer="180000";
	//private String Timer="5000";



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); 
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


		
		setContentView(R.layout.activity_main);
		
	    
	}
	
	  
    @Override  
    protected void onActivityResult(int requestCode, int resultCode, Intent data)  
    {  
              super.onActivityResult(requestCode, resultCode, data);  
               // check if the request code is same as what is passed  here it is 2  
                if(requestCode==0)  
                      {  
                	Timer=data.getStringExtra("MESSAGE");  
          
                        
                      }  
	
    }

	 public void TimerSetting(View v)
	 { 
		 
		   Intent Timer = new Intent (this,TimerSetting.class);
		   
		   startActivityForResult(Timer, 0); 

	 } 
	
	
	
	public void trimble1(View v)
	{	
		 Intent Trimble1 = new Intent (this,Trimble1.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle1 = new Bundle();
         bundle1.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble1.putExtras(bundle1); 
		   startActivity(Trimble1);  			
	}
	
	public void trimble2(View v)
	{	
		 Intent Trimble2 = new Intent (this,Trimble2.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle2 = new Bundle();
         bundle2.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble2.putExtras(bundle2); 
		   startActivity(Trimble2);  			
	}
	
	public void trimble3(View v)
	{	
		 Intent Trimble3 = new Intent (this,Trimble3.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle3 = new Bundle();
         bundle3.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble3.putExtras(bundle3); 
		   startActivity(Trimble3);  			
	}
	
	public void trimble4(View v)
	{	
		 Intent Trimble4 = new Intent (this,Trimble4.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle4 = new Bundle();
         bundle4.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble4.putExtras(bundle4); 
		   startActivity(Trimble4);  			
	}
	
	
	public void trimble5(View v)
	{	
		 Intent Trimble5 = new Intent (this,Trimble5.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle5 = new Bundle();
         bundle5.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble5.putExtras(bundle5); 
		   startActivity(Trimble5);  			
	}
	
	
	public void trimble6(View v)
	{	
		 Intent Trimble6 = new Intent (this,Trimble6.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle6 = new Bundle();
         bundle6.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble6.putExtras(bundle6); 
		   startActivity(Trimble6);  			
	}
	
	
	public void trimble7(View v)
	{	
		 Intent Trimble7 = new Intent (this,Trimble7.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle7 = new Bundle();
         bundle7.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble7.putExtras(bundle7); 
		   startActivity(Trimble7);  			
	}
	
	public void trimble8(View v)
	{	
		 Intent Trimble8 = new Intent (this,Trimble8.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle8 = new Bundle();
         bundle8.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble8.putExtras(bundle8); 
		   startActivity(Trimble8);  			
	}
	
	
	public void trimble9(View v)
	{	
		 Intent Trimble9 = new Intent (this,Trimble9.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle9 = new Bundle();
         bundle9.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble9.putExtras(bundle9); 
		   startActivity(Trimble9);  			
	}
	
	
	public void trimble10(View v)
	{	
		 Intent Trimble10 = new Intent (this,Trimble10.class);
		  //new一個Bundle物件，並將要傳遞的資料傳入
         Bundle bundle10 = new Bundle();
         bundle10.putString("Timer", Timer);
         //將Bundle物件assign給intent
         Trimble10.putExtras(bundle10); 
		   startActivity(Trimble10);  			
	}
	
	
	
	
	
}
