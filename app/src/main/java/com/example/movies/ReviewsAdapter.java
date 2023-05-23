package com.example.movies;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder>{

    private List<Review> reviews = new ArrayList<>();

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ReviewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.review_item,
                parent,
                false);
        return new ReviewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsViewHolder holder, int position) {
        Review review = reviews.get(position);
        String type = review.getType();
        int colorResId;

        if (Objects.equals(type, "Позитивный")) {
            colorResId = android.R.color.holo_green_light;
        } else if (Objects.equals(type, "Негативный")) {
            colorResId = android.R.color.holo_red_light;
        } else {
            colorResId = R.color.yellow;
        }
        int color = ContextCompat.getColor(holder.itemView.getContext(), colorResId);
        holder.linearLayoutContainer.setBackgroundColor(color);
        holder.textViewReviewerName.setText(review.getAuthor());
        Log.d("onBindViewHolder1", review.getAuthor());
        holder.textViewReviewDescription.setText(review.getReview());
        Log.d("onBindViewHolder1", review.getReview());

    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    static class ReviewsViewHolder extends RecyclerView.ViewHolder {

        private final TextView textViewReviewerName;
        private final TextView textViewReviewDescription;
        private final LinearLayout linearLayoutContainer;

        public ReviewsViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewReviewerName = itemView.findViewById(R.id.textViewReviewerName);
            textViewReviewDescription = itemView.findViewById(R.id.textViewReviewDescription);
            linearLayoutContainer = itemView.findViewById(R.id.linearLayoutContainer);
        }

    }
}
