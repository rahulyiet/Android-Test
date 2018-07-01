package com.example.joker.androidtest;

import android.content.Context;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    ArrayList<Movie> movieArrayList;
    Context context;
    ClickListner clickListner;






    public MovieAdapter(Context context, ArrayList<Movie> movieArrayList) {
        this.movieArrayList = movieArrayList;
        this.context = context;

        clickListner = (ClickListner) context;

    }



    //TODO 7: Complete the @Override methods accordingly by inflating list_item.xml as layout of list.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);



        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.bind(position);

    }


    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        ImageView movieImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            //TODO 8 get the reference of nameTextView and heroImageView using itemView

             nameTextView=(TextView) itemView.findViewById(R.id.nameTextView);
             movieImageView=(ImageView) itemView.findViewById(R.id.imageView);


        }

        public void bind(final int position) {

            //TODO 9 Set title to nameTextView using moveiArrayList and position

           Movie movie = movieArrayList.get(position);
           nameTextView.setText(movie.getName());
           nameTextView.setText(movie.getDetail());




            //TODO 10 set image using glide
            //example Glide.with(context).load(getImage(my_drawable_image_name)).into(heroImageView);
            String imageName = getImageName(position);

            //write you code below this

            Glide.with(context).load(getImage("file:///android_drawable/batman.jpeg")).into(movieImageView);

            Glide.with(context).load(getImage("file:///android_drawable/deadpool.jpeg")).into(movieImageView);

            Glide.with(context).load(getImage("file:///android_drawable/doctor_strange.jpeg")).into(movieImageView);

            Glide.with(context).load(getImage("file:///android_drawable/iron_man.jpeg")).into(movieImageView);
            Glide.with(context).load(getImage("file:///android_drawable/spiderman.jpeg")).into(movieImageView);

            Glide.with(context).load(getImage("file:///android_drawable/thor.jpeg")).into(movieImageView);



            movieImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    clickListner.onClick(position);

                }
            });

        }

        private String getImageName(int position) {

            switch (position) {
                case 0:
                    return "batman.jpeg";
                case 1:
                    return "deadpool.jpeg";
                case 2:
                    return "doctor_strange.jpeg";
                case 3:
                    return "iron_man.jpeg";
                case 5:
                    return "spiderman.jpeg";
                case 6:
                    return "thor.jpeg";
                default:
                    return null;
            }

        }

        public int getImage(String imageName) {

            return context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        }

    }
}
