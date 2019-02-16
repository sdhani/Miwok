package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//inherits behavior from the
public class WordAdapter extends ArrayAdapter<Word>{

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColorResourceId;

    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }


    /**
     * getView method is called when the listview is trying to display
     * a list of items at a given position. So it will pass in a potential
     * view we could use i.e. convertView
     * */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null){
            //creates a new list item view layout
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent, false);
        }

        Word currentWord = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage()){
            //Set image to the image resource specified in the current word
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        }else {
            //if no image is specified set to Gone (8)
            image.setVisibility(View.GONE);
        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultWord());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_view_layout);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        

        return listItemView;
    }
}
