package innovation.tower.com.axida.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import innovation.tower.com.axida.activity.R;

public class FragmentKamuning extends Fragment {
	
	public FragmentKamuning(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
         
        return rootView;
    }
}
