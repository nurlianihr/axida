package innovation.tower.com.axida.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import innovation.tower.com.axida.activity.R;
import innovation.tower.com.axida.controller.FragmentTabHotController;

/**
 * Created by yeha on 10/8/16.
 */

public class FragmentTabHot extends Fragment {
    private View view;
    private TableLayout fieldContent;
    private FragmentEvent fragmentEvent;
    private FragmentTabHotController fragmentTabHotController;

    public FragmentTabHot(FragmentEvent fragmentEvent) {
        this.fragmentEvent = fragmentEvent;

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab_hot, container, false);
        initLayout();
        fragmentTabHotController = new FragmentTabHotController(this);
        return view;
    }

    /**
     * Initialize the spinner in schedule page
     */
    private void initLayout(){


    }

    /**
     * Get View
     */
    public View getView(){
        return view;
    }

    /**
     * Get a TableLayout
     * @return fieldContent
     */
    public TableLayout getFieldContent(){
        return fieldContent;
    }

    /**
     * Get a fragmentSchedule
     * @return fragmentSchedule
     */
    public FragmentEvent getFragmentSchedule(){
        return fragmentEvent;
    }

    /**
     * Get a fragmentScheduleController
     * @return fragmentScheduleController
     */
    public FragmentTabHotController getFragmentTabHotController(){
        return fragmentTabHotController;
    }

}
