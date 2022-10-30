
	 
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

public class event_activity extends Activity {

	
	private View _bg__event_ek2;
	private View rectangle_1_ek9;
	private ImageView asset_1_1_ek10;
	private View rectangle_13_ek7;
	private ImageView _42_3_ek7;
	private View rectangle_3_ek8;
	private TextView _manage_slots_ek12;
	private TextView _events_ek10;
	private TextView _evaluation_ek9;
	private TextView _create_event_ek8;
	private TextView _settings_ek12;
	private TextView _logout_ek8;
	private ImageView vector_ek14;
	private TextView event_ek3;
	private View rectangle_9_ek2;
	private View rectangle_10_ek2;
	private View rectangle_11_ek2;
	private TextView events_ek11;
	private TextView time_ek3;
	private TextView dis__ek1;
	private TextView date_ek1;
	private View rectangle_8_ek2;
	private View rectangle_9_ek3;
	private View rectangle_10_ek3;
	private View rectangle_11_ek3;
	private TextView exam_ek1;
	private TextView _06_30_pm_ek1;
	private TextView exam_for_students_lab_2_ek1;
	private TextView _25_ek1;
	private View rectangle_8_ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.event);

		
		_bg__event_ek2 = (View) findViewById(R.id._bg__event_ek2);
		rectangle_1_ek9 = (View) findViewById(R.id.rectangle_1_ek9);
		asset_1_1_ek10 = (ImageView) findViewById(R.id.asset_1_1_ek10);
		rectangle_13_ek7 = (View) findViewById(R.id.rectangle_13_ek7);
		_42_3_ek7 = (ImageView) findViewById(R.id._42_3_ek7);
		rectangle_3_ek8 = (View) findViewById(R.id.rectangle_3_ek8);
		_manage_slots_ek12 = (TextView) findViewById(R.id._manage_slots_ek12);
		_events_ek10 = (TextView) findViewById(R.id._events_ek10);
		_evaluation_ek9 = (TextView) findViewById(R.id._evaluation_ek9);
		_create_event_ek8 = (TextView) findViewById(R.id._create_event_ek8);
		_settings_ek12 = (TextView) findViewById(R.id._settings_ek12);
		_logout_ek8 = (TextView) findViewById(R.id._logout_ek8);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		event_ek3 = (TextView) findViewById(R.id.event_ek3);
		rectangle_9_ek2 = (View) findViewById(R.id.rectangle_9_ek2);
		rectangle_10_ek2 = (View) findViewById(R.id.rectangle_10_ek2);
		rectangle_11_ek2 = (View) findViewById(R.id.rectangle_11_ek2);
		events_ek11 = (TextView) findViewById(R.id.events_ek11);
		time_ek3 = (TextView) findViewById(R.id.time_ek3);
		dis__ek1 = (TextView) findViewById(R.id.dis__ek1);
		date_ek1 = (TextView) findViewById(R.id.date_ek1);
		rectangle_8_ek2 = (View) findViewById(R.id.rectangle_8_ek2);
		rectangle_9_ek3 = (View) findViewById(R.id.rectangle_9_ek3);
		rectangle_10_ek3 = (View) findViewById(R.id.rectangle_10_ek3);
		rectangle_11_ek3 = (View) findViewById(R.id.rectangle_11_ek3);
		exam_ek1 = (TextView) findViewById(R.id.exam_ek1);
		_06_30_pm_ek1 = (TextView) findViewById(R.id._06_30_pm_ek1);
		exam_for_students_lab_2_ek1 = (TextView) findViewById(R.id.exam_for_students_lab_2_ek1);
		_25_ek1 = (TextView) findViewById(R.id._25_ek1);
		rectangle_8_ek3 = (View) findViewById(R.id.rectangle_8_ek3);
	
		
		_manage_slots_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek10.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek12.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	