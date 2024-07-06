package com.example.wallo.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wallo.Adapter.HorizontalAdapter;
import com.example.wallo.Adapter.HorizontalAdapter2;
import com.example.wallo.Adapter.Slide_adapter;
import com.example.wallo.R;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> urlla=new ArrayList<>();


    ArrayList<String> txtHorizontal=new ArrayList<>();
    ArrayList<String> imgHorizontal=new ArrayList<>();


    public RecyclerView rcvUp;
    public RecyclerView rcvlow;
    public ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tasarim=inflater.inflate(R.layout.fragment_search, container, false);
        rcvUp = tasarim.findViewById(R.id.rcvUp);
        rcvlow = tasarim.findViewById(R.id.rcvlow);
        viewPager = tasarim.findViewById(R.id.viewPager);



        Slide_adapter adapter = new Slide_adapter(getContext());
        viewPager.setAdapter(adapter);
        initRecyclerView();
        horizontalRcv();
        getImages();
        return  tasarim;
    }

    private void getImages(){


        /*
    http://www.rspcavic.org/images/Articles/Adult%20cats%20are%20the%20best/Website%20article%20(5).jpg
http://i.dailymail.co.uk/i/pix/2017/11/09/09/46285EF000000578-5065373-image-a-18_1510219514264.jpg
http://geniusvets.s3.amazonaws.com/gv-blog/2017/08-cat-cancer-2.jpg
https://d3i6fh83elv35t.cloudfront.net/newshour/app/uploads/2017/03/cat-tongue_AdobeStock_70141743-1024x719.jpeg
https://www.cats.org.uk/uploads/images/featurebox_sidebar_kids/Cat-Behaviour.jpg
http://r.ddmcdn.com/w_830/s_f/o_1/cx_0/cy_66/cw_288/ch_162/APL/uploads/2014/10/cat_5-1.jpg
https://laughingsquid.com/wp-content/uploads/2013/05/57136754_o1.jpg
http://www.cutestpaw.com/wp-content/uploads/2011/11/OIo.jpg
http://www.funnyordie.com/thumbnails/8f475168af/fullsize
http://www.freepngimg.com/download/cat/9-2-cat-png-8.png
https://www.aspca.org/sites/default/files/cat-care_cat-grooming_body1-left.jpg
http://www.pethealthnetwork.com/sites/default/files/content/images/age_chart_cats_v3-fb.jpg
https://ontariospca.ca/blog/wp-content/uploads/2013/04/cat-health-check.jpg
https://d17fnq9dkz9hgj.cloudfront.net/uploads/2018/03/Russian-Blue_01-390x203.jpg
https://www.rd.com/wp-content/uploads/2018/05/shutterstock_1076294222-760x506.jpg
http://www.healthnewsline.net/wp-content/uploads/2014/03/Pet-Cat-TB.jpg
https://fortunedotcom.files.wordpress.com/2017/11/gettyimages-166275767.jpg
https://cdn.images.express.co.uk/img/dynamic/1/590x/secondary/cat-tabitha-harley-special-relationship-1311330.jpg
https://www.bluecross.org.uk/sites/default/files/assets/images/cat%20cattery.jpg
https://www.rd.com/wp-content/uploads/2018/05/shutterstock_1076294222-760x506.jpg
https://www.telegraph.co.uk/content/dam/news/2018/02/12/TELEMMGLPICT000154026899_trans_NvBQzQNjv4BqW5LAbqXSQw_G1yEaLnMlB0zmgpppVTrYA6w61jGcGH0.jpeg?imwidth=480
https://cdn.arstechnica.net/wp-content/uploads/2017/06/Fotolia_58941902_Subscription_Monthly_M.jpg
https://www.petmd.com/sites/default/files/cat-flea-vaccine_0.jpg
         */
        urlla.add("https://http.cat/images/200.jpg");
        name.add("Havasu Falls");
        imgHorizontal.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrmojuD-xMi5uPUpCwC6b-Z0dFubMSpZXRAA&s");
        txtHorizontal.add("Havasu Falls");

        urlla.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg");
        name.add("Trondheim");
        imgHorizontal.add("https://static.boredpanda.com/blog/wp-content/uploads/2018/04/5acb63d83493f__700-png.jpg");
        txtHorizontal.add("Trondheim");

        urlla.add("https://www.argospetinsurance.co.uk/assets/uploads/2017/12/cat-pet-animal-domestic-104827.jpeg");
        name.add("Portugal");
        imgHorizontal.add("https://www.cats.org.uk/uploads/images/featurebox_sidebar_kids/grief-and-loss.jpg");
        txtHorizontal.add("Portugal");

        urlla.add("https://i.ytimg.com/vi/R81pgRSQ2XQ/maxresdefault.jpg");
        name.add(" National Park");
        imgHorizontal.add("https://www.petmd.com/sites/default/files/cat-flea-vaccine_0.jpg");
        txtHorizontal.add("National Park");



        urlla.add("https://i.ytimg.com/vi/cNycdfFEgBc/maxresdefault.jpg");
        name.add("Mahahual");
        imgHorizontal.add("https://cdn.arstechnica.net/wp-content/uploads/2017/06/Fotolia_58941902_Subscription_Monthly_M.jpg");
        txtHorizontal.add("Mahahual");

        urlla.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Cat_November_2010-1a.jpg/200px-Cat_November_2010-1a.jpg");
        name.add("Frozen Lake");
        imgHorizontal.add("https://www.telegraph.co.uk/content/dam/news/2018/02/12/TELEMMGLPICT000154026899_trans_NvBQzQNjv4BqW5LAbqXSQw_G1yEaLnMlB0zmgpppVTrYA6w61jGcGH0.jpeg?imwidth=480");
        txtHorizontal.add("Frozen Lake");



        urlla.add("https://i.ytimg.com/vi/9C1leq--_wM/maxresdefault.jpg");
        name.add("White Sands Desert");
        imgHorizontal.add("https://i.ytimg.com/vi/5530I_pYjbo/maxresdefault.jpg");
        txtHorizontal.add("White Sands Desert");


        urlla.add("https://img-aws.ehowcdn.com/600x600p/photos.demandstudios.com/getty/article/18/201/87786652.jpg");
        name.add("Austrailia");
        imgHorizontal.add("https://www.cats.org.uk/uploads/images/featurebox_sidebar_kids/Cat-Behaviour.jpg");
        txtHorizontal.add("Austrailia");

        urlla.add("https://kittentoob.com/wp-content/uploads/2018/01/Mackerel-tabby-750x441.jpg");
        name.add("Washington");
        imgHorizontal.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Black_white_cat_on_fence.jpg/220px-Black_white_cat_on_fence.jpg");
        txtHorizontal.add("Washington");


    }

    private void initRecyclerView(){


        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rcvUp.setLayoutManager(layoutManager);  // rcvUp burada kullanılıyor
        HorizontalAdapter adapter = new HorizontalAdapter(getContext(), name, urlla);
        rcvUp.setAdapter(adapter);
    }

    private void horizontalRcv(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rcvlow.setLayoutManager(layoutManager);
        rcvlow.setHasFixedSize(true);
        HorizontalAdapter2 adapter = new HorizontalAdapter2(getContext(), txtHorizontal, imgHorizontal);
        rcvlow.setAdapter(adapter);


    }



}