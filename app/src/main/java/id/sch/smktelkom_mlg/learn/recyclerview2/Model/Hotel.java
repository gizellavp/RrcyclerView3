package id.sch.smktelkom_mlg.learn.recyclerview2.Model;

import android.graphics.drawable.Drawable;
/**
 * Created by asus on 12/7/2016.
 */
public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}

