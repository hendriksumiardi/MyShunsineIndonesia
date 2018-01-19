package com.example.user.myshunsineindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by USER on 1/19/2018.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.weather_item_image)
    ImageView weatherImage;
    @BindView(R.id.weather_item_date)
    TextView weatherDate;
    @BindView(R.id.weather_item_desc)
    TextView weatherDesc;
    @BindView(R.id.weather_item_temp)
    TextView weatherTemp;
    private final WeatherCallback callback;
    private static final int weatherLayout = R.layout.activity_weather_view_holder;

    public WeatherViewHolder(View itemView, WeatherCallback callback) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        this.callback = callback;

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        callback.onWeatherClick(this);
    }

    public interface WeatherCallback {
        void onWeatherClick(WeatherViewHolder holder);
    }

    public ImageView getWeatherImage() {
        return weatherImage;
    }

    public TextView getWeatherDate() {
        return weatherDate;
    }

    public TextView getWeatherDesc() {
        return weatherDesc;
    }

    public TextView getWeatherTemp() {
        return weatherTemp;
    }

    public static int getWeatherLayout() {
        return weatherLayout;
    }
}
