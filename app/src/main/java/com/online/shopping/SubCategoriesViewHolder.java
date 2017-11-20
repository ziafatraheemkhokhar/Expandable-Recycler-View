package com.online.shopping;

import android.view.View;
import android.widget.TextView;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup; // Third party library for expandable recycler view
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder; // Third party library for expandable recycler view
public class SubCategoriesViewHolder extends ChildViewHolder {
    private TextView subcategoriesName;
    public SubCategoriesViewHolder(View itemView) {
        super(itemView);
        subcategoriesName = (TextView) itemView.findViewById(R.id.tvSubCatogries);
    }
    public void onBind(SubCategories subCategories, ExpandableGroup group) {
        subcategoriesName.setText(subCategories.getName());
    }
}
