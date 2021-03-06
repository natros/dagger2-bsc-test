package com.github.natros.bsc;

import dagger.Module;
import dagger.Provides;

@Module
public class ServicesModule {
  @Provides
  static UserService provideUserService() {
    return new UserService();
  }

  @Provides
  static AuthService provideAuthService() {
    return new AuthService();
  }
}
