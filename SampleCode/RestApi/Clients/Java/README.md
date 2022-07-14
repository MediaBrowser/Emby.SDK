# Java Client

<table><tr />
    <tr>
        <th valign="top" align="left">Name</th>
        <td>embyclient-rest-java</td>
    </tr>
    <tr>
        <th valign="top" align="left">Language</th>
        <td>Java</td>
    </tr>
    <tr>
        <th valign="top" align="left">SDK Folder</th>
        <td>SampleCode/RestApi/Clients/Java</td>
    </tr>
</table>

## Requirements

Building the API client library requires:
1. Java 1.7+
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
  <artifactId>embyclient-rest-java</artifactId>
  <version>0.0.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "media.emby:embyclient-rest-java:0.0.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/embyclient-rest-java-0.0.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import EmbyClient.*;
import EmbyClient.auth.*;
import io.swagger.client.model.*;
import EmbyClient.Java.ActivityLogServiceApi;

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
        String minDate = "minDate_example"; // String | Optional. The minimum date. Format = ISO
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

