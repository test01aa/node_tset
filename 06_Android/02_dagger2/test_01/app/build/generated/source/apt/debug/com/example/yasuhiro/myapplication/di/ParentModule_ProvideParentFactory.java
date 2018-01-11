package com.example.yasuhiro.myapplication.di;

import com.example.yasuhiro.myapplication.Pojo.Child;
import com.example.yasuhiro.myapplication.Pojo.Parent;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ParentModule_ProvideParentFactory implements Factory<Parent> {
  private final ParentModule module;
  private final Provider<Child> childProvider;

  public ParentModule_ProvideParentFactory(ParentModule module, Provider<Child> childProvider) {  
    assert module != null;
    this.module = module;
    assert childProvider != null;
    this.childProvider = childProvider;
  }

  @Override
  public Parent get() {  
    Parent provided = module.provideParent(childProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Parent> create(ParentModule module, Provider<Child> childProvider) {  
    return new ParentModule_ProvideParentFactory(module, childProvider);
  }
}

