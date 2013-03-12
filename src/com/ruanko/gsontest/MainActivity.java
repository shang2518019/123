package com.ruanko.gsontest;

import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	
	String string="{\"shang\":\"sss\",\"data\":{\"name\":\"shangjiarong\",\"age\":\"14\"}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
       CommonResult commonResult =  gson.fromJson(string, CommonResult.class);
       System.out.println("shang======"+commonResult.getShang());
       System.out.println("8888==="+commonResult.getData().toString());
       User user =  gson.fromJson(commonResult.getData().toString(), User.class);
       
       System.out.println("name==="+user.getName());
                
    }


    
}
