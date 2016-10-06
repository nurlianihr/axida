package innovation.tower.com.axida.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import innovation.tower.com.axida.activity.R;
import innovation.tower.com.axida.adapter.ImageAdapter;

public class FragmentHome extends Fragment {

    private ImageAdapter imageAdapter;
	
	public FragmentHome(){

    }
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
         
        return rootView;

//        GridView gridView = (GridView) imageAdapter.getMainActivity().findViewById(R.id.grid_view);
//
//        // Instance of ImageAdapter Class
//        gridView.setAdapter(new ImageAdapter(imageAdapter.getMainActivity()));
    }
}
