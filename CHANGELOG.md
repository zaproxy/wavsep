# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## 2026-08-11
### Added
- Spotless Maven plugin for Java sources with Google Java Format (AOSP), matching ZAP (`mvn spotless:apply` / `mvn spotless:check`). CI runs `spotless:check`.

### Changed
- Applied Spotless to Java sources under `src/`.

## 2026-05-11
### Changed
- Updated to use Tomcat 9.0.117.

## 2025-09-08
### Changed
- Updated to use Tomcat 9.0.109.

## 2025-09-02
### Added
- Imported XXE from [Reinforced Wavsep](https://github.com/luigiurbano/Reinforced-Wavsep) at commit [962d566](https://github.com/luigiurbano/Reinforced-Wavsep/commit/962d566ebe51a3f64f772b6c1856d99f1150ba4a). Updated them to use the same endpoint to handle the POST requests instead of using a common one.

### Changed
- Unvalidated-Redirect/Redirect-FalsePositives-GET/Case09... now uses the default host from the first configured engine (identified via JMX) instead of the requested host name (which could have been from a manipulated Host header).

## 2025-08-30
### Added
- Imported OS Command Injection tests from [Reinforced Wavsep](https://github.com/luigiurbano/Reinforced-Wavsep) at commit [962d566](https://github.com/luigiurbano/Reinforced-Wavsep/commit/962d566ebe51a3f64f772b6c1856d99f1150ba4a).

## 2025-08-28

### Changed
- Main JSP to use leading spaces instead of a mix of spaces and tabs - to make refactoring easier. 

### Fixed
- Changed all of the SQL JSPs to use try-with-resources on the db statement.

## 2025-08-27

### Fixed
- Changed all of the SQL JSPs to use try-with-resources on the db connection.

## 2025-08-08

### Added
- Basic Maven build.
- Docker support.
- Auto initialise DB.
- Simple CI build.

### Changed
- Docs to reflect adoption by ZAP team.

### Fixed
- JSPs to use correct exceptions.

### Removed
- Eclipse files.
