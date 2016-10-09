package innovation.tower.com.axida.fragment;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import innovation.tower.com.axida.activity.MainActivity;
import innovation.tower.com.axida.activity.R;
import innovation.tower.com.axida.adapter.ImageAdapter;
import innovation.tower.com.axida.controller.FragmentRadarController;

public class FragmentRadar extends Fragment {

    private ImageAdapter imageAdapter;
    private FragmentRadarController radarController;
    private MainActivity mainActivity;
    private View view;
    private FragmentRadarController fragmentRadarController;

    public FragmentRadar() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        super.onCreate(savedInstanceState);
//        View rootView = inflater.inflate(R.layout.fragment_radar, container, false);
//        return rootView;
        if(view == null){
            this.view = inflater.inflate(R.layout.fragment_radar, container, false);
        }
        return view;


    }

//    @Override
//    public void onResume(){
//        if (fragmentRadarController == null){
//            this.fragmentRadarController  = new FragmentRadarController (this);
//        }
//    }

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


    public FragmentRadarController getRadarController(){
        return fragmentRadarController;
    }

    public MainActivity getMainActivity(){
        return mainActivity;
    }

}

