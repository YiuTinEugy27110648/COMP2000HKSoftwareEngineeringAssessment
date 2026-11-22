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


public class managermybookingselectroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_managermybookingselectroom);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnselectrooma = findViewById(R.id.btn_selectroom_a);
        btnselectrooma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });
        ImageButton btnselectroomb = findViewById(R.id.btn_selectroom_b);
        btnselectroomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomc = findViewById(R.id.btn_selectroom_c);
        btnselectroomc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomd = findViewById(R.id.btn_selectroom_d);
        btnselectroomd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroome = findViewById(R.id.btn_selectroom_e);
        btnselectroome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomf = findViewById(R.id.btn_selectroom_f);
        btnselectroomf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomg = findViewById(R.id.btn_selectroom_g);
        btnselectroomg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomh = findViewById(R.id.btn_selectroom_h);
        btnselectroomh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, bookingroom_selectroom_selectdatetime.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermybooking = findViewById(R.id.btn_managermybookingbutton);
        btnmanagermybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, managermenumybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermyprofile = findViewById(R.id.btn_managermyprofile);
        btnmanagermyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, managermenumyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermenubutton = findViewById(R.id.btn_managermenubutton);
        btnmanagermenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, managermenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnmenutohomepage = findViewById(R.id.btn_managermenuhomebutton);
        btnmenutohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managermybookingselectroom.this, managerhomepage.class);
                startActivity(intent);
            }
        });



    }
}