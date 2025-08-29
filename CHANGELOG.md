# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## 2025-08-28

### Changed
- Main JSP to use leading spaces instead of a mix of spaces and tabs - to make refactoring easier. 
- Unvalidated-Redirect/Redirect-FalsePositives-GET/Case09... now uses the first configured host name (identified via JMX) instead of the requested host name (which could have been from a manipulated Host header).

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
