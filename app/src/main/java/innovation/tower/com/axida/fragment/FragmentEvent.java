package innovation.tower.com.axida.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import innovation.tower.com.axida.activity.R;

public class FragmentEvent extends Fragment {
    private View view;
//    private FragmentEventController fragmentEventController;
    private FragmentTabHot fragmentTabHot;
    private FragmentTabNew fragmentTabNew;


    public FragmentEvent(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        this.view = inflater.inflate(R.layout.fragment_event, container, false);
//        this.fragmentTabHot = new FragmentTabHot(this);
//        this.fragmentTabNew = new FragmentTabNew(this);
//        this.fragmentEventController = new FragmentEventController(this);
//        fragmentEventController.initLayout();
//        fragmentEventController.initEvent();
//        return view;
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);

        return rootView;
    }


    public View getView(){
        return view;
    }

//    public FragmentEventController getFragmentEventController(){
//        return fragmentEventController;
//    }
//
//    public FragmentTabHot getFragmentTabHot(){
//        return fragmentTabHot;
//    }
//
//    public FragmentTabNew getFragmentTabNew(){
//        return fragmentTabNew;
//    }
}
