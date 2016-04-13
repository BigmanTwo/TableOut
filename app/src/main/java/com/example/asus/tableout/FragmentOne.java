package com.example.asus.tableout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/13.
 */
public class FragmentOne extends Fragment {
    private List<Map<String,Object>> mList;
    private ListView mListView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.listview_layout,null);
        mList=new ArrayList<>();
        Map map=new HashMap();
        for(int i=0;i<10;i++){
            map.put("image",R.mipmap.duola);
            map.put("text","sdsafd");
            mList.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(getActivity(),mList,R.layout.listfragment_layout,
                new String[]{"image","text"},
                new int[]{R.id.image,R.id.text_view});
        mListView= (ListView) view.findViewById(R.id.list_item);
        mListView.setAdapter(adapter);

        return view;
    }
}
