// Generated code from Butter Knife. Do not modify!
package com.leapfrog.inventorymanagementsystem.cart;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CartRvAdapter$ViewHolder$$ViewBinder<T extends com.leapfrog.inventorymanagementsystem.cart.CartRvAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 16908308, "field 'tvItemName'");
    target.tvItemName = finder.castView(view, 16908308, "field 'tvItemName'");
  }

  @Override public void unbind(T target) {
    target.tvItemName = null;
  }
}
