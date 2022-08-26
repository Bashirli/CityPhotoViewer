package com.bashirli.cityphotoviewer;

import java.io.Serializable;

public class Data implements Serializable {
    String seher_adi;
    String olke_adi;
    int sekil_id;

    public Data(String seher_adi, String olke_adi, int sekil_id) {
        this.seher_adi = seher_adi;
        this.olke_adi = olke_adi;
        this.sekil_id = sekil_id;
    }
}
