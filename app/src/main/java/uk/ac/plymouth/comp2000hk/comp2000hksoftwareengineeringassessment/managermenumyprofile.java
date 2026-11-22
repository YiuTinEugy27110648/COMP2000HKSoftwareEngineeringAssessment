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

public class managermenumyprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_managermenumyprofile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnmanagermybooking = findViewById(R.id.btn_managermybookingbutton);
        btnmanagermybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermenumyprofile.this, managermenumybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermyprofile = findViewById(R.id.btn_managermyprofile);
        btnmanagermyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermenumyprofile.this, managermenumyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermenubutton = findViewById(R.id.btn_managermenubutton);
        btnmanagermenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermenumyprofile.this, managermenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnmenutohomepage = findViewById(R.id.btn_managermenuhomebutton);
        btnmenutohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermenumyprofile.this, managerhomepage.class);
                startActivity(intent);
            }
        });

        ImageButton btnlogout = findViewById(R.id.btn_select_datetime_select_logout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermenumyprofile.this, secondactivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnbacktomhome = findViewById(R.id.btn_select_datetime_select_back_to_home);
        btnbacktomhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermenumyprofile.this, managerhomepage.class);
                startActivity(intent);
            }
        });


    }
}