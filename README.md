# Ender Utilities Cleanroom

This repository is a Cleanroom Loader specific port of Ender Utilities for Minecraft 1.12.2.

It keeps the original Ender Utilities source, resources, author metadata, and LGPL license terms while replacing the legacy ForgeGradle 2 build with the CleanroomModTemplate Gradle 9 / Unimined setup. This branch is intended for Cleanroom builds only; use the original upstream project for non-Cleanroom releases.

## Cleanroom Build

Key build details:

* Minecraft: 1.12.2
* Cleanroom Loader: 0.5.14-alpha
* Java toolchain: Java 25
* Mappings: MCP stable 39
* Version suffix: `_cleanroom`
* Access transformer: `src/main/resources/enderutilities_at.cfg`, written in MCP names and remapped by Unimined

The current Gradle version is published as `0.7.15_cleanroom`, producing jars such as:

* `enderutilities-1.12.2-0.7.15_cleanroom.jar`
* `enderutilities-1.12.2-0.7.15_cleanroom-sources.jar`

## Dependencies

The Cleanroom build uses Maven dependencies suitable for automated builds:

* JEI: `maven.modrinth:jei`
* Baubles: `curse.maven:baubles-227083`
* Chisels & Bits: `curse.maven:chisels-bits-231095`

## Compiling

Install a Java 25 JDK, then run:

```bash
./gradlew build
```

On Windows:

```bat
gradlew.bat build
```

The remapped Cleanroom jar is written to `build/libs/`.

## GitHub Builds

GitHub Actions builds the project automatically on pushes to `master`, tag pushes, and manual workflow dispatch.

* Every build uploads the compiled jars as workflow artifacts.
* Pushes to `master` and manual runs update the prerelease `cleanroom-latest`.
* Tag pushes create a GitHub Release for that tag.

## Original Project

Ender Utilities is an ender-themed Minecraft mod by masa, originally started during Modjam 4 in May 2014. It adds items and blocks related to item storage, item transport, and player/mob teleportation.

Original downloads and project page:

* CurseForge: https://minecraft.curseforge.com/projects/ender-utilities
* Original update JSON: https://raw.githubusercontent.com/maruohon/enderutilities/master/update.json

## License And Attribution

Ender Utilities source code and resources remain licensed under the GNU Lesser General Public License v3 as provided in `LICENSE.txt`. The original mod author metadata is preserved as `masa` in `mcmod.info`.

The Cleanroom build skeleton is based on [CleanroomMC/CleanroomModTemplate](https://github.com/CleanroomMC/CleanroomModTemplate), copyright (c) 2025 kappa-maintainer, licensed under the MIT License. The template license is preserved in `LICENSE-CleanroomModTemplate.txt`.

## YourKit

![](https://www.yourkit.com/images/yklogo.png)

We appreciate YourKit for providing the project developers licenses of its profiler to help us improve performance.

YourKit supports open source projects with tools for monitoring and profiling Java and .NET applications:

* [YourKit Java Profiler](https://www.yourkit.com/java/profiler/)
* [YourKit .NET Profiler](https://www.yourkit.com/.net/profiler/)
* [YourKit YouMonitor](https://www.yourkit.com/youmonitor)
