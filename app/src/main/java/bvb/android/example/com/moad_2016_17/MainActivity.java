package bvb.android.example.com.moad_2016_17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String LOG_CAT= MainActivity.class.getSimpleName();
    AppCompatActivity thisActivityReference;
    Button fourthActivityButtonRef;
    //test line from cabin pc for GitHub
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_CAT, "onCreate()");
        super.onCreate(savedInstanceState);

        thisActivityReference=this;

        setContentView(R.layout.activity_main3);
        Button fifthButtonRef=
                (Button)findViewById(R.id.fifthActBtnId);
        fifthButtonRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=
                        new Intent(thisActivityReference,
                                fifth_Activity.class);
                startActivity(intent);
            }
        });
        Button loginButtonRef=
                (Button)findViewById(R.id.loginButtonId);
        loginButtonRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=
                        new Intent(thisActivityReference,
                                loginActivity.class);
                startActivity(intent);
            }
        });

        /*setContentView(R.layout.activity_main2);
        fourthActivityButtonRef=(Button)findViewById(R.id.fourthActBtnId);
        fourthActivityButtonRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(thisActivityReference,fourth_Activity.class);
                startActivity(intent);
            }
        });*/

//        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_CAT, "onStasrt()");
       /* Intent intent=new Intent(this, secondActivity.class);
        startActivity(intent);*/


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_CAT, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_CAT, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_CAT, "onDestroy()");
    }
}
