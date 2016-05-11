package cleodora.eidrecipes;

import java.util.ArrayList;
import java.util.List;

public class Category {
	List<Recipe> items;

	Category() {
		items = new ArrayList<Recipe>();
	}
	public void add(int id,String name, String prep_time, String cook_time,
			String serving,Integer image_id)
	{
		Recipe temp=new Recipe(id, name, prep_time, cook_time, serving, image_id);
		items.add(temp);
	}

}
