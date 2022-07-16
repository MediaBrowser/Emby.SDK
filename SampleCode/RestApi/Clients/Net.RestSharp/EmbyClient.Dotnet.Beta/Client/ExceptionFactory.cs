/*
 * EmbyClient.Dotnet.Beta
 * API Version: 4.8.0.6
 */


using System;
using RestSharp;

namespace EmbyClient.Dotnet.Beta.Client
{
    /// <summary>
    /// A delegate to ExceptionFactory method
    /// </summary>
    /// <param name="methodName">Method name</param>
    /// <param name="response">Response</param>
    /// <returns>Exceptions</returns>
    public delegate Exception ExceptionFactory(string methodName, IRestResponse response);
}
