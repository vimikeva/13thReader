package com.thirteenth.v13threader;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    EditText homeSearch;
    TextView homeNotifications;

    TextView homeIconText;
    TextView homeText;
    TextView libraryIconText;
    TextView libraryText;
    TextView storeIconText;
    TextView storeText;
    TextView moreIconText;
    TextView moreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkedXMLJava();
        initialFontXml();

    }

    private void linkedXMLJava () {
        homeSearch = findViewById(R.id.home_search);
        homeNotifications = findViewById(R.id.home_notification);

        homeIconText = findViewById(R.id.home_icon_view);
        homeText = findViewById(R.id.home_view);
        libraryIconText = findViewById(R.id.library_icon_text);
        libraryText = findViewById(R.id.library_text);
        storeIconText = findViewById(R.id.store_icon_text);
        storeText = findViewById(R.id.store_text);
        moreIconText = findViewById(R.id.more_icon_text);
        moreText = findViewById(R.id.more_text);
    }


    private void initialFontXml() {
        Typeface awesome5BrandsRegular = Typeface.createFromAsset(this.getAssets(),
                "fonts/Font Awesome 5 Brands-Regular.otf");
        Typeface awesome5FreeRegular = Typeface.createFromAsset(this.getAssets(),
                "fonts/Font Awesome 5 Free-Regular.otf");
        Typeface awesome5FreeSolid = Typeface.createFromAsset(this.getAssets(),
                "fonts/Font Awesome 5 Free-Solid.otf");
        Typeface segoeUISymbol = Typeface.createFromAsset(this.getAssets(),
                "fonts/Segoe UI Symbol.ttf");

        homeSearch.setTypeface(awesome5BrandsRegular);
        homeNotifications.setTypeface(awesome5FreeRegular);

        homeIconText.setTypeface(awesome5FreeSolid);
        homeText.setTypeface(segoeUISymbol);
        homeIconText.setTextColor(getResources().getColor(R.color.colorAccent));
        homeText.setTextColor(getResources().getColor(R.color.colorAccent));


        libraryIconText.setTypeface(awesome5FreeSolid);
        libraryText.setTypeface(segoeUISymbol);

        storeIconText.setTypeface(awesome5FreeSolid);
        storeText.setTypeface(segoeUISymbol);

        moreIconText.setTypeface(awesome5FreeSolid);
        moreText.setTypeface(segoeUISymbol);
    }


    public void onClickNotification(View view) {
        Toast.makeText(getApplicationContext(),"No implementation", Toast.LENGTH_SHORT).show();
    }

    public void onClickHome(View view) {
        Toast.makeText(getApplicationContext(),"Home", Toast.LENGTH_SHORT).show();
    }

    public void onClickLibrary(View view) {
        Toast.makeText(getApplicationContext(),"Library", Toast.LENGTH_SHORT).show();
    }

    public void onClickStore(View view) {
        Toast.makeText(getApplicationContext(),"Store", Toast.LENGTH_SHORT).show();
    }

    public void onClickMore(View view) {
        Toast.makeText(getApplicationContext(),"More", Toast.LENGTH_SHORT).show();
    }
}
