package com.example.tmp.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by tmp on 03.08.2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

}
