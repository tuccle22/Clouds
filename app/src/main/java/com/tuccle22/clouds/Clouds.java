package com.tuccle22.clouds;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;



public class Clouds extends AppCompatActivity implements Parcelable {

    private String clouds_title;
    private String header;
    private List<String> sections_list = new ArrayList<>();
    private List<Drawable> image_list = new ArrayList<>();


    public Clouds(int clouds_title, String header, int[] sections_list, int[] img_list) {
        this.clouds_title = getResources().getString(clouds_title);
        this.header = header;

        for ( int i = 0; i < sections_list.length; i++) {
            this.sections_list.add(getResources().getString(i));
        }

        for ( int i = 0; i < img_list.length; i++ ) {
            this.image_list.add(getResources().getDrawable(i, getTheme()));
        }
    }

    public String getCloudsTitle() {
        return clouds_title;
    }

    public void setCloudsTitle(String clouds_title) {
        this.clouds_title = clouds_title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<String> getSectionsList() {
        return sections_list;
    }

    public void setSectionsList(List<String> sections) {
        this.sections_list = sections;
    }

    public List<Drawable> getImageList() {
        return image_list;
    }

    public void setImageList(List<Drawable> image_list) {
        this.image_list = image_list;
    }


    protected Clouds(Parcel in) {
    }

    public static final Creator<Clouds> CREATOR = new Creator<Clouds>() {
        @Override
        public Clouds createFromParcel(Parcel in) {
            return new Clouds(in);
        }

        @Override
        public Clouds[] newArray(int size) {
            return new Clouds[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }


}


