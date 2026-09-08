# LarpOfWar

LarpOfWar is a Java CLI program that prints a random quote from *The Art of War* by Sun Tzu, including the Chinese character original and pīnyīn.

## Requirements

- Java 17
- Maven
- A terminal with Chinese character and pīnyīn support

## Build

From the project root:

```bash
mvn clean package
```
Creates the .jar in `target`.

## Run from .jar

### Windows

```bash
java -jar target\LarpOfWar-1.0.jar
```

### Linux

```bash
java -jar target/LarpOfWar-1.0.jar
```

## Colour Flags

- `-r` red
- `-b` blue
- `-g` green
- `-y` yellow

Example:

```bash
java -jar target/LarpOfWar-1.0.jar -r
```

## Quotes

Quotes are stored in:

```text
src/main/resources/ArtOfWar.txt
```

Each quote is separated by a line containing:

```text
%
```

## Install Scripts

A Windows installation ```.bat``` file is in the release folder, and a Linux installation ```.sh``` file is also in the release folder

The linux ```.sh``` automatically installs the program to ```.local/bin/larpofwar.sh``` so it can be run from anywhere in terminal via:

```bash
larpofwar
```



