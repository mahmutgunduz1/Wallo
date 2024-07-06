package com.example.wallo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.wallo.R;

public class Slide_adapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_img={
            R.drawable.kediissss,
            R.drawable.kedi3,
            R.drawable.kedi4



    };
    @Override
    public int getCount() {
        return list_img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public Slide_adapter(Context context) {
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.slide_viewpager, container, false);
        LinearLayout linearLayout = view.findViewById(R.id.slide_layoutt);
        ImageView imageView = view.findViewById(R.id.slyatfoto);
        imageView.setImageResource(list_img[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}
