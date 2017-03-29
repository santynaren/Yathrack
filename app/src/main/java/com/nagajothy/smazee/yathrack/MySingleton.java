package com.nagajothy.smazee.yathrack;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by SANTHOSH on 4/1/2017.
 */

public class MySingleton {

    private static MySingleton mInstance;
    private RequestQueue requestqueue;
    private static Context context;
    private MySingleton(Context ctx){
        context = ctx;
        requestqueue = getRequestQueue();

    }

    public  RequestQueue getRequestQueue(){
        if(requestqueue == null){
            requestqueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestqueue;
    }

    public static synchronized  MySingleton getInstance(Context context){
        if(mInstance == null){
            mInstance = new MySingleton(context);

        }
        return mInstance;
    }
    public <T>void addToRequestque(Request<T> request)
    {
        requestqueue.add(request);
    }



}
