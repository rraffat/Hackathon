
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login_page
	 *	@date 		Sunday 30th of October 2022 09:52:07 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class notification_activity extends Activity {

	
	private View _bg__notification_ek2;
	private View rectangle_1_ek6;
	private View rectangle_13_ek4;
	private ImageView _42_3_ek4;
	private View rectangle_3_ek5;
	private TextView _manage_slots_ek9;
	private TextView _events_ek7;
	private TextView _evaluation_ek6;
	private TextView _create_event_ek5;
	private TextView _settings_ek9;
	private TextView _logout_ek5;
	private ImageView vector_ek11;
	private TextView notifications_ek1;
	private ImageView asset_1_1_ek7;
	private View rectangle_28;
	private View ellipse_4;
	private View ellipse_3;
	private TextView allow_notifications;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);

		
		_bg__notification_ek2 = (View) findViewById(R.id._bg__notification_ek2);
		rectangle_1_ek6 = (View) findViewById(R.id.rectangle_1_ek6);
		rectangle_13_ek4 = (View) findViewById(R.id.rectangle_13_ek4);
		_42_3_ek4 = (ImageView) findViewById(R.id._42_3_ek4);
		rectangle_3_ek5 = (View) findViewById(R.id.rectangle_3_ek5);
		_manage_slots_ek9 = (TextView) findViewById(R.id._manage_slots_ek9);
		_events_ek7 = (TextView) findViewById(R.id._events_ek7);
		_evaluation_ek6 = (TextView) findViewById(R.id._evaluation_ek6);
		_create_event_ek5 = (TextView) findViewById(R.id._create_event_ek5);
		_settings_ek9 = (TextView) findViewById(R.id._settings_ek9);
		_logout_ek5 = (TextView) findViewById(R.id._logout_ek5);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		notifications_ek1 = (TextView) findViewById(R.id.notifications_ek1);
		asset_1_1_ek7 = (ImageView) findViewById(R.id.asset_1_1_ek7);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		allow_notifications = (TextView) findViewById(R.id.allow_notifications);
	
		
		_manage_slots_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	