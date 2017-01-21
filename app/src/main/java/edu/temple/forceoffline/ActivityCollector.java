package edu.temple.forceoffline;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boyangbao on 1/20/17.
 */

public class ActivityCollector {

    public static List<Activity> activityList = new ArrayList<Activity>();

    public static void add(Activity activity) {
        activityList.add(activity);
    }

    public static void remove(Activity activity) {
        activityList.remove(activity);
    }

    public static void finishALL() {
        for (Activity activity:activityList) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }



}
