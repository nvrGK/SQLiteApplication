package storage.sqliteapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public void Adapter(
            Activity activity, List
            <Data> items)
    {
        this.activity = activity;
        this.items = items;
    }

    public int getCount(){
    return items.size();
    }

    @Override
    public Object getItem(int Location) {
        return items.get(Location)
    }
    @Override
    public long getItemId(int position) {
return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null);
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null);
        convertView = inflater.inflate(R.Layout.list_row, null);
        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView nama = (TextView) convertView.findViewById(R.id.name);
        TextView address = (TextView) convertView.findViewById(R.id.address);

        Data data = items.get(position);
        id.setText(data.getId());
        nama.setText(data.getnama());
        address.setText(data.getanddress());

        return convertView;

    }
}
