package com.astrocls777.exploraméxico.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.astrocls777.exploraméxico.R;
import com.astrocls777.exploraméxico.model.Municipality;
import java.util.List;

public class MunicipalitiesAdapter extends RecyclerView.Adapter<MunicipalitiesAdapter.MunicipalityViewHolder> {
    private List<Municipality> municipalities;
    private OnMunicipalityClickListener clickListener;

    public interface OnMunicipalityClickListener {
        void onMunicipalityClick(Municipality municipality);
    }

    public MunicipalitiesAdapter(List<Municipality> municipalities, OnMunicipalityClickListener clickListener) {
        this.municipalities = municipalities;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public MunicipalityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_municipality, parent, false);
        return new MunicipalityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MunicipalityViewHolder holder, int position) {
        Municipality municipality = municipalities.get(position);
        holder.bind(municipality, clickListener);
    }

    @Override
    public int getItemCount() {
        return municipalities != null ? municipalities.size() : 0;
    }

    public static class MunicipalityViewHolder extends RecyclerView.ViewHolder {
        private TextView municipalityName;
        private TextView municipalityPopulation;
        private TextView municipalityArea;

        public MunicipalityViewHolder(@NonNull View itemView) {
            super(itemView);
            municipalityName = itemView.findViewById(R.id.municipality_name);
            municipalityPopulation = itemView.findViewById(R.id.municipality_population);
            municipalityArea = itemView.findViewById(R.id.municipality_area);
        }

        public void bind(Municipality municipality, OnMunicipalityClickListener clickListener) {
            municipalityName.setText(municipality.getName());
            municipalityPopulation.setText(String.format("Población: %.0f", municipality.getPopulation()));
            municipalityArea.setText(String.format("Área: %.2f km²", municipality.getArea()));
            
            itemView.setOnClickListener(v -> clickListener.onMunicipalityClick(municipality));
        }
    }
}
