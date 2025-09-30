# Net.RestSharp

<table><tr />
    <tr>
        <th valign="top" align="left">Name</th>
        <td>EmbyClient.Dotnet</td>
    </tr>
    <tr>
        <th valign="top" align="left">Language</th>
        <td>C#</td>
    </tr>
    <tr>
        <th valign="top" align="left">SDK Folder</th>
        <td>SampleCode/RestApi/Clients/Net.RestSharp</td>
    </tr>
</table>

## Prerequisites 

#### Frameworks supported

- .NET >=5.0
- .NET Core >=2.0
- .NetStandard 2.0
- .NET Framework >=4.6
- Mono/Xamarin
- UWP >=10.0

#### Dependencies
- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.2.2 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 10.0.3 or later

> [!NOTE]
> RestSharp has introduced breaking changes in v107.x.
> Updating RestSharp to those version will require a huge amount of changes to the code.

## Getting Started

### Using the Client Code

The `Net.RestSharp\EmbyClient.Dotnet` folder includes the C# project `EmbyClient.Dotnet.csproj` and all code that is required. You can copy the whole folder directly into your own project.

### Visal Studio Sample Application

The folder includes a Visual Studio solution which you can open directly in Visual Studio 2019 (or later).

The sample application is a simple Windows Forms application which demonstrates how to authenticate with Emby Server and make basic API calls:

![Csharp App Screenshot](../../../../images/csharp_app_screenshot.png)

### Basic Code Example

```csharp
using System;
using System.Diagnostics;
using EmbyClient.Dotnet.Api;
using EmbyClient.Dotnet.Client;
using EmbyClient.Dotnet.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            // Configure API key authorization: apikeyauth
            Configuration.Default.ApiKey.Add("api_key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("api_key", "Bearer");

            var apiInstance = new ActivityLogServiceApi();
            var startIndex = 56;  // int? | Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional) 
            var limit = 56;  // int? | Optional. The maximum number of records to return (optional) 
            var minDate = minDate_example;  // string | Optional. The minimum date. Format = ISO (optional) 

            try
            {
                // Gets activity log entries
                QueryResultActivityLogEntry result = apiInstance.GetSystemActivitylogEntries(startIndex, limit, minDate);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ActivityLogServiceApi.GetSystemActivitylogEntries: " + e.Message );
            }
        }
    }
}
```
