// Generated code from Butter Knife. Do not modify!
package com.leapfrog.inventorymanagementsystem.widgets;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CustomItemViewGroup$$ViewBinder<T extends com.leapfrog.inventorymanagementsystem.widgets.CustomItemViewGroup> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492984, "field 'tvItemName'");
    target.tvItemName = finder.castView(view, 2131492984, "field 'tvItemName'");
    view = finder.findRequiredView(source, 2131492970, "field 'ivItemPic'");
    target.ivItemPic = finder.castView(view, 2131492970, "field 'ivItemPic'");
    view = finder.findRequiredView(source, 2131492987, "field 'ivFavIndicator'");
    target.ivFavIndicator = finder.castView(view, 2131492987, "field 'ivFavIndicator'");
    view = finder.findRequiredView(source, 2131492986, "field 'ivFav'");
    target.ivFav = finder.castView(view, 2131492986, "field 'ivFav'");
    view = finder.findRequiredView(source, 2131492985, "field 'tvDealerName'");
    target.tvDealerName = finder.castView(view, 2131492985, "field 'tvDealerName'");
    view = finder.findRequiredView(source, 2131492971, "field 'tvPrice'");
    target.tvPrice = finder.castView(view, 2131492971, "field 'tvPrice'");
  }

  @Override public void unbind(T target) {
    target.tvItemName = null;
    target.ivItemPic = null;
    target.ivFavIndicator = null;
    target.ivFav = null;
    target.tvDealerName = null;
    target.tvPrice = null;
  }
}
