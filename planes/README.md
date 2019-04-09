# Planes

Code corresponding to the [planes cookbook](https://swim.dev/tutorials/planes/).

## Run

This demo requires running the `BasicPlane` Java class.

### Option 1: Build And Run With IDE

Simply navigate to the `BasicPlane` class, and run it through your IDE.

### Option 2: Build And Run With Gradle

1. In a shell, navigate to this directory (`/some/path/cookbook/planes/`)

2. Run one of the following:

  - `./gradlew run`, on most non-Windows machines
  
  - `.\gradlew.bat run`, on Windows machines

  - `gradle run` (regardless of machine) if you have a local Gradle distribution and prefer to use that; note that we do not support anything prior to 5.2.

### Option 3: Build With Gradle, Run With Java

1. In a shell, navigate to this directory (`/some/path/cookbook/planes/`)

2. Run one of the following:

  - `./gradlew build`, on most non-Windows machines
  
  - `.\gradlew.bat build`, on Windows machines

  - `gradle build` (regardless of machine) if you have a local Gradle distribution and prefer to use that; note that we do not support anything prior to 5.2.

3. Unfoo the newly-created `build/distributions/planes-3.9.2.foo`, where "foo" is either "tar" or "zip".

4. Run the `bin/planes` script (`bin\planes.bat` on Windows).