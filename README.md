# Repro for Koin gh-1829

See https://github.com/InsertKoinIO/koin/issues/1829

- The `library` module uses Koin 3.4.3.
- The `app` module depends on both the `library` module and also Koin 3.5.3.

To repro, first run

```./gradlew library:publishToMavenLocal```

Then run 

```./gradlew app:run```

The app will invoke the library, which will cause a crash due to binary incompatibility.
