package com.dabing.demo;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class WelcomeActivity extends Activity {
	
	ImageView mImageView;
	AnimationDrawable mAnimationDrawable;
	Animation mAnimation;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		mImageView = (ImageView)findViewById(R.id.welcome_img);
		mImageView.setBackgroundResource(R.drawable.welcome_animation);
		mAnimation = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.welcome_move);
		mAnimation.setRepeatCount(5);
		mAnimationDrawable = (AnimationDrawable)mImageView.getBackground();
	}
	/* (non-Javadoc)
	 * @see android.app.Activity#onWindowFocusChanged(boolean)
	 */
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasFocus);
		
		mAnimationDrawable.start();
		mImageView.startAnimation(mAnimation);
	}

}
