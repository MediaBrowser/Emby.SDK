# JavaScript Client

<table><tr />
    <tr>
        <th valign="top" align="left">Name</th>
        <td>EmbyClient.JavaScript</td>
    </tr>
    <tr>
        <th valign="top" align="left">Language</th>
        <td>JavaScript</td>
    </tr>
    <tr>
        <th valign="top" align="left">SDK Folder</th>
        <td>SampleCode/RestApi/Clients/JavaScript</td>
    </tr>
</table>

## Installation

##### Important
We do not recommend to use and install this code as a package. Probably too many adjustments will be required to get it working according to your requirements.  
 A better approach is to use the code files directly in your project!

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

> [!NOTE]
> Please edit the package name to a custom name of yours before publishing anywhere!


Then install it via:

```shell
npm install embyclient-js --save
```

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var EmbyClientJavaScript = require('EmbyClient.JavaScript');
var defaultClient = EmbyClientJavaScript.ApiClient.instance;

// Configure API key authorization: apikeyauth
var apikeyauth = defaultClient.authentications['apikeyauth'];
apikeyauth.apiKey = "YOUR API KEY"
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikeyauth.apiKeyPrefix['api_key'] = "Token"


var api = new EmbyClientJavaScript.ActivityLogServiceApi()
var opts = { 
  'startIndex': 56, // {Number} Optional. The record index to start at. All items with a lower index will be dropped from the results.
  'limit': 56, // {Number} Optional. The maximum number of records to return
  'minDate': "minDate_example" // {String} Optional. The minimum date. Format = ISO
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getSystemActivitylogEntries(opts, callback);
```


