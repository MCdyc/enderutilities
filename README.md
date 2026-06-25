[![Curseforge](http://cf.way2muchnoise.eu/full_ender-utilities_downloads.svg)](https://minecraft.curseforge.com/projects/ender-utilities) [![Curseforge](http://cf.way2muchnoise.eu/versions/For%20MC_ender-utilities_all.svg)](https://minecraft.curseforge.com/projects/ender-utilities)

## Ender Utilities

Ender Utilities is an "ender-themed" Minecraft mod, which adds various different items and blocks.
Many of them are related to storing or transporting items or player and mob teleportation.

Ender Utilities was started during Modjam 4, a Minecraft modding competition/event, back in May 2014.

This branch ports the project build environment to [Cleanroom Loader](https://cleanroommc.com/) using the [CleanroomModTemplate](https://github.com/CleanroomMC/CleanroomModTemplate) Gradle/Unimined setup while keeping the original Ender Utilities source, resources, author metadata, and LGPL license terms.

For compiled original builds (= downloads), see:
* CurseForge: https://minecraft.curseforge.com/projects/ender-utilities

## Cleanroom migration

Cleanroom Loader is a modern Forge fork for Minecraft 1.12.2. This project now uses the Cleanroom template's Gradle 9 / Unimined build instead of the old ForgeGradle 2 setup.

Notable migration details:
* Java toolchain: Java 25
* Minecraft: 1.12.2
* Mappings: MCP stable 39
* Cleanroom Loader: 0.5.14-alpha
* Access transformer: `src/main/resources/enderutilities_at.cfg`, written in MCP names for Unimined remapping
* Mod dependencies:
  * JEI from Modrinth Maven: `maven.modrinth:jei`
  * Baubles from Cleanroom CurseMaven: `curse.maven:baubles-227083`
  * Chisels & Bits from Cleanroom CurseMaven: `curse.maven:chisels-bits-231095`

## Compiling

* Install a Java 25 JDK.
* Clone the repository.
* Open a command prompt/terminal to the repository directory.
* Run `gradlew build` to build the mod.
* The remapped jar is produced under `build/libs/`.

In IntelliJ IDEA, import the Gradle project and use the generated Gradle run configurations, especially `2. Run Client` and `3. Run Server`.

## License and attribution

Ender Utilities source code and resources remain licensed under the GNU Lesser General Public License v3 as provided in `LICENSE.txt`. The original mod author metadata is preserved as `masa` in `mcmod.info`.

The Cleanroom build skeleton is based on CleanroomMC/CleanroomModTemplate, copyright (c) 2025 kappa-maintainer, licensed under the MIT License. The template license is preserved in `LICENSE-CleanroomModTemplate.txt`.

## YourKit

![](https://www.yourkit.com/images/yklogo.png)

We appreciate YourKit for providing the project developers licenses of its profiler to help us improve performance!

YourKit supports open source projects with innovative and intelligent tools
for monitoring and profiling Java and .NET applications.
YourKit is the creator of [YourKit Java Profiler](https://www.yourkit.com/java/profiler/),
[YourKit .NET Profiler](https://www.yourkit.com/.net/profiler/) and
[YourKit YouMonitor](https://www.yourkit.com/youmonitor), tools for profiling Java and .NET applications.
