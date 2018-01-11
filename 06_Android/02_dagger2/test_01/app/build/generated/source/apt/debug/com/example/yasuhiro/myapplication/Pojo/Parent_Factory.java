package com.example.yasuhiro.myapplication.Pojo;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Parent_Factory implements Factory<Parent> {
  private final Provider<Child> repositoryProvider;

  public Parent_Factory(Provider<Child> repositoryProvider) {  
    assert repositoryProvider != null;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public Parent get() {  
    return new Parent(repositoryProvider.get());
  }

  public static Factory<Parent> create(Provider<Child> repositoryProvider) {  
    return new Parent_Factory(repositoryProvider);
  }
}

