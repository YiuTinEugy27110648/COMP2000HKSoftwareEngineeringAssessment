package uk.ac.plymouth.comp2000hk.comp2000hksoftwareengineeringassessment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class manager_roomstates_upcoming_d extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_manager_roomstates_upcoming_d);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnmanagermybooking = findViewById(R.id.btn_managermybookingbutton);
        btnmanagermybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manager_roomstates_upcoming_d.this, managermenumybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermyprofile = findViewById(R.id.btn_managermyprofile);
        btnmanagermyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manager_roomstates_upcoming_d.this, managermenumyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermenubutton = findViewById(R.id.btn_managermenubutton);
        btnmanagermenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manager_roomstates_upcoming_d.this, managermenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnmenutohomepage = findViewById(R.id.btn_managermenuhomebutton);
        btnmenutohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manager_roomstates_upcoming_d.this, managerhomepage.class);
                startActivity(intent);
            }
        });

        ImageButton btnback = findViewById(R.id.btn_select_datetime_select_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manager_roomstates_upcoming_d.this, Viewbooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnroom= findViewById(R.id.btn_select_booking_a);
        btnroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(manager_roomstates_upcoming_d.this, bookingroom_selectroom_d_b_acceptorreject.class);
                startActivity(intent);
            }
        });


    }
}