# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import pprint
import re  # noqa: F401

import six

class BitRate(object):
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
        'bps': 'int',
        'kbps': 'float',
        'mbps': 'float'
    }

    attribute_map = {
        'bps': 'bps',
        'kbps': 'kbps',
        'mbps': 'Mbps'
    }

    def __init__(self, bps=None, kbps=None, mbps=None):  # noqa: E501
        """BitRate - a model defined in Swagger"""  # noqa: E501
        self._bps = None
        self._kbps = None
        self._mbps = None
        self.discriminator = None
        if bps is not None:
            self.bps = bps
        if kbps is not None:
            self.kbps = kbps
        if mbps is not None:
            self.mbps = mbps

    @property
    def bps(self):
        """Gets the bps of this BitRate.  # noqa: E501


        :return: The bps of this BitRate.  # noqa: E501
        :rtype: int
        """
        return self._bps

    @bps.setter
    def bps(self, bps):
        """Sets the bps of this BitRate.


        :param bps: The bps of this BitRate.  # noqa: E501
        :type: int
        """

        self._bps = bps

    @property
    def kbps(self):
        """Gets the kbps of this BitRate.  # noqa: E501


        :return: The kbps of this BitRate.  # noqa: E501
        :rtype: float
        """
        return self._kbps

    @kbps.setter
    def kbps(self, kbps):
        """Sets the kbps of this BitRate.


        :param kbps: The kbps of this BitRate.  # noqa: E501
        :type: float
        """

        self._kbps = kbps

    @property
    def mbps(self):
        """Gets the mbps of this BitRate.  # noqa: E501


        :return: The mbps of this BitRate.  # noqa: E501
        :rtype: float
        """
        return self._mbps

    @mbps.setter
    def mbps(self, mbps):
        """Sets the mbps of this BitRate.


        :param mbps: The mbps of this BitRate.  # noqa: E501
        :type: float
        """

        self._mbps = mbps

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
        if issubclass(BitRate, dict):
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
        if not isinstance(other, BitRate):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other