package com.buhotling.animepjdb;

import android.os.Parcel;
import android.os.Parcelable;

public class Anime implements Parcelable {
    private String titulo;
    private String año;
    private String descrip;
    private float rating;

    public Anime(String titulo, String año, String descrip, float rating) {
        this.titulo = titulo;
        this.año = año;
        this.descrip = descrip;
        this.rating = rating;
    }

    protected Anime(Parcel in) {
        titulo = in.readString();
        año = in.readString();
        descrip = in.readString();
        rating = in.readFloat();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(titulo);
        dest.writeString(año);
        dest.writeString(descrip);
        dest.writeFloat(rating);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
