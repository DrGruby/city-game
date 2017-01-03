package ninja.drgruby8.citygame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by adam on 1/3/17.
 */
public class MainActivity extends Activity {
    public final static String EXTRA_MESSAGE = "ninja.drgruby8.citygame.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TODO:
//        - check if user are logged
//        - add view to choose login method
        setContentView(R.layout.activity_main);
    }

    /**
     * login by google
     */
    public void loginByGoogle(View view) {
        //TODO:
        //make login by google
    }

    /**
     * login by old way
     */
    public void loginByOldWay(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
