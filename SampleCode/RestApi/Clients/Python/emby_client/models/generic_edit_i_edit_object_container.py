# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import pprint
import re  # noqa: F401

import six

class GenericEditIEditObjectContainer(object):
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
        'object': 'object',
        'default_object': 'object',
        'type_name': 'str'
    }

    attribute_map = {
        'object': 'Object',
        'default_object': 'DefaultObject',
        'type_name': 'TypeName'
    }

    def __init__(self, object=None, default_object=None, type_name=None):  # noqa: E501
        """GenericEditIEditObjectContainer - a model defined in Swagger"""  # noqa: E501
        self._object = None
        self._default_object = None
        self._type_name = None
        self.discriminator = None
        if object is not None:
            self.object = object
        if default_object is not None:
            self.default_object = default_object
        if type_name is not None:
            self.type_name = type_name

    @property
    def object(self):
        """Gets the object of this GenericEditIEditObjectContainer.  # noqa: E501


        :return: The object of this GenericEditIEditObjectContainer.  # noqa: E501
        :rtype: object
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this GenericEditIEditObjectContainer.


        :param object: The object of this GenericEditIEditObjectContainer.  # noqa: E501
        :type: object
        """

        self._object = object

    @property
    def default_object(self):
        """Gets the default_object of this GenericEditIEditObjectContainer.  # noqa: E501


        :return: The default_object of this GenericEditIEditObjectContainer.  # noqa: E501
        :rtype: object
        """
        return self._default_object

    @default_object.setter
    def default_object(self, default_object):
        """Sets the default_object of this GenericEditIEditObjectContainer.


        :param default_object: The default_object of this GenericEditIEditObjectContainer.  # noqa: E501
        :type: object
        """

        self._default_object = default_object

    @property
    def type_name(self):
        """Gets the type_name of this GenericEditIEditObjectContainer.  # noqa: E501


        :return: The type_name of this GenericEditIEditObjectContainer.  # noqa: E501
        :rtype: str
        """
        return self._type_name

    @type_name.setter
    def type_name(self, type_name):
        """Sets the type_name of this GenericEditIEditObjectContainer.


        :param type_name: The type_name of this GenericEditIEditObjectContainer.  # noqa: E501
        :type: str
        """

        self._type_name = type_name

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
        if issubclass(GenericEditIEditObjectContainer, dict):
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
        if not isinstance(other, GenericEditIEditObjectContainer):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other