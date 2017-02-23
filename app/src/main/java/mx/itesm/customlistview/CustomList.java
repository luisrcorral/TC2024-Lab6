package mx.itesm.customlistview;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity activity;
    private final String[] web;
    private final Integer[] imageId;


    //This constructor receives the arrays we want to accommodate in our custom adapter

    public CustomList(Activity activity_param, String[] web, Integer[] imageId) {
        super(activity_param, R.layout.list_adapter, web);
        this.activity = activity_param;
        this.web = web;
        this.imageId = imageId;

    }


    //Here we override and re-define the method getView, member of the ArrayAdapter class
    //to make it render the custom adapter in the way that our custom adapter defines it in the xml
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_adapter, null);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        imageView.setImageResource(imageId[position]);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(web[position]);

        return rowView;
    }
}