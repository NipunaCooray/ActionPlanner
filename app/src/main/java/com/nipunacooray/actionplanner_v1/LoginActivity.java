package com.nipunacooray.actionplanner_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void startCategoryActivity(View view){
        Intent intent = new Intent(this, CatalogActivity.class);
        startActivity(intent);
    }

}
