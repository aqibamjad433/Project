package cleodora.eidrecipes;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.app.FragmentTransaction;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle mDrawerToggle;
	private ListView mDrawerList;
	private boolean mDrawerOpenStatus=true;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		mDrawerLayout.setFocusableInTouchMode(false);

		// Enabling Home button
		getActionBar().setHomeButtonEnabled(true);

		// Enabling Up navigation
		getActionBar().setDisplayHomeAsUpEnabled(true);
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

			/** Called when drawer is closed */
			public void onDrawerClosed(View view) {
				mDrawerOpenStatus=false;
				//invalidateOptionsMenu();

			}

			/** Called when a drawer is opened */
			public void onDrawerOpened(View drawerView) {

				Log.i("Drawer","Opened");
				mDrawerOpenStatus=true;
				//invalidateOptionsMenu();
			}

		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		mDrawerLayout.openDrawer(Gravity.LEFT);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		
		List<DrawerItem> rowItems;
		rowItems = new ArrayList<DrawerItem>();
		rowItems.add(new DrawerItem("Special", R.drawable.dr_dining));
		rowItems.add(new DrawerItem("Drinks", R.drawable.dr_drinks));
		rowItems.add(new DrawerItem("Deserts", R.drawable.dr_cake));
		rowItems.add(new DrawerItem("Appetizer", R.drawable.dr_dining));
		rowItems.add(new DrawerItem("Rice", R.drawable.dr_rice));
		rowItems.add(new DrawerItem("Curry and BBQ", R.drawable.dr_curry));
		//rowItems.add(new DrawerItem("About", R.drawable.about));
		DrawerListAdapter adapter = new DrawerListAdapter(
				this, R.layout.drawer_list_item, rowItems);
	/*	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1,
				drawerValues);

		// Assign adapter to ListView
		mDrawerList.setAdapter(adapter);
*/
		mDrawerList.setAdapter(adapter);
		// Setting the adapter on mDrawerList

		mDrawerList.setOnItemClickListener(new SlideMenuClickListener());

		//displayView(0);
		Fragment fragment = new RecipeList(0);
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction transaction = fragmentManager
				.beginTransaction();

		transaction.replace(R.id.fragment_container, fragment).commit();

	}

	private class SlideMenuClickListener implements
			ListView.OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			displayView(position);
		}
	}
	@Override
    public void onBackPressed() 
    {
		Log.i("Activity","BackPressed Called");
		//boolean re=mDrawerLayout.isDrawerOpen(mDrawerList); 
		if(mDrawerOpenStatus==true)
		{
			Log.i("Activity","Opened Called");
			this.finish();
		}
		else
		{
			mDrawerLayout.openDrawer(Gravity.LEFT);
		}
    }
	private void displayView(int position) {
		// update the main content by replacing fragments
		Fragment fragment = null;
		Log.i("ListView Action", " " + position);
		if(position==6)
		{
			//FragmentManager fragmentManager = getFragmentManager();
			fragment=new EmptyFragment();
			/*fragmentManager.addOnBackStackChangedListener(new OnBackStackChangedListener() {
			        @Override
			        public void onBackStackChanged() {
			        	mDrawerLayout.openDrawer(Gravity.LEFT);
			            if(getFragmentManager().getBackStackEntryCount() == 0)
			            {
			            	mDrawerLayout.openDrawer(Gravity.LEFT);
			            }
			        }
			    });*/
		}
		else
		{
		fragment = new RecipeList(position);
		}
		mDrawerList.setItemChecked(position, true);
		mDrawerList.setSelection(position);
		// setTitle(navMenuTitles[position]);
		mDrawerLayout.closeDrawer(Gravity.LEFT);
		/*
		 * switch (position) { case 0: fragment = new RecipeList(); break; case
		 * 1: fragment = new RecipeList(); break; case 2: fragment = new
		 * RecipeList(); break; case 3: fragment = new RecipeList(); break; case
		 * 4: fragment = new RecipeList(); break; case 5: fragment = new
		 * RecipeList(); break;
		 * 
		 * default: break; }
		 */
		if (fragment != null) {
			FragmentManager fragmentManager = getFragmentManager();
			FragmentTransaction transaction = fragmentManager
					.beginTransaction();
			transaction
					.setCustomAnimations(R.animator.card_flip_right_in,
							R.animator.card_flip_right_out,
							R.animator.card_flip_left_in,
							R.animator.card_flip_left_out);

			transaction.replace(R.id.fragment_container, fragment).commit();
		}
	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// If the drawer is open, hide action items related to the content view
		// boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
		boolean drawerOpen = true;
		menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}
}
