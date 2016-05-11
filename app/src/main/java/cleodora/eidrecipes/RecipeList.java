package cleodora.eidrecipes;

import java.util.ArrayList;
import java.util.List;

import cleodora.eidrecipes.R;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

@SuppressLint("ValidFragment")
public class RecipeList extends Fragment {
	ListView list;
	int[] id = { 1, 2, 6, 9, 12, 13, 14, 18, 22, 25, 26, 3, 7, 11, 17, 19, 23,
			28, 8, 16, 21, 24, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
			47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 67,
			68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84,
			85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
			101, 102, 103 };
	String[] name = { "PineApple Cake", "Simple Cake", "KitKat Milk Shake",
			"Strawberry Ice Cream", "Shahi Custard", "Parsi Custard",
			"Mango Chutney", "Mango Salsa", "Mango Lassi",
			"Mango Ice-Cream Tart", "Mango Cheese Cake", "Sindhi Biryani",
			"Mumbai Biryani", "Prawn Biryani", "Yakhni Pulao", "White Qorma",
			"Shahi Qorma", "Falooda", "Orange Julius",
			"Iced Cappuccino - Sugar Free", "katluma", "chakwali kheer",
			"Mexican Tacos with Mince", "Mavay ki Kachori",
			"Buffalo Chicken Bites", "Winter Blast Dry Fruit Shak",
			"Beef Goulash", "Khopra Halwa", "Bong Do Piyaza", "Creamed Steak",
			"Lime Yogurt Parfait", "Creamy Bar BQ Chicken",
			"Gujiya (Indian Sweet Dish)", "Kacha Chicken Pulao",
			"Mango and Pineapple Trifle", "Pahadi Chicken (Pahari Murgh)",
			"Ferni Delight", "Lemon Meringue Pie", "Khopray Ki Methai",
			"Badami Kheer", "Dry Fruit Tarts", "Caramel Coffee Cake",
			"Gulzaar Special Biryani", "Shephard's Pie", "French Almond Cake",
			"Saffron And Rosemary-Herb Turkey Tikkas", "BBQ Foily Chops",
			"Kafta & Chip�s", "Chicken Nacho Grilled",
			"Baked Chicken with Sour Cream", "Fruit Melody",
			"Granadilla Lemon Mix", "Cocunut-Strawberry Lassi",
			"Strawberry Smoothie", "Strawberry Banana Smoothie",
			"Mango-Peach Smoothie", "Tropical Fruit Smoothie",
			" Mango Pina Colada Smoothie", "Licuado de Mango",
			"Mango-Banana Milkshake", "Pawpaw And Mango Punch",
			"Gloomy Day Smoothie", "Basic Fruit Smoothie",
			"Creamy Mango Smoothie", "Mango-Pineapple Smoothie",

			"Qeema Sabzi Pao Bhaji", "Sweet And Sour Beef Chowmien",
			"Bengali Mutton Curry", "Rajhistani Gosht Salan",
			"Beef Kheema with Peas", "Beef Curry Dopiaza",
			"Aromatic Beef Curry", "Fragrant South Indian Beef Curry",
			"Lamb Korma", "Banana Dumplings", "Beef Pasanda", "Rogan Josh",
			"Khoya Seekh Kabab", "Tangri Tikka", "Tandoori Motia Tikka",
			"Dhaga Kabab", "BBQ Mutton Ribs", "Beef BBQ Sauce",
			"Tikkaboti Pizza", "BBQ Numkeen Boti", "BBQ Mutton Leg",
			"Mutton Karahi" };
	int category = 0;
	String[] prep_time = { "20 min", "15 min", "10-15 min",
			"10-12 hours Freezing ", "25 min", "15 min", "15 min", "5 min",
			"4 min", "30 min", "7 hour", "20 min", "20 min", "20 min",
			"15 min", "35 min", "35 min", "30 min", "3 min", "5 min", "35 min",
			"5 min", "15 min", "25 min", "50 min", "5 min", "10 min", "10 min",
			"15 min", "10 min", "10 min", "10 min", "1 hour 30 min", "30 min",
			"30 min", "30 min", "10 min", "10 min", "1 hour 30 min",
			"10-15 min", "10 min", "20-25 min", "10 min", "45 min", "25 min",
			"15 min", "2 hour 30 min", "10-15 min", "10 min", "10 min",
			"10 min", "5 min", "5 min", "10 min", "10 min", "5 min", "15 min",
			"10 min", "5 min", "5 min", "10 min", "15 min", "15 min", "15 min",
			"10 min", "5 min", "-", "-", "-", "-", "-", "5 min", "20 min",
			"10 min", "-", "20 min", "20 min", "10 min", "10 min", "40 min",
			"40 min", "50 min", "45 min", "15 min", "20 min", "15 min",
			"35 min", "-" };

