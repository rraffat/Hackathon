
	 
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

public class manage_slots_activity extends Activity {

	
	private View _bg__manage_slots_ek3;
	private View rectangle_1_ek2;
	private ImageView asset_1_1_ek2;
	private View rectangle_13;
	private ImageView _42_3;
	private TextView manage_slots_ek4;
	private View ellipse_2;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private TextView day_month_yeaer;
	private TextView time_from___to;
	private ImageView vector_ek3;
	private TextView _30_oct_2022;
	private TextView time_9_30_pm___11_00_pm;
	private ImageView vector_ek4;
	private TextView new_slots;
	private TextView begin_at;
	private TextView end_at;
	private View line_7;
	private View line_5;
	private View line_8;
	private View line_6;
	private TextView day_month_year;
	private TextView time_ek1;
	private TextView time_ek2;
	private TextView day_month_year_ek1;
	private View rectangle_14;
	private TextView create;
	private View rectangle_3_ek1;
	private TextView _manage_slots_ek5;
	private TextView _events_ek3;
	private TextView _evaluation_ek1;
	private TextView _create_event_ek1;
	private TextView _settings_ek1;
	private TextView _logout_ek1;
	private ImageView vector_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.manage_slots);

		
		_bg__manage_slots_ek3 = (View) findViewById(R.id._bg__manage_slots_ek3);
		rectangle_1_ek2 = (View) findViewById(R.id.rectangle_1_ek2);
		asset_1_1_ek2 = (ImageView) findViewById(R.id.asset_1_1_ek2);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		_42_3 = (ImageView) findViewById(R.id._42_3);
		manage_slots_ek4 = (TextView) findViewById(R.id.manage_slots_ek4);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		day_month_yeaer = (TextView) findViewById(R.id.day_month_yeaer);
		time_from___to = (TextView) findViewById(R.id.time_from___to);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		_30_oct_2022 = (TextView) findViewById(R.id._30_oct_2022);
		time_9_30_pm___11_00_pm = (TextView) findViewById(R.id.time_9_30_pm___11_00_pm);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		new_slots = (TextView) findViewById(R.id.new_slots);
		begin_at = (TextView) findViewById(R.id.begin_at);
		end_at = (TextView) findViewById(R.id.end_at);
		line_7 = (View) findViewById(R.id.line_7);
		line_5 = (View) findViewById(R.id.line_5);
		line_8 = (View) findViewById(R.id.line_8);
		line_6 = (View) findViewById(R.id.line_6);
		day_month_year = (TextView) findViewById(R.id.day_month_year);
		time_ek1 = (TextView) findViewById(R.id.time_ek1);
		time_ek2 = (TextView) findViewById(R.id.time_ek2);
		day_month_year_ek1 = (TextView) findViewById(R.id.day_month_year_ek1);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		create = (TextView) findViewById(R.id.create);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
		_manage_slots_ek5 = (TextView) findViewById(R.id._manage_slots_ek5);
		_events_ek3 = (TextView) findViewById(R.id._events_ek3);
		_evaluation_ek1 = (TextView) findViewById(R.id._evaluation_ek1);
		_create_event_ek1 = (TextView) findViewById(R.id._create_event_ek1);
		_settings_ek1 = (TextView) findViewById(R.id._settings_ek1);
		_logout_ek1 = (TextView) findViewById(R.id._logout_ek1);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
	
		
		_manage_slots_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	