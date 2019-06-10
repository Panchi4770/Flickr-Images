package com.Flickr.app.images.Activityes;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.Flickr.app.images.Fragments.PhotoGalleryFragment;
import com.Flickr.app.images.Fragments.PhotoPageFragment;
import com.Flickr.app.images.R;


public class PhotoPageActivity extends SingleFragmentActivity {
    private static final String TAG = "PhotoPageActivity";

    @Override
    public Fragment createFragment() {
        return new PhotoPageFragment();
    }

    Context context;

    @Override
    public void onNewIntent(Intent intent) {
        PhotoPageFragment fragment = (PhotoPageFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainer);


    }
}
