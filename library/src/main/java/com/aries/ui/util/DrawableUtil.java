package com.aries.ui.util;

import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * Created: AriesHoo on 2018/2/5/005 12:02
 * E-Mail: AriesHoo@126.com
 * Function: Drawable设置相关工具类
 * Description:
 */
public class DrawableUtil {

    /**
     * 设置drawable宽高
     *
     * @param drawable
     * @param width
     * @param height
     */
    public static void setDrawableWidthHeight(Drawable drawable, int width, int height) {
        try {
            if (drawable != null) {
                drawable.setBounds(0, 0,
                        width >= 0 ? width : drawable.getIntrinsicWidth(),
                        height >= 0 ? height : drawable.getIntrinsicHeight());
            }
            Log.i("setDrawableWidthHeight",drawable+"");
        } catch (Exception e) {
        }
    }
}