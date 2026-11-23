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

public class employeehomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employeehomepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnemplyeesmybooking = findViewById(R.id.btn_employee_menu_home_button);
        btnemplyeesmybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(employeehomepage.this, employeehomepage.class);
                startActivity(intent);
            }
        });

        ImageButton btnemplyeesmenubutton = findViewById(R.id.btn_employee_menu_menu_button);
        btnemplyeesmenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(employeehomepage.this, emplyeesmenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnemployeemybooking = findViewById(R.id.btn_employee_mybooking_button);
        btnemployeemybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(employeehomepage.this, emplyeesmybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnemplyeesmyprofile = findViewById(R.id.btn_employee_my_employee_profile_button);
        btnemplyeesmyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(employeehomepage.this, emplyeesmyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton newbooking = findViewById(R.id.btn_employee_new_booking);
        newbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(employeehomepage.this, emplyeenewbooking.class);
                startActivity(intent);
            }
        });

        ImageButton cancelbooking = findViewById(R.id.btn_employee_cancel_booking);
        cancelbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(employeehomepage.this, emplyeescancelbooking.class);
                startActivity(intent);
            }
        });




    }
}