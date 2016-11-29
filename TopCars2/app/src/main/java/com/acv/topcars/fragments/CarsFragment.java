package com.acv.topcars.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.acv.topcars.CarsDetailActivity;
import com.acv.topcars.R;
import com.acv.topcars.adapter.CarsListAdapter;
import com.acv.topcars.api.CarsAPI;
import com.acv.topcars.listener.CarsOnClickListener;
import com.acv.topcars.model.Car;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarsFragment extends Fragment implements Callback<List<Car>> {

    private String tipo;
    protected RecyclerView rvCarros;
    private CarsListAdapter adapter;
    private LinearLayoutManager mLayoutManager;
    private List<Car> cars;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.tipo = getArguments().getString("tipo");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cars, container, false);
        rvCarros = (RecyclerView) view.findViewById(R.id.rvCarros);
        mLayoutManager = new LinearLayoutManager(getActivity());
        rvCarros.setLayoutManager(mLayoutManager);
        rvCarros.setItemAnimator(new DefaultItemAnimator());
        rvCarros.setHasFixedSize(true);
        return view;
    }

    @Override
    public void onActivityCreated (Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        loadCarros();
    }

    private void loadCarros() {
        cars = new ArrayList<>();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.heiderlopes.com.br")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // prepara a chamada no Retrofit 2.0
        CarsAPI carsAPI = retrofit.create(CarsAPI.class);
        Call<List<Car>> call = carsAPI.findBy(tipo);
        //chamada assincrona
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Car>> call, Response<List<Car>> response) {
        adapter = new CarsListAdapter(getContext(), response.body(), onClickListener());
        rvCarros.setAdapter(adapter);
    }

    @Override
    public void onFailure(Call<List<Car>> call, Throwable t) {
        Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
    }

    private CarsOnClickListener onClickListener() {
        return new CarsOnClickListener() {
            @Override
            public void onClickCars(View view, int idx) {
                Car car = adapter.getItem(idx);
                Intent intent = new Intent(getContext(), CarsDetailActivity.class);
                intent.putExtra("carro", car);
                startActivity(intent);
            }
        };
    }


}
