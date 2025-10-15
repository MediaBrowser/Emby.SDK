# coding: utf-8

"""
    Emby Server REST API (BETA)
"""

import setuptools

with open("README.md", "r") as fh:
    long_description = fh.read()


NAME = "embyclient"
VERSION = "4.9.2.4"


REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

classifiers = [
    'Intended Audience :: Developers',
    'Topic :: Software Development :: Build Tools',
    'Topic :: Multimedia :: Video',
    'Topic :: Multimedia',
    'Topic :: Internet :: WWW/HTTP',
    'Operating System :: OS Independent'
]

setup(
    name=NAME,
    version=VERSION,
    packages=setuptools.find_packages(exclude=["tests"]),
    include_package_data=True,
    description="",
    install_requires=REQUIRES,
    long_description=long_description,
    long_description_content_type="text/markdown",
    url="",
    keywords=["Emby", "Rest", "API", "client", "media", "server", "JSON"],
    classifiers=classifiers,
)
