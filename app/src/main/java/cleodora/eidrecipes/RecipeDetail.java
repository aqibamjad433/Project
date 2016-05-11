package cleodora.eidrecipes;

import cleodora.eidrecipes.R;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecipeDetail extends Fragment {

	ImageView image;
	TextView txtprep;
	TextView txtcook;
	TextView txtserving;
	TextView txtname;
	Recipe item;
	String[] ingredients;
	String[] directions;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Bundle bundle = getArguments();
		item = (Recipe) bundle.getSerializable("item");

		View view = inflater.inflate(R.layout.detail_recipe, container, false);
		image = (ImageView) view.findViewById(R.id.RecipeDetailImage);
		txtprep = (TextView) view.findViewById(R.id.text_prep);
		txtcook = (TextView) view.findViewById(R.id.text_cooking);
		txtserving = (TextView) view.findViewById(R.id.text_serve);
		txtname = (TextView) view.findViewById(R.id.text_name);

		DisplayMetrics metrics = getResources().getDisplayMetrics();
		int width = metrics.widthPixels;
		// int height = metrics.heightPixels;
		float ht_px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
				300, getResources().getDisplayMetrics());
		// float wt_px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
		// width, mContext.getResources().getDisplayMetrics());
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
				item.getImage_id());
		Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) width,
				(int) (ht_px), false);

		image.setImageBitmap(scaledBitmap);

		txtprep.setText(item.getPrep_time());
		txtcook.setText(item.getCook_time());
		txtserving.setText(item.getServing());
		txtname.setText(item.getName());

		if (item.getId() == 1) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Sugar 6oz", "Butter 6oz", "Plain Flour 6oz",
					"Eggs 3", "Baking Powder 1 1/2 tsp",
					"Vanilla essence 1 tsp", "Pineapple syrup 3 tbs",
					"Pineapple slices 4-5", "Yellow colouring",
					"Brown Sugar 2-3 tbs as requiredz" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Mix sugar and butter together.",
					"Add eggs one by one and mix together.",
					"Add vanilla essence, yellow colouring and pineapple syrup (you can use pineapple essence or juice from tin can).",
					"Sift in the flour and baking powder together and fold into the batter.",
					"Grease a 7-8 inch cake pan with butter.",
					"Sprinkle evenly brown sugar on the base of the cake pan.",
					"Arrange slices of pineapple on top of brown sugar.",
					"Pour the cake batter over the pineapple slices.",
					"Bake the cake from 45 minutes in a pre-heated oven, Gas Mark 4.",
					"Once cooked turn the cake upside down and serve.",
					"Note: If you want to make a simple sponge cake omit the pineapple slices, and pineapple syrup and replace with milk)" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 6) {
			String[] temp = { "Milk 3 glasses", "Kit kat 4 pieces",
					"Coffee 1/2 tsp", "Sugar 4 tbsp", "Chocolate powder 1 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = { "Put all ingredients in blender.",
					"Blend it and serve chilled." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 9) {
			String[] temp = { "Strawberry 600 gm",
					"Fresh Cream (dairy's) 1 pkt 0r 2-1/4 cup", "Sugar 2 cup",
					"Lemon juice 2 tbsp", "Flavoured essence few drops" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Wipe cream with electric beater at lower no. until thicken and foamy.",
					"In a bowl put strawberries and sugar mix well.",
					"Put strawberries in Blender or food processor until sugar dissolve and become puree.",
					"Add lemon juice in strawberry puree mix well.",
					"Now add puree in wipped cream mix with spoon dont mix completey to give ripple effect.",
					"Take almunium foil pan and spread selofen polythene sheet pour ice cream mixture into and cover around.",
					"Cover with flap and put in freezer.",
					"For Serving: In serving glass put banana, strawberry sauce, chocolate cookies and Chocolate sauce.",
					"Put ice cream piece in it and serve immedietly.",
					"Chef Tip: Dont use tetra pack cream other wise crunch could be form." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 12) {
			String[] temp = { "Milk 2 cups", "Sugar ½ cup",
					"Vanilla custard powder 2 tbsp", "Bread 6 slices",
					"Cream ½ cup", "pistachios 1 tbsp",
					"Glace cherries 1 tbsp", "water ¼ cup", "Ghee ½ cup" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Cut slices of bread into triangles and fry in ghee till light brown.",
					"After frying put n absorbent paper.",
					"In another pan boil milk, sugar and water and stir until sugar dissolves.",
					"When milk comes to a boil, drop the fried bread and allow soaking up the milk.",
					"Remove the bread and place in a serving dish.",
					"Make a thin paste of custard powder, the rest of the sugar and milk and cook for 3 minutes.",
					"Pour over the bread and decorate with cream cherries and pistachios.",
					"Serve chilled." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 13) {
			String[] temp = { "Milk	5 pints", "Eggs	6",
					"Milk cooked into khoya	3 pints", "Egg yolks	1 dozen",
					"Sugar	8 oz or to taste",
					"Ground cardamoms	1 coffee spoon",
					"Almonds pistachios	4 oz", "Nutmeg ground	1 coffee spoon",
					"Pumpkin or chironji (melon) seed	4 oz",
					"Vanilla essence	2 tsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Boil the milk, adding sugar, till half its original quantity remains.",
					"Grind the almonds and pistachios very fine and blanch chironji seeds.",
					"Mix the khoya and almonds paste into the milk.",
					"Beat all the eggs and egg yolks and stir into the milk mixture.",
					"Add cardamom and nutmeg powder and vanilla essence.",
					"Pour into a greased baking dish, garnish with chironji seeds and bake for 1/2 hour till done and the seeds turn dark brown.",
					"When cold, chill. Alternatively.", "Serve chilled." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 14) {
			String[] temp = {
					"4 pounds fresh mangos, ripe but not too soft, peeled",
					"3 tablespoons vegetable oil", "1 teaspoon chile flakes",
					"2 1/2 cups medium dice red onion",
					"1/4 cup minced fresh ginger",
					"1 cup small dice red bell pepper",
					"8 ounces unsweetened pineapple juice",
					"4 ounces cider vinegar", "1/2 cup brown sugar",
					"1 1/2 tablespoons curry powder",
					"Kosher salt and fresh ground white pepper",
					"1/2 cup raisins or golden raisins",
					"1/2 cup toasted, roughly chopped macadamia nutss" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Cut the mango flesh away from the pit. The pit is shaped similar to an obelisk, so you'll end up with 2 large pieces and 2 smaller pieces from each mango. Roughly chop the flesh.",
					"In a saute pan heat the oil and add the chile flakes. Be careful not to burn the chile, just toast to flavor the oil. Add the onions and sweat until soft. Add the ginger and bell pepper and saute for 1 to 2 minutes. Finally add the mango and cook for 1 more minute.",
					"In a separate bowl, combine the pineapple juice, vinegar, sugar, and curry powder. Add this mixture to the pan. Stir to combine. Bring the mixture to a bare simmer and reduce for about 30 minutes, stirring frequently. Season with salt and pepper. Add the raisins and the nuts and transfer to another container over an ice bath. I used a mild yellow curry powder, but if you want it hotter go for red." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 18) {
			String[] temp = { "1 mango, peeled and diced",
					"1/2 cup peeled, diced cucumber",
					"1 tablespoon finely chopped jalapeno",
					"1/3 cup diced red onion", "1 tablespoon lime juice",
					"1/3 cup roughly chopped cilantro leaves",
					"Salt and pepper" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = { "Combine the mango, cucumber, jalapeno, red onion, lime juice and cilantro leaves and mix well. Season with salt and pepper, to taste." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 22) {
			String[] temp = {
					"9 fluid ounces (255 milliliters) plain yogurt",
					"4 1/2 fluid ounces (130 milliliters) milk",
					"4 1/2 fluid ounces (130 milliliters) canned mango pulp or 7 ounces (200 grams) from 3 fresh mango, stoned and sliced",
					"4 teaspoons sugar, to taste, or feel free to try salt and cardamom seeds" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Put all the ingredients into a blender and blend for 2 minutes, then pour into individual glasses, and serve.",
					" Feel free to try salt and cardamom seeds.",
					"Note: The lassi can be kept refrigerated for up to 24 hours" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 25) {
			String[] temp = { "180ml (3/4 cup) double cream",
					"180ml (3/4 cup) milk", "1 tablespoon dark rum",
					"3 egg yolks", "45g (1/4 cup) dark brown sugar",
					"250g pkt Arnott's Granita biscuits",
					"100g unsalted butter, melted", "80ml (1/3 cup) water",
					"2 tablespoons caster sugar", "2 teaspoons liquid glucose",
					"1 mango, cheeks removed, peeled" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Place cream, milk and rum in a saucepan over medium heat. Bring just to a simmer. Set aside for five minutes to cool.",
					"Meanwhile, whisk egg yolks and brown sugar until pale and creamy. Slowly whisk in the cream mixture. Pour mixture into a clean saucepan. Return to low heat. Use a wooden spoon to stir until the mixture coats the back of the spoon. Pour custard into a jug. Cool to room temperature, stirring occasionally. Cover and place in the fridge for 4 hours or overnight to chill.",
					"Meanwhile, process biscuits in a food processor until finely crushed. Add butter and process until well combined. Press evenly into the base and sides of a 2.5cm-deep, 11 x 34cm (base measurement) fluted tart tin with a removable base. Cover and place in the fridge for 30 minutes to chill.",
					"Preheat oven to 180°C/160°C fan forced. Bake base for 20 minutes or until light golden. Set aside to cool.",
					"Combine water, caster sugar and liquid glucose in a small saucepan over medium heat. Stir to dissolve the sugar. Simmer for 2 minutes to reduce slightly. Set aside to cool.",
					"Process the mango in a food processor until smooth. Add the sugar mixture. Process to combine.",
					"Churn the custard in an ice-cream maker following manufacturer’s instructions. Spoon into the cooled base. Top with the mango puree and swirl to combine. Place in the freezer to firm. Cut into pieces and top with mango slices." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 26) {
			String[] temp = {
					"150g Arnott's Marie biscuits",
					"80g butter, melted",
					"2 x 250g pkts Kraft Philadelphia original cream cheese block, at room temperature",
					"1/2 cup caster sugar", "300ml thickened cream, whipped",
					"1 tablespoon gelatine", "1/4 cup hot water",
					"4 mangoes, peeled and sliced", "2 tablespoons lime juice",
					"1 mango, peeled and chopped, to serve" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Process biscuits in a food processor until finely crushed. Add butter and pulse to combine. Press over the base of a 20cm springform pan. Chill for 15 mins or until firm.",
					"Meanwhile, use an electric mixer to beat the cream cheese and sugar in a bowl until smooth and creamy. Fold in the cream. Whisk the gelatine and hot water in a small bowl until the gelatine dissolves. Stir 1/4 cup of the cream cheese mixture into the gelatine mixture, then add to the remaining mixture and mix well. Pour half the cream cheese mixture over the biscuit base. Top with half the mango slices, then remaining cream cheese mixture. Refrigerate overnight or until firm.",
					"Remove the cheesecake from the fridge 15 mins before serving. To make coulis, place the mango and lime juice in a blender and pulse until smooth. (If necessary, blend in a little water until coulis reaches pouring consistency.)",
					"Arrange the remaining sliced mango over the cheesecake and drizzle over the coulis." };

			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 3) {

			String[] temp = { "Chicken 1 kg", "RIce 1 kg ", "Oil 1 1/2 cup",
					"Onion 4 medium", "Ginger, Garlic 3 tbsps ",
					"Red chilli 4 tsps", "Turmeric 1 tsp ",
					"Dry Coriander powder 2 tsps", "Garam masala 1/2 tbsp",
					"Salt to taste", "Bay leaves 2-3", "Anardana 1 tsp",
					"Dried Plums 12-15",
					"Yellow or Orange food colour 1/2 tsp ", "Yoghurt 250 gm",
					"Tomatoes 1/2 kg ", "Green chillies 3-4 small",
					"Potatoes 1/4 kg", "Lemon 4", "Mint 1/2 bunch",
					"Coriander 1/2 bunch", "Nutmeg and mace powder 1/2 tsp",
					"Fennel seeds 1 tbsp", "Dry Coriander seeds 1 tbsps",
					"Salt 2 tbsps" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Add oil in a saucepan.",
					"Add onions and fry till light brown and keep aside.",
					"Now add chicken in the pan and cook till water evaporates.",
					"Then add ginger and garlic in the pan and all spices, cinnamon and cardamoms.",
					"Roast the chicken till it tenderizes.",
					"Then add potatoes, tomatoes, green chillies, lemon, anardana, yoghurt, coriander, mint, dried plums, fried curshed onions in the pan.",
					"Simmer on low heat (the curry must have 1 1/2-2 cups gravy).",
					"Now take another saucepan, add water to boil rice.",
					"Tie the fennel seeds and coriander seeds and make a pouch and add in the boiling water along with 2 tbsps salt.",
					"When rice tenderize a little, sieve and in a big saucepan, spread a layer of rice first, then add curry and another layer of rice.",
					"In the end, mix food colour in a little kewra and add in the rice.",
					"Cover and simmer for 5-10 minutes on low heat.",
					" Serve hot and delicious biryani with salad and raita" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 7) {

			String[] temp = { "1 Chicken", "3 cups RIce", "4 Potato",
					"6 Tomato", "4 Onion", "4 Lemon", "1 cup Dry plum",
					"1 cup Yogurt", "1 Â½ cup Ginger Garlic paste",
					"6 Green chilli", "1 bunch Mint chopped",
					"6 Small Cardamom", "4 Clove", "6 Whole black pepper",
					"1 tsp Whole cumin", "1 tbsp Red Chilli powder",
					"2 tbsp Coriander powder", "1 cup Milk",
					"1 pinch Food color", "1 cup Clarified Butter" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Wash chicken and put yogurt, ginger garlic paste, red chilli powder, coriander, green chilli, lemon, mint, green chilli, dry plum and salt and leave it for half an hour.",
					"Fry onion in till it turns golden brown. Take out half of it on absorbing paper.",
					"Now add chicken in pan with onion and cook it till all water dries.",
					"Saute a little and make sure that there is no water left.",
					"Add a little smoke to potatoes and cut each potato into four pieces and deep fry.",
					"Chop tomato into pieces and fry.",
					"Top your chicken with fried potatoes and tomatoes.",
					"Boil rice separately.",
					"Add mint, green chili, cardamom, black pepper, salt and cloves while boiling.",
					"Do not cook rice more than 1/3. In a greased cooking pot, layer rice, then chicken, again rice and fried onion on top of rice. Dissolve a pinch of saffron in warm milk and pour over the layers.",
					"Also add lemon juice squeezed from 2 lemons. Let it cook on a high flame for 10 minutes.",
					"Then lower the flame and cook until biryani is ready. Remember that before you serve your rice, mix well with a saucer.",
					" Serve with yogurt dip and salad." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 11) {

			String[] temp = { "1 kg Prawns", "1/2 kg rIce", "1 onion, chopped",
					"1″ piece Ginger, chopped", "2 Cloves Garlic, crushed",
					"2 Green chillies, chopped", "2/3 cup grated Coconut",
					"2 tsp Garam masala", "juIce of 1 Lemon",
					"1 tbsp Cashewnuts", "2 Bay Leaves", "¼ cup Butter or Oil",
					"1 tsp Salt", "½ cup peas" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Make a fine paste of green chillies, garam masala, ginger, garlic, cashew nuts & coconut.",
					"In a pan heat 3 tbsp butter or oil and add half of the onions and fry until golden brown.",
					"Add the paste to the onions and stir for about 5 minutes.",
					"Add the prawns and 1/2 tsp salt. Mix well so that all the prawns are coated with the cooked masala and cook on a low flame for 5 minutes. Remove from heat and set aside.",
					"In a separate pan heat 2 tbsp of butter or oil and fry the bayleaves and add the remaining onions and fry until the onions are golden brown.",
					"Add the rice and stir fry for about 10 minutes. Add the peas, 1/2 tsp salt and 2 cups of water.",
					"Cover and cook till the rice is almost done on a low flame. Mix the prawns and rice together.",
					"Simmer, lastly add lemon juice and garnish the biryani with fried cashewnuts." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 17) {

			String[] temp = { "Mutton 1 kg", "Water 16 cups",
					"Green chilies 6", "Garlic Cloves 13",
					"1/2 KG Basmati RIce", "Onion 1 large slIced",
					"White cumin 1 tsp", "Black cumin 1/2 tsp",
					"Small green Cardamoms 5", "Big Cardamoms 3",
					"Cinnamon sticks 3 pieces",
					"Star anise (baadyan ka phol) 1", "Whole black pepper 11",
					"Cloves 5", "Yogurt whisked 1 cup", "Oil/ Ghee 3/4 cups",
					"Salt to taste" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Soak rice in water for half an hour. Than Cook mutton with garlic cloves, green chilies, little bit salt and water till tender and so much so that it left with 2-3 cups of stock in it.",
					"Heat up oil in a pan and fry onion till light golden brown.",
					"Add white cumin, black cumin, cinnamon sticks, star anise, small cardamoms, big cardamoms, cloves and black pepper whole and add meat in the pan, without stock. Fry for 3-4 minutes and add yogurt, cook for 4-5 minutes.",
					"Measure 7-1/2 cups of stock with water and pour in the pan.",
					"Add soaked rice too, without its water. Cook for 5 minutes on a high flame and on a low flame for 10 minutes than turn off the stove and let it be placed on the stove for 5-6 minutes for DAM. Now its ready to Serve with garnishing.", };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 19) {

			String[] temp = { "1kg Mutton", "1 big onion",
					"Some Garlic Cloves", "Salt to taste",
					"Black pepper to taste", "1 cup Creamed yogurt",
					"1/2 cup Oil", "Water",
					"Some Cream, Green chillies, Ginger and Coriander for garnishing" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Add mutton, onion, garlic, salt and 2 glass water in pressure cooker .",
					"Close the lid and cook for about 15 minutes .",
					"After it add oil and fry until most liquid is evaporated.",
					"Now add yogurt and black pepper and keep stirring until oil separates.",
					"Pour 1 glass water and close lid again .",
					"Further cook 3 -4 minutes then open.",
					"Garnish with green chilies, ginger and coriander ." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 23) {

			String[] temp = { "Meat ½ kg", "Potatoes ½ kg", "Bay leaves 2",
					"Black Cardamoms 2", "Green chilies 4",
					"Green Cardamoms 4", "Onion 250 gm", "Ghee 250 gm",
					"Yogurt 475 gm", "Whole black pepper 1 tsp",
					"Nutmeg & mace 1 tsp", "Black cumin 1 tsp", "Salt 1 tsp ",
					"Chili powder 1 tbsp", "Ginger Garlic paste 1 tbsp",
					"Kewra 1 tbsp", "Ginger chopped 1 tbsp",
					"Coriander powder 2 tsp", "All spIce powder 2 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Heat 250 gm ghee in a pan, add ½ kg potatoes cut into cubes, fry well and remove. In the remaining ghee add 250 gm chopped onion and fry till golden brown, remove brown onion and keep aside. Marinate ½ kg meat with 475 gm yogurt, 2 tsp coriander powder, 1 tbsp chili powder, 1 tsp salt, 1 tbsp ginger garlic paste and 1 tsp cumin seeds. Keep aside for 30 minutes.",
					"Put marinated meat in the remaining ghee, cook for 30 minutes till meat is done.",
					"Now add fried potatoes and crushed brown onion.",
					"Fry well. Add 2 glasses of water and cook for 30 minutes.",
					"Now crush 2 bay leaves, 4 green cardamoms and 1 tsp nutmeg mace powder together.",
					"Add crushed spice to the Qorma mixture and cook for another 30 minutes. Now turn the flame off, add 1 tbsp Kewra, 1 tbsp chopped ginger and 4 green chilies." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 28) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "1 glass milk (skim to full)",
					"1 -2 ounce chinese noodles", "1 1/2 teaspoons rose water",
					"1/2 teaspoon falooda seeds",
					" kulfi(per taste) or Ice Cream" };

			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Soak the Takmaria Seeds in water for at least 1 hour.",
					"Boil the noodles/sev in water for about 15 minutes.",
					"Drain the water, and boil the noodles in a little milk for about 5-10 minutes on low heat. Do not burn the noodles!",
					"Turn off the heat and add lots of ice to the pot to cool the noodles for about 10 minute Stir them to quicken the process.",
					"Put the noodles in the glass, add Rooafzah/Rose Water, pour in milk, add a little crushed ice and stir. (Rooafzah is a sweet syrup added to milk or water for a drink in itself).",
					"Top it off with a scoop or two of the Pista Kulfi Ice cream and enjoy!"

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 8) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "1 cup milk", "1 1/2 cups orange juice",
					"1 pitted cherries" };

			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"Pour milk and orange juice in a cup.", "Stir.",
					"Cut orange slice in half and take the seed out.",
					"Put cherry on cup.", "Stir, and Enjoy!!" };

			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 16) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "2 teaspoons instant coffee granules",
					"1 teaspoon Splenda granular", "3 tablespoons warm water",
					"6 fluid ounces cold milk" };

			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"In sealable jar, combine instant coffee,SPLENDA® Granulated Sweetener, and warm water.",
					"Cover the jar and shake until it is foamy.",
					"Pour into a glass full of ice. Fill the glass with milk.",
					"Adjust to taste if necessary" };

			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 21) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Flour 2 cups", "Oil 1/4 cup", "Salt 1 tsp",
					"Water to make dough", "For Paste To Apply On Katlama",
					"Eggs 2", "Pomegranate seeds 2 tsp",
					"Crushed red pepper 1-1/2 tsp", "Crushed cumin 1 tsp",
					"Coriander leaves 2 tbsp", "Coriander seeds 1 tsp",
					"Red color pinch" };

			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Make dough of salt, flour and oil and knead medium hard with water.",
					"Now cover it and leave for 30 minutes.",
					"Now make portions.",
					"Then make 3 balls and spread oil.",
					"Now roll it equal to dinner plate, make circle or oval paratha, mark cut with fork and spread paste with brush.",
					"Put paratha in pan, keep filling, roll it, sprinkle oil so that it becomes crisp.",
					"Now roll paratha and serve it." };

			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 24) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Milk 1-1/2 kg", "Rice 1/2 cup", "Khoya 1/2 cup",
					"Green cardamom 1 tsp", "Sugar 3/4 cup",
					"Kewra water 1 tsp", "Almonds and pistachios as required",
					"Silver paper as required" };

			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Boil milk, add soaked rice and stir it continuously for 15 minutes.",
					"Now put khoya and cook until rice tendered.",
					"In end, add green cardamom and kewra water and sprinkle almonds and pistachios.",
					"Then garnish with silver paper." };

			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		if (item.getId() == 35) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Beef mince ½ kg", "Onion 2 tbsp",
					"Ginger garlic paste 1 tbsp", "Red kidney beans 3 tbsp",
					"Tomatoes puree 2 tbsp", "Salt as required",
					"Tacos seasoning 1 tsp", "Capsicum 3 tbsp",
					"Green chillies 1 tbsp", "Tacos shells 4-5",
					"Grated cheddar cheese, sour cheese, coriander and nachos for garnishing" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Heat some oil in a pan and then put onion to fry. ",
					"Then put mince, ginger garlic paste, tomatoes puree, salt, seasoning and mix them. ",
					"Now add capsicum, red kidney beans, green chillies and let the mince cook well. ",
					"Put the prepared mince in tacos shells and put cheese and sour cheese over it. Put tacos dish in oven and melt the cheese. ",
					"Garnish it with coriander leave and nachos. Now fold it and serve. " };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 36) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Solid milk 1 cup heaped",
					"Caster sugar 4 tbsp heaped",
					"Almonds and pistachio 3 tbsp (chopped) ",
					"Cardamom powder 1 tsp",
					"Oil or clarified butter for deep frying",
					"For Kachori Covering: ", "Flour 2 cup",
					"Gram flour 1 tbsp", "Clarified butter 3 tbsp",
					"Water to knead", "For Syrup: ", "Water 1 cup",
					"Sugar 1 cup heaped", "Saffron ½ tsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"For Filling: Mix solid milk, caster sugar, almonds and pistachio, cardamom powder. ",
					"For Syrup: Make a 2 thread consistency sugar syrup by boiling sugar and water add saffron to it. ",
					"For Kachori Covering: Mix flour and gram flour, rub in clarified butter. ",
					"Make a medium dough by adding little water, knead for 5 minutes. ",
					"Cover and leave it for 15 minutes. ",
					"Make into 12 balls, flatten each fill with tablespoon of filling. ",
					"Collect the extra dough on top. ",
					"Fold on one side, flatten evenly with a thumb. ",
					"Heat clarified butter in a skillet. ",
					"Cool till it just warm. ",
					"Fry kachori on a low heat 3 to 4 at a time. ",
					"Drain when light golden. ",
					"Before serving break the kachori slightly spread a tablespoon of syrup over it and serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 37) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {
					"Chicken ½ kg (boneless, cut into medium cubes) ",
					"Baking powder 2 tsp", "Flour 1 cup",
					"Paprika ½ tsp heaped", "Salt ½ tsp heaped",
					"Chili powder ½ tsp", "Oil for deep fryingv",
					"For Sauce: ", "Butter 2 ounce", "Hot sauce ¼ cup",
					"Garlic powder ½ tsp", "Black pepper ½ tsp",
					"Sugar 1 tbsp", "Ketchup 2 tbsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"For Sauce: Cook all together in a sauce pan for 5 minutes. ",
					"For Chicken: Put chicken pieces in a large bowl. ",
					"Spread with baking powder and leave for 15 minutes. ",
					"In another bowl mix together flour, paprika, salt, chili powder and add chicken to this seasoned flour so that chicken is well coated. ",
					"Put in fridge for 30 minutes. ",
					"Heat oil in a frying pan. ",
					"Deep fry chicken bites until golden and crisp, toss in the prepared sauce to coat well. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 38) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Milk ½ liter", "Dates 6", "Figs 4", "Almonds 6",
					"Pistachios 6", "Cashew nuts 6", "Brown sugar 2 tbsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Chop the dates, figs, almonds, pistachios and cashews",
					"Blend the chopped ingredients with milk, in a blender along with brown sugar. ",
					"Winter Blast Dry Fruit shake is ready to serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 39) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Undercut ½ kg (cut into 1 inch cubes) ",
					"Oil ¼ cup", "Onion ½ cup (chopped) ",
					"Ginger garlic paste 1 tbsp", "Ketchup ½ cup",
					"Salt 1 tsp", "Mustard powder 1 tsp", "Black pepper ½ tsp",
					"Chili powder 1 tsp leveled", "Tomato paste 1 tbsp",
					"BBQ sauce 2 tbsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = { "Heat oil add onion, fry till transparent. ",
					"Add ginger garlic paste with undercut and fry well. ",
					"Add all the above ingredients and sauces, fry well. ",
					"Add half cup water for gravy, cook until done. ",
					"Serve with boiled rice. " };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 40) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Semolina ½ cup", "Milk 1 liter",
					"Cardamom powder 1 tsp", "Sugar 250 gm",
					"Green food color 1 tsp", "Solid milk ½ kg",
					"Coconut 2 cup (grated) "

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = { "In a pan add semolina to sauté. Keep aside. ",
					"In a separate pan add milk, cardamom and sugar to cook. ",
					"Dissolve green food color in water and add in milk pan. ",
					"Now add solid milk to cook and stir continuously. ",
					"Now add sauté semolina and cook till it turn thick. ",
					"Now take it out in a mould and garnish with coconut to serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 41) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Round meat ½ kg", "Clarified butter 1 cup",
					"Black cardamom 3 - 4 (whole) ", "Bay leaves 2 – 3",
					"Red chili 6 - 8 (whole) ", "Black pepper 1 tsp (whole) ",
					"Cinnamon sticks 3 – 4", "Ginger garlic paste 2 tbsp",
					"Yogurt 250 gm (whisked) ", "Onion 4 (sliced) ",
					"All spice powder 1 tbsp",
					"Green chilies 6 – 8 (chopped) ", "Salt to taste"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"In a pan heat clarified butter with black cardamom, bay leaves, red chili, black pepper and cinnamon sticks to crackle. ",
					"Then add meat pieces to cook till it turn brown. ",
					"Then add ginger garlic paste to saute. ",
					"Now put yogurt and again cook for 2 to 3 minutes to saute. ",
					"Now pour as required water to cook till meat tender. ",
					"Then add onion, all spice powder, green chilies and salt to mix and cook till it turn thick. ",
					"Dish it out and serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 42) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Undercut steaks 2 (strips cut) ", "Onion 1",
					"Mushroom 2 large", "Salt ¼ tsp", "Garlic minced 2 cloves",
					"Parsley flakes 1 ½ tsp", "Basil leaves 1 tsp (dried) ",
					"Oregano leaves 1 tsp (dried) ", "Ginger ½ tsp",
					"Cream 1 cup", "Pickle 2 large", "Parmesan cheese ½ cup",
					"Cheddar cheese ½ cup", "Butter 4 tbsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Saute onion and mushrooms in butter until slightly browned. ",
					"Add undercut steaks, salt and cook until browned. ",
					"Add all the spices and mix until combined. ",
					"Add the cream, pickles, parmesan cheese and cheddar cheese. Mix until combined. ",
					"Turn heat down to simmer and cover. ",
					"Let simmer for 10-15 minutes, until cream has reduced and sauce has thickened. ",
					"Serve steak cream sauce with mash or a jacket potato. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 43) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Green Mango 1", "Blueberries 150 gm",
					"Spinach 150 gm", "Cashew nuts 110 gm", "Almonds 55 gm",
					"Lime Juice 1 lime’s", "Yogurt 100 gm", "Honey 2 tbsp",
					"Fresh Mint 2 tbsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Peel the mango and cut into small pieces and divide these pieces into two jars. ",
					"First add blueberries and then spinach in those jars. ",
					"Now take a bowl and mix yogurt, lime juice, honey and mint add a dollop of this mixture in the jars. ",
					"Garnish with almonds and nuts. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 44) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Whole chicken 1", "Yogurt 4 tbsp",
					"Ginger garlic paste 2 tbsp", "Lemon juice 4 tbsp",
					"Cream 2 tbsp", "BBQ masala 4 tbsp", "Oil 2-3 tbsp",
					"Salt to taste"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Add chicken pieces then make marks with fork. ",
					"Now take a mixing bowl add yogurt, add beaten cream. ",
					"Now take a mixing bowl then add salt, pour oil add lemon juice, garlic paste, BBQ masala, ginger garlic paste then mix it well. ",
					"Then add chicken in spices and cream yogurt mixture for marination. ",
					"Marinate for 1 and half hour. ",
					"Now grease the oven tray put the marinated chicken bake it on 180 degree C for 25 to 30 minutes then steam it on coals. ",
					"In the end garnish it with salad leaves then serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 45) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Clarified butter 1 kg", "Sugar 1 kg",
					"All purpose flour ½ kg", "Baking soda ½ tsp",
					"Yogurt 1 tsp", "Solid milk 250 gm",
					"Cardamom seeds 5 - 6", "Pistachio as required",
					"Almond as required"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Heat clarified butter in a skillet. ",
					"Add clarified butter, water, baking soda and yogurt in a bowl and mix well. ",
					"Then add all purpose flour and knead well and make balls. ",
					"Then spread balls and fill with solid milk and fold it. ",
					"Then fry in clarified butter. ",
					"Combine sugar and water in a skillet and prepare sugar syrup. ",
					"Then dip fried gujiya in sugar syrup. ",
					"Take out in dish and garnish with almond and pistachio. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 46) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Chicken 750 gm", "Rice ½ kg (boiled) ",
					"Papaya 2 tbsp", "Yogurt 1 ½ gm",
					"Ginger garlic paste 1 tbsp", "Red chili powder 2 tsp",
					"Salt as required", "Coriander powder 1 tsp",
					"Turmeric 1 tsp", "All Spice 1 tbsp (whole) ", "Oil 1 cup",
					"Onion 250 gm", "Star anise 6", "Fennel seeds 1 tbsp",
					"Coriander 1 tbsp (whole) ", "Green chilies 6",
					"Milk ½ cup"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"First of all take a dish add chicken along with papaya, yogurt, ginger garlic paste, red chili powder, salt, coriander powder, turmeric, whole all spice powder. ",
					"Leave it for half an hour. ",
					"In a frying pan, add oil and cook onions until brown, also add chicken and cover it for 20 minutes. ",
					"After this add star anise, fennel seeds, whole coriander and place on chicken. ",
					"Now add green chilies and spread rice on it along with milk. Cover cook for 20 minutes. ",
					"In the end turn off the flame and mix well. ",
					"Ready to serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 47) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Digestive biscuits 1 packet (broken pieces) ",
					"Pineapple juice ½ cup", "Mango 2 (sliced) ",
					"Pineapple chunks 1 cup",
					"Vanilla custard 2 cups (cooked) ", "Cream 1 cup",
					"Sugar 2 tbsp", "Mix nuts ½ cup",
					"Chocolate syrup as required"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Spread layer of broken biscuits on the base of bowl. ",
					"Drizzle over half pineapple juice. ",
					"Set over mango slices and pineapple chunks. ",
					"Pour remaining juice then pour custard over fruits. ",
					"Beat cream and sugar. ",
					"Top custard with cream, garnish with nuts and chocolate syrup. ",
					"Chill in refrigerator and serve. ",
					"Note: You can make this dessert in individual glasses as well. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 48) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Chicken 1 kg", "Oil 1 cup",
					"Onion 250 gm (chopped) ", "Salt 1 tsp", "Turmeric ½ tsp",
					"Black Pepper 1 tsp (whole) ", "Ginger garlic paste 2 tsp",
					"Nutmeg mace 1 tsp (chopped) ", "Green chili 50 gm",
					"Yogurt 350 gm", "Cardamom 6",
					"White cumin seeds 1 tsp (chopped) ", "Kewra 1 tbsp",
					"Garlic 2 tbsp (finely chopped) "

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"In a frying pan, heat oil and add onion. ",
					"Now turn the flame low and dry the water of onion. ",
					"Add chicken, salt, turmeric, black pepper, ginger garlic paste, nutmeg mace along with this also take green chilies mixed in yogurt and mix with the mixture. ",
					"After this cook on the normal flame. ",
					"Cook until tender and add 1 glass of water. ",
					"Again cook until boil and let the boiling point come again twice. ",
					"When it will reach to 3rd boiling point then add 6 cardamoms, along with this add white cumin seeds. ",
					"Also add kewra, sprinkle garlic and turn off the flame. ",
					"Delicious Pahari Murgh is ready to serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 49) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Rice 1 cup (boiled) ", "Fresh milk 1 liter",
					"Sugar 1 cup", "Small cardamom powder 1 tsp",
					"Biscuits 1 packet (crushed) ", "Brown sugar ½ cup",
					"Almonds 15 (boiled) ", "Pistachios 15 (boiled) ",
					"Fresh cream 1 packet"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Crush the biscuits. ",
					"Take a pan and add in milk, sugar, rice and small cardamom powder. ",
					"Cook it and when the ferni thickens remove it from the pan. ",
					"Cool it and add in biscuits, brown sugar, almonds, pistachio and fresh cream. ",
					"Mix everything well. ",
					"In the end, set it in a serving dish. ", "Serve it cold. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 50) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Crust Pastry: ", "Plain flour 200 gm",
					"Caster sugar 1 tsp", "Unsalted butter 100 gm (chopped) ",
					"Egg 1", "Vanilla essence 1 tsp", "Salt a pinch",
					"For Lemon Filling: ", "Egg yolks 3",
					"Caster sugar 150 gm", "Lemon rind 2 tsp (finely grated) ",
					"Juice of 3 lemons", "Egg whites 4",
					"Icing sugar for dusting"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"To make the pastry, put plain flour, caster sugar and a good pinch of salt. ",
					"Add the unsalted butter in a bowl and rub between your fingertips until the mixture resembles fine breadcrumbs. Make a well in the centre combine the egg and vanilla essence. ",
					"And 2 tsp water and pour in the well. Slowly stir together flat bladed knife, adding more flour if the mixture is slightly sticky. ",
					"Make the ball of the mixture, wrap in plastic wrap and refrigerate for 20 minutes. ",
					"Preheat the oven to moderate 180 C. Gently roll the pastry between two sheets of baking paper to about 2.5mm (1/8 inch) thick put some baking beans on the paper, then put into a lightly greased baking tin, 22cm (8 ¾ inches). ",
					"Blind bake for 10 minutes. Remove the baking beans and the paper. Bake for 10 more minutes, or until the centre begins to colour. Remove from the oven and cool on a wire rack. ",
					"To Prepare the Lemon Filling: Heat a medium pan of water until gently simmering. ",
					"Whisk or beat the egg yolks and caster sugar in a large heat proof bowl until light and creamy. ",
					"Add the lemon rind, lemon juice and then the butter. Sit the bowl over the pan of simmering water and whisk continuously for 15-20 minutes, or until thickened. ",
					"When ready, the mixture will leave a ribbon when drizzled from the whisk. ",
					"While the filling is still hot, pour into the cool, pre-baked flan case. ",
					"Take a dry bowl and beat the egg whites with the help of beater and beat it become fluffy like snow. ",
					"Add 2tbsp of caster sugar and beat it for few seconds. ",
					"Place the meringue in a piping bag fitted with a 1 cm (1/2 inch) star nozzle. ",
					"Starting in the centre, pipe the meringue in continuous concentric circle covering the entire flan, keeping the meringue inside the pastry edge. Dust the surface with icing sugar. Bake for 5 minutes, or until the meringue is lightly coloured. Leave to cool and then refrigerate for 20 minutes, or until the filling is set. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 51) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Sugar 250 grams", "Milk solid ½ kg",
					"Green color 1 pinch", "Coconut 2 cups (grated) ",
					"Semolina ½ cup", "Cardamom powder 1 tsp",
					"Kewra essence a few drops"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Sauté semolina in a pan. ",
					"In another pan boil milk, cardamom, and sugar; mix it well. ",
					"In a cup mix water with a pinch of color and pour it into milk. ",
					"Add milk solid in milk and stir it continuously. ",
					"Then put coconut to mix. ",
					"In the end transfer semolina in pan and cook it till batter becomes thick. ",
					"Dish it out and garnish with coconut. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 52) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Fresh milk 1 litre",
					"Rice ½ cup (soak in water) ", "Almond 20 – 25",
					"Cardamom 6 (ground with sugar) ", "Khoya 250 gm",
					"Sugar 2 cup", "Condensed milk ½ tin", "Pistachio 10",
					"Silver paper for garnish"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"In a saucepan heat milk with cardamom, a low flame. ",
					"When it starts to turn brown in colour, crush the rice and add it with condensed milk. ",
					"Now stir it and add sugar with half of the almonds. ",
					"When the milk starts to thicken, pour it into a bowl and mix khoya after cooling. ",
					"Garnish with blanched almonds, pistachios and silver paper. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 53) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Egg yolk 1", "Butter 112 grams",
					"Refined flour 168 grams", "Caster sugar 56 grams",
					"Vanilla essence few drops", "For filling: ", "Eggs 2",
					"Pistachios chopped 1 tbsp", "Walnut chopped 1 tbsp",
					"Cinnamon ¼ tsp", "Raisins 2 tbsp",
					"Orange rind grated 2 tbsp", "Almonds 2 tbsp (chopped) ",
					"Glazed red cherries 2 tbsp",
					"Glazed green cherries 2 tbsp", "Sultanas 2 tbsp",
					"Jam 3 tbsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Beat butter, sugar and vanilla essence in a bowl till frothy. ",
					"Add egg yolk and beat. ",
					"Fold in refined flour. ",
					"Knead into soft dough, roll out. ",
					"With the help of a cutter, cut into rounds and place on a muffin tray. ",
					"Mix raisins, orange rind, walnuts, red and green cherries, sultanas, pistachios, cinnamon, almonds and eggs in a bowl. ",
					"Put 1 tbsp of mixture on each tart. ",
					"Bake in pre-heated oven at 180°c for 20 minutes. ",
					"Apply jam on sides of each tart, garnish with pistachios and serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 54) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Cake mix 1 package",
					"Pineapple 1 can (chopped) ", "Instant coffee 4 tsp",
					"Cinnamon 1 tsp", "Eggs 2", "Butter ¼ cup (melted) ",
					"Brown sugar ½ cup", "Walnut ¼ cup (chopped) ",
					"Salt ¼ tsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Grease round mold and preheat oven at 300 Degree C. ",
					"Drain pineapple and set aside syrup. ",
					"Mix cake mix, ¾ cup pineapple syrup, coffee and salt. ",
					"Add cinnamon and eggs; beat until combine. ",
					"In another bowl combine melted butter, brown sugar and 2 cups pineapple syrup. ",
					"Pour this mixture onto bottom of round mold then shift cake mixture over it. ",
					"Bake for 50-60 minutes. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 55) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Rice ½ kg", "Chicken 750 gms", "Potato 3",
					"Tomato 3", "Plum 1 cup", "Onion 2", "Yogurt 1 cup",
					"Lemon 2", "White cumin 1 tsp", "Black cumin ½ tsp",
					"Red chili crushed 1 ½ tbsp",
					"Whole garam masala as required", "Garam masala 1 tsp",
					"Ginger garlic paste 3 tbsp", "Coconut powder 4 tbsp",
					"Saffron as required", "Food color as required",
					"Green coriander ½ bunch", "Mint ½ bunches",
					"Green chili 5", "Clarified butter 1 cup",
					"Salt as required"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"For rice: ",
					"First boil water in a pan and add salt and cumin in it. ",
					"When smell starting to come add rice in it and half boil it. ",
					"For Qorma: ",
					"First heat up oil in a pan and add whole garam masala in it. ",
					"When it cooks a little add onion and cook it till it become brown. ",
					"Now add chicken and ginger garlic paste and cook it. ",
					"Now put yogurt, green chili, potato, red chili, garam masala powder and black cumin and cook it well. ",
					"Add coconut, plum and tomato and mix it well. ",
					"And cook it for 5 to 6 minutes. Qorma is ready. ",
					"For preparing layers: ",
					"First place a layer of qorma. ",
					"Now put half of rice on it. ",
					"Then again put layer of qorma and green coriander, mint and coconut powder and put remaining rice and put saffron and food color on top and in the end ½ cup clarified butter and covered it to cook. ",
					"Now garnish it with lemon slice. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 56) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Minced beef ½ kg",
					"Potatoes ½ kg boiled and mashed", "Capsicum 1 finely cut",
					"Tomatoes 2 finely cut", "Onions 1 cup finely cut",
					"Cheddar cheese ½ cup", "Milk ½ cup",
					"Ginger, garlic paste 1 tsp", "Black pepper powder 2 tsp",
					"Mustard powder 1 tsp", "Worcestershire sauce 1 tbsp",
					"All spices powder ½ tsp", "Tomato ketchup 4 tbsp",
					"Salt 1 tsp", "Oil ¼ cup"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Mix milk, salt and 1 tsp black pepper in potatoes, fill a piping bag with it and keep aside. ",
					"Heat oil in a pot and fry onions till golden. ",
					"Add tomatoes and ginger, garlic and fry. ",
					"Add mince, salt, remaining black pepper, mustard, Worcestershire sauce, hot spices and tomato ketchup. ",
					"Cook until mince is tender. ",
					"Layer a pyrex dish with mince, capsicum and cheese. ",
					"Decorate with potato using piping bag. ",
					"Bake dish in pre-heated oven at 180°c for 15 minutes. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 57) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {
					"Unsalted butter 110 gm (cut into small cubes and leave to soften) ",
					"Caster sugar 150 gm", "Large eggs 3 (lightly beaten) ",
					"Ground almonds 90 gm (almond powder) ",
					"Self-raising flour 40 gm", "Milk 1 tbsp",
					"Pure vanilla extract or almond extract (optional) 1 tsp",
					"Flaked almonds for sprinkling 1 tbsp",
					"Icing sugar for dusting"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Pre-heat oven at 180 degree C. ",
					"Grease with butter and flour the sides of a 20 cm pan, line the base with parchment paper, set aside. ",
					"Place butter, sugar and eggs in a mixing bowl, add almond powder, flour, milk, vanilla extract. ",
					"Then beat with an electric mixer or whisk. ",
					"Creamed butter and sugar first then add eggs one at a time and beat and then add remaining ingredients and beat until just well combined. ",
					"When quite light and fluffy, spoon into the prepared pan and spread the batter evenly. ",
					"Sprinkle the flaked almonds over the top. ",
					"Bake at 180 degree C for 30-35 minutes or until the sponge just springs back when pressed, or a skewer inserted into the centre comes out clean. ",
					"Cover the top with foil about 15-20 mins into baking to prevent the top from over browning. ",
					"Run a thin bladed knife around the sides of the pan to loosen the cake. ",
					"Then turn out onto a wire rack and let cool. ",
					"Dust with icing sugar before serving. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 58) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Turkey breast 4 (cut into long strips) ",
					"Cumin 1 tbsp (roasted, ground) ", "Hot milk 1/4 cup",
					"Rosemary 2 large springs (chopped) ", "Salt to taste",
					"Yogurt 200 gm", "Coriander 1 tbsp (roasted and ground) ",
					"Saffron 3-4 strains", "Red chili flakes 1 - 2 tsp",
					"Salt to taste", "Skewers as required",
					"Salad for Serving: ", "Cucumber 1", "Beetroot 1",
					"Curd 1/3 cup", "Sesame seed 1/2 tsp"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Chop veggies and mix into curd and sprinkle sesame seed toss well this salad and refrigerate. ",
					"In hot milk soak saffron for 15 minutes. ",
					"Hang curd into thin cloth and separate water. ",
					"Marinate turkey fillets with mixing all ingredients for overnight or minimum 1 hour. ",
					"Thread marinated fillets into skewers and bbq or cook on griddle. ",
					"Serve hot with veggie salad. ",

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 59) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Mutton chops ½ kg", "Raw papaya paste 3 tbsp",
					"Salt to taste", "Chili powder 1 tbsp", "Turmeric 1 tsp",
					"Coriander leaves ¼ bunch", "Ginger garlic paste 2 tbsp",
					"Oil 2 – 3 tbsp", "Aluminum foil as required"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Marinate mutton chops with raw papaya paste and salt to taste for 10 – 15 minutes. ",
					"Now add chili powder, turmeric, coriander leaves, ginger garlic paste and oil. ",
					"Now put each chop on aluminum foil and wrap. ",
					"Put a wire rack on burning coal. ",
					"Now put chops on wire rack and cook for 10 – 15 minutes each side. ",
					"BBQ chops are ready to serve. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 60) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Beef or lamb mince ½ kg",
					"Parsley 1 cup (chopped) ", "Onion 1 (finely chopped) ",
					"Bread slice 2", "Mix spices ½ tsp",
					"Paprika powder ¼ tspCinnamon powder ¼ tsp",
					"Salt & pepper as taste", "For Chip’s: ",
					"Onion 2 big slices", "Potatoes chip 1 kg",
					"Lemon juice 2 tbsp", "Water 4 tbsp",
					"Worcestershire sauce 2 tbsp", "Mix spices ¼ tsp",
					"Salt and pepper as taste", "Oil for frying 4 tbsp",
					"For Garlic Sauce: ", "Garlic bulb paste 1",
					"Vegetable oil ½ cup", "Mayonnaise 3 tbsp",
					"Lemon juice 1 squeezed", "Salt and pepper as taste"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Mix mince with parsley, onion, bread, spices, paprika, cinnamon, salt & pepper. ",
					"Divide & shape into small sausages. ",
					"Deep fry the chip’s & keep on kitchen paper to absorb the extra oil. ",
					"Heat 2 tbsp oil in a big pan or wok, fry the kafta, few at a time, remove & keep warm. ",
					"Heat the rest oil using the same pan & fry the onion slices till caramelized & brown on the edges, add the water, lemon juice, spices, salt and pepper & boil for 1 minute. ",
					"Then add the kafta & chip’s. ",
					"Serve with Pita bread, salad & garlic sauce. ",
					"For Garlic Sauce: ",
					"Put the garlic paste in a bowl, add salt & lemon juice, add a little oil at a time & mix with spoon. ",
					"Until the oil stop being absorbed. ",
					"Keep adding the oil until it run out. ",
					"Now add the mayonnaise & mix. ",
					"Put in a jar & refrigerate. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 61) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Tortilla chips 40 gm bag (crushed) ",
					"Chicken breasts 4", "Spicy tomato salsa 2 cups",
					"Sour cream 142 ml", "Cheddar cheese 1/2 cup (grated) "

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Put the chicken breasts on a non-stick baking tray, season, then slash each 3 times with a knife. ",
					"Spoon 1 tbsp of salsa on top of each, then 1 tbsp sour cream. ",
					"Sprinkle the chips over the chicken, then the cheese. ",
					"Roast for 15-20 mins at 180 degrees C or until the topping is golden and melting. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 62) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "Chicken pieces 6 (boneless) ",
					"Sour cream 1 cup", "Lemon juice 3 tbsp",
					"Worcestershire sauce ¼ tbsp", "Paprika ¼ tsp",
					"Garlic 1 clove (finely minced) ", "Salt ¼ tsp",
					"Black pepper 1 tsp", "Dry bread crumbs 1 ½ cup"

			};
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Combine all the ingredients (sour cream, lemon juice,Worcestershire sauce, paprika, garlic, salt and black pepper) in a bowl. ",
					"Dip all the chicken pieces in the mixtures in the bowl & coat it fully. ",
					"Cover it & refrigerate for whole night. ",
					"Then, remove it and coat the pieces in bread crumbs perfectly. ",
					"Get a shallow baking pan. ",
					"Brushed it well and place all the pieces maintaining inches differences. ",
					"Continue the process by baking the preparation at 350° for 45 minutes. ",
					"It is done once the chicken is tender and juicy. "

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		if (item.getId() == 67) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "7 oranges", "3 red guavas", "1 pear", "1 apple" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Use citrus juicer to juice oranges.",
					"place other fruits in a juice extractor and blend together",
					"add ice and let it cool", "Chill and enjoy" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 68) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"Super 7 lemon", "lime half bottle", "Water",
					"3 to 4 squeezed lemons", "Grated apple (optional)",
					"4 to 6 Granadilla pulps", "Mint leaves" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"Add super 7 lemons.", "add half glass of water.",
					"squeezed lemons", "add granadilla pulps mix",
					"freeze the mixture" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 69) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"500ml milk", "1/4 cup sugar", "1/2 cup frozen strawberries",
					"1 tablespoon coconut", "1/4 teaspoon tartaric acid",
					"1/4 cup water", };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"blend all ingredients", "cool it  down",
					"add ice cubes and enjoy", };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 70) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "8 strawberries, hulled", "1/2 cup skim milk",
					"1/2 cup plain yogurt", "3 tablespoons white sugar",
					"2 teaspoons vanilla extract", "6 cubes ice, crushed" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"add all items in the blender", "cool it", "drink it" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 71) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 banana", "1 1/4 cups sliced fresh strawberries",
					"10 whole almonds", "1 cup ice cubes",
					"3 tablespoons chocolate flavored protein powder" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"In a blender, blend banana with almonds and sliced strawberries",
					"than add ice cubes ",
					"mix it with 3 tablespoons chocolate flavored protein powder",
					"cool it", "drink it" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 72) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "1 peach, sliced", "1 mango, peeled and diced",
					"1/2 cup vanilla soy milk",
					"1/2 cup orange juice, or as needed" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"You can use fresh or frozen fruit in this yummy smoothie.",
					"It tastes better if the fruit is frozen, so I freeze fresh fruit for this.",
					"mix all the items in the blender ", "cool down the drink",
					"enjoy!!" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 73) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = { "1 mango, peeled and seeded",
					"1 papaya, peeled and seeded",
					"1/2 cup fresh strawberries", "1/3 cup orange juice",
					"5 cubes ice" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Place the mango, papaya, strawberries, orange juice, and ice cubes in an electric blender.",
					"Process until the ingredients are smooth." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 74) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 mango - peeled, seeded and cubed", "1 1/4 cups ice cubes",
					"2 tablespoons white sugar", "1 1/4 cups pineapple juice",
					"1/2 cup heavy cream", "1 (14 ounce) can coconut milk" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Place the mango cubes, ice, sugar, pineapple juice, cream, and coconut milk into a blender.",
					"Puree until smooth, pour into glasses and serve." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 75) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 mango - peeled, seeded and diced", "1 1/2 cups milk",
					"3 tablespoons honey", "1 cup ice cubes" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"Place the mango, milk, honey and ice cubes into a blender.",
					"Cover and blend until smooth. ", "Serve immediately" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 76) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1/2 small mango - peeled, seeded and diced",
					"1 banana, cut in chunks",
					"1 scoop vanilla ice cream (optional)",
					"1 tablespoon white sugar, or to taste",
					"1/8 teaspoon ground cinnamon, or to taste",
					"1 pinch ground nutmeg, or to taste", "2 cups milk" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Place mango, banana, and ice cream into a blender, and sprinkle with white sugar, cinnamon, and nutmeg.",
					"Pour in milk and place the lid on the blender.",
					"Blend until smooth, then pour into cups to serve." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 77) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 cup sliced mango", "1 cup diced, peeled papaya",
					"1 cup orange juice", "1/4 cup lime juice",
					"1/4 cup white sugar, or to taste",
					"1 teaspoon grated orange zest", "4 cups water" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Place the mango and papaya into a blender.",
					"Cover, and puree until smooth",
					"add the orange juice, lime juice, sugar, orange zest, and water.",
					"Blend well. Serve over crushed ice." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 78) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 mango - peeled, seeded, and cut into chunks",
					"1 banana, peeled and chopped", "1 cup orange juice",
					"1 cup vanilla nonfat yogurt" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"Place mango, banana, orange juice, and yogurt in a blender.",
					"Blend until smooth.",
					"Serve in clear glasses, and drink with a bendy straw!" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		} else if (item.getId() == 79) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 quart strawberries, hulled", "1 banana, broken into chunks",
					"2 peaches", "1 cup orange-peach-mango juice", "2 cups ice" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"In a blender, combine strawberries, banana and peaches.",
					"Blend until fruit is pureed.", "Blend in the juice.",
					"Add ice and blend to desired consistency.",
					"Pour into glasses and serve." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 80) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"3/4 cup cold milk", "1/4 cup vanilla yogurt",
					"3/4 teaspoon vanilla extract",
					"1 1/2 cups chopped fresh mango", "3 ice cubes" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"Blend the milk, yogurt, vanilla extract, mango, and ice cubes in a blender until smooth and creamy."

			};
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 81) {
			Log.i("Recipe Fragment", "Check Ok");
			String[] temp = {

			"1 cup vanilla yogurt", "1 cup unsweetened pineapple juice",
					"1/2 banana, sliced",
					"1 mango - peeled, seeded, and chopped",
					"1/2 cup nonfat milk", "2 tablespoons cream of coconut" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"In a blender, blend the vanilla yogurt, pineapple juice, banana, mango, milk",
					"and cream of coconut until smooth.",
					"cool down the drink", "enjoy!!" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
			Log.i("Recipe Fragment", "Assigning Ok");
		}

		else if (item.getId() == 82) {
			String[] temp = { "Chicken mince½ kg", "Cauliflower1",
					"Peas2 tbsp", "Pao bhaji Masala1 ½ tbsp", "Grated carrot2",
					"Tomatoes1", "Whole red chilies6", "Chopped garlic2 tbsp",
					"Chopped ginger", "1 tbsp", "Chopped onion 3",
					"Saltto taste", "Tomato puree2 tbsp",
					"Chopped green coriander1 bunch", "Lemons 2", "Oil½ cup" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Cut the cauliflower.",
					"Soak 6 dry red chilies.",
					"Together blend whole red chilies, 2 tbsp chopped garlic and 1 tbsp ginger in the blender.",
					"Take ½ cup oil in the pan and sauté 3 chopped onion and fry it till golden brown.",
					"Add in chopped tomatoes.",
					"Add in cauliflower and some salt and cook it.",
					"Add in 2 tbsp tomato puree and ½ kg chicken mince and add in water to dry.",
					"Add in grinder masala and 1-1/2 tbsp Pao Bhaji Masala in it.",
					"No take 2 grated carrots and ½ cup warm water and cook it. With the water dries add in 2 lemon juice and 1 bunch chopped green coriander and serve it hot." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 83) {
			String[] temp = { "Noodles 1 packet", "Undercut ½ kg",
					"Pineapple cubes 1 tin", "Soya sauce 2 tbsp",
					"Brown sugar 2 tbsp", "White vinegar 2 tbsp",
					"Corn flour 2 tbsp", "Salt to taste",
					"Crushed black pepper 1 tsp", "Chopped carrots 2",
					"Chopped capsicum 2", "Sesame seed oil 1 tsp", "Oil 3 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Boilone packet noodles along with 3 tbsp oil.",
					"When the noodles are boiled drain the water and wash them with cold water, grease them and keep them.",
					"Add in 1 tbsp soya sauce, 1 tbsp white vinegar and some salt  and keep it for 10 minutes.",
					"Heat oil and add in 4 chopped garlic cloves. Fry it till they are golden brown.",
					"Add in the meat and stir fry it.",
					"Add in 2 chopped carrots, 2 chopped capsicum, 2 tbsp brown sugar, 1 tbsp soya sauce, 1 tbsp white vinegar and 1 tsp crushed black pepper.Cook it and add in the noodles. Add in pine apple cubes. Add in 1 tsp sesame seed oil. Dish it out and serve." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 84) {
			String[] temp = { "Mutton ½ kg", "Mustard oil 1 cup",
					"Bay leaves 1", "Chopped onion 3", "Lemons 3",
					"Slightly boiled 4", "Green chilies  4",
					"Fresh red chilies 8",
					"Roasted and crushed cinnamon 1 tsp",
					"Crushed black pepper 1 tsp", "Turmeric 1 tsp",
					"Ginger garlic 1 tbsp", "Coriander seeds 1 tbsp",
					"Salt to taste" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Make cubes of 4 boiled potatoes. Fry them till they are golden brown.",
					"Take some mustard oil in the pan and fry onions till they are golden brown.",
					"Add in ½ kg mutton, salt, 1 tsp turmeric and 1 tbsp chopped ginger garlic.",
					"Cook it.",
					"When the water dries 8 chopped red chilies, 1 tbsp coriander seeds, 1 tsp roasted and crushed cinnamon , 1 tsp crushed black pepper and 1 bay leave.",
					"Add in 2 – 2 ½ cups of hot water till the meat tenders.",
					"Add in fried potatoes, 4 green chilies and 3 lemons. Simmer and serve hot with boiled rice." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 85) {
			String[] temp = { "Mutton ½ kg", "Yogurt 1 cup",
					"Clarified butter 1 cup",
					"Chopped green coriander 1 bunch", "Chopped onion 3",
					"Chopped green chilies 4", "Big cardamom 4",
					"Garlic cloves 8", "Red chili 8", "Turmeric 1 tsp",
					"White cumin 1 tsp", "Coriander seeds 1 tbsp",
					"Salt to taste" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Take some oil in the pan, add in 3 chopped onion and 4 big cardamom.",
					"When onion is golden brown add in meat and some salt.",
					"Then grind in 1 tsp turmeric, red chilies, 1 tsp white cumin and 1 tbsp  coriander  together and mix it with yogurt.",
					"Add the yogurt in and cook it for 10 minutes. Cook it till the water dries.",
					"When the gravy thickens and the meat tenders and in chopped coriander, chopped green chilies and serve." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 86) {
			String[] temp = {
					"3 tablespoons canola oil",
					"1 medium onion, finely diced",
					"4 cloves garlic, minced",
					"1 (1-inch thumb) fresh ginger, peeled and minced",
					"2 teaspoons ground coriander",
					"1 teaspoon paprika",
					"1/2 teaspoon store-bought or homemade garam masala, recipe follows",
					"1/2 teaspoon ground cumin",
					"1/2 teaspoon cayenne, optional",
					"1 pound ground beef",
					"2 medium tomatoes, chopped",
					"Kosher salt and freshly ground black pepper",
					"1 cup shucked fresh English peas or 1/2 cup frozen peas, thawed",
					"2 teaspoons malt vinegar or apple cider vinegar",
					"1/4 cup chopped fresh cilantro, plus a few extra leaves for garnish",
					"4 chapatis or pitas, warmed" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"In a large skillet, warm the oil over medium-high heat. Add the onions and cook until golden. Add the garlic and ginger, and saute for another minute. Stir in the coriander, paprika, garam masala, cumin and cayenne, if using and cook for 1 minute.",
					"Add the beef, breaking up lumps with a spoon, and saute until the meat is no longer pink. Add the tomatoes, 1 cup of water and season with salt and pepper. Sprinkle in the fresh English peas. Stir well and simmer, partially covered, about 10 minutes or if using frozen peas, add them now, and cook another 5 minutes, partially covered.",
					"Stir in the vinegar and chopped cilantro. Garnish with torn cilantro leaves and serve with warm chapatis or pita bread." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 87) {
			String[] temp = {
					"2 lb (900 g) chuck steak, chopped into 1 inch (2.5 cm) pieces",
					"1 rounded teaspoon cumin seeds",
					"1 rounded teaspoon coriander seeds",
					"3 cardamom pods (whole)",
					"1 level teaspoon fennel seeds",
					"1 level teaspoon whole fenugreek (alternatively, use ground fenugreek)",
					"3 tablespoons groundnut or other flavourless oil",
					"1 lb (450 g) onions, peeled and sliced into half-moon shapes about ½ (1 cm) thick",
					"3 cloves garlic, peeled and crushed",
					"3 green chillies, deseeded and finely chopped",
					"1 level tablespoon ground turmeric",
					"2 medium tomatoes, skinned and chopped",
					"3 oz (75 g) creamed coconut",
					"5 fl oz (150 ml) natural yoghurt",
					"salt and freshly milled black pepper" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"First of all you need to roast the whole spices, and to do this place them in a small frying pan or saucepan over a medium heat and stir and toss them around for 1-2 minutes, or until they begin to look toasted and start to jump in the pan.",
					"Now transfer them to a pestle and mortar and crush them to a powder.",
					"Next place 2 tablespoons of the oil in the casserole over a high heat and, when it is really hot, brown the pieces of meat a few at a time.",
					"Remove them to a plate, then add the rest of the oil and, when that's really hot, too, fry the onions till well browned – about 10 minutes – then add the garlic and chilli and cook for a further 2 minutes.",
					"Next return the meat to the pan, add the crushed spices, fenugreek powder (if you were unable to buy it whole), turmeric, ginger and tomatoes and stir everything around.",
					"Next grate the creamed coconut into a bowl and combine it with 10 fl oz (275 ml) boiling water using a whisk, then, when it has dissolved, pour it into the casserole, followed by the yoghurt and some seasoning.",
					"Now bring the mixture up to a slow simmer, put the lid on the casserole and simmer very gently for 2 hours.",
					"Just before serving, add the lime juice and sprinkle over the chopped fresh coriander",
					"Serve with spiced basmati rice and Fresh Coriander Chutney." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 88) {
			String[] temp = {
					"1 tbsp sunflower oil",
					"1 large onion, thinly sliced",
					"150 g (5½ oz) button mushrooms, sliced",
					"400 g (14 oz) sirloin steak, trimmed of fat and cut into thin strips",
					"1½ tsp bottled chopped root ginger in oil, drained",
					"2 garlic cloves, crushed", "½ tsp crushed dried chillies",
					"2 tsp ground coriander", "¼ tsp ground cardamom",
					"½ tsp turmeric", "¼ tsp grated nutmeg",
					"1 can chopped tomatoes, about 400 g",
					"1 tsp cornflour mixed with 1 tbsp water",
					"300 g (10½ oz) plain low-fat yogurt",
					"1 tbsp clear honey", "125 g (4½ oz) young spinach leaves",
					"juice of ½ lime",
					"2 tbsp chopped fresh coriander, plus extra leaves to garnish" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Heat the oil in a large saucepan and add the onion and mushrooms. ",
					"Cook over a high heat for 2 minutes or until the onion slices begin to colour.",
					"Add the beef together with the ginger, garlic, chillies, ground coriander, cardamom, turmeric and nutmeg.",
					"Cook for 2 minutes, stirring well, then add the tomatoes with their juice and the cornflour mixture.",
					"Bring to the boil, stirring. Stir in the yogurt and honey.",
					"Bring back to the boil, then reduce the heat, cover and simmer gently for 20 minutes.",
					"Meanwhile, prepare the cardamom rice. Put 450 ml (15 fl oz) cold water in a saucepan and bring to the boil. Add the rice, cinnamon stick and cardamom pods.",
					"Bring back to the boil, then cover tightly and cook for 10 minutes or until the rice is tender.",
					"Drain and return the rice to the saucepan. Stir in the lemon juice and keep covered until the curry is ready to serve.",
					"Stir the spinach, lime juice and chopped coriander into the curry and allow the leaves to wilt down into the sauce.",
					"To serve, spoon the curry over the rice and garnish with fresh coriander leaves." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 89) {
			String[] temp = {
					"2 tablespoons canola oil",
					"1 medium onion, thinly sliced",
					"12 fresh curry leaves or 2 bay leaves",
					"6 garlic cloves, grated",
					"4 teaspoons finely grated peeled fresh ginger",
					"1 tablespoon tomato paste dissolved in 1/2 cup of water",
					"2 teaspoons ground coriander",
					"1 teaspoon garam masala",
					"1 teaspoon cayenne",
					"1/2 teaspoon ground turmeric",
					"4 small dried hot chiles",
					"4 star anise pods",
					"1 3/4 pounds boneless beef short ribs, cut into 3/4-inch pieces",
					"Salt" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"In a medium enameled cast-iron casserole, heat the oil until shimmering.",
					"Add the onion and curry leaves and cook over moderate heat until lightly browned, about 7 minutes.",
					"Add the garlic and ginger and cook until fragrant, 1 minute.",
					"Stir in the dissolved tomato paste along with the coriander, garam masala, cayenne, turmeric, dried chiles, star anise and cinnamon sticks.",
					"Add the ribs, season with salt and stir until coated with spices.",
					"Cover partially and cook over very low heat until the meat is tender, about 1 hour and 30 minutes.",
					"Spoon off as much fat as possible and discard the star anise, cinnamon sticks and bay leaves, if using." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 90) {
			String[] temp = {
					"1 kg boneless lamb, cut into 3cm cubes",
					"1 medium onion, chopped",
					"2 teaspoons fresh ginger, grated",
					"3 garlic cloves, roughly chopped",
					"1 tablespoon coriander seed",
					"2 teaspoons ground cumin",
					"1 teaspoon cardamom pod",
					"1/2 teaspoon salt",
					"1 teaspoon chili flakes, depending on taste (less (or more)",
					"2 tablespoons ghee", "1 medium onion, extra, sliced",
					"2 tablespoons tomato paste", "1/2 cup yoghurt" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Put the onion, ginger, garlic, coriander seeds, cumin, cardamom, salt and chili flakes into a food processor and process until a smooth paste forms (or use a mortar and pestle).",
					"Add the spice mix to the lamb and stir well to coat. Set aside for 1 hour.",
					"Heat ghee in a large pan or wok. Add the extra onions and cook, stirring over moderate heat until the onions soften.",
					"Add the lamb and cook for 8 to 10 minutes, stirring constantly,until the lamb cubes are browned all over.",
					"Add the tomato paste and 2 tablespoons of the yoghurt and stir until combined.",
					"Simmer uncovered until the liquid is absorbed.",
					"Add the remaining yoghurt, 2 tablespoons at a time, stirring between each addition until the liquid is absorbed.",
					"Cover the pan and simmer over a low heat for 30 minutes, stirring occasionally.",
					"Serve with rice, raitas and relishes." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 91) {
			String[] temp = {
					"2 bananas, peeled and sliced in thick circular pieces",
					"1 cup flour", "1 cup milk", "1 1/2 teaspoons sugar",
					"1 egg", "1 teaspoon baking powder",
					"2 tablespoons vegetable oil" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Peel and slice your bananas in small pieces.",
					"In a bowl, mix flour, milk, sugar, beaten egg, baking powder and oil as directed.",
					"Mix well until you get a thick mixture.",
					"Slide all your chopped banana pieces into this mixture.",
					"Take a deep frying saucepan or wok. Make sure you heat about half a cup of oil to the saucepan so the dumplings fry well.",
					"Keep the stove on medium to high heat.",
					"Using a tablespoon or wooden spoon, pick each banana piece from the bowl and pour directly into the hot oil. A little bit of the mixture will spread around the banana piece and that's good.",
					"Turn each dumpling after 1-2 minutes of deep frying so both sides are done well.",
					"As soon as the dumplings are golden brown, drain them on paper towel and serve hot with tea or coffee!" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 92) {
			String[] temp = { "1 lb beef, in 1-inch cubes",
					"1 1/2 teaspoons salt", "1/2 pint yogurt", "8 ounces ghee",
					"2 onions, sliced", "2 ounces fresh ginger",
					"4 garlic cloves, finely chopped",
					"2 teaspoons ground coriander", "1 teaspoon garam masala",
					"1/2 teaspoon ground red chili pepper",
					"2 teaspoons paprika", "1/2 teaspoon ground cumin",
					"2 teaspoons turmeric" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Rub the salt into the meat.",
					" In a bowl marinate the meat in the yogurt for 24 hours in the refridgerator.",
					"In a heavy pan melt the ghee and fry the onions till golden.",
					"Add the garlic and ginger and all of the spices, stir and cook for 5 mins over low heat.",
					"Add the meat and the yogurt mix and cook till the meat is tender about 50 minutes.",
					"Serve with a side dish of curried okra and boiled rice." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 93) {
			String[] temp = { "2 1/2 lbs lamb, cubed", "3 tablespoons ghee",
					"1 tablespoon ground cumin",
					"1 tablespoon ground coriander", "1 teaspoon turmeric",
					"1 teaspoon chili powder",
					"1 inch cube fresh ginger, grated",
					"3 garlic cloves, crushed", "1 large red onion, sliced",
					"14 ounces tomatoes", "1 tablespoon tomato puree",
					"5 ounces warm water", "1 teaspoon salt",
					"4 ounces double cream", "2 teaspoons garam masala",
					"2 tablespoons fresh coriander leaves, chopped" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {
					"Melt two tbsp ghee over medium heat and fry the meat till it changes colour, remove from the pan.",
					"Lower the heat and fry the cumin, coriander, turmeric, chilli powder, ginger and garlic for 1 minute.",
					"Raise the heat to medium and refry the meat with any juices for 3 minutes.",
					"Add the onions and stir fry for 5 minutes.",
					"Add the tomatoes and tomato puree cook for 2 minutes.",
					"Add the salt and water, bring to the boil and simmer till meat is tender approximately 1 hour.",
					"Stir in the cream and turn off the heat.",
					"In a small pan melt the remaining ghee and fry the garam masala stir and add a tbsp of the meat sauce to the pan stir and add to the meat.",
					"Garnish with the coriander leaves.",
					"Serve with Cumin rice, a vegetable dish, chutney and pappads." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 94) {
			String[] temp = { "Fine Mince ½ kg", "Salt 1 tsp heaped",
					"Chili powder 1 tsp", "All spice 1 tsp",
					"Onion 2 tbsp (chopped)",
					"Coriander leaves 2 tbsp (chopped)",
					"Green chilies 1 tbsp (chopped)",
					"Ginger garlic paste 1 tbsp", "Clarified butter 2 tbsp",
					"Solid milk ½ cup", "Oil 2 tbsp " };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Marinate mince with salt, chili powder, all spice, onion, coriander leaves, green chilies, ginger garlic paste, clarified butter and solid milk.",
					"Make seekh kababs shape.",
					"Shallow fry in oil, give simmer of charcoal.",
					"Serve with chutney." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 95) {
			String[] temp = {
					"Chicken drumsticks 1 kg give deep cuts on both sides",
					"Thick yogurt 2 tbsp heaped", "Raw papaya 1 tbsp",
					"Ginger garlic paste 1 tbsp", "Green chilies 1 tbsp",
					"Salt 1 ½ tsp", "White cumin crushed 2 tsp",
					"Pinch of yellow color", "Vinegar 2 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"In a bowl mix Thick yogurt 2 tbsp heaped, Raw papaya 1 tbsp, Ginger garlic paste 1 tbsp",
					"Green chilies 1 tbsp, Salt 1 ½ tsp, White cumin crushed 2 tsp, Pinch of yellow color, Vinegar 2 tbsp, marinate chicken legs for 2 hours in the fridge, put on skewers, BBQ brushing with oil and left over marinade.",
					" Serve immediately" };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 96) {
			String[] temp = { "Boneless chicken ½ kg 2 inch cubes",
					"Black cumin ¼  tsp", "Crushed black pepper ¾ tsp",
					"Butter to brush as required", "Grated cheese 3 tbsp",
					"Fresh cream 2 tbsp", "Egg white 1", "Allspice 1 tsp",
					"Ginger garlic 1 tbsp", "Green chili paste 1 tbsp heaped",
					"Lemon juice 1 tbsp", "Salt 1 tsp", "Yogurt 4 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Marinate the boneless cubes of chicken with Black cumin ¼ tsp, Crushed black pepper ¾ tsp",
					"Butter to brush as required, Grated cheese 3 tbsp, Fresh cream 2 tbsp, Egg white 1, Allspice 1 tsp, Ginger garlic 1 tbsp, Green chili paste 1 tbsp heaped, Lemon juice 1 tbsp, Salt 1 tsp, Yogurt 4 tbsp threads the pieces on skewers.",
					"Pre heat oven 180 degree C and grills for 15 minutes, brush with butter and remove." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 97) {
			String[] temp = { "Mutton ½ kg", "Ginger garlic paste 1 tbsp",
					"Papaya paste ½ cup", "Yogurt ½ cup", "Turmeric  1 tsp",
					"Red chili flakes 1 tbsp", "All spice powder 1 tsp",
					"Crushed black pepper 1 tsp", "Oil 2 tbsp",
					"Salt to taste", "Coal 1 piece", "Thread as required" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Put 1 tbsp ginger garlic paste, ½ cup papaya paste, ½ cup yogurt, 1 tsp turmeric, 1 tbsp red chili flakes,  tsp all spice powder, 1 tsp crushed black pepper, 2 tbsp oil and some salt in ½ kg mutton and marinade it for 3-4 hours.",
					"Put them in bbq sticks and put thread around it. ",
					"Then either steam it and fry it or bake it in the oven. ",
					"Give it a coal smoke or BBQ it. ",
					"Garnish it with tomatoes, onion and salad leaves and serve." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 98) {
			String[] temp = { "Mutton Ribs ½ kg", "Papaya paste 3-4 tbsp",
					"Red chili powder 1 tbsp", "BBQ Masala 2 tbsp",
					"Turmeric powder 1 tsp", "All spice powder 1 tsp",
					"Kabab chini powder ½ tsp", "Crushed black pepper 2 tsp",
					"Lemon juice 4 tbsp", "Ginger garlic paste 2 tbsp",
					"Oil 4-5 tbsp", "Salt to taste", "Coal 1 piece" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Add 3-4 tbsp with papaya paste and keep it for 3-4 tbsp.",
					" now take 3-4 tbsp papaya paste, 1 tbsp red chili, 2 tbsp bbq masala, 1 tsp turmeric powder, 2 tbsp bbq masala, 1 tbsp turmeric powder, 1 tsp all spice powder, ½ tsp kabab chini powder, 2 tsp crushed black pepper, 4 tbsp lemon juice, 2tbsp ginger garlic paste, salt and 2 tbsp oil. ",
					"Make a paste and put it on ribs and keep it for 1 ½ hours. ",
					"Preheat the oven at 200c and bake it for 15-20 minutes.  ",
					"Put oil on both the sides of ribs and when they are ready take them out and give coal burn. ",
					"Serve hot." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 99) {
			String[] temp = { "Undercut  ½ kg thinly sliced",
					"Salt  ½ + ½ tsp", "White pepper ½ + ½ tsp",
					"Sugar 1 + 1 tsp", "Soya sauce  1 tbsp",
					"Oil  2 tbsp + ¼ cup", "Corn flour  1 + 1 tbsp",
					"Egg ½ beaten", "Chopped garlic 1 tbsp", "Stock  2 cups",
					"BBQ sauce  4 tbsp", "Ketchup 2 tbsp",
					"Finely chopped spring onion leaves for garnish 1 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Marinate thinly sliced undercut with salt, white pepper ½ tsp each, sugar 1 tsp, soya sauce 1 tbsp, oil 2 tbsp, corn flour 1 tbsp, ½ beaten egg for 15 minutes.",
					"Deep fry for 10 minutes and remove.",
					"Heat ¼ cup oil in a wok",
					"Add 1 tbsp chopped garlic, slightly brown.",
					"Add in your fried beef with stock, salt and white pepper ½ tsp each, sugar 1 tsp, BBQ sauce 4 tbsp, ketchup.",
					"When mixture boiling, thicken gravy with corn flour paste, serve on a sizzler garnish with chopped green onion leaves." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 100) {
			String[] temp = { "Flour ½ kg", "Yeast 20 gm",
					"White butter 20 gm", "Salt 10 gm", "Sugar 10 gm",
					"Water as required", "Ingredients for Pizza Sauce",
					"Tomato paste 1 cup", "Garlic paste 1 tbsp",
					"Oregano ½ tsp", "Thyme ½ tsp",
					"Crushed red pepper 1 tbsp", "Salt to taste", "Oil 3 tbsp",
					"Ingredients for Topping", "Chicken breast 2",
					"Capsicum 1", "Tomato 1", "Onion 1",
					"Mozzarella cheese 1 packet", "Parsley ½ bunch",
					"Coriander leaves ¼ bunch", "Yogurt 125 gm",
					"Turmeric 1 tbsp", "Chili powder 1 tbsp",
					"Allspice powder 1 tbsp", "Cumin powder ½ tsp",
					"Salt to taste", "Oil 3 tbsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"In a bowl mix together ½ kg flour, yeast, white butter, salt and sugar. Then knead to a medium soft dough with water as required. Cover and keep in a warm place till rise and doubled.",
					"Method for Sauce",
					"Heat 3 tbsp oil in a pan, add 1 tbsp garlic paste and sauté for a few seconds.",
					"Then add tomato paste, oregano, thyme, crushed red pepper and salt to taste. Fry well.",
					"Now add ¼ cup water and cook on low flame till sauce thickens.",
					"Method for Topping",
					"Heat 3 tbsp oil in a pan, add 2 tbsp ginger garlic paste and sauté. Then add chicken breast cut into cubes and fry till golden brown.",
					"Now add 125 gm yogurt, 1 tbsp turmeric, 1 tbsp chili powder, 1 tbsp all spice powder, ½ tbsp cumin powder and salt to taste. Fry well till water dries.",
					"Now spread the dough in a greased pizza pan, brush edges of the dough with a little oil.",
					"Spread prepared pizza sauce on top. Then top with cooked chicken, also spread all the chopped vegetables.",
					"Make a layer of grated mozzarella cheese on top.",
					"Lastly bake in a preheated oven on 220 degrees for 15 – 20 minutes.",
					"Remove from oven, cut into wedges and serve hot." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 101) {
			String[] temp = { "Chicken 1 kg 16 pieces", "Salt 1 ½ tsp heaped",
					"Vinegar 4 tbsp", "White pepper 1 tsp leveled",
					"Crushed red pepper 1 tsp", "Kachri powder 1 tsp" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

			"Give cuts on chicken marinate with Salt 1 ½ tsp heaped, Vinegar 4 tbsp, White pepper 1 tsp leveled, Crushed red pepper 1 tsp, Kachri powder 1 tsp for 3 hours, put on skewers, BBQ over hot charcoal, brushing with oil lastly for glazed." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 102) {
			String[] temp = { "Mutton leg 1", "Papaya paste 3 tbsp",
					"Vinegar 4 tbsp", "Lemon juice 1 tbsp", "Lemon skin ½ tsp",
					"Oil 3 tbsp", "Mint leaves ¼ bunch",
					"Ginger garlic paste 2 tbsp", "Brown sugar 1 tbsp",
					"Salt to taste", "Black pepper powder ½ tsp",
					"Chili powder 1 tbsp", "Worchester sauce 2 tbsp" };
	
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Debone the whole chicken leg piece, do not remove the bone completely and remain it attached with the meat.",
					"Open the whole piece into book form.",
					"Marinate mutton leg piece with 2 tbsp ginger garlic paste and 3 tbsp papaya paste.",
					"Now rub mutton with salt, black pepper, lemon juice, lemon skin, Worchester sauce, fruit vinegar and oil.",
					"Lastly sprinkle with mint leaves, chili powder and brown sugar. Rub all the marinade very well.",
					"Now wrap mutton with aluminum foil, fit in a grilling stand and cook over burning charcoal from both sides." };
			directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		} else if (item.getId() == 103) {
			String[] temp = { "1/2 kg mutton", "1/2 kg tomatoes",
					"2 onions, sliced", "2 tbsp karahi masala",
					"1/2 tsp coriander powder", "1 tsp red chilli crushed",
					"1/2 tsp cumin powder", "1/2 tsp garam masala powder",
					"1/2 tsp black pepper powder", "1 tsp salt", "2 tbsp oil",
					"1/2 tsp turmeric powder", "4-5 green chillies",
					"Coriander chopped to garnish",
					"3-4 tbsp ginger, to garnish" };
			ingredients = new String[temp.length];
			System.arraycopy(temp, 0, ingredients, 0, temp.length);
			String[] temp1 = {

					"Boil mutton and keep its stock aside. ",
					"Grind half tomatoes with half cup of mutton stock and cook this puree with 1 tbsp oil and add 2tbsp karahi masala. When oil separates then keep it aside.",
					"Heat remaining oil in a pan and add sliced onions, when it turns golden colour add chopped tomatoes and when tomatoes are tender then add turmeric powder , red chilli crushed and garlic paste cook it for 2-3 minutes. Add mutton, ginger, coriander powder, cumin powder.",
					"Now add tomato puree, green chillies, ginger, garam masala and black pepper. Add 1/2 cup water and cook covered for 10 minutes on low flame. Garnish with coriander leaves. " };
		directions = new String[temp1.length];
			System.arraycopy(temp1, 0, directions, 0, temp1.length);
		}

		LinearLayout llIngredients = (LinearLayout) view
				.findViewById(R.id.ll_Ingredients);
		LinearLayout llDirection = (LinearLayout) view
				.findViewById(R.id.ll_direction);

		Context context = getActivity();
		int flag = 0;
		for (int k = 0; k < ingredients.length; k++) {
			LinearLayout ll = new LinearLayout(context);
			ll.setOrientation(LinearLayout.HORIZONTAL);
			ll.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT));
			ImageView iv = new ImageView(context);
			if (flag == 0) {
				iv.setBackgroundResource(R.drawable.black_bar);
				flag++;
			} else if (flag == 1) {
				iv.setBackgroundResource(R.drawable.darkblue_bar);
				flag++;
			} else if (flag == 2) {
				iv.setBackgroundResource(R.drawable.red_bar);
				flag++;
			} else {
				iv.setBackgroundResource(R.drawable.blue_bar);
				flag = 0;
			}
			iv.setLayoutParams(new LayoutParams(10, LayoutParams.MATCH_PARENT));
			ll.addView(iv);
			TextView tv = new TextView(context);
			tv.setText(ingredients[k]);
			tv.setId(k + 1);
			tv.setTextSize(18);
			if (k % 2 == 0) {
				tv.setBackgroundResource(R.color.grey);
			}
			tv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT));
			tv.setPadding(3, 10, 3, 10);
			ll.addView(tv);
			llIngredients.addView(ll);
		}
		for (int l = 0; l < directions.length; l++) {
			LinearLayout ll = new LinearLayout(context);
			ll.setOrientation(LinearLayout.HORIZONTAL);
			ll.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT));
			// ll.setBackgroundResource(R.color.transparent);
			ImageView iv = new ImageView(context);
			if (flag == 0) {
				iv.setBackgroundResource(R.drawable.black_bar);
				flag++;
			} else if (flag == 1) {
				iv.setBackgroundResource(R.drawable.darkblue_bar);
				flag++;
			} else if (flag == 2) {
				iv.setBackgroundResource(R.drawable.red_bar);
				flag++;
			} else {
				iv.setBackgroundResource(R.drawable.blue_bar);
				flag = 0;
			}
			iv.setLayoutParams(new LayoutParams(10, LayoutParams.MATCH_PARENT));
			ll.addView(iv);
			TextView tv = new TextView(context);
			tv.setText(directions[l]);
			tv.setId(l + 30);
			tv.setTextSize(18);
			tv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT));
			tv.setPadding(3, 10, 3, 10);
			if (l % 2 == 0) {
				tv.setBackgroundResource(R.color.grey);
			}
			// tv.setAlpha((float)0.5);
			ll.addView(tv);
			llDirection.addView(ll);
		}
		return view;
	}
}