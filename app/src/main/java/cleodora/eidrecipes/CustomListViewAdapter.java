package cleodora.eidrecipes;


import imageLoader.ImageLoader;

import java.util.List;

import cleodora.eidrecipes.R;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter  extends ArrayAdapter<Recipe>{
	Context context;
	public ImageLoader imageLoader; 
    public CustomListViewAdapter(Context context, int resourceId, List<Recipe> items) {
        super(context, resourceId, items);
        this.context = context;
        imageLoader = new ImageLoader(context);
    }
    private class ViewHolder {
    	ImageView imageBorder;
        ImageView imageView;
        TextView txtName;
        TextView txtPrep;
        TextView txtCook;
        TextView txtServe;
        
    }
     
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Recipe rowItem = getItem(position);
         
        if (convertView == null) {

            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.fragment_list_item, null);
            holder = new ViewHolder();
            holder.imageBorder = (ImageView) convertView.findViewById(R.id.BarImage);
            holder.txtName = (TextView) convertView.findViewById(R.id.text_name);
            holder.txtPrep = (TextView) convertView.findViewById(R.id.text_prep);
            holder.txtCook = (TextView) convertView.findViewById(R.id.text_cooking);
            holder.txtServe= (TextView) convertView.findViewById(R.id.text_serve);
            holder.txtPrep = (TextView) convertView.findViewById(R.id.text_prep);
            holder.imageView = (ImageView) convertView.findViewById(R.id.RecipeImage);
            convertView.setTag(holder);
            holder.imageBorder.setImageResource(R.drawable.black_bar_long);
           /* if(position%4==0)
            {
            	holder.imageBorder.setImageResource(R.drawable.black_bar_long);
            }
            else if(position%3==0)
            {
            	holder.imageBorder.setImageResource(R.drawable.blue_bar_long);
            }
            else if(position%2==0)
            {
            	holder.imageBorder.setImageResource(R.drawable.darkblue_bar_long);
            }
            else
            {
            	holder.imageBorder.setImageResource(R.drawable.red_bar_long);
            }    */
        } 
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        //ViewIDObject obj=new ViewIDObject(rowItem.getImage_id(), holder.imageView,context);
        //new ImageAssignment().execute(obj);
        holder.txtName.setText(rowItem.getName());
        holder.txtPrep.setText(rowItem.getPrep_time());
		
        
        /*DisplayMetrics displaymetrics = new DisplayMetrics();
		((Activity) context).getWindowManager().getDefaultDisplay()
				.getMetrics(displaymetrics);
		int height = displaymetrics.heightPixels;
		int width = displaymetrics.widthPixels;

		Bitmap unscaledBitmap = BitmapFactory.decodeResource(
				context.getResources(), rowItem.getId());
		 Bitmap scaledBitmap = Bitmap.createScaledBitmap(unscaledBitmap,
				width, 300, true);
		 holder.imageView.setImageBitmap(scaledBitmap);*/
        imageLoader.DisplayImage(rowItem.getImage_id(),  holder.imageView);
        //holder.imageView.setImageResource(rowItem.getImage_id());
        
        holder.txtCook.setText(rowItem.getCook_time());
        holder.txtServe.setText(rowItem.getServing());
        
         
        return convertView;
    }
}