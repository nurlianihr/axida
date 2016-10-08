package innovation.tower.com.axida.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import innovation.tower.com.axida.activity.R;

public class FragmentProfile extends Fragment {
	
	public FragmentProfile(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
         
        return rootView;
    }
}
