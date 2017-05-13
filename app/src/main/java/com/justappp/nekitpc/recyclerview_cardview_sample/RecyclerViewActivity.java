package com.justappp.nekitpc.recyclerview_cardview_sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends Activity {

    private List<Numbers> numbersList;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recyclerview_activity);

        rv = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        // если размер rv не будет меняться вызываем метод
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    // заполняем объекты данными
    private void initializeData() {
        numbersList = new ArrayList<>();
        numbersList.add(new Numbers(R.string.one, R.string.one1, R.drawable.one));
        numbersList.add(new Numbers(R.string.two, R.string.two2, R.drawable.two));
        numbersList.add(new Numbers(R.string.three, R.string.three3, R.drawable.three));
        numbersList.add(new Numbers(R.string.four, R.string.four4, R.drawable.four));
        numbersList.add(new Numbers(R.string.five, R.string.five5, R.drawable.five));
        numbersList.add(new Numbers(R.string.six, R.string.six6, R.drawable.six));
        numbersList.add(new Numbers(R.string.seven, R.string.seven7, R.drawable.seven));
        numbersList.add(new Numbers(R.string.eight, R.string.eight8, R.drawable.eight));
        numbersList.add(new Numbers(R.string.nine, R.string.nine9, R.drawable.nine));
    }


    private void initializeAdapter() {
        RVAdapter adapter = new RVAdapter(numbersList);
        rv.setAdapter(adapter);
    }
}
