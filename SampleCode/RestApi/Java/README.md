# embyclient

Emby Server REST API (BETA)
- API version: 4.9.2.6

Explore the Emby Server API

  For more information, please visit [https://emby.media/community/index.php?/forum/47-developer-api](https://emby.media/community/index.php?/forum/47-developer-api)

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>media.emby</groupId>
  <artifactId>embyclient</artifactId>
  <version>4.9.2.6</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "media.emby:embyclient:4.9.2.6"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/embyclient-4.9.2.6.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import embyclient.*;
import embyclient.auth.*;
import embyclient.model.*;
import embyclient.api.ActivityLogServiceApi;

import java.io.File;
import java.util.*;

public class ActivityLogServiceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: apikeyauth
        ApiKeyAuth apikeyauth = (ApiKeyAuth) defaultClient.getAuthentication("apikeyauth");
        apikeyauth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apikeyauth.setApiKeyPrefix("Token");


        ActivityLogServiceApi apiInstance = new ActivityLogServiceApi();
        Integer startIndex = 56; // Integer | Optional. The record index to start at. All items with a lower index will be dropped from the results.
        Integer limit = 56; // Integer | Optional. The maximum number of records to return
        OffsetDateTime minDate = new OffsetDateTime(); // OffsetDateTime | Optional. The minimum date. Format = ISO
        try {
            QueryResultActivityLogEntry result = apiInstance.getSystemActivitylogEntries(startIndex, limit, minDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivityLogServiceApi#getSystemActivitylogEntries");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://emby.media/emby*
