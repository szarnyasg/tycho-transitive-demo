# tycho-transitive-demo

1. Build the `my.tycho` project, then the `my.maven` project.

    ```bash
    cd my.tycho
    mvn clean install
    cd ..
    cd my.maven
    mvn clean install
    ```

2. Try to run the `my.maven` project.

  ```bash
  java -jar target/my.maven-1.0.0-SNAPSHOT.jar 
  ```

  It will throw an error:

  ```
  Exception in thread "main" java.lang.NoClassDefFoundError: com/google/common/collect/ImmutableMap
    at my.tycho.TychoWorker.sayHello(TychoWorker.java:8)
    at my.maven.MavenMain.main(MavenMain.java:8)
  Caused by: java.lang.ClassNotFoundException: com.google.common.collect.ImmutableMap
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    ... 2 more
  ```
