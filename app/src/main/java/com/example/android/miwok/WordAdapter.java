package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    // We need a constructor to tell Java how to build this new adapter
    public WordAdapter(Activity context, ArrayList<Word> numbersList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list of data.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, numbersList);
    }

    @NonNull
    @Override
    /*
     * To create our own array adapter, we have to change the way a normal adapter gives a view
     * to the ListView/Recycler. A normal array adapter expects a view with a single TextView
     * element to be returned. Since our ViewGroup has two TextViews, we need to tell our custom
     * adapter how to populate and fill in that data for the two TextViews.
     *
     * @param position - Remember, an ArrayAdapter is going through an array or arrayList and populating
     *                   the screen with multiple Views that we defined in the list_item.xml file.
     *                   The position variable is the position of the current element in the array
     *                   that the adapter is accessing information from.
     *
     * @param convertView - This is the Layout that is going to be recycled and displayed all
     *                      over the screen. You can use this to reference the individual views id's
     *
     * @param parent - The ViewGroup (The whole xml components) that is used to display and recycle
     *                 on the screen. Usually used with the LayoutInflater.
     *
     * @return - must return the Layout(View) With its information filled out so it can be displayed
     */
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView; // Gets the layout
        // Here, if there are no views to recycle, then it will inflate a view (convert the given
        // XML file into a view) and display it on the screen.
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Gets the item in the arrayList at the position being used by the adapter
        Word currentWord = getItem(position);

        /*
         * We now have to fill in the information for each view that the layout has. This tells
         * the adapter how to populate the views with the proper information to be displayed and
         * recycled.
         */
        TextView spanishTextView = (TextView) listItemView.findViewById(R.id.spanishText);
        spanishTextView.setText(currentWord.getSpanishWord());

        TextView defaultWordTextVIew = (TextView) listItemView.findViewById(R.id.englishText);
        defaultWordTextVIew.setText(currentWord.getDefaultWord());

        // Once all views have been coded to display information, then we can return the layout(View)
        return listItemView;
    }
}
