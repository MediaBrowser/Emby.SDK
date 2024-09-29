# coding: utf-8

"""
    Emby Server REST API
"""

from setuptools import setup, find_packages  # noqa: H301

NAME = "embyclient-python"
VERSION = "4.8.10.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Emby Server REST API",
    author_email="",
    url="",
    keywords=["Emby Server REST API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    Explore the Emby Server API  # noqa: E501
    """
)
