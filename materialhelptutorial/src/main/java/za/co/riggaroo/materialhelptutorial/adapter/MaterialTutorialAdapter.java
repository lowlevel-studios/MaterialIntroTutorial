package za.co.riggaroo.materialhelptutorial.adapter;

import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import za.co.riggaroo.materialhelptutorial.MaterialTutorialFragment;


public class MaterialTutorialAdapter extends FragmentPagerAdapter {

    private List<MaterialTutorialFragment> fragments;

    public MaterialTutorialAdapter(FragmentManager fm, List<MaterialTutorialFragment> fragments) {
        super(fm);
        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }


    @Override
    public int getCount() {
        return this.fragments.size();
    }

}
