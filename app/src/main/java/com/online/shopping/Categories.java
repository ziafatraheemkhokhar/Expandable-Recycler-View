package com.online.shopping;

import android.annotation.SuppressLint;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.List;
@SuppressLint("ParcelCreator")
public class Categories extends ExpandableGroup<SubCategories> {
    
    public Categories(String title, List<SubCategories> items) {
        super(title, items);
    }
}
