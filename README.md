# Full Stack Table Tennis League

# Problem Statement

## Backend & full-stack developers Exercise : TheChampion
As an initiative a tennis-table league has to be design for team members inside the digital factory, allowing all staff to participate and randomly manages the matches of all participants and compose a league of 3 matches a day and maximum 12 participants, consuming a modern API for basic features. This is planned to be API first approach, of well-tested functions and enabling agility of later modifications.

## Technology constraints
- At the digital factory, we currently have a microservices architecture with services mostly written in Spring Boot.
- We would like you to develop a single service using Spring Boot with either Java or Kotlin that exposes several REST
endpoints (see next page)
- You can use whatever database and data access method; the application should create the required database structure.
- You should include a README file that has instructions for us to get the solution running on our machines.

## What are we looking to test?
- The overall software architecture of the application
- The structure and quality of the code itself
- The use of well-known patterns for REST and Spring development
- Your ability to model the problem domain (data models and APIs)
- Full-Stack developers/leads (only), overall Angular project
structure and code-quality.
- Bonus points if you include unit tests in your solution.


## What are we not looking to test?
- We don’t expect you to implement authentication or
authorization

## **Your APIs should provide the following functionality to downstream consumers of the API (in a RESTful way):**

### Participants
- Submit a participant request
- Get a list of all participants
- Group randomly participants into (n) groups

### Matches
- Get list of all automatically created the first-round matches
- Update match winner and results
- Close round

### The League | BONUS
- Submit a request of new match (players and time)
- Submit league champion

**TIP #1:** focus on defining a very clear data model. You should
include the SQL create table statements etc. in your code base.

**TIP #2:** invest time in building some ‘seed data’ that covers all
the use cases you want to demonstrate.

**TIP #3:** build web frontend pages, for some of the journeys as
APIs described using Angular.**(ONLY FULL-STACK DEVELOPER/LEADER)**

**BONUS POINTS:** Create a new model for **‘Congratulation Mail’** to be sent
to the champion.


## Documnets illustratation with different Rest API involving table tennis match
1. **GET http://localhost:8080/rest/v1/participants**
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": [
        {
            "first_name": "Ashish",
            "last_name": "Karn",
            "email": "er.ashishkarn@gmail.com"
        },
        {
            "first_name": "Manish",
            "last_name": "Karn",
            "email": "manish@gmail.com"
        },
        {
            "first_name": "Ramesh",
            "last_name": "Karn",
            "email": "ramesh@gmail.com"
        }
    ],
    "time_stamp": "2021-05-10T13:05:18.805+00:00"
}

```

2. **GET http://localhost:8080/rest/v1/matches** Help to fetch all the matches.
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": [
        {
            "id": 1,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 1,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 2,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        },
        {
            "id": 3,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 3,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 4,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        },
        {
            "id": 6,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 2,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 4,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 2
        }
    ],
    "time_stamp": "2021-05-10T13:05:54.641+00:00"
}
```

3. **GET http://localhost:8080/rest/v1/matches/1** Help to fetch matches whose round will be first.
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": [
        {
            "id": 1,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 1,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 2,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        },
        {
            "id": 3,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 3,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 4,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        },
        {
            "id": 5,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 2,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 4,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        }
    ],
    "time_stamp": "2021-05-10T13:07:17.690+00:00"
}
```

## External Resources
- [Building a RESTful service in Spring Boot](http://spring.io/guides/gs/rest-service/)
- [Testing in Spring Boot](https://www.baeldung.com/spring-boot-testing)
- [Logging in SprintBoot](https://www.baeldung.com/spring-boot-logging)
- [Creating a Multi Module Project](https://spring.io/guides/gs/multi-module/)

## Application execution in IntelliJ
Setting:-
- **Build, Execution, Deployment -> Compiler -> Shared build process VM options**
     ```
     -Djps.track.ap.dependencies=false
     ``` 
     
- **To connect to MySql, URL need to have these dependency**
```
spring.datasource.url=jdbc:mysql://localhost:3306/table_tennis?useSSL=false&tinyInt1isBit=false

```

