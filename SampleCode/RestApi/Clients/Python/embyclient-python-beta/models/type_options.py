# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import pprint
import re  # noqa: F401

import six

class TypeOptions(object):
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
        'type': 'str',
        'metadata_fetchers': 'list[str]',
        'metadata_fetcher_order': 'list[str]',
        'image_fetchers': 'list[str]',
        'image_fetcher_order': 'list[str]',
        'image_options': 'list[ImageOption]'
    }

    attribute_map = {
        'type': 'Type',
        'metadata_fetchers': 'MetadataFetchers',
        'metadata_fetcher_order': 'MetadataFetcherOrder',
        'image_fetchers': 'ImageFetchers',
        'image_fetcher_order': 'ImageFetcherOrder',
        'image_options': 'ImageOptions'
    }

    def __init__(self, type=None, metadata_fetchers=None, metadata_fetcher_order=None, image_fetchers=None, image_fetcher_order=None, image_options=None):  # noqa: E501
        """TypeOptions - a model defined in Swagger"""  # noqa: E501
        self._type = None
        self._metadata_fetchers = None
        self._metadata_fetcher_order = None
        self._image_fetchers = None
        self._image_fetcher_order = None
        self._image_options = None
        self.discriminator = None
        if type is not None:
            self.type = type
        if metadata_fetchers is not None:
            self.metadata_fetchers = metadata_fetchers
        if metadata_fetcher_order is not None:
            self.metadata_fetcher_order = metadata_fetcher_order
        if image_fetchers is not None:
            self.image_fetchers = image_fetchers
        if image_fetcher_order is not None:
            self.image_fetcher_order = image_fetcher_order
        if image_options is not None:
            self.image_options = image_options

    @property
    def type(self):
        """Gets the type of this TypeOptions.  # noqa: E501


        :return: The type of this TypeOptions.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this TypeOptions.


        :param type: The type of this TypeOptions.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def metadata_fetchers(self):
        """Gets the metadata_fetchers of this TypeOptions.  # noqa: E501


        :return: The metadata_fetchers of this TypeOptions.  # noqa: E501
        :rtype: list[str]
        """
        return self._metadata_fetchers

    @metadata_fetchers.setter
    def metadata_fetchers(self, metadata_fetchers):
        """Sets the metadata_fetchers of this TypeOptions.


        :param metadata_fetchers: The metadata_fetchers of this TypeOptions.  # noqa: E501
        :type: list[str]
        """

        self._metadata_fetchers = metadata_fetchers

    @property
    def metadata_fetcher_order(self):
        """Gets the metadata_fetcher_order of this TypeOptions.  # noqa: E501


        :return: The metadata_fetcher_order of this TypeOptions.  # noqa: E501
        :rtype: list[str]
        """
        return self._metadata_fetcher_order

    @metadata_fetcher_order.setter
    def metadata_fetcher_order(self, metadata_fetcher_order):
        """Sets the metadata_fetcher_order of this TypeOptions.


        :param metadata_fetcher_order: The metadata_fetcher_order of this TypeOptions.  # noqa: E501
        :type: list[str]
        """

        self._metadata_fetcher_order = metadata_fetcher_order

    @property
    def image_fetchers(self):
        """Gets the image_fetchers of this TypeOptions.  # noqa: E501


        :return: The image_fetchers of this TypeOptions.  # noqa: E501
        :rtype: list[str]
        """
        return self._image_fetchers

    @image_fetchers.setter
    def image_fetchers(self, image_fetchers):
        """Sets the image_fetchers of this TypeOptions.


        :param image_fetchers: The image_fetchers of this TypeOptions.  # noqa: E501
        :type: list[str]
        """

        self._image_fetchers = image_fetchers

    @property
    def image_fetcher_order(self):
        """Gets the image_fetcher_order of this TypeOptions.  # noqa: E501


        :return: The image_fetcher_order of this TypeOptions.  # noqa: E501
        :rtype: list[str]
        """
        return self._image_fetcher_order

    @image_fetcher_order.setter
    def image_fetcher_order(self, image_fetcher_order):
        """Sets the image_fetcher_order of this TypeOptions.


        :param image_fetcher_order: The image_fetcher_order of this TypeOptions.  # noqa: E501
        :type: list[str]
        """

        self._image_fetcher_order = image_fetcher_order

    @property
    def image_options(self):
        """Gets the image_options of this TypeOptions.  # noqa: E501


        :return: The image_options of this TypeOptions.  # noqa: E501
        :rtype: list[ImageOption]
        """
        return self._image_options

    @image_options.setter
    def image_options(self, image_options):
        """Sets the image_options of this TypeOptions.


        :param image_options: The image_options of this TypeOptions.  # noqa: E501
        :type: list[ImageOption]
        """

        self._image_options = image_options

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
        if issubclass(TypeOptions, dict):
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
        if not isinstance(other, TypeOptions):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other