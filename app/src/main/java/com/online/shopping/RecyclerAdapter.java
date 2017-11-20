package com.online.shopping;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter; // Third party library for achieving expandable recyclerview
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup; // Third party library for achieving expandable recyclerview
import java.util.List;
public class RecyclerAdapter extends ExpandableRecyclerViewAdapter<CategoriesViewHolder, SubCategoriesViewHolder> {
    private Activity activity;
    public RecyclerAdapter(Activity activity, List<? extends ExpandableGroup> groups) {
        super(groups);
        this.activity = activity;
    }
    // Creating category recycler view
    @Override
    public CategoriesViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {// View Holder for Top category
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.catogries, parent, false);
        
        return new CategoriesViewHolder(view);
    }
    // Creating Sub category recycler view
    @Override
    public SubCategoriesViewHolder onCreateChildViewHolder(ViewGroup parent, final int viewType) {// View Holder for Sub category
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.subcatogries, parent, false);
        
        return new SubCategoriesViewHolder(view);
    }
    // When the sub category of recycler view will expanded from category.
    @Override
    public void onBindChildViewHolder(SubCategoriesViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final SubCategories subCategories = ((Categories) group).getItems().get(childIndex);
        holder.onBind(subCategories, group);
    }
    // When the category of recycler view will display
    @Override
    public void onBindGroupViewHolder(CategoriesViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGroupName(group);
    }
}
