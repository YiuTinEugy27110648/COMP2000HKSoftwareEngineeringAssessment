package uk.ac.plymouth.comp2000hk.comp2000hksoftwareengineeringassessment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;


public class managerhomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_managerhomepage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnmenutohomepage = findViewById(R.id.btn_managermenuhomebutton);
        btnmenutohomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, managerhomepage.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermenubutton = findViewById(R.id.btn_managermenubutton);
        btnmanagermenubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, managermenu.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermybooking = findViewById(R.id.btn_managermybookingbutton);
        btnmanagermybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, managermenumybooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagermyprofile = findViewById(R.id.btn_managermyprofile);
        btnmanagermyprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, managermenumyprofile.class);
                startActivity(intent);
            }
        });

        ImageButton btnmanagernewbooking = findViewById(R.id.btn_managernewbooking);
        btnmanagernewbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, managermybookingselectroom.class);
                startActivity(intent);
            }
        });

        ImageButton btncancelbooking = findViewById(R.id.btn_manager_cancel_booking);
        btncancelbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_cancelbooking.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesA = findViewById(R.id.btn_roomstates_a);
        btnRoomStatesA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, managerroomstatesupcominga.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesb = findViewById(R.id.btn_roomstates_b);
        btnRoomStatesb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_b.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesc = findViewById(R.id.btn_roomstates_c);
        btnRoomStatesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_c.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesd = findViewById(R.id.btn_roomstates_d);
        btnRoomStatesd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_d.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatese = findViewById(R.id.btn_roomstates_e);
        btnRoomStatese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_e.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesf = findViewById(R.id.btn_roomstates_f);
        btnRoomStatesf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_f.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesg = findViewById(R.id.btn_roomstates_g);
        btnRoomStatesg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_g.class);
                startActivity(intent);
            }
        });

        ImageButton btnRoomStatesh = findViewById(R.id.btn_roomstates_h);
        btnRoomStatesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(managerhomepage.this, manager_roomstates_upcoming_h.class);
                startActivity(intent);
            }
        });











    }
}