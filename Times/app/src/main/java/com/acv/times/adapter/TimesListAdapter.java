package com.acv.times.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.acv.times.listener.TimesOnClickListener;
import com.acv.times.model.Times;
import com.acv.topcars.R;
import com.acv.topcars.listener.CarsOnClickListener;
import com.acv.topcars.model.Car;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by vinicius.castro on 11/19/2016.
 */

public class TimesListAdapter extends RecyclerView.Adapter<TimesListAdapter.TimesViewHolder> {

    private Context context;
    private List<Times> times;
    private TimesOnClickListener clickListener;

    public TimesListAdapter(Context context, List<Times> times, TimesOnClickListener onClickListener) {
        this.context = context;
        this.times = times;
        this.clickListener = onClickListener;
    }

    @Override
    public TimesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cars_row, parent, false);
        return new TimesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TimesViewHolder holder, final int position) {
        holder.tvName.setText(times.get(position).getName());
        holder.tvDescription.setText(times.get(position).getEstado());
        Picasso.with(context).load(times.get(position).getEscudo())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivTimes);
        if (clickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    clickListener.onClickCars(holder.itemView, position);
                }
            });

        }
    }

    public Times getItem(int position) {
        return times.get(position);
    }

    @Override
    public int getItemCount() {
        return this.times.size();
    }

    public static class TimesViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvDescription;
        ImageView ivTimes;

        public TimesViewHolder(View view) {
            super(view);
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvDescription = (TextView) view.findViewById(R.id.tvDescription);
            ivTimes = (ImageView) view.findViewById(R.id.ivTimes);

        }
    }
}
