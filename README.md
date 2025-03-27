# Demonstration of issue with Jackson deserialization of form data

This repository is used to demonstrate an issue with Jackson deserialization of form data. The main code consists of a
controller which accepts a generic request object. When ServerWebExchange tries to deserialize the form data, it uses
the wrong mapper and an 500 is returned in Spring Boot version 3.4.4.

## How to run

Run the test. It should fail.

Change the version of Spring Boot to 3.4.3 and run the test again. It should pass.