	String[] cook_time = { "45 min", "30 min", "2 min", "-", "20 min",
			"1 hour", "45 min", "-", "-", "25 min", "-", "20 min", "20 min",
			"20 min", "50 min", "25 min", "25 min", "-", "-", "-", "30 min",
			"15 min", "25-30 min", "25-30 min", "20 min", "No cooking",
			"30-35 min", "25-30 min", "35-40 min", "40 min", "no cooking",
			"25-30 min", "15 min", "45 min", "No cooking", "35 min", "20 min",
			"1 hour", "25-30 min", "30-35 min", "20 min", "60 min", "50 min",
			"35 min", "1 hour 30 min", "20 min", "10-15 min", "35-40 min",
			"15-20 min", "45 min", "-", "-", "-", "-", "-", "-", "-", "-", "-",
			"-", "-", "-", "-", "-", "-", "30 min", "30 min", "50 min",
			"40 min", "20 min", "50 min", "20 min", "2 hour 15 min", "24 hour",
			"5 min", "55 min", "1 hour 15 min", "30 min", "30 min", "40 min",
			"20 min", "25 min", "30 min", "20 min", "35 min", "25 min",
			"50 min" };
	String[] serving = { "8", "4-6", "3-4", "6", "4 - 6", "8-10", "4 cups",
			"4-6", "4", "6", "12", "8", "8", "8", "6", "4", "4", "1", "1", "1",
			"3", "2", "4", "3", "4", "2-3", "4", "3-4", "4", "4", "2", "4",
			"-", "4", "2-3", "6", "-", "-", "-", "-", "6-8", "2-4", "4-6",
			"6-8", "4-6", "-", "3-4", "3", "4", "4", "4", "2-3", "2-3", "2-3",
			"4-6", "1-2", "2-3", "4-5", "1-2", "2-3", "4-5", "8-10", "2-4",
			"3-4", "2-3", "4-5", "2-4", "3-4", "3-5", "4-5", "4", "4", "4",
			"4", "3-5", "4-6", "4", "4", "4", "5", "3", "3", "4", "4", "3-4",
			"3-5", "2-4", "3-4" };
	Integer[] imageId = { R.drawable.pineapple_cake, R.drawable.simple,
			R.drawable.kitkat_milk_shake, R.drawable.strawberry_ice_cream,
			R.drawable.shahi_custord, R.drawable.parsi_custord,
			R.drawable.mango_chutney, R.drawable.mango_salsa,
			R.drawable.mango_lassi, R.drawable.mango_ice_cream_tart,
			R.drawable.mango_cheesecake, R.drawable.sindhi, R.drawable.mumbai,
			R.drawable.prawn, R.drawable.yakhni, R.drawable.white,
			R.drawable.shahi, R.drawable.falooda, R.drawable.orangejulius,
			R.drawable.icedcocoacappuccino, R.drawable.katlama,
			R.drawable.kheer, R.drawable.mexican, R.drawable.mavai,
			R.drawable.buffalo, R.drawable.winter, R.drawable.beefgoulash,
			R.drawable.khopra, R.drawable.bong, R.drawable.creamedsteak,
			R.drawable.lime, R.drawable.creamy, R.drawable.gujiya,
			R.drawable.kacha, R.drawable.mango, R.drawable.pahadichicken,
			R.drawable.fernidelight, R.drawable.lemonmeringue,
			R.drawable.khopray, R.drawable.badamikheer, R.drawable.dry,
			R.drawable.caramel, R.drawable.gulzaari, R.drawable.shephard,
			R.drawable.frenchalmond, R.drawable.saffron, R.drawable.bar,
			R.drawable.kafta, R.drawable.chickennacho, R.drawable.bakedchicken,
			R.drawable.fruitmelody, R.drawable.granadillalemonmix,
			R.drawable.cocustrabrysmt, R.drawable.strawberrysmoothie,
			R.drawable.strawberrysmoothie, R.drawable.strawberrybananasmoothie,
			R.drawable.mangopeachsmoothie, R.drawable.tropicalfruitsmoothie,
			R.drawable.mangopinacoladasmoothie,
			R.drawable.mangobananamilkshake, R.drawable.pawpawandmangopunch,
			R.drawable.gloomydaysmoothie, R.drawable.basicfruitsmoothie,
			R.drawable.creamymangosmoothie, R.drawable.mangopineapplesmoothie,
			
			R.drawable.qeema_sabzi_pao_bhaji, R.drawable.beef_chowmien,
			R.drawable.bengali_mutton_curry, R.drawable.rajhistani_gosht_salan,
			R.drawable.beef_keema, R.drawable.beef_curry_dopiaza,
			R.drawable.aromatic_beef_curry,
			R.drawable.fragrantsouthindianbeefcurry, R.drawable.lamb_korma,
			R.drawable.banana_dumplings, R.drawable.beef_pasanda,
			R.drawable.rogan_josh, R.drawable.khoya_seekh_kabab,
			R.drawable.tangri_tikka, R.drawable.tandoorimotiatikka,
			R.drawable.dhaga_kabab, R.drawable.bbqmuttonribs,
			R.drawable.beefbbqsauce, R.drawable.tikkaboti_pizza,
			R.drawable.bbqnamkeenboti, R.drawable.bbqmuttonleg1,
			R.drawable.mutton_karahi};

	
	public RecipeList(int num) {
		category = num;
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.tab, container, false);
		ListView listView;
		List<Recipe> rowItems;
		rowItems = new ArrayList<Recipe>();
		for (int i = 0; i < name.length; i++) {
			Recipe item = new Recipe(id[i], name[i], prep_time[i],
					cook_time[i], serving[i], imageId[i]);
			rowItems.add(item);
		}

