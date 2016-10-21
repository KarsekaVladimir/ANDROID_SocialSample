package com.econcalendar.econcalendar;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.FileNotFoundException;
//import java.net.SocketException;
//import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.FileOutputStream;
//import java.io.FileInputStream;
import java.io.File;
import java.net.URLConnection;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TakeXML();
        GoToParsing();
        ProgressFragment pr= new ProgressFragment();
        //pr.startActivity(Intent i);

    }

    public void GoToParsing() {

        Intent i = new Intent(MainActivity.this, XmlParsingActivity.class);
        startActivity(i);
    }


    /*public void TakeXML() {
        try {
            URL url = new URL("http://www.forexfactory.com/ffcal_week_this.xml");
            URLConnection conexion = url.openConnection();
            conexion.connect();
            int lenghtOfFile = conexion.getContentLength();
            InputStream is = url.openStream();
            File testDirectory = new File(Environment.getExternalStorageDirectory() + "/storage/sdcard0/Download");
            if (!testDirectory.exists()) {
                testDirectory.mkdir();
            }
            FileOutputStream fos = new FileOutputStream(testDirectory + "/zip.zip");
            byte data[] = new byte[1024];
            int count = 0;
            long total = 0;
            int progress = 0;
            while ((count = is.read(data)) != -1) {
                total += count;
                int progress_temp = (int) total * 100 / lenghtOfFile;
                if (progress_temp % 10 == 0 && progress != progress_temp) {
                    progress = progress_temp;
                }
                fos.write(data, 0, count);
            }
            is.close();
            fos.close();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
*/
}
