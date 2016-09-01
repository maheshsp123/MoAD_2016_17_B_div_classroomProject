package bvb.android.example.com.moad_2016_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText useerIdET_ref;
    EditText passwd_ref;
    Button submitBtn_ref;
    UserCrendentials[] userArray=new UserCrendentials[4];
    String LOG_CAT=loginActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        for (int a=0;a<userArray.length;a++)
            userArray[a]=new UserCrendentials("aaa"+a,"bbb"+a );
        useerIdET_ref=(EditText)findViewById(R.id.userNameEditTextId);
        passwd_ref=(EditText)findViewById(R.id.passwordEditTextId);
        submitBtn_ref=(Button) findViewById(R.id.loginSubmitButtonId);
        submitBtn_ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=useerIdET_ref.getText().toString();
                String pswd=passwd_ref.getText().toString();
                boolean flag=false;
                for (int a=0;a<userArray.length;a++)
                {
                    if(userName.equals(userArray[a].userName)  &&
                            pswd.equals(userArray[a].passwd) )
                    {
                        flag=true;
                        break;

                    }
                }
                if (flag)
                Toast.makeText
                        (loginActivity.this, "successfull login", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText
                            (loginActivity.this, "login failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selected_item= item.getItemId();
        if(selected_item==R.id.profileId)
        {
            Log.i(LOG_CAT,"profile menu item selected");
            Toast.makeText
                    (loginActivity.this, "profile menu item",
                            Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