		Category special = new Category();
		//special.items.add(rowItems.get(0));
		special.items.add(rowItems.get(47));
		special.items.add(rowItems.get(67));
		special.items.add(rowItems.get(66));
		special.items.add(rowItems.get(79));
		special.items.add(rowItems.get(14));
		special.items.add(rowItems.get(81));
		special.items.add(rowItems.get(75));
		special.items.add(rowItems.get(67));
		special.items.add(rowItems.get(77));
		special.items.add(rowItems.get(80));
		special.items.add(rowItems.get(83));
		special.items.add(rowItems.get(42));
		special.items.add(rowItems.get(2));
		
		//special.items.add(rowItems.get(6));
		//special.items.add(rowItems.get(9));
		//special.items.add(rowItems.get(10));
		//special.items.add(rowItems.get(55));
		special.items.add(rowItems.get(13));
		//special.items.add(rowItems.get(20));
		//special.items.add(rowItems.get(25));
		//special.items.add(rowItems.get(27));
		special.items.add(rowItems.get(29));
		//special.items.add(rowItems.get(30));
		special.items.add(rowItems.get(31));
		//special.items.add(rowItems.get(34));
		//special.items.add(rowItems.get(37));
		special.items.add(rowItems.get(41));
		special.items.add(rowItems.get(48));
		//special.items.add(rowItems.get(50));
		//special.items.add(rowItems.get(55));
		//special.items.add(rowItems.get(57));
		//special.items.add(rowItems.get(64));

		Category drinks = new Category();
		drinks.items.add(rowItems.get(2));
		drinks.items.add(rowItems.get(8));
		drinks.items.add(rowItems.get(18));
		drinks.items.add(rowItems.get(19));
		drinks.items.add(rowItems.get(25));
		drinks.items.add(rowItems.get(50));
		drinks.items.add(rowItems.get(52));
		drinks.items.add(rowItems.get(53));
		drinks.items.add(rowItems.get(54));
		drinks.items.add(rowItems.get(55));
		drinks.items.add(rowItems.get(56));
		drinks.items.add(rowItems.get(57));
		drinks.items.add(rowItems.get(58));
		drinks.items.add(rowItems.get(59));
		drinks.items.add(rowItems.get(60));
		drinks.items.add(rowItems.get(61));
		drinks.items.add(rowItems.get(62));
		drinks.items.add(rowItems.get(63));
		drinks.items.add(rowItems.get(64));

		Category deserts = new Category();
		deserts.items.add(rowItems.get(0));
		deserts.items.add(rowItems.get(1));
		deserts.items.add(rowItems.get(3));
		deserts.items.add(rowItems.get(4));
		deserts.items.add(rowItems.get(5));
		deserts.items.add(rowItems.get(6));
		deserts.items.add(rowItems.get(7));
		deserts.items.add(rowItems.get(9));
		deserts.items.add(rowItems.get(10));
		deserts.items.add(rowItems.get(17));
		deserts.items.add(rowItems.get(18));
		deserts.items.add(rowItems.get(21));
		deserts.items.add(rowItems.get(27));
		deserts.items.add(rowItems.get(30));
		deserts.items.add(rowItems.get(32));
		deserts.items.add(rowItems.get(34));
		deserts.items.add(rowItems.get(36));
		deserts.items.add(rowItems.get(37));
		deserts.items.add(rowItems.get(38));
		deserts.items.add(rowItems.get(39));
		deserts.items.add(rowItems.get(40));
		deserts.items.add(rowItems.get(41));
		deserts.items.add(rowItems.get(43));
		deserts.items.add(rowItems.get(44));

