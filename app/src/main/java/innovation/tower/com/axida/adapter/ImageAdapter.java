package innovation.tower.com.axida.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import id.innovation.tower.titrada.R;
import innovation.tower.com.axida.activity.MainActivity;

/**
 * Created by yeha on 9/9/16.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private MainActivity mainActivity;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.ic_communities, R.drawable.ic_drawer,
            R.drawable.ic_home, R.drawable.ic_launcher,
            R.drawable.ic_pages, R.drawable.ic_people,
            R.drawable.ic_photos, R.drawable.ic_whats_hot,

    };

    // Constructor
    public ImageAdapter(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
        return imageView;
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }
}
