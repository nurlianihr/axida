package innovation.tower.com.axida.fragment;

import android.app.Fragment;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import innovation.tower.com.axida.activity.MainActivity;
import innovation.tower.com.axida.activity.R;
import innovation.tower.com.axida.adapter.ImageAdapter;
import innovation.tower.com.axida.controller.FragmentRadarController;

public class FragmentRadar extends Fragment {//implements LocationListener {

    private ImageAdapter imageAdapter;
    private FragmentRadarController fragmentRadarController;
    private Button btnClick;
    private View view;
    
    public FragmentRadar(){

    }
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null){
            this.view = inflater.inflate(R.layout.fragment_radar, container, false);
        }
        return view;

//        super.onCreate(savedInstanceState);
//        View rootView = inflater.inflate(R.layout.fragment_radar, container, false);
//        return rootView;

    }

    @Override
    public void onResume() {
        if (fragmentRadarController == null){
            this.fragmentRadarController = new FragmentRadarController(this);
        }
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    /**
     * Get setting fragment
     *
     * @return view
     */
    public View getView() {
        return view;
    }

    /**
     * Get Fragment Setting Controller
     *
     * @return fragmentSettingController
     */

    public FragmentRadarController getFragmentRadarController(){
        return fragmentRadarController;
    }

}
