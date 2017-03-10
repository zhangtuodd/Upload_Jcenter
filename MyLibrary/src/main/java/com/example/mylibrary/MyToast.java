package com.example.mylibrary;

/**
 * Created by zbj on 2017/2/23.
 */


import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * 描述：统一管理类
 * <p>
 * Created by dj on 2016/11/17 0017.
 */

public class MyToast {

    private MyToast() {
        //不能被实例化
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isShow = true;

    /**
     * 屏幕中间位置显示短时间Toast
     *
     * @param context
     * @param msg
     */
    public static void ToastShortCenter(Context context, String msg) {
        if (isShow) {
            if (context != null) {
                Toast toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        }

    }

    /**
     * 屏幕中心位置长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void ToastLongCenter(Context context, String message) {
        if (isShow) {
            if (context != null) {
                Toast toast = Toast.makeText(context, message, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        }
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void ToastShow(Context context, String message, int duration) {
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }
}