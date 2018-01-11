package com.example.yasuhiro.myapplication.di;

import android.content.Context;
import com.example.yasuhiro.myapplication.Pojo.Child;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ChildModule_ProvideChildFactory implements Factory<Child> {
  private final ChildModule module;
  private final Provider<Context> contextProvider;

  public ChildModule_ProvideChildFactory(ChildModule module, Provider<Context> contextProvider) {  
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Child get() {  
    Child provided = module.provideChild(contextProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Child> create(ChildModule module, Provider<Context> contextProvider) {  
    return new ChildModule_ProvideChildFactory(module, contextProvider);
  }
}