		Category appetizers = new Category();
		appetizers.items.add(rowItems.get(7));
		appetizers.items.add(rowItems.get(22));

		Category rice = new Category();
		rice.items.add(rowItems.get(11));
		rice.items.add(rowItems.get(12));
		rice.items.add(rowItems.get(13));
		rice.items.add(rowItems.get(14));
		rice.items.add(rowItems.get(33));
		rice.items.add(rowItems.get(42));

		Category curry = new Category();
		curry.items.add(rowItems.get(15));
		curry.items.add(rowItems.get(16));
		curry.items.add(rowItems.get(20));
		curry.items.add(rowItems.get(24));
		curry.items.add(rowItems.get(26));
		curry.items.add(rowItems.get(28));
		curry.items.add(rowItems.get(29));
		curry.items.add(rowItems.get(31));
		curry.items.add(rowItems.get(35));
		curry.items.add(rowItems.get(45));
		curry.items.add(rowItems.get(46));
		curry.items.add(rowItems.get(47));
		curry.items.add(rowItems.get(49));
		
		curry.items.add(rowItems.get(65));
		curry.items.add(rowItems.get(66));
		curry.items.add(rowItems.get(67));
		curry.items.add(rowItems.get(68));
		curry.items.add(rowItems.get(69));
		curry.items.add(rowItems.get(70));
		curry.items.add(rowItems.get(71));
		curry.items.add(rowItems.get(72));
		curry.items.add(rowItems.get(73));
		curry.items.add(rowItems.get(74));
		curry.items.add(rowItems.get(75));
		curry.items.add(rowItems.get(76));
		curry.items.add(rowItems.get(77));
		curry.items.add(rowItems.get(78));
		curry.items.add(rowItems.get(79));
		curry.items.add(rowItems.get(80));
		curry.items.add(rowItems.get(81));
		curry.items.add(rowItems.get(82));
		curry.items.add(rowItems.get(83));
		curry.items.add(rowItems.get(84));
		curry.items.add(rowItems.get(85));
		curry.items.add(rowItems.get(86));

		for (int k = 0; k < special.items.size(); k++) {
			Log.i("Special Name ", " " + special.items.get(k).getName());
		}
		final List<Recipe> copyItems;
		if (category == 0) {
			copyItems = new ArrayList<Recipe>(special.items);
		} else if (category == 1) {
			copyItems = new ArrayList<Recipe>(drinks.items);
		} else if (category == 2) {
			copyItems = new ArrayList<Recipe>(deserts.items);
		} else if (category == 3) {
			copyItems = new ArrayList<Recipe>(appetizers.items);
		} else if (category == 4) {
			copyItems = new ArrayList<Recipe>(rice.items);
		} else if (category == 5) {
			copyItems = new ArrayList<Recipe>(curry.items);
		} else {
			copyItems = new ArrayList<Recipe>(rowItems);
		}
		listView = (ListView) view.findViewById(R.id.recipeList);
		CustomListViewAdapter adapter = new CustomListViewAdapter(
				getActivity(), R.layout.fragment_list_item, copyItems);
		listView.setAdapter(adapter);
		// final List<Recipe> copyItems = new ArrayList<Recipe>(rowItems);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Fragment newFragment = new RecipeDetail();
				Bundle bundle = new Bundle();
				bundle.putSerializable("item", copyItems.get(position));
				newFragment.setArguments(bundle);
				FragmentTransaction transaction = getFragmentManager()
						.beginTransaction();

				// Replace whatever is in the fragment_container view with this
				// fragment,
				// and add the transaction to the back stack
				transaction.setCustomAnimations(R.animator.card_flip_right_in,
						R.animator.card_flip_right_out,
						R.animator.card_flip_left_in,
						R.animator.card_flip_left_out);
				transaction.replace(R.id.fragment_container, newFragment);
				transaction.addToBackStack(null);

				// Commit the transaction
				transaction.commit();

			}
		});
		Log.i("Frosting ", "End");
		return view;
	}

}
