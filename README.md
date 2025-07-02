# spring-mdb-demo-101

This is a very basic demo that showcase Spring Data MongoDB. This is a RESTFul app which exposes 2 GET endpoints:

/load : Load 3 users data into mongodb

/users : Return the list of users in the database


## Pre-Req

The only requirement here is Java 21. I highly suggested you use [SDK Man](https://docs.gradle.org) to manage your local Java versions. 

## How too run the app

on the command line simply run: 

1. Clone this repo
```shell
git clone https://github.com/schabiyo-eng/spring-mdb-demo-101.git
```
2. cd into the root directory
```shell
cd spring-mdb-demo-101
```
3. Run the app

```shell
./gradlew bootRun

```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.3/gradle-plugin)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/3.5.3/reference/data/nosql.html#data.nosql.mongodb)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)





