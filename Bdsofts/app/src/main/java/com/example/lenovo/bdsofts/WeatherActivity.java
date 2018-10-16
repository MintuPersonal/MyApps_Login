package com.example.lenovo.bdsofts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        FindWeather();
    }

    public void FindWeather(){

        String Url="https://api.github.com/repos/octocat/Hello-World";
        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, Url,null, new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        JSONArray jsonArray = response.getJSONArray("owner");
                        String name = jsonArray.getString(1);
                        TextView cityName = findViewById(R.id.tvCityName);
                        cityName.append(name);
//                        for (int i =0; i<jsonArray.length(); i++){
//                            JSONObject jsonObject = jsonArray.getJSONObject(i);
//                            String description = jsonObject.getString("description");
//                            String Location = jsonObject.getString("Location");
//                           TextView cityName = findViewById(R.id.tvCityName);
//                           cityName.append("description");
//                        };
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
            });
        }
}
