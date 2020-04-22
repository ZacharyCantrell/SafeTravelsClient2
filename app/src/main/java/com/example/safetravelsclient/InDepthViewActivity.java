package com.example.safetravelsclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.safetravelsclient.WeatherListActivity;
import com.example.safetravelsclient.models.fields.WeatherTransitionData;
import com.example.safetravelsclient.models.transition.WeatherDataTransition;

public class InDepthViewActivity extends AppCompatActivity {

    String myLocation = "Springdale, AR";
    String myDescription = "Sunny";
    String myWindValue = "NNW 15mph";
    String myPrecipitation = "23%";
    String myHumidity = "24%";
    String myDate = "Mon Feb 02, 2020";
    String myTemperature = "74";
    String myTemperatureHigh = "95";
    String myTemperatureLow = "8";
    WeatherTransitionData weather_data;
    WeatherDataTransition weather_transition;

    Button back_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_depth_view);
        this.back_button = findViewById(R.id.backButton);


        //button = findViewById(R.id.directionButton);

        this.back_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), WeatherListActivity.class));
                //startActivityOnClick(view);
            }
        });
        //this.weather_data = this.getIntent().getParcelableExtra(this.getString(R.string.intent_weather_data));
        this.weather_transition = this.getIntent().getParcelableExtra(this.getString(R.string.intent_weather_data));
        this.weather_data = this.weather_transition.getMarkerData();
        this.setLocation(this.weather_data.getLocation());
        this.setWeatherDescription(this.weather_data.getDescription());
        this.setWind(this.weather_data.getWindVelocity());
        this.setPrecipitation(this.weather_data.getPrecipitation());
        this.setHumidity(this.weather_data.getHumidity());
        this.setDate(myDate);
        this.setTemperature(this.weather_data.getTemperature());
        this.setTemperatureHigh(this.weather_data.getTemperatureHigh());
        this.setTemperatureLow(this.weather_data.getTemperatureLow());

    }


    public void setLocation(String myLocation){
        TextView location = findViewById(R.id.location);
        location.setText(myLocation);
    }

    public void setWeatherDescription(String myDescription){
        TextView weatherDescription = findViewById(R.id.weatherDescription);
        weatherDescription.setText(myDescription);
    }

    public void setWind(String myWind){
        TextView windValue = findViewById(R.id.windValue);
        windValue.setText(myWind);
    }

    public void setHumidity(String myHumidity){
        TextView humidity = findViewById(R.id.humidityValue);
        humidity.setText(myHumidity);
    }

    public void setPrecipitation(String myPrecipitation){
        TextView precipitation = findViewById(R.id.percipitationValue);
        precipitation.setText(myPrecipitation);
    }

    public void setDate(String myDate){
        TextView date = findViewById(R.id.date);
        date.setText(myDate);
    }

    public void setTemperature(String myTemperature){
        TextView temperature = findViewById(R.id.temperatureValue);
        temperature.setText(myTemperature);
    }

    public void setTemperatureHigh(String myTemperature){
        TextView temperatureHigh = findViewById(R.id.highTemperature);
        temperatureHigh.setText(myTemperature);
    }

    public void setTemperatureLow(String myTemperature){
        TextView temperatureLow = findViewById(R.id.lowTemperature);
        temperatureLow.setText(myTemperature);
    }
}


