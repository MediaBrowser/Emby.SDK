# Python Client

<table><tr />
    <tr>
        <th valign="top" align="left">Name</th>
        <td>embyclient-python</td>
    </tr>
    <tr>
        <th valign="top" align="left">Language</th>
        <td>Python</td>
    </tr>
    <tr>
        <th valign="top" align="left">SDK Folder</th>
        <td>SampleCode/RestApi/Clients/Python</td>
    </tr>
</table>

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import embyclient-python
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import embyclient-python
from embyclient-python.rest import ApiException
from pprint import pprint

# Configure API key authorization: apikeyauth
configuration = embyclient-python.Configuration()
configuration.api_key['api_key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key'] = 'Bearer'

# create an instance of the API class
api_instance = embyclient-python.ActivityLogServiceApi(embyclient-python.ApiClient(configuration))
start_index = 56 # int | Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
limit = 56 # int | Optional. The maximum number of records to return (optional)
min_date = 'min_date_example' # str | Optional. The minimum date. Format = ISO (optional)

try:
    # Gets activity log entries
    api_response = api_instance.get_system_activitylog_entries(start_index=start_index, limit=limit, min_date=min_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ActivityLogServiceApi->get_system_activitylog_entries: %s\n" % e)
```
