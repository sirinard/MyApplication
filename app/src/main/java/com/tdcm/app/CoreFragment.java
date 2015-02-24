package com.tdcm.app;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Sirinard_cho on 21-Nov-14.
 */
public class CoreFragment extends Fragment {

    private boolean isOpenLeftMenu = true;

    protected void toggleLeftMenu() {
        Activity activity = getActivity();
        if(activity instanceof HomeActivity && isOpenLeftMenu){
            ((HomeActivity)activity).toggleLeftMenu();
        }
    }

    protected boolean isHomeActivity() {
        Activity activity = getActivity();
        if(activity instanceof HomeActivity){
            return true;
        }
        return false;
    }

    protected void changeFragment(Fragment fragment, int res_id, String tag) {
        if (fragment != null) {
            final FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(res_id, fragment, tag);
            ft.addToBackStack(tag);
            ft.commit();
        }
    }

    protected void setIsOpenLeftMenu (boolean isOpen){
        isOpenLeftMenu = isOpen;
    }

}
