package android.galileo.edu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Andree Vasquez on 17/07/2016.
 */
public class SignAdapter extends BaseAdapter {

    private Context context;

    public SignAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Sign.ITEMS.length;
    }

    @Override
    public Sign getItem(int position) {
        return Sign.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenCoche = (ImageView) view.findViewById(R.id.imagen_seña);
        TextView nombreCoche = (TextView) view.findViewById(R.id.nombre_seña);

        final Sign item = getItem(position);
        Glide.with(imagenCoche.getContext())
                .load(item.getIdDrawable())
                .into(imagenCoche);

        nombreCoche.setText(item.getNombre());

        return view;
    }

}
