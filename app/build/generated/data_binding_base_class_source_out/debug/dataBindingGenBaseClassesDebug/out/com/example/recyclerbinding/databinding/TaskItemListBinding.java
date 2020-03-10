package com.example.recyclerbinding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.recyclerbinding.Book;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TaskItemListBinding extends ViewDataBinding {
  @NonNull
  public final TextView bookAuthor;

  @NonNull
  public final TextView bookDescription;

  @NonNull
  public final TextView bookId;

  @NonNull
  public final TextView bookPublished;

  @NonNull
  public final TextView bookTitle;

  @Bindable
  protected Book mModel;

  protected TaskItemListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView bookAuthor, TextView bookDescription, TextView bookId, TextView bookPublished,
      TextView bookTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bookAuthor = bookAuthor;
    this.bookDescription = bookDescription;
    this.bookId = bookId;
    this.bookPublished = bookPublished;
    this.bookTitle = bookTitle;
  }

  public abstract void setModel(@Nullable Book model);

  @Nullable
  public Book getModel() {
    return mModel;
  }

  @NonNull
  public static TaskItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.task_item_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TaskItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TaskItemListBinding>inflateInternal(inflater, com.example.recyclerbinding.R.layout.task_item_list, root, attachToRoot, component);
  }

  @NonNull
  public static TaskItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.task_item_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TaskItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TaskItemListBinding>inflateInternal(inflater, com.example.recyclerbinding.R.layout.task_item_list, null, false, component);
  }

  public static TaskItemListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TaskItemListBinding bind(@NonNull View view, @Nullable Object component) {
    return (TaskItemListBinding)bind(component, view, com.example.recyclerbinding.R.layout.task_item_list);
  }
}
