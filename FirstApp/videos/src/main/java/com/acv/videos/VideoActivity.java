package com.acv.videos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class VideoActivity extends AppCompatActivity {

    private ListView listavideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

//        listavideos = (ListView) findViewById((R.id.listVideo));
//        List<Video> lista = VideoDAO.listar();

//        ListAdapter adapter = new ArrayAdapter<Video>(this, R.layout.support_simple_spinner_dropdown_item,
//                R.layout.activity_video, lista);

//        listavideos.setAdapter(adapter);;
    }
}
