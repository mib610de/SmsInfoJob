package com.fastcode.smsinfojobv2;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


public class RequestApiKeyAsyncTask extends AsyncTask<UserSmsInfo, Void, Boolean> {

    private Exception exception;


    protected Boolean doInBackground(UserSmsInfo... user) {

        List<String> records = new ArrayList<String>();
        Gson g = new Gson();
        try {

            // Step2: Now pass JSON File Data to REST Service
            try {
                URL url = new URL(Const.ip_remote + "/Menu/api/smsinfouser/requestApiKey");
                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setConnectTimeout(10000);
                connection.setReadTimeout(10000);
                OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
                out.write(g.toJson(user));
                out.close();

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                records = new ArrayList<String>();
                String line;
                while ((line = in.readLine()) != null) {
                    records.add(line);
                }

                Log.i("OcrRecognizeAsyncTask", "\nCrunchify REST Service Invoked Successfully..");
                in.close();
            } catch (Exception e) {
                Log.e("OcrRecognizeAsyncTask", "\nError while calling Crunchify REST Service");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Boolean.TRUE;
    }

}