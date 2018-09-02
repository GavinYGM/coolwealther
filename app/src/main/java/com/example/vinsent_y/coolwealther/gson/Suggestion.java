package com.example.vinsent_y.coolwealther.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cw")
    public CarWash carWash;


    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    @SerializedName("sport")
    public Sport sport;


    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}