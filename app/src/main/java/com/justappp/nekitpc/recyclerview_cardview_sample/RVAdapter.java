package com.justappp.nekitpc.recyclerview_cardview_sample;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.NumberViewHolder> {

    public static class NumberViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView cv;
        TextView numberName;
        TextView numberSymbol;
        ImageView numberPicture;

        NumberViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            numberName = (TextView) itemView.findViewById(R.id.number_name);
            numberSymbol = (TextView) itemView.findViewById(R.id.number_symbol);
            numberPicture = (ImageView) itemView.findViewById(R.id.number_picture);

            itemView.setOnClickListener(this);
        }


        // Обработчик нажатия на cardView
        @Override
        public void onClick(View v) {

            switch (getAdapterPosition()) {
                case 0:

                    break;
                case 1:

                    break;
                case 2:

                    break;
            }
            Log.d("RecyclerView", "Вы щёлкнули на позиции " + (getAdapterPosition() + 1));
        }
    }

    private List<Numbers> numbersList;

    RVAdapter(List<Numbers> numbersList) {
        this.numbersList = numbersList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_activity, viewGroup, false);
        NumberViewHolder nvh = new NumberViewHolder(view);
        return nvh;
    }

    @Override
    public void onBindViewHolder(NumberViewHolder numberViewHolder, int i) {
        numberViewHolder.numberName.setText(numbersList.get(i).name);
        numberViewHolder.numberSymbol.setText(numbersList.get(i).symbol);
        numberViewHolder.numberPicture.setImageResource(numbersList.get(i).picture);
    }

    @Override
    public int getItemCount() {
        return numbersList.size();
    }
}