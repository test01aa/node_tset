package com.example.yasuhiro.myapplication.di;

import android.content.Context;
import com.example.yasuhiro.myapplication.MainActivity;
import com.example.yasuhiro.myapplication.MainActivity_MembersInjector;
import com.example.yasuhiro.myapplication.Pojo.Child;
import com.example.yasuhiro.myapplication.Pojo.Parent;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<Context> provideApplicationContextProvider;
  private Provider<Child> provideChildProvider;
  private Provider<Parent> provideParentProvider;
  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApplicationContextProvider = ScopedProvider.create(AppModule_ProvideApplicationContextFactory.create(builder.appModule));
    this.provideChildProvider = ChildModule_ProvideChildFactory.create(builder.childModule, provideApplicationContextProvider);
    this.provideParentProvider = ParentModule_ProvideParentFactory.create(builder.parentModule, provideChildProvider);
    this.mainActivityMembersInjector = MainActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideParentProvider);
  }

  @Override
  public void inject(MainActivity activity) {  
    mainActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private ChildModule childModule;
    private ParentModule parentModule;
    private AppModule appModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (childModule == null) {
        this.childModule = new ChildModule();
      }
      if (parentModule == null) {
        this.parentModule = new ParentModule();
      }
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder childModule(ChildModule childModule) {  
      if (childModule == null) {
        throw new NullPointerException("childModule");
      }
      this.childModule = childModule;
      return this;
    }
  
    public Builder parentModule(ParentModule parentModule) {  
      if (parentModule == null) {
        throw new NullPointerException("parentModule");
      }
      this.parentModule = parentModule;
      return this;
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  }
}

