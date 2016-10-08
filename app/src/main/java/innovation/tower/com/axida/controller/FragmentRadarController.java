package innovation.tower.com.axida.controller;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import innovation.tower.com.axida.activity.MainActivity;
import innovation.tower.com.axida.activity.MapsActivity;

import innovation.tower.com.axida.fragment.FragmentRadar;
/**
 * Created by yeha on 10/8/16.
 */

public class FragmentRadarController extends MapsActivity {
    private FragmentRadar fragmentRadar;
    private GoogleMap googleMap;
    private MainActivity mainActivity;
    private MapsActivity mapsActivity;
    private double curlat;
    private double curlong;
    private static LatLng CURRENT= new LatLng(-7.048015,110.441016);
    private MarkerOptions currentMarker;

    private static final LatLng PERTH = new LatLng(-31.952854, 115.857342);
    private static final LatLng SYDNEY = new LatLng(-33.87365, 151.20689);
    private static final LatLng BRISBANE = new LatLng(-27.47093, 153.0235);

    private Marker mPerth;
    private Marker mSydney;
    private Marker mBrisbane;


    public FragmentRadarController(final FragmentRadar fragmentRadar) {
        this.fragmentRadar = fragmentRadar;
        this.mainActivity = fragmentRadar.getMainActivity();
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(map);
//        mapFragment.getMapAsync(this);
        initLayout(fragmentRadar.getView());


    }

    private void initLayout(View view) {
        getMapsActivity();

    }

    public FragmentRadar getFragmentRadar() {
        return fragmentRadar;
    }

//
//
//    public void onMapReady(GoogleMap map){
//        googleMap = map;
//
//        // Add some markers to the map, and add a data object to each marker.
//        mPerth = googleMap.addMarker(new MarkerOptions()
//                .position(PERTH)
//                .title("Perth"));
//        mPerth.setTag(0);
//
//        mSydney = googleMap.addMarker(new MarkerOptions()
//                .position(SYDNEY)
//                .title("Sydney"));
//        mSydney.setTag(0);
//
//        mBrisbane = googleMap.addMarker(new MarkerOptions()
//                .position(BRISBANE)
//                .title("Brisbane"));
//        mBrisbane.setTag(0);
//
//        // Set a listener for marker click.
//        googleMap.setOnMarkerClickListener(this);
//    }
//
//    @Override
//    public boolean onMarkerClick(Marker marker) {
//        // Retrieve the data from the marker.
//        Integer clickCount = (Integer) marker.getTag();
//
//        // Check if a click count was set, then display the click count.
//        if (clickCount != null) {
//            clickCount = clickCount + 1;
//            marker.setTag(clickCount);
//            Toast.makeText(this,
//                    marker.getTitle() +
//                            " has been clicked " + clickCount + " times.",
//                    Toast.LENGTH_SHORT).show();
//        }
//
//        // Return false to indicate that we have not consumed the event and that we wish
//        // for the default behavior to occur (which is for the camera to move such that the
//        // marker is centered and for the marker's info window to open, if it has one).
//
//
//        return false;
//    }


    public MapsActivity getMapsActivity() {
        return mapsActivity;
    }

}
