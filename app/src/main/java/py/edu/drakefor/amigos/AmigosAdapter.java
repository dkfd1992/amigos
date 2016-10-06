package py.edu.drakefor.amigos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by LUIS on 05/10/2016.
 */
public class AmigosAdapter extends BaseAdapter {
    private List<Amigo> amigoss;
    private Context context;

    public AmigosAdapter(List<Amigo> amigoss, Context context) {
        this.amigoss = amigoss;
        this.context = context;
    }

    @Override
    public int getCount() {
        return amigoss.size();
    }

    @Override
    public Object getItem(int position) {
        return amigoss.get(position);
    }

    @Override
    public long getItemId(int position) {
        return amigoss.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.activity_main, null);
        }

        Amigo c = amigoss.get(position);

        TextView textViewUsuario = (TextView) v.findViewById(R.id.textViewUsuario);
        textViewUsuario.setText(c.getNombre());

        TextView textViewEmail = (TextView) v.findViewById(R.id.textViewEmail);
        textViewEmail.setText(c.getEmail());

       return null;
    }
}



