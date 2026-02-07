# Cucumber Setup for Java Projects

To use Cucumber with Java in GitHub Actions:

## 1. Add Cucumber Dependencies

### Maven (pom.xml)
Add these to your `<dependencies>` section:

```
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.16.1</version>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.16.1</version>
</dependency>
```

### Gradle (build.gradle)
Add these to your `dependencies` block:

```
testImplementation 'io.cucumber:cucumber-java:7.16.1'
testImplementation 'io.cucumber:cucumber-junit:7.16.1'
```

## 2. Create Feature Files
- Place your `.feature` files in `src/test/resources/features`.

## 3. Create Step Definitions
- Place your step definition classes in `src/test/java/your/package/`.

## 4. Run Cucumber Tests
- Maven: `mvn test` will run Cucumber tests if configured.
- Gradle: `./gradlew test` will run Cucumber tests if configured.

## 5. GitHub Actions Workflow
- The provided Java workflow already runs `mvn test` and `./gradlew test`, so Cucumber tests will be executed automatically.

## 6. Check Results
- After pushing, view test results in the Actions tab on GitHub.

For more details, see the [Cucumber Java documentation](https://cucumber.io/docs/installation/java/).
