package apkmarvel.com.utilanimation.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apkmarvel.com.utilanimation.R;
import apkmarvel.com.utilanimation.util.UtilAnim;

/**
 * Created by c_jvfranco on 11/27/2015.
 */
public class MoveYFragment   extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment, container, false);
        UtilAnim.moveY(v, UtilAnim.dip2px(getActivity(),500), 0, 500, null);
        return v;
    }
}