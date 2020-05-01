//********************************
//Written By William Henness
//********************************

package com.example.safetravelsclient.models.interfaces;

import org.json.JSONException;
import org.json.JSONObject;

public interface VolleyCallback {
    void onSuccess(JSONObject result) throws JSONException;
}
