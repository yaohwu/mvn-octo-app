# mvn-octo-app

A java starter app for the beginner using maven build test and deploy java (spring) app or lib.

This contains three modules, the lib module called `base-lib`, the spring app module called `spring-app`, and the third
lib module called `third-lib`.

They can stand for the construction of most app.

## build

Just build with

```shell
mvn clean install
```

Then you will get the `spring-app-2021.12-SNAPSHOT-app-fatty.jar` in `spring-app/target` folder.

You can run the spring app with

```shell
java -jar spring-app/target/spring-app-2021.12-SNAPSHOT-app-fatty.jar
```

With a new terminal window

```shell
curl http://localhost:8078/app/hello
# Hello World!
```

### build in a shade jar

### build a executable spring app jar

## test

### use dependency module test jar

### generate test coverage report

## deploy

Follow [this](https://stackoverflow.com/a/42917618/7859396) to create account and distribute your public key.

### make it friendly to CI/CD

