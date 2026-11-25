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


public class emplyeesmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emplyeesmenu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btemplyeesmybooking = findViewById(R.id.btn_employee_mybooking_button);
        btemplyeesmybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, emplyeesmybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnemplyeesmyprofile = findViewById(R.id.btn_employee_my_employee_profile_button);
        btnemplyeesmyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, emplyeesmyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton btnemplyeesmenubutton = findViewById(R.id.btn_employee_menu_menu_button);
        btnemplyeesmenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, emplyeesmenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnemplyeeshomepage = findViewById(R.id.btn_employee_menu_home_button);
        btnemplyeeshomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, employeehomepage.class);
                startActivity(intent);
            }
        });

        ImageButton btnemplyeesmybooking = findViewById(R.id.btn_employee_menu_my_booking);
        btnemplyeesmybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, emplyeesmybooking.class);
                startActivity(intent);
            }
        });
        ImageButton btnemplyeesnewbooking = findViewById(R.id.btn_employee_menu_new_booking);
        btnemplyeesnewbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, emplyeenewbooking.class);
                startActivity(intent);
            }
        });

        ImageButton btncancelbooking = findViewById(R.id.btn_employee_menu_cancel_booking);
        btncancelbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(emplyeesmenu.this, emplyeescancelbooking.class);
                startActivity(intent);
            }
        });






    }
}