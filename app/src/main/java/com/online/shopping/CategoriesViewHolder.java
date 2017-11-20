package com.online.shopping;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup; // Third Party Library for expandable recycler view
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;// Third Party Library for expandable recycler view
public class CategoriesViewHolder extends GroupViewHolder {
    private TextView categoriesName;
    public CategoriesViewHolder(View itemView) {
        super(itemView);
        categoriesName = (TextView) itemView.findViewById(R.id.tvCatogries);
    }
    @Override
    public void expand() { // When recycler view is expanded
        categoriesName.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.downarrow, 0);
        Log.i("Adapter", "expand");
    }
    @Override
    public void collapse() {// When recycler view is collapsed
        Log.i("Adapter", "collapse");
        categoriesName.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.uparrow, 0);
    }
    public void setGroupName(ExpandableGroup group) { // For setting the name of manu
        categoriesName.setText(group.getTitle());
    }
}

