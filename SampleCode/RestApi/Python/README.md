# embyclient

- API version: 4.9.2.6
- Package version: 4.9.2.6
- Build package: io.swagger.codegen.v3.generators.python.PythonClientCodegen

## Requirements.

Python 2.7 (deprecated) and 3.4+

## Installation

Install via [pip](https://pypi.org/project/embyclient/)

```sh
pip install embyclient
```

## Usage

Import the package:

```python
import embyclient
```
Configure a client instance:

```python
import embyclient
from embyclient.rest import ApiException

# Configure API key authorization: apikeyauth
configuration = embyclient.Configuration()
configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# create an instance of the API class
client = embyclient.ApiClient(configuration)
```

Then use the client to interact via specific API services:

```python
activity_log_service = embyclient.ActivityLogServiceApi(client)

try:
    # Gets activity log entries
    api_response = activity_log_service.get_activity_log_entries(start_index=56, limit=56, min_date='min_date_example')
    print(api_response)
except ApiException as e:
    print("Exception when calling ActivityLogServiceApi->get_activity_log_entries: %s\n" % e)
```

## Documentation

Emby Server REST Api Documentation: https://dev.emby.media/doc/restapi/index.html

Emby Server REST Api Reference: https://dev.emby.media/reference/index.html

## Credits

Big thanks to [nwithan8](https://github.com/nwithan8) for required adjustments and bringing this to pypi.org originally

