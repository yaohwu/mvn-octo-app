# mvn-octo-app

A java starter app for the beginner using maven build test and deploy java (spring) app or lib.

This contains three modules, the lib module called `octo-base-lib`, the spring app module called `octo-spring-app`, and
the third lib module called `octo-third-lib`.

They can stand for the construction of most app.

## use

Just build with

```shell
mvn clean install
```

Then you will get the `octo-spring-app-2021.12-SNAPSHOT-app-fatty.jar` in `octo-spring-app/target` folder.

You can run the spring app with

```shell
java -jar octo-spring-app/target/octo-spring-app-2021.12-SNAPSHOT-app-fatty.jar
```

With a new terminal window

```shell
curl http://localhost:8078/app/hello
# Hello World!
```

## problems solved

Using this code repository template can solve many problems bellow.

### build in a shade jar

### build a executable spring app jar

### use dependency module test jar

### generate test coverage report

### deploy

Follow [this](https://stackoverflow.com/a/42917618/7859396) to create account and distribute your public key.

### make it friendly to CI/CD

