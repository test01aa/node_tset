package com.example.yasuhiro.myapplication.Pojo;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Child_Factory implements Factory<Child> {
  private final Provider<Context> contextProvider;

  public Child_Factory(Provider<Context> contextProvider) {  
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Child get() {  
    return new Child(contextProvider.get());
  }

  public static Factory<Child> create(Provider<Context> contextProvider) {  
    return new Child_Factory(contextProvider);
  }
}

