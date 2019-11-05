package co.edu.unal.se1.presentation.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.UserController;
import co.edu.unal.se1.dataAccess.model.User;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import co.edu.unal.se1.R;
import co.edu.unal.se1.businessLogic.controller.UserController;
import co.edu.unal.se1.dataAccess.model.User;
import co.edu.unal.se1.dataAccess.repository.UserRepository;

public class Main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        final TextInputEditText idInput = findViewById(R.id.id);
        final TextInputEditText nameInput = findViewById(R.id.name);
        final TextInputEditText balanceInput = findViewById(R.id.balance);

        Button createButton = findViewById(R.id.createButton);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });



    }

}




