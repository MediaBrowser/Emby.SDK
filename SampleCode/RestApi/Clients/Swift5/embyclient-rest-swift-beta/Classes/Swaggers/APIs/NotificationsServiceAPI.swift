//
// NotificationsServiceAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire


open class NotificationsServiceAPI {
    /**
     Gets notification types

     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getNotificationsTypes(completion: @escaping ((_ data: [EmbyNotificationsNotificationCategoryInfo]?,_ error: Error?) -> Void)) {
        getNotificationsTypesWithRequestBuilder().execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Gets notification types
     - GET /Notifications/Types

     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apikeyauth
     - :
       - type: http
       - name: embyauth
     - examples: [{contentType=application/json, example=[ {
  "Events" : [ {
    "CategoryId" : "CategoryId",
    "CategoryName" : "CategoryName",
    "Id" : "Id",
    "Name" : "Name"
  }, {
    "CategoryId" : "CategoryId",
    "CategoryName" : "CategoryName",
    "Id" : "Id",
    "Name" : "Name"
  } ],
  "Id" : "Id",
  "Name" : "Name"
}, {
  "Events" : [ {
    "CategoryId" : "CategoryId",
    "CategoryName" : "CategoryName",
    "Id" : "Id",
    "Name" : "Name"
  }, {
    "CategoryId" : "CategoryId",
    "CategoryName" : "CategoryName",
    "Id" : "Id",
    "Name" : "Name"
  } ],
  "Id" : "Id",
  "Name" : "Name"
} ]}]

     - returns: RequestBuilder<[EmbyNotificationsNotificationCategoryInfo]> 
     */
    open class func getNotificationsTypesWithRequestBuilder() -> RequestBuilder<[EmbyNotificationsNotificationCategoryInfo]> {
        let path = "/Notifications/Types"
        let URLString = embyclient-rest-swift-betaAPI.basePath + path
        let parameters: [String:Any]? = nil
        let url = URLComponents(string: URLString)


        let requestBuilder: RequestBuilder<[EmbyNotificationsNotificationCategoryInfo]>.Type = embyclient-rest-swift-betaAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
    /**
     Sends a notification to all admin users

     - parameter name: (query) The notification&#x27;s name 
     - parameter _description: (query) The notification&#x27;s description 
     - parameter imageUrl: (query) The notification&#x27;s image url (optional)
     - parameter url: (query) The notification&#x27;s info url (optional)
     - parameter level: (query) The notification level (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func postNotificationsAdmin(name: String, _description: String, imageUrl: String? = nil, url: String? = nil, level: String? = nil, completion: @escaping ((_ data: Void?,_ error: Error?) -> Void)) {
        postNotificationsAdminWithRequestBuilder(name: name, _description: _description, imageUrl: imageUrl, url: url, level: level).execute { (response, error) -> Void in
            if error == nil {
                completion((), error)
            } else {
                completion(nil, error)
            }
        }
    }


    /**
     Sends a notification to all admin users
     - POST /Notifications/Admin

     - API Key:
       - type: apiKey api_key (QUERY)
       - name: apikeyauth
     - :
       - type: http
       - name: embyauth
     - parameter name: (query) The notification&#x27;s name 
     - parameter _description: (query) The notification&#x27;s description 
     - parameter imageUrl: (query) The notification&#x27;s image url (optional)
     - parameter url: (query) The notification&#x27;s info url (optional)
     - parameter level: (query) The notification level (optional)

     - returns: RequestBuilder<Void> 
     */
    open class func postNotificationsAdminWithRequestBuilder(name: String, _description: String, imageUrl: String? = nil, url: String? = nil, level: String? = nil) -> RequestBuilder<Void> {
        let path = "/Notifications/Admin"
        let URLString = embyclient-rest-swift-betaAPI.basePath + path
        let parameters: [String:Any]? = nil
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems([
                        "Name": name, 
                        "Description": _description, 
                        "ImageUrl": imageUrl, 
                        "Url": url, 
                        "Level": level
        ])


        let requestBuilder: RequestBuilder<Void>.Type = embyclient-rest-swift-betaAPI.requestBuilderFactory.getNonDecodableBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }
}