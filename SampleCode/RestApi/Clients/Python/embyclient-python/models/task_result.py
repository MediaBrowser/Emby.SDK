# coding: utf-8

"""
    Emby Server REST API
"""

import pprint
import re  # noqa: F401

import six

class TaskResult(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'start_time_utc': 'datetime',
        'end_time_utc': 'datetime',
        'status': 'TaskCompletionStatus',
        'name': 'str',
        'key': 'str',
        'id': 'str',
        'error_message': 'str',
        'long_error_message': 'str'
    }

    attribute_map = {
        'start_time_utc': 'StartTimeUtc',
        'end_time_utc': 'EndTimeUtc',
        'status': 'Status',
        'name': 'Name',
        'key': 'Key',
        'id': 'Id',
        'error_message': 'ErrorMessage',
        'long_error_message': 'LongErrorMessage'
    }

    def __init__(self, start_time_utc=None, end_time_utc=None, status=None, name=None, key=None, id=None, error_message=None, long_error_message=None):  # noqa: E501
        """TaskResult - a model defined in Swagger"""  # noqa: E501
        self._start_time_utc = None
        self._end_time_utc = None
        self._status = None
        self._name = None
        self._key = None
        self._id = None
        self._error_message = None
        self._long_error_message = None
        self.discriminator = None
        if start_time_utc is not None:
            self.start_time_utc = start_time_utc
        if end_time_utc is not None:
            self.end_time_utc = end_time_utc
        if status is not None:
            self.status = status
        if name is not None:
            self.name = name
        if key is not None:
            self.key = key
        if id is not None:
            self.id = id
        if error_message is not None:
            self.error_message = error_message
        if long_error_message is not None:
            self.long_error_message = long_error_message

    @property
    def start_time_utc(self):
        """Gets the start_time_utc of this TaskResult.  # noqa: E501

        The start time UTC.  # noqa: E501

        :return: The start_time_utc of this TaskResult.  # noqa: E501
        :rtype: datetime
        """
        return self._start_time_utc

    @start_time_utc.setter
    def start_time_utc(self, start_time_utc):
        """Sets the start_time_utc of this TaskResult.

        The start time UTC.  # noqa: E501

        :param start_time_utc: The start_time_utc of this TaskResult.  # noqa: E501
        :type: datetime
        """

        self._start_time_utc = start_time_utc

    @property
    def end_time_utc(self):
        """Gets the end_time_utc of this TaskResult.  # noqa: E501

        The end time UTC.  # noqa: E501

        :return: The end_time_utc of this TaskResult.  # noqa: E501
        :rtype: datetime
        """
        return self._end_time_utc

    @end_time_utc.setter
    def end_time_utc(self, end_time_utc):
        """Sets the end_time_utc of this TaskResult.

        The end time UTC.  # noqa: E501

        :param end_time_utc: The end_time_utc of this TaskResult.  # noqa: E501
        :type: datetime
        """

        self._end_time_utc = end_time_utc

    @property
    def status(self):
        """Gets the status of this TaskResult.  # noqa: E501


        :return: The status of this TaskResult.  # noqa: E501
        :rtype: TaskCompletionStatus
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this TaskResult.


        :param status: The status of this TaskResult.  # noqa: E501
        :type: TaskCompletionStatus
        """

        self._status = status

    @property
    def name(self):
        """Gets the name of this TaskResult.  # noqa: E501

        The name.  # noqa: E501

        :return: The name of this TaskResult.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TaskResult.

        The name.  # noqa: E501

        :param name: The name of this TaskResult.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def key(self):
        """Gets the key of this TaskResult.  # noqa: E501

        The key.  # noqa: E501

        :return: The key of this TaskResult.  # noqa: E501
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """Sets the key of this TaskResult.

        The key.  # noqa: E501

        :param key: The key of this TaskResult.  # noqa: E501
        :type: str
        """

        self._key = key

    @property
    def id(self):
        """Gets the id of this TaskResult.  # noqa: E501

        The id.  # noqa: E501

        :return: The id of this TaskResult.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this TaskResult.

        The id.  # noqa: E501

        :param id: The id of this TaskResult.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def error_message(self):
        """Gets the error_message of this TaskResult.  # noqa: E501

        The error message.  # noqa: E501

        :return: The error_message of this TaskResult.  # noqa: E501
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """Sets the error_message of this TaskResult.

        The error message.  # noqa: E501

        :param error_message: The error_message of this TaskResult.  # noqa: E501
        :type: str
        """

        self._error_message = error_message

    @property
    def long_error_message(self):
        """Gets the long_error_message of this TaskResult.  # noqa: E501

        The long error message.  # noqa: E501

        :return: The long_error_message of this TaskResult.  # noqa: E501
        :rtype: str
        """
        return self._long_error_message

    @long_error_message.setter
    def long_error_message(self, long_error_message):
        """Sets the long_error_message of this TaskResult.

        The long error message.  # noqa: E501

        :param long_error_message: The long_error_message of this TaskResult.  # noqa: E501
        :type: str
        """

        self._long_error_message = long_error_message

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(TaskResult, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, TaskResult):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
