package com.example.comp2000project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Make_Booking_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_make_booking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton backButton = findViewById(R.id.imgbtn_back_makebooking);

        backButton.setOnClickListener (v -> {
            Intent intent = new Intent(Make_Booking_Activity.this, MainActivity.class);
            startActivity(intent);
        });

        Button makebookingButton = findViewById(R.id.btn_make_booking);

        makebookingButton.setOnClickListener (v -> {
            Intent intent = new Intent(Make_Booking_Activity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}