package com.weiweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhufei on 2018/4/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
