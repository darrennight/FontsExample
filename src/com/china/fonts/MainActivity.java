package com.china.fonts;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
			@Override
			public void run() {
				setTitle("Calligraphy changed");
				getActionBar().setSubtitle("Added subtitle");
			}
		}, 1000);
	}

	@Override
	protected void attachBaseContext(Context newBase) {
		super.attachBaseContext(new CalligraphyContextWrapper(newBase));
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment implements
			OnClickListener {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle state) {
			return inflater.inflate(R.layout.fragment_main, container, false);
		}

		@Override
		public void onViewCreated(View view, Bundle savedInstanceState) {
			view.findViewById(R.id.button_default).setOnClickListener(this);
			view.findViewById(R.id.button_bold).setOnClickListener(this);

			super.onViewCreated(view, savedInstanceState);
		}

		@Override
		public void onClick(View v) {
			Toast.makeText(getActivity(), "Custom Typeface toast text",
					Toast.LENGTH_SHORT).show();
		}
	}
}
