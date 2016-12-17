package com.acv.times.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vinicius.castro on 11/19/2016.
 */

public class    Times implements Parcelable{

    @SerializedName("nome")
    private String name;

    @SerializedName("estado")
    private String estado;

    @SerializedName("escudo")
    private String escudo;

    @SerializedName("anofundacao")
    private String anofundacao;

    protected Times(Parcel in) {
        name = in.readString();
        estado = in.readString();
        escudo = in.readString();
        anofundacao = in.readString();
    }

    public static final Creator<Times> CREATOR = new Creator<Times>() {
        @Override
        public Times createFromParcel(Parcel in) {
            return new Times(in);
        }

        @Override
        public Times[] newArray(int size) {
            return new Times[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getAnofundacao() {
        return anofundacao;
    }

    public void setAnofundacao(String anofundacao) {
        this.anofundacao = anofundacao;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(estado);
        parcel.writeString(escudo);
        parcel.writeString(anofundacao);
    }
}
