package my.edu.tarc.lab22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText editTextName, editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    public void saveProfile(View view){
        //TODO: capture data from screen
        String name, email;
        name = editTextName.getText().toString();
        email = editTextEmail.getText().toString();

        //TODO: pass data to main activity
        Intent intent = getIntent();
        intent.putExtra(MainActivity.PROFILE_NAME,name);
        intent.putExtra(MainActivity.PROFILE_EMAIL,email);
        setResult(RESULT_OK,intent);

        //TODO: terminate this activity
        finish();


    }
}
