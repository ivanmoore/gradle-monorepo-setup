# gradle-monorepo-setup

This follows the example from https://rob-wiki.fly.dev/en/writing/gradle/gradle-monorepo-setup as a learning exercise for me about how to set up a "monorepo" that uses [gradle](https://gradle.org/) as its build tool.

I suggest as you read the article, checkout the tag of the same name (minus spaces) as the section to get the code as it is at the end of that section (as shown in section notes).

To get back to the final version:

```shell
git checkout main
```

To see list of sections for which I've included the code (because I deliberately missed out "Custom build logic"):

```shell
git tag -l
```

## Start simple

```shell
git checkout Startsimple
```

```shell
./gradlew :teasite:tasks --all
```

## Creating a plugin that does nothing

```shell
git checkout Creatingapluginthatdoesnothing
```

```shell
tree gradle/plugins
```

```shell
./gradlew :teapay:sayHello
```

### Possibly interesting things to note

This below produces the same result:

```shell
./gradlew :teapayments:sayHello
```

This below won't work because we haven't edited `teasite/build.gradle.kts` at this point:

```shell
./gradlew :teasite:sayHello
```

## Creating a plugin that does something

```shell
git checkout Creatingapluginthatdoessomething
```

```shell
./gradlew :teapay:sayHello
```

```shell
rm -rf build && rm -rf gradle/plugins/no-op/build && tree .
```
