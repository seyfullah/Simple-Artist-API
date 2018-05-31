# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: UserSecurity
        HttpBasicAuth UserSecurity = (HttpBasicAuth) defaultClient.getAuthentication("UserSecurity");
        UserSecurity.setUsername("YOUR USERNAME");
        UserSecurity.setPassword("YOUR PASSWORD");

        DefaultApi apiInstance = new DefaultApi();
        Integer limit = 56; // Integer | Limits the number of items on a page
        Integer offset = 56; // Integer | Specifies the page number of the artists to be displayed
        try {
            List<Artist> result = apiInstance.artistsGet(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#artistsGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/stikic/SimpleArtistAPI/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**artistsGet**](docs/DefaultApi.md#artistsGet) | **GET** /artists | 
*DefaultApi* | [**artistsPost**](docs/DefaultApi.md#artistsPost) | **POST** /artists | 
*DefaultApi* | [**artistsUsernameGet**](docs/DefaultApi.md#artistsUsernameGet) | **GET** /artists/{username} | 


## Documentation for Models

 - [Artist](docs/Artist.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse400](docs/InlineResponse400.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### UserSecurity

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



