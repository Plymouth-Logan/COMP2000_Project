package com.example.comp2000project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Employee_Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button bookingsButton = findViewById(R.id.btnEmployeeBookings);

        bookingsButton.setOnClickListener (v -> {
            Intent intent = new Intent(Employee_Main_Activity.this, Employee_Bookings_Activity.class);
            startActivity(intent);
        });

        Button requestButton = findViewById(R.id.btnEmployeeRequest);

        requestButton.setOnClickListener (v -> {
            Intent intent = new Intent(Employee_Main_Activity.this, Employee_Requests_Activity.class);
            startActivity(intent);
        });

        Button signoutButton = findViewById(R.id.btn_signoutemployee);

        signoutButton.setOnClickListener (v -> {
            Intent intent = new Intent(Employee_Main_Activity.this, SignIn_Activity.class);
            startActivity(intent);
        });
    }
}