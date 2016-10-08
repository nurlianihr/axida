package innovation.tower.com.axida.controller;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import innovation.tower.com.axida.activity.MainActivity;
import innovation.tower.com.axida.fragment.FragmentRadar;


/**
 * Created by yeha on 10/8/16.
 */

public class FragmentRadarController {
    private FragmentRadar fragmentRadar;
    private GoogleMap googleMap;
    private MainActivity mainActivity;
    private MapFragment mapFragment;
    private double curlat;
    private double curlong;
    private static LatLng CURRENT= new LatLng(-7.083733,110.416816);
    private MarkerOptions currentMarker;



    public FragmentRadarController(final FragmentRadar fragmentRadar) {
        this.fragmentRadar = fragmentRadar;

        initLayout();
        initData();
        initEvent();
    }

    private void initLayout() {


    }

    private void initData() {

    }

    private void initEvent() {
//        fragmentRadar.getActivity()


    }
}
