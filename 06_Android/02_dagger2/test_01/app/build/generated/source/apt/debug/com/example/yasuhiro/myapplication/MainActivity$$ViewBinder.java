// Generated code from Butter Knife. Do not modify!
package com.example.yasuhiro.myapplication;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.example.yasuhiro.myapplication.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131165193, "field 'editText'");
    target.editText = finder.castView(view, 2131165193, "field 'editText'");
    view = finder.findRequiredView(source, 2131165194, "field 'button' and method 'aaa'");
    target.button = finder.castView(view, 2131165194, "field 'button'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.aaa();
        }
      });
  }

  @Override public void unbind(T target) {
    target.editText = null;
    target.button = null;
  }
}
