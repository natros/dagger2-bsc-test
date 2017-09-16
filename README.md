Compile

```
./mvnw clean compile
```

Comment first argument

```
sed -i -e 's@AuthService@//AuthService@' src/main/java/com/github/natros/bsc/Main.java
```

Compile again without clean and it will fail

```
./mvnw compile
```

Clean compile and works

```
./mvnw clean compile
```

