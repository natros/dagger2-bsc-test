package com.github.natros.bsc;

import dagger.Component;

@Component(modules = ServicesModule.class)
public interface MyComponent {
  Main getMain();
}
