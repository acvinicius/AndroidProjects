package com.acv.topcars.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.acv.topcars.R;
import com.acv.topcars.listener.CarsOnClickListener;
import com.acv.topcars.model.Car;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by vinicius.castro on 11/19/2016.
 */

public class CarsListAdapter extends RecyclerView.Adapter<CarsListAdapter.CarsViewHolder> {

    private Context context;
    private List<Car> cars;
    private CarsOnClickListener clickListener;

    public CarsListAdapter(Context context, List<Car> cars, CarsOnClickListener onClickListener) {
        this.context = context;
        this.cars = cars;
        this.clickListener = onClickListener;
    }

    @Override
    public CarsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cars_row, parent, false);
        return new CarsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CarsViewHolder holder, final int position) {
        holder.tvName.setText(cars.get(position).getName());
        holder.tvDescription.setText(cars.get(position).getDescription());
        Picasso.with(context).load(cars.get(position).getPhoto())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivCar);
        if (clickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.onClickCars(holder.itemView, position);
                }
            });

        }
    }

    public Car getItem(int position) {
        return cars.get(position);
    }

    @Override
    public int getItemCount() {
        return this.cars.size();
    }

    public static class CarsViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvDescription;
        ImageView ivCar;

        public CarsViewHolder (View view) {
            super(view);
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvDescription = (TextView) view.findViewById(R.id.tvDescription);
            ivCar = (ImageView) view.findViewById(R.id.ivCar);

        }
    }
}
