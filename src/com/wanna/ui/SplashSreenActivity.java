/**
 * 
 */
package com.wanna.ui;

import com.wanna.controller.Controller;

import android.app.Activity;
import android.os.Bundle;

/**
 *
 */

public class SplashSreenActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Controller.getInstance().verifyUser();
	}
}
