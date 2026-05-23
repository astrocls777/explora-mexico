package com.astrocls777.exploraméxico.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.astrocls777.exploraméxico.R;
import com.astrocls777.exploraméxico.model.State;
import java.util.List;

public class StatesAdapter extends RecyclerView.Adapter<StatesAdapter.StateViewHolder> {
    private List<State> states;
    private OnStateClickListener clickListener;

    public interface OnStateClickListener {
        void onStateClick(State state);
    }

    public StatesAdapter(List<State> states, OnStateClickListener clickListener) {
        this.states = states;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public StateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_state, parent, false);
        return new StateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StateViewHolder holder, int position) {
        State state = states.get(position);
        holder.bind(state, clickListener);
    }

    @Override
    public int getItemCount() {
        return states != null ? states.size() : 0;
    }

    public static class StateViewHolder extends RecyclerView.ViewHolder {
        private TextView stateName;
        private TextView stateCapital;
        private TextView municipalitiesCount;

        public StateViewHolder(@NonNull View itemView) {
            super(itemView);
            stateName = itemView.findViewById(R.id.state_name);
            stateCapital = itemView.findViewById(R.id.state_capital);
            municipalitiesCount = itemView.findViewById(R.id.municipalities_count);
        }

        public void bind(State state, OnStateClickListener clickListener) {
            stateName.setText(state.getName());
            stateCapital.setText("Capital: " + state.getCapital());
            municipalitiesCount.setText(state.getMunicipalitiesCount() + " municipios");
            
            itemView.setOnClickListener(v -> clickListener.onStateClick(state));
        }
    }
}
