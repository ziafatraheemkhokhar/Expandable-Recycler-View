package com.online.shopping;

import android.os.Parcel;
import android.os.Parcelable;
public class SubCategories implements Parcelable {
    private String name;
    public SubCategories(Parcel in) {
        name = in.readString();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public SubCategories(String name) {
        this.name = name;
    }
    public static final Creator<SubCategories> CREATOR = new Creator<SubCategories>() {
    @Override
    public SubCategories createFromParcel(Parcel in) {
    return new SubCategories(in);
}
@Override
public SubCategories[] newArray(int size) {
return new SubCategories[size];
}
};
@Override
public int describeContents() {
return 0;
}
@Override
public void writeToParcel(Parcel dest, int flags) {
dest.writeString(name);
}
}
