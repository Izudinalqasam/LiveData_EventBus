package com.example.izudinqasam.livedataexample;

import android.arch.lifecycle.MutableLiveData;

public class User {

    MutableLiveData<String> nama;

    public MutableLiveData<String> getNama() {
        if (nama == null)
            nama = new MutableLiveData<>();
        return nama;
    }

    public void setNama(String nama) {
        this.nama.setValue(nama);
    }
}
