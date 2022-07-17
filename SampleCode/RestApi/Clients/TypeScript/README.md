# TypeScript Client

<table><tr />
    <tr>
        <th valign="top" align="left">Name</th>
        <td>EmbyClient.TypeScript</td>
    </tr>
    <tr>
        <th valign="top" align="left">Language</th>
        <td>TypeScript</td>
    </tr>
    <tr>
        <th valign="top" align="left">SDK Folder</th>
        <td>SampleCode/RestApi/Clients/TypeScript</td>
    </tr>
</table>

## Prerequisites

This TypeScript client utilizes the [Fetch API](https://fetch.spec.whatwg.org/). The generated Node module can be used in the following environments:

### Environment
* Node.js
* Webpack
* Browserify

### Language level
* ES5 - you must have a Promises/A+ library installed
* ES6

### Module system
* CommonJS
* ES6 module system

It can be used in both TypeScript and JavaScript. In TypeScript, the definition should be automatically resolved via `package.json`. ([Reference](http://www.typescriptlang.org/docs/handbook/typings-for-npm-packages.html))

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Publishing

##### Important
We do not recommend to use and install this code as a package. Probably too many adjustments will be required to get it working according to your requirements.  
 A better approach is to use the code files directly in your project!

First build the package then run ```npm publish```

> [!NOTE]
> Please edit the package name to a custom name of yours before publishing anywhere!

### Consuming

Navigate to the folder of your consuming project and run one of the following commands.

##### Published

```
npm install {{npmName}}@{{npmVersion}} --save
```

##### UnPublished

```
npm install PATH_TO_GENERATED_PACKAGE --save
```



