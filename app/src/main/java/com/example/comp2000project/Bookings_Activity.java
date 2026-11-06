package com.example.comp2000project;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bookings_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bookings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button makeBookingButton = findViewById(R.id.btn_make_booking);

        makeBookingButton.setOnClickListener (v -> {
            Intent intent = new Intent(Bookings_Activity.this, Make_Booking_Activity.class);
            startActivity(intent);
        });

        ImageButton backButton = findViewById(R.id.imgbtn_Back);

        backButton.setOnClickListener (v -> {
            Intent intent = new Intent(Bookings_Activity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}