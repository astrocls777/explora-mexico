package com.astrocls777.exploraméxico.util;

import android.content.Context;
import com.astrocls777.exploraméxico.model.State;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DataManager {
    private static final String STATES_FILE = "states_data.json";

    public static List<State> loadStatesFromAssets(Context context) {
        try {
            InputStream inputStream = context.getAssets().open(STATES_FILE);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            String jsonString = new String(buffer, StandardCharsets.UTF_8);
            
            Gson gson = new Gson();
            Type type = new TypeToken<List<State>>(){}.getType();
            return gson.fromJson(jsonString, type);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static State getStateById(Context context, String stateId) {
        List<State> states = loadStatesFromAssets(context);
        if (states != null) {
            for (State state : states) {
                if (state.getId().equals(stateId)) {
                    return state;
                }
            }
        }
        return null;
    }
}
