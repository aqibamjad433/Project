package cleodora.eidrecipes;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Recipe implements Serializable{
	int id;
	String name;
	String prep_time;
	String cook_time;
	String serving;
	Integer image_id;
	
	/*
	 * 0 for Special
	 * 1 for Drinks
	 * 2 for Sweet
	 * 3 for Appetizer
	 * 4 for Desserts
	 * 5 for Rice
	 * 6 for Salad
	 * 7 for Main Dish
	 * */
	public Recipe(int id,String name, String prep_time, String cook_time,
			String serving,Integer image_id) {
		this.id=id;
		
		this.name = name;
		this.prep_time = prep_time;
		this.cook_time = cook_time;
		this.serving = serving;
		this.image_id=image_id;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrep_time() {
		return prep_time;
	}
	public void setPrep_time(String prep_time) {
		this.prep_time = prep_time;
	}
	public String getCook_time() {
		return cook_time;
	}
	public void setCook_time(String cook_time) {
		this.cook_time = cook_time;
	}
	public String getServing() {
		return serving;
	}
	public void setServing(String serving) {
		this.serving = serving;
	}
	public Integer getImage_id() {
		return image_id;
	}
	public void setImage_id(Integer image_id) {
		this.image_id = image_id;
	}
	

}
