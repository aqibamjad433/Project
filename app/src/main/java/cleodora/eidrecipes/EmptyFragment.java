package cleodora.eidrecipes;

import cleodora.eidrecipes.R;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EmptyFragment extends Fragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.empty, container, false);
		return view;
	}
	public void onBackPressed ()
	{
		Log.i("BackPressed","Called");
	}
}
