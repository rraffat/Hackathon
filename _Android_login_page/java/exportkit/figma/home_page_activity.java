
	 
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

public class home_page_activity extends Activity {

	
	private View _bg__home_page_ek2;
	private View rectangle_1_ek1;
	private ImageView asset_1_1_ek1;
	private ImageView mask_group;
	private ImageView _42_1_ek1;
	private View rectangle_4;
	private View rectangle_5;
	private TextView student_name_intra_name;
	private TextView evaluation_point__;
	private TextView wallet__;
	private TextView level__;
	private View rectangle_3;
	private TextView _manage_slots;
	private TextView _events;
	private TextView _evaluation;
	private TextView _create_event;
	private TextView _settings;
	private TextView _logout;
	private ImageView vector;
	private View rectangle_6;
	private TextView projects;
	private TextView projects_ek1;
	private TextView projects_ek2;
	private TextView projects_ek3;
	private View rectangle_7;
	private View rectangle_9;
	private View rectangle_10;
	private View rectangle_11;
	private TextView events_ek1;
	private TextView time;
	private TextView dis_;
	private TextView date;
	private View rectangle_8;
	private View rectangle_9_ek1;
	private View rectangle_10_ek1;
	private View rectangle_11_ek1;
	private TextView exam;
	private TextView _06_30_pm;
	private TextView exam_for_students_lab_2;
	private TextView _25;
	private View rectangle_8_ek1;
	private TextView events_ek2;
	private View rectangle_12;
	private TextView unavailable;
	private TextView bh_absorpation;
	private TextView ___days;
	private TextView __;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);

		
		_bg__home_page_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		asset_1_1_ek1 = (ImageView) findViewById(R.id.asset_1_1_ek1);
		mask_group = (ImageView) findViewById(R.id.mask_group);
		_42_1_ek1 = (ImageView) findViewById(R.id._42_1_ek1);
		rectangle_4 = (View) findViewById(R.id.rectangle_4);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		student_name_intra_name = (TextView) findViewById(R.id.student_name_intra_name);
		evaluation_point__ = (TextView) findViewById(R.id.evaluation_point__);
		wallet__ = (TextView) findViewById(R.id.wallet__);
		level__ = (TextView) findViewById(R.id.level__);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		_manage_slots = (TextView) findViewById(R.id._manage_slots);
		_events = (TextView) findViewById(R.id._events);
		_evaluation = (TextView) findViewById(R.id._evaluation);
		_create_event = (TextView) findViewById(R.id._create_event);
		_settings = (TextView) findViewById(R.id._settings);
		_logout = (TextView) findViewById(R.id._logout);
		vector = (ImageView) findViewById(R.id.vector);
		rectangle_6 = (View) findViewById(R.id.rectangle_6);
		projects = (TextView) findViewById(R.id.projects);
		projects_ek1 = (TextView) findViewById(R.id.projects_ek1);
		projects_ek2 = (TextView) findViewById(R.id.projects_ek2);
		projects_ek3 = (TextView) findViewById(R.id.projects_ek3);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		rectangle_9 = (View) findViewById(R.id.rectangle_9);
		rectangle_10 = (View) findViewById(R.id.rectangle_10);
		rectangle_11 = (View) findViewById(R.id.rectangle_11);
		events_ek1 = (TextView) findViewById(R.id.events_ek1);
		time = (TextView) findViewById(R.id.time);
		dis_ = (TextView) findViewById(R.id.dis_);
		date = (TextView) findViewById(R.id.date);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		rectangle_9_ek1 = (View) findViewById(R.id.rectangle_9_ek1);
		rectangle_10_ek1 = (View) findViewById(R.id.rectangle_10_ek1);
		rectangle_11_ek1 = (View) findViewById(R.id.rectangle_11_ek1);
		exam = (TextView) findViewById(R.id.exam);
		_06_30_pm = (TextView) findViewById(R.id._06_30_pm);
		exam_for_students_lab_2 = (TextView) findViewById(R.id.exam_for_students_lab_2);
		_25 = (TextView) findViewById(R.id._25);
		rectangle_8_ek1 = (View) findViewById(R.id.rectangle_8_ek1);
		events_ek2 = (TextView) findViewById(R.id.events_ek2);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		unavailable = (TextView) findViewById(R.id.unavailable);
		bh_absorpation = (TextView) findViewById(R.id.bh_absorpation);
		___days = (TextView) findViewById(R.id.___days);
		__ = (TextView) findViewById(R.id.__);
	
		
		_manage_slots.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), manage_slots_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_events.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_evaluation.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), eval_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_create_event.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), creat_event_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_settings.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_logout.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	