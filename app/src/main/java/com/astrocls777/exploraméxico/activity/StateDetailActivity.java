package com.astrocls777.exploraméxico.activity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.astrocls777.exploraméxico.R;
import com.astrocls777.exploraméxico.adapter.MunicipalitiesAdapter;
import com.astrocls777.exploraméxico.model.State;
import com.astrocls777.exploraméxico.util.DataManager;

public class StateDetailActivity extends AppCompatActivity {
    private State state;
    private RecyclerView municipalitiesRecyclerView;
    private MunicipalitiesAdapter adapter;
    private TextView stateInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_detail);
        
        String stateId = getIntent().getStringExtra("state_id");
        if (stateId != null) {
            state = DataManager.getStateById(this, stateId);
            displayStateDetails();
        }
    }

    private void displayStateDetails() {
        if (state != null) {
            setSupportActionBar(findViewById(R.id.toolbar));
            setTitle(state.getName());
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
            
            stateInfo = findViewById(R.id.state_info);
            String info = String.format("Capital: %s\nPoblación: %.0f\nÁrea: %.2f km²\nRegión: %s",
                    state.getCapital(),
                    state.getPopulation(),
                    state.getArea(),
                    state.getRegion());
            stateInfo.setText(info);
            
            municipalitiesRecyclerView = findViewById(R.id.municipalities_recyclerview);
            municipalitiesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            
            if (state.getMunicipalities() != null && !state.getMunicipalities().isEmpty()) {
                adapter = new MunicipalitiesAdapter(state.getMunicipalities(), municipality -> {
                    // TODO: Implementar detalle de municipio
                });
                municipalitiesRecyclerView.setAdapter(adapter);
            }
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
