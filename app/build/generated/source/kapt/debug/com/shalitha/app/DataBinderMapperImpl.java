package com.shalitha.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.shalitha.app.databinding.ActivityLoginBindingImpl;
import com.shalitha.app.databinding.ActivitySignUpBindingImpl;
import com.shalitha.app.databinding.ActivitySplashBindingImpl;
import com.shalitha.app.databinding.ItemBreakingNewsListingBindingImpl;
import com.shalitha.app.databinding.ItemShimmerBreakingNewsListingBindingImpl;
import com.shalitha.app.databinding.ItemShimmerTopNewsListingBindingImpl;
import com.shalitha.app.databinding.ItemTopNewsListingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_ACTIVITYSIGNUP = 2;

  private static final int LAYOUT_ACTIVITYSPLASH = 3;

  private static final int LAYOUT_ITEMBREAKINGNEWSLISTING = 4;

  private static final int LAYOUT_ITEMSHIMMERBREAKINGNEWSLISTING = 5;

  private static final int LAYOUT_ITEMSHIMMERTOPNEWSLISTING = 6;

  private static final int LAYOUT_ITEMTOPNEWSLISTING = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.activity_sign_up, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.item_breaking_news_listing, LAYOUT_ITEMBREAKINGNEWSLISTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.item_shimmer_breaking_news_listing, LAYOUT_ITEMSHIMMERBREAKINGNEWSLISTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.item_shimmer_top_news_listing, LAYOUT_ITEMSHIMMERTOPNEWSLISTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.shalitha.app.R.layout.item_top_news_listing, LAYOUT_ITEMTOPNEWSLISTING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_sign_up_0".equals(tag)) {
            return new ActivitySignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBREAKINGNEWSLISTING: {
          if ("layout/item_breaking_news_listing_0".equals(tag)) {
            return new ItemBreakingNewsListingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_breaking_news_listing is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSHIMMERBREAKINGNEWSLISTING: {
          if ("layout/item_shimmer_breaking_news_listing_0".equals(tag)) {
            return new ItemShimmerBreakingNewsListingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_shimmer_breaking_news_listing is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSHIMMERTOPNEWSLISTING: {
          if ("layout/item_shimmer_top_news_listing_0".equals(tag)) {
            return new ItemShimmerTopNewsListingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_shimmer_top_news_listing is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTOPNEWSLISTING: {
          if ("layout/item_top_news_listing_0".equals(tag)) {
            return new ItemTopNewsListingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_top_news_listing is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_login_0", com.shalitha.app.R.layout.activity_login);
      sKeys.put("layout/activity_sign_up_0", com.shalitha.app.R.layout.activity_sign_up);
      sKeys.put("layout/activity_splash_0", com.shalitha.app.R.layout.activity_splash);
      sKeys.put("layout/item_breaking_news_listing_0", com.shalitha.app.R.layout.item_breaking_news_listing);
      sKeys.put("layout/item_shimmer_breaking_news_listing_0", com.shalitha.app.R.layout.item_shimmer_breaking_news_listing);
      sKeys.put("layout/item_shimmer_top_news_listing_0", com.shalitha.app.R.layout.item_shimmer_top_news_listing);
      sKeys.put("layout/item_top_news_listing_0", com.shalitha.app.R.layout.item_top_news_listing);
    }
  }
}
