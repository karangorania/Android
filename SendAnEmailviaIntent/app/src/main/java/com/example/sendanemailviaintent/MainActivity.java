package com.example.sendanemailviaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sendanemailviaintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.emailAddress.getText().toString();
                String subject = binding.subject.getText().toString();
                String message = binding.message.getText().toString();

                String[] addresses = email.split(",");

                Intent intent = new Intent (Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,addresses);
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,message);

                if (intent.resolveActivity(getPackageManager()) != null){

                    startActivity(intent);

                }else {

                    Toast.makeText(MainActivity.this, "No app is Installed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}