# WAVSEP

## The Web Application Vulnerability Evaluation Project

This is a fork of https://github.com/sectooladdict/wavsep which is now maintained by the [ZAP Team](https://www.zaproxy.org/docs/team/).

WAVSEP is a vulnerable web application designed to help assessing the features, quality and accuracy of web application vulnerability scanners.

This evaluation platform contains a collection of unique vulnerable web pages that can be used to test the various properties of web application scanners.

### Reinforced Wavsep

This fork also includes the following tests added to [Reinforced Wavsep](https://github.com/luigiurbano/Reinforced-Wavsep)

* OS Command Injection
* XML External Entity 

## Building

WAVSEP can be run in one standalone Docker container.

To build and run WAVSEP run the following commands:

* `mvn clean package`
* `docker build -t zaproxy/wavsep .`
* `docker run --rm -it -p 8080:8080 -p 3306:3306 zaproxy/wavsep`

WAVSEP will then be accessible via [http://localhost:8080/wavsep/](http://localhost:8080/wavsep/)

## Formatting

WAVSEP uses [Spotless](https://github.com/diffplug/spotless) with Google Java Format (AOSP), matching ZAP core and zap-extensions. Spotless needs JRE 17+ (same as CI).

* Apply formatting: `mvn spotless:apply`
* Check formatting: `mvn spotless:check`

## Debugging

To show the output of WAVSEP run it using the command:

* `docker run -e DEBUG=y --rm -it -p 8080:8080 -p 3306:3306 zaproxy/wavsep`

## Copyright

WAVSEP - The Web Application Vulnerability Scanner Evaluation Project.

Copyright (C) 2014, Shay Chen.

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program.  If not, see [http://www.gnu.org/licenses/](http://www.gnu.org/licenses).
