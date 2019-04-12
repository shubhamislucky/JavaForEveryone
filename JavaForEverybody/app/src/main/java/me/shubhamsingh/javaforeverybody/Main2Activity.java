package me.shubhamsingh.javaforeverybody;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;


public class Main2Activity extends AppCompatActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {


    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#8b85ff")));
        bar.setElevation(10);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);





        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));



    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = null;
        ActionBar actionBar2 = getSupportActionBar();

        switch(position){
            case 0:
                fragment = new java2();
                setTitle("Java : Overview");
                mTitle = "Java : Overview";
                break;
            case 1:
                fragment = new Features();
                setTitle("The Java Buzzwords");
                mTitle = "The Java Buzzwords";
                break;
            case 2:
                fragment = new OOP();
                setTitle("Object-Oriented Programming");
                mTitle = "Object-Oriented Programming";
                break;
            case 3:
                fragment = new SetJava();
                setTitle("Set up your JAVA");
                mTitle = "Set up your JAVA";
                break;
            case 4:
                fragment = new FirstProgram();
                setTitle("First Java Program");
                mTitle = "First Java Program";
                break;
            case 5:
                fragment = new JavaBasic();
                setTitle("Java Basic Definitions");
                mTitle = "Java Basic Definitions";
                break;
            case 6:
                fragment = new DataTypes();
                setTitle("Data types & Literals");
                mTitle = "Data types & Literals";
                break;
            case 7:
                fragment = new Operators();
                setTitle("Operators in Java");
                mTitle = "Operators in Java";
                break;
            case 8:
                fragment = new Variables();
                setTitle("Variables in Java");
                mTitle = "Variables in Java";
                break;
            case 9:
                fragment = new If_else();
                setTitle("If-else Statement");
                mTitle = "If-else Statement";
                break;
            case 10:
                fragment = new me.shubhamsingh.javaforeverybody.Switch();
                setTitle("Switch Statement");
                mTitle = "Switch Statement";
                break;
            case 11:
                fragment = new For_loop();
                setTitle("The For Loop");
                mTitle = "The For Loop";
                break;
            case 12:
                fragment = new While();
                setTitle("While Loop");
                mTitle = "While Loop";
                break;
            case 13:
                fragment = new DoWhile();
                setTitle("Do While Loop");
                mTitle = "Do While Loop";
                break;
            case 14:
                fragment = new Break();
                setTitle("Break Statement");
                mTitle = "Break Statement";
                break;
            case 15:
                fragment = new Continue();
                setTitle("Continue Statement");
                mTitle = "Continue Statement";
                break;
            case 16:
                fragment = new Methods();
                setTitle("Methods in Java");
                mTitle = "Methods in Java";
                break;
            case 17:
                fragment = new ObjectsAndClasses();
                setTitle("Objects and Classes");
                mTitle = "Objects and Classes";
                break;
            case 18:
                fragment = new UserInput();
                setTitle("Getting User Input");
                mTitle = "Getting User Input";
                break;
            case 19:
                fragment = new Constructor();
                setTitle("Constructors in Java");
                mTitle = "Constructors in Java";
                break;
            case 20:
                fragment = new ConstructorOverloading();
                setTitle("Constructor Overloading");
                mTitle = "Constructor Overloading";
                break;
            case 21:
                fragment = new MethodOverloading();
                setTitle("Method Overloading");
                mTitle = "Method Overloading";
                break;
            case 22:
                fragment = new Strings();
                setTitle("Strings in Java");
                mTitle = "Strings in Java";
                break;
            case 23:
                fragment = new Arrays();
                setTitle("Arrays");
                mTitle = "Arrays";
                break;
            case 24:
                fragment = new Foreach();
                setTitle("Foreach Loop");
                mTitle = "Foreach Loop";
                break;
            case 25:
                fragment = new Inheritance();
                setTitle("Inheritance");
                mTitle = "Inheritance";
                break;
            case 26:
                fragment = new Overriding();
                setTitle("Method Overriding");
                mTitle = "Method Overriding";
                break;
            case 27:
                fragment = new Super();
                setTitle("Super keyword");
                mTitle = "Super keyword";
                break;
            case 28:
                fragment = new Abstract();
                setTitle("Abstract Class and Methods");
                mTitle = "Abstract Class and Methods";
                break;
            case 29:
                fragment = new myinterface();
                setTitle("Interface");
                mTitle = "Interface";
                break;
            case 30:
                fragment = new Package();
                setTitle("Packages in Java");
                mTitle = "Packages in Java";
                break;
            case 31:
                fragment = new Modifiers();
                setTitle("Access Modifiers");
                mTitle = "Access Modifiers";
                break;
            case 32:
                fragment = new CmdArguments();
                setTitle("Command Line Arguments");
                mTitle = "Command Line Arguments";
                break;
            case 33:
                fragment = new Exception();
                setTitle("Exception Handling in Java : I");
                mTitle = "Exception Handling in Java : I";
                break;
            case 34:
                fragment = new Exception_two();
                setTitle("Exception Handling in Java : II");
                mTitle = "Exception Handling in Java : II";
                break;
            case 35:
                fragment = new Exception_three();
                setTitle("Exception Handling in Java : III");
                mTitle = "Exception Handling in Java : III";
                break;
            case 36:
                fragment = new Exception_four();
                setTitle("Exception Handling in Java : IV");
                mTitle = "Exception Handling in Java : IV";
                break;
        }

        fragmentManager.beginTransaction()

                .replace(R.id.container, fragment)
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main2, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((Main2Activity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
