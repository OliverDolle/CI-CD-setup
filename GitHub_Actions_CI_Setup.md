# GitHub Actions CI Setup

This project includes example workflows for running automated tests on every push to GitHub, for both Python and Java projects.

## Python Workflow
- File: `.github/workflows/ci.yml`
- Uses Python 3.11
- Installs dependencies from `requirements.txt`
- Runs tests with `pytest` if a `tests` directory exists

## Java Workflow
- File: `.github/workflows/java-ci.yml`
- Uses Java 17 (Temurin distribution)
- Supports both Gradle and Maven builds
- Runs tests automatically

### How to Use
1. Copy the workflow files into your repository under `.github/workflows/`.
2. Push your code to GitHub.
3. GitHub Actions will automatically run the workflows on every push.

### Customization
- Edit the workflow files to match your project structure or testing commands.
- For other languages, search for official GitHub Actions or update the steps accordingly.

### Troubleshooting
- Check the Actions tab in your GitHub repository for logs and errors.
- Make sure your project contains the necessary files (e.g., `requirements.txt`, `tests/`, `pom.xml`, `gradlew`).

For more details, see the [GitHub Actions documentation](https://docs.github.com/en/actions).
