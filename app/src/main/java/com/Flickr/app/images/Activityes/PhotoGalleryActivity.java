package com.Flickr.app.images.Activityes;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.Flickr.app.images.Fragments.PhotoGalleryFragment;
import com.Flickr.app.images.R;


public class PhotoGalleryActivity extends SingleFragmentActivity {
    private static final String TAG = "PhotoGalleryActivity";

    @Override
    public Fragment createFragment() {
        return new PhotoGalleryFragment();
    }
Context context;
    @Override
    public void onNewIntent(Intent intent) {
        PhotoGalleryFragment fragment = (PhotoGalleryFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainer);


        fragment.updateItems();
    }


}
