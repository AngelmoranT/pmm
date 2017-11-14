package com.example.angval.spinnerpersona;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Titular[] datos = new Titular[]{
            new Titular("La casa de los horrores","Pelicula basada en un atracción que pagaras por entrar y rezaras por salir", R.drawable.img1),
            new Titular("Las colinas tienen ojos","Las pruebas nucleares atormentan a el publo minero del desierto, niegasn a salir de sus hogares...", R.drawable.img2),
            new Titular("Freaks","La mayor atracción de los horrores", R.drawable.img3)
    };

    @Override
    protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorTitulares adaptador = new AdaptadorTitulares(this);
        ListView LstOpciones = (ListView)findViewById(R.id.LstOpciones);
        LstOpciones.setAdapter(adaptador);


        /*LstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemCLick(AdapterView arg0, View arg1, int position,long id) {
                String mensaje = "Titulo" + datos[position].getTitulo() + ".Subtitulo:" + datos[position].getSubtitulo();
                Toast.makeText(getApplicationContext(),mensaje, Toast.LENGTH_LONG).show();
            }*/
        LstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public  void onItemClick(AdapterView argO, View arg1, int position, long id){
                String mensaje = "Titulo:"+datos[position].getTitulo()+".Subtitulo:"+datos[position].getSubtitulo();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();

    }});
}
    public class AdaptadorTitulares extends ArrayAdapter {
        Activity context;
        AdaptadorTitulares(Activity context){
            super(context, R.layout.listitem_titular, datos);
            this.context = context;
        }

        public View getView(int i, View convertView, ViewGroup parent){

            View item = convertView;
            ViewHolder holder;

            if(item == null){
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_titular, null);

            holder = new ViewHolder();
            holder.titulo = (TextView)item.findViewById(R.id.ivlTitulo);
            holder.subtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
            item.setTag(holder);
        }
        else
        { holder = (ViewHolder)item.getTag(); }
        holder.titulo.setText(datos[position].getTitulo());
        holder.subtitulo.setText(datos[position].getSubtitulo());
        holder.foto.setBackground(getDrawable(datos[i].getImagen());

        return (item);



            TextView lblTitulo = (TextView) item.findViewById(R.id.tvTitulo);
            lblTitulo.setText(datos[i].getTitulo());

            TextView lblSubtitulo =(TextView) item.findViewById(R.id.tvSubtitulo);
            lblSubtitulo.setText(datos[i].getSubtitulo());

            ImageView imagen = (ImageView) item.findViewById(R.id.ivlImagen);
            imagen.setBackground(getDrawable(datos[i].getImagen()));
            return (item);
        }
    }
}
