# customer-api
# Basic Spring Boot Project
## H2 DB
## Spring MVC
## Docker

## Docker commands
```
1. docker build -t customerapi .
    * -t is tag for the image we are building
2. docker images
    * to check the latest image details
3. docker run -d -p 8000:8082 customerapi
4. docker container stop <conatine-id>
5. docker rm -f <container-id>
```
## To test the application from postman
### http://localhost:8080/user [GET]
### http://localhost:8080/user [POST]
#### Body
```
{        
        "firstName": "Ja",
        "lastName": "Spar",
        "dateOfBirth": "1999-10-11T18:30:00.000+00:00",
        "last4Ssn": "1234",
        "email": "jack.sp@gmail.com",
        "phoneNumber": "1235551234"
}
```
