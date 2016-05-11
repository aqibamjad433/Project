package cleodora.eidrecipes;

import imageLoader.ImageLoader;

import java.util.List;

import cleodora.eidrecipes.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerListAdapter extends ArrayAdapter<DrawerItem>{
	Context context;
	public ImageLoader imageLoader; 
    public DrawerListAdapter(Context context, int resourceId, List<DrawerItem> items) {
        super(context, resourceId, items);
        this.context = context;
        imageLoader = new ImageLoader(context);
    }
    private class ViewHolder {
        ImageView imageView;
        TextView txtName;
        
    }
     
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        DrawerItem rowItem = getItem(position);
         
        if (convertView == null) {

            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.secondLine);
            holder.imageView = (ImageView) convertView.findViewById(R.id.DrawerImage);
            convertView.setTag(holder);
        } 
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txtName.setText(rowItem.getName());
        holder.imageView.setImageResource(rowItem.id);
        
         
        return convertView;
    }
}
