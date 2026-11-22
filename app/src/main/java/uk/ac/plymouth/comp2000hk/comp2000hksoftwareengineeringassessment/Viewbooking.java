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

public class Viewbooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_viewbooking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnselectrooma = findViewById(R.id.btn_v_select_room_a);
        btnselectrooma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, managerroomstatesupcominga.class);
                startActivity(intent);
            }
        });
        ImageButton btnselectroomb = findViewById(R.id.btn_v_select_room_b);
        btnselectroomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_b.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomc = findViewById(R.id.btn_v_select_room_c);
        btnselectroomc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_c.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomd = findViewById(R.id.btn_v_select_room_d);
        btnselectroomd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_d.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroome = findViewById(R.id.btn_v_select_room_e);
        btnselectroome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_e.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomf = findViewById(R.id.btn_v_select_room_f);
        btnselectroomf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_f.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomg = findViewById(R.id.btn_v_select_room_g);
        btnselectroomg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_g.class);
                startActivity(intent);
            }
        });

        ImageButton btnselectroomh = findViewById(R.id.btn_v_select_room_h);
        btnselectroomh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, manager_roomstates_upcoming_h.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermybooking = findViewById(R.id.btn_managermybookingbutton);
        btnmanagermybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, managermenumybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermyprofile = findViewById(R.id.btn_managermyprofile);
        btnmanagermyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, managermenumyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermenubutton = findViewById(R.id.btn_managermenubutton);
        btnmanagermenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, managermenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnmenutohomepage = findViewById(R.id.btn_managermenuhomebutton);
        btnmenutohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Viewbooking.this, managerhomepage.class);
                startActivity(intent);
            }
        });

    }
}