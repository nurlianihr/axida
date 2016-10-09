package innovation.tower.com.axida.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import innovation.tower.com.axida.activity.R;
import innovation.tower.com.axida.controller.FragmentTabNewController;

/**
 * Created by yeha on 10/8/16.
 */

public class FragmentTabNew extends Fragment {
    private View view;
    private FragmentEvent fragmentEvent;
    private LayoutInflater inflater;
    private TableLayout fieldContent;
    private FragmentTabNewController fragmentTabNewController;

    /**
     * Constructor
     * @param fragmentEvent
     */
    @SuppressLint("ValidFragment")
    public FragmentTabNew(FragmentEvent fragmentEvent){
        this.fragmentEvent = fragmentEvent;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab_news, container, false);
        this.inflater = inflater;
        initLayout();
        fragmentTabNewController = new FragmentTabNewController(this);
        return view;
        
    }

    private void initLayout() {

    }

    public View getView(){
        return view;
    }

    /**
     * Get TableLayout
     * @return fieldContent
     */
    public TableLayout getFieldContent(){
        return fieldContent;
    }

    /**
     * Get a fragment schedule
     * @return fragmentSchedule
     */
    public FragmentEvent getFragmentEvent(){
        return fragmentEvent;
    }

    /**
     * Get a fragment tab schedule
     * @return fragmentTabHistoryController
     */
    public FragmentTabNewController getFragmentTabNewController(){
        return fragmentTabNewController;
    }

    public LayoutInflater getInflater(){
        return inflater;
    }

}
