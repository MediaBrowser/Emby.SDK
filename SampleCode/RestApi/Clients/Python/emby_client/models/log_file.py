# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import pprint
import re  # noqa: F401

import six

class LogFile(object):
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
        'date_created': 'datetime',
        'date_modified': 'datetime',
        'size': 'int',
        'name': 'str'
    }

    attribute_map = {
        'date_created': 'DateCreated',
        'date_modified': 'DateModified',
        'size': 'Size',
        'name': 'Name'
    }

    def __init__(self, date_created=None, date_modified=None, size=None, name=None):  # noqa: E501
        """LogFile - a model defined in Swagger"""  # noqa: E501
        self._date_created = None
        self._date_modified = None
        self._size = None
        self._name = None
        self.discriminator = None
        if date_created is not None:
            self.date_created = date_created
        if date_modified is not None:
            self.date_modified = date_modified
        if size is not None:
            self.size = size
        if name is not None:
            self.name = name

    @property
    def date_created(self):
        """Gets the date_created of this LogFile.  # noqa: E501

        The date created.  # noqa: E501

        :return: The date_created of this LogFile.  # noqa: E501
        :rtype: datetime
        """
        return self._date_created

    @date_created.setter
    def date_created(self, date_created):
        """Sets the date_created of this LogFile.

        The date created.  # noqa: E501

        :param date_created: The date_created of this LogFile.  # noqa: E501
        :type: datetime
        """

        self._date_created = date_created

    @property
    def date_modified(self):
        """Gets the date_modified of this LogFile.  # noqa: E501

        The date modified.  # noqa: E501

        :return: The date_modified of this LogFile.  # noqa: E501
        :rtype: datetime
        """
        return self._date_modified

    @date_modified.setter
    def date_modified(self, date_modified):
        """Sets the date_modified of this LogFile.

        The date modified.  # noqa: E501

        :param date_modified: The date_modified of this LogFile.  # noqa: E501
        :type: datetime
        """

        self._date_modified = date_modified

    @property
    def size(self):
        """Gets the size of this LogFile.  # noqa: E501

        The size.  # noqa: E501

        :return: The size of this LogFile.  # noqa: E501
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size):
        """Sets the size of this LogFile.

        The size.  # noqa: E501

        :param size: The size of this LogFile.  # noqa: E501
        :type: int
        """

        self._size = size

    @property
    def name(self):
        """Gets the name of this LogFile.  # noqa: E501

        The name.  # noqa: E501

        :return: The name of this LogFile.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this LogFile.

        The name.  # noqa: E501

        :param name: The name of this LogFile.  # noqa: E501
        :type: str
        """

        self._name = name

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
        if issubclass(LogFile, dict):
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
        if not isinstance(other, LogFile):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other