package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

import com.example.nikhilgupta.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;


/**
 * Created by Nikhil Gupta on 18-12-2016.
 */

public class AsyncJokeDownloader {
    private IDownloadListener downloadListener;
    private static MyApi myApiService = null;
    protected AsyncJokeDownloader( IDownloadListener downloadListener )
    {
        this.downloadListener = downloadListener;
    }

    protected void downloadJoke()
    {
        new EndpointsAsyncTask().execute();
    }
    private class EndpointsAsyncTask extends AsyncTask<Void, Void, String> {
        private Context context;

        @Override
        protected String doInBackground(Void... params) {
            if(myApiService == null) {  // Only do this once
                //Insert IP address of the host machine of the network below.
                MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                        .setRootUrl("http://192.168.43.250:8080/_ah/api/")
                        .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                            @Override
                            public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                                abstractGoogleClientRequest.setDisableGZipContent(true);
                            }
                        });
                // end options for devappserver
                myApiService = builder.build();
            }

            try {
                return myApiService.tellJoke().execute().getData();
            } catch (IOException e) {
                return e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            downloadListener.downloadCompleted(result);
        }
    }
}

interface IDownloadListener {
    void downloadCompleted(String j);
}
