# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import pprint
import re  # noqa: F401

import six

class SubtitleProfile(object):
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
        'format': 'str',
        'method': 'SubtitleDeliveryMethod',
        'didl_mode': 'str',
        'language': 'str',
        'container': 'str',
        'protocol': 'str'
    }

    attribute_map = {
        'format': 'Format',
        'method': 'Method',
        'didl_mode': 'DidlMode',
        'language': 'Language',
        'container': 'Container',
        'protocol': 'Protocol'
    }

    def __init__(self, format=None, method=None, didl_mode=None, language=None, container=None, protocol=None):  # noqa: E501
        """SubtitleProfile - a model defined in Swagger"""  # noqa: E501
        self._format = None
        self._method = None
        self._didl_mode = None
        self._language = None
        self._container = None
        self._protocol = None
        self.discriminator = None
        if format is not None:
            self.format = format
        if method is not None:
            self.method = method
        if didl_mode is not None:
            self.didl_mode = didl_mode
        if language is not None:
            self.language = language
        if container is not None:
            self.container = container
        if protocol is not None:
            self.protocol = protocol

    @property
    def format(self):
        """Gets the format of this SubtitleProfile.  # noqa: E501


        :return: The format of this SubtitleProfile.  # noqa: E501
        :rtype: str
        """
        return self._format

    @format.setter
    def format(self, format):
        """Sets the format of this SubtitleProfile.


        :param format: The format of this SubtitleProfile.  # noqa: E501
        :type: str
        """

        self._format = format

    @property
    def method(self):
        """Gets the method of this SubtitleProfile.  # noqa: E501


        :return: The method of this SubtitleProfile.  # noqa: E501
        :rtype: SubtitleDeliveryMethod
        """
        return self._method

    @method.setter
    def method(self, method):
        """Sets the method of this SubtitleProfile.


        :param method: The method of this SubtitleProfile.  # noqa: E501
        :type: SubtitleDeliveryMethod
        """

        self._method = method

    @property
    def didl_mode(self):
        """Gets the didl_mode of this SubtitleProfile.  # noqa: E501


        :return: The didl_mode of this SubtitleProfile.  # noqa: E501
        :rtype: str
        """
        return self._didl_mode

    @didl_mode.setter
    def didl_mode(self, didl_mode):
        """Sets the didl_mode of this SubtitleProfile.


        :param didl_mode: The didl_mode of this SubtitleProfile.  # noqa: E501
        :type: str
        """

        self._didl_mode = didl_mode

    @property
    def language(self):
        """Gets the language of this SubtitleProfile.  # noqa: E501


        :return: The language of this SubtitleProfile.  # noqa: E501
        :rtype: str
        """
        return self._language

    @language.setter
    def language(self, language):
        """Sets the language of this SubtitleProfile.


        :param language: The language of this SubtitleProfile.  # noqa: E501
        :type: str
        """

        self._language = language

    @property
    def container(self):
        """Gets the container of this SubtitleProfile.  # noqa: E501


        :return: The container of this SubtitleProfile.  # noqa: E501
        :rtype: str
        """
        return self._container

    @container.setter
    def container(self, container):
        """Sets the container of this SubtitleProfile.


        :param container: The container of this SubtitleProfile.  # noqa: E501
        :type: str
        """

        self._container = container

    @property
    def protocol(self):
        """Gets the protocol of this SubtitleProfile.  # noqa: E501


        :return: The protocol of this SubtitleProfile.  # noqa: E501
        :rtype: str
        """
        return self._protocol

    @protocol.setter
    def protocol(self, protocol):
        """Sets the protocol of this SubtitleProfile.


        :param protocol: The protocol of this SubtitleProfile.  # noqa: E501
        :type: str
        """

        self._protocol = protocol

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
        if issubclass(SubtitleProfile, dict):
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
        if not isinstance(other, SubtitleProfile):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other