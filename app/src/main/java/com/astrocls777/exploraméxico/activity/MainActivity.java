package com.astrocls777.exploraméxico.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.astrocls777.exploraméxico.R;
import com.astrocls777.exploraméxico.adapter.StatesAdapter;
import com.astrocls777.exploraméxico.model.State;
import com.astrocls777.exploraméxico.util.DataManager;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StatesAdapter adapter;
    private List<State> states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setSupportActionBar(findViewById(R.id.toolbar));
        
        recyclerView = findViewById(R.id.states_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        loadStates();
    }

    private void loadStates() {
        states = DataManager.loadStatesFromAssets(this);
        if (states != null && !states.isEmpty()) {
            adapter = new StatesAdapter(states, this::onStateClick);
            recyclerView.setAdapter(adapter);
        }
    }

    private void onStateClick(State state) {
        Intent intent = new Intent(this, StateDetailActivity.class);
        intent.putExtra("state_id", state.getId());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            // TODO: Implementar AboutActivity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
