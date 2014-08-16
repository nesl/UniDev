package edu.ucla.nesl.flowengine.util;

import android.util.Log;

import com.ucla.nesl.aidl.Device;
import com.ucla.nesl.lib.UniversalSensorNameMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Utils {

    public static void printDeviceList(String tag, ArrayList<Device> devList) {
        if (devList == null || devList.isEmpty()) {
            Log.i(tag, "No devices");
            return;
        }

        Log.i(tag, "Current device list:");
        for (Device device : devList) {
            Log.i(tag, device.getDevID());
            for (Integer i : device.getSensorList())
                Log.i(tag, "SenorID: " + i + ", Name:" + UniversalSensorNameMap.getName(i) +
                        ", Rates" + device.getRateList(i) + ", BundleSize: " + device.getBundleSizeList(i));
        }
    }

    public static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }
}
