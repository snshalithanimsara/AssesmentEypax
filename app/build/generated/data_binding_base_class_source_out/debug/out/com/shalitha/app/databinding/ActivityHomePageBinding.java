// Generated by view binder compiler. Do not edit!
package com.shalitha.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.shalitha.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editSearchNews;

  @NonNull
  public final RecyclerView recycleBreakingNews;

  @NonNull
  public final RecyclerView recycleTopNews;

  @NonNull
  public final ShimmerFrameLayout shimmerBreakingNewsListing;

  @NonNull
  public final ShimmerFrameLayout shimmerTopNews;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textViewAllBreakingNews;

  @NonNull
  public final TextView textViewAllTopNews;

  private ActivityHomePageBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editSearchNews, @NonNull RecyclerView recycleBreakingNews,
      @NonNull RecyclerView recycleTopNews, @NonNull ShimmerFrameLayout shimmerBreakingNewsListing,
      @NonNull ShimmerFrameLayout shimmerTopNews, @NonNull TextView textView,
      @NonNull TextView textView1, @NonNull TextView textViewAllBreakingNews,
      @NonNull TextView textViewAllTopNews) {
    this.rootView = rootView;
    this.editSearchNews = editSearchNews;
    this.recycleBreakingNews = recycleBreakingNews;
    this.recycleTopNews = recycleTopNews;
    this.shimmerBreakingNewsListing = shimmerBreakingNewsListing;
    this.shimmerTopNews = shimmerTopNews;
    this.textView = textView;
    this.textView1 = textView1;
    this.textViewAllBreakingNews = textViewAllBreakingNews;
    this.textViewAllTopNews = textViewAllTopNews;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edit_search_news;
      EditText editSearchNews = rootView.findViewById(id);
      if (editSearchNews == null) {
        break missingId;
      }

      id = R.id.recycle_breaking_news;
      RecyclerView recycleBreakingNews = rootView.findViewById(id);
      if (recycleBreakingNews == null) {
        break missingId;
      }

      id = R.id.recycle_top_news;
      RecyclerView recycleTopNews = rootView.findViewById(id);
      if (recycleTopNews == null) {
        break missingId;
      }

      id = R.id.shimmer_breaking_news_listing;
      ShimmerFrameLayout shimmerBreakingNewsListing = rootView.findViewById(id);
      if (shimmerBreakingNewsListing == null) {
        break missingId;
      }

      id = R.id.shimmer_top_news;
      ShimmerFrameLayout shimmerTopNews = rootView.findViewById(id);
      if (shimmerTopNews == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = rootView.findViewById(id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.text_view_all_breaking_news;
      TextView textViewAllBreakingNews = rootView.findViewById(id);
      if (textViewAllBreakingNews == null) {
        break missingId;
      }

      id = R.id.text_view_all_top_news;
      TextView textViewAllTopNews = rootView.findViewById(id);
      if (textViewAllTopNews == null) {
        break missingId;
      }

      return new ActivityHomePageBinding((ConstraintLayout) rootView, editSearchNews,
          recycleBreakingNews, recycleTopNews, shimmerBreakingNewsListing, shimmerTopNews, textView,
          textView1, textViewAllBreakingNews, textViewAllTopNews);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
