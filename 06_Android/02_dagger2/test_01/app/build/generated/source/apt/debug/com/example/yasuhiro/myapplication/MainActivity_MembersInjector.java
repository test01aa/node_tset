package com.example.yasuhiro.myapplication;

import android.app.Activity;
import com.example.yasuhiro.myapplication.Pojo.Parent;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final MembersInjector<Activity> supertypeInjector;
  private final Provider<Parent> objParentProvider;

  public MainActivity_MembersInjector(MembersInjector<Activity> supertypeInjector, Provider<Parent> objParentProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert objParentProvider != null;
    this.objParentProvider = objParentProvider;
  }

  @Override
  public void injectMembers(MainActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.objParent = objParentProvider.get();
  }

  public static MembersInjector<MainActivity> create(MembersInjector<Activity> supertypeInjector, Provider<Parent> objParentProvider) {  
      return new MainActivity_MembersInjector(supertypeInjector, objParentProvider);
  }
}

