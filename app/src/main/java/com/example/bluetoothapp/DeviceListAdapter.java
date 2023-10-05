package com.example.bluetoothapp;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DeviceListAdapter extends ArrayAdapter<BluetoothDevice> {
    private Context mContext;
    private int mLayoutResource;
    private ArrayList<BluetoothDevice> mBTDevices;

    public DeviceListAdapter(Context context, int resource, ArrayList<BluetoothDevice> devices) {
        super(context, resource, devices);
        mContext = context;
        mLayoutResource = resource;
        mBTDevices = devices;
    }

    // Інші методи і логіка класу
}