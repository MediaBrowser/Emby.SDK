//
// OpenApiServiceAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class OpenApiServiceAPI {
    /**
     Gets the OpenAPI 3 specifications

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getOpenapi(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        getOpenapiWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Gets the OpenAPI 3 specifications
     - GET /openapi

     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func getOpenapiWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/openapi"
        let URLString = embyclient-rest-swift-betaAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = embyclient-rest-swift-betaAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Gets OpenAPI 3 specifications

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getOpenapiJson(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        getOpenapiJsonWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Gets OpenAPI 3 specifications
     - GET /openapi.json

     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func getOpenapiJsonWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/openapi.json"
        let URLString = embyclient-rest-swift-betaAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = embyclient-rest-swift-betaAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Gets the swagger specifications

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSwagger(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        getSwaggerWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Gets the swagger specifications
     - GET /swagger

     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func getSwaggerWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/swagger"
        let URLString = embyclient-rest-swift-betaAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = embyclient-rest-swift-betaAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Gets the swagger specifications

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getSwaggerJson(completion: @escaping ((_ data: String?,_ error: Error?) -> Void)) {
        getSwaggerJsonWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Gets the swagger specifications
     - GET /swagger.json

     - examples: [{contentType=application/json, example=""}]

     - returns: RequestBuilder<String> 
     */
    open class func getSwaggerJsonWithRequestBuilder() -> RequestBuilder<String> {
        let path = "/swagger.json"
        let URLString = embyclient-rest-swift-betaAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<String>.Type = embyclient-rest-swift-betaAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}