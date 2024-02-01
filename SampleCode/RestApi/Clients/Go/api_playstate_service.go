
/*
 * Emby Server REST API
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

import (
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"fmt"
	"github.com/antihax/optional"
)

// Linger please
var (
	_ context.Context
)

type PlaystateServiceApiService service
/*
PlaystateServiceApiService Marks an item as unplayed
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param userId User Id
 * @param id Item Id
@return UserItemDataDto
*/
func (a *PlaystateServiceApiService) DeleteUsersByUseridPlayeditemsById(ctx context.Context, userId string, id string) (UserItemDataDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue UserItemDataDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayedItems/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v UserItemDataDto
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports that a user has stopped playing an item
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param userId User Id
 * @param id Item Id
 * @param mediaSourceId The id of the MediaSource
 * @param nextMediaType The next media type that will play
 * @param optional nil or *PlaystateServiceApiDeleteUsersByUseridPlayingitemsByIdOpts - Optional Parameters:
     * @param "PositionTicks" (optional.Int64) -  Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks.
     * @param "LiveStreamId" (optional.String) - 
     * @param "PlaySessionId" (optional.String) - 

*/

type PlaystateServiceApiDeleteUsersByUseridPlayingitemsByIdOpts struct {
    PositionTicks optional.Int64
    LiveStreamId optional.String
    PlaySessionId optional.String
}

func (a *PlaystateServiceApiService) DeleteUsersByUseridPlayingitemsById(ctx context.Context, userId string, id string, mediaSourceId string, nextMediaType string, localVarOptionals *PlaystateServiceApiDeleteUsersByUseridPlayingitemsByIdOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayingItems/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
	localVarQueryParams.Add("NextMediaType", parameterToString(nextMediaType, ""))
	if localVarOptionals != nil && localVarOptionals.PositionTicks.IsSet() {
		localVarQueryParams.Add("PositionTicks", parameterToString(localVarOptionals.PositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.LiveStreamId.IsSet() {
		localVarQueryParams.Add("LiveStreamId", parameterToString(localVarOptionals.LiveStreamId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlaySessionId.IsSet() {
		localVarQueryParams.Add("PlaySessionId", parameterToString(localVarOptionals.PlaySessionId.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports playback has started within a session
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body PlaybackStartInfo: 

*/
func (a *PlaystateServiceApiService) PostSessionsPlaying(ctx context.Context, body PlaybackStartInfo) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Sessions/Playing"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json", "application/xml"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Pings a playback session
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *PlaystateServiceApiPostSessionsPlayingPingOpts - Optional Parameters:
     * @param "PlaySessionId" (optional.String) - 

*/

type PlaystateServiceApiPostSessionsPlayingPingOpts struct {
    PlaySessionId optional.String
}

func (a *PlaystateServiceApiService) PostSessionsPlayingPing(ctx context.Context, localVarOptionals *PlaystateServiceApiPostSessionsPlayingPingOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Sessions/Playing/Ping"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.PlaySessionId.IsSet() {
		localVarQueryParams.Add("PlaySessionId", parameterToString(localVarOptionals.PlaySessionId.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports playback progress within a session
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body PlaybackProgressInfo: 

*/
func (a *PlaystateServiceApiService) PostSessionsPlayingProgress(ctx context.Context, body PlaybackProgressInfo) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Sessions/Playing/Progress"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json", "application/xml"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports playback has stopped within a session
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body PlaybackStopInfo: 

*/
func (a *PlaystateServiceApiService) PostSessionsPlayingStopped(ctx context.Context, body PlaybackStopInfo) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Sessions/Playing/Stopped"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json", "application/xml"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Updates userdata for an item
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body UserItemDataDto: 
 * @param userId User Id
 * @param itemId

*/
func (a *PlaystateServiceApiService) PostUsersByUseridItemsByItemidUserdata(ctx context.Context, body UserItemDataDto, userId string, itemId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/Items/{ItemId}/UserData"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"ItemId"+"}", fmt.Sprintf("%v", itemId), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json", "application/xml"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Marks an item as played
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param userId User Id
 * @param id Item Id
 * @param optional nil or *PlaystateServiceApiPostUsersByUseridPlayeditemsByIdOpts - Optional Parameters:
     * @param "DatePlayed" (optional.String) -  The date the item was played (if any). Format &#x3D; yyyyMMddHHmmss
@return UserItemDataDto
*/

type PlaystateServiceApiPostUsersByUseridPlayeditemsByIdOpts struct {
    DatePlayed optional.String
}

func (a *PlaystateServiceApiService) PostUsersByUseridPlayeditemsById(ctx context.Context, userId string, id string, localVarOptionals *PlaystateServiceApiPostUsersByUseridPlayeditemsByIdOpts) (UserItemDataDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue UserItemDataDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayedItems/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.DatePlayed.IsSet() {
		localVarQueryParams.Add("DatePlayed", parameterToString(localVarOptionals.DatePlayed.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v UserItemDataDto
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Marks an item as unplayed
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param userId User Id
 * @param id Item Id
@return UserItemDataDto
*/
func (a *PlaystateServiceApiService) PostUsersByUseridPlayeditemsByIdDelete(ctx context.Context, userId string, id string) (UserItemDataDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue UserItemDataDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayedItems/{Id}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v UserItemDataDto
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports that a user has begun playing an item
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param userId User Id
 * @param id Item Id
 * @param mediaSourceId The id of the MediaSource
 * @param optional nil or *PlaystateServiceApiPostUsersByUseridPlayingitemsByIdOpts - Optional Parameters:
     * @param "CanSeek" (optional.Bool) -  Indicates if the client can seek
     * @param "AudioStreamIndex" (optional.Int32) - 
     * @param "SubtitleStreamIndex" (optional.Int32) - 
     * @param "PlayMethod" (optional.Interface of PlayMethod) - 
     * @param "LiveStreamId" (optional.String) - 
     * @param "PlaySessionId" (optional.String) - 

*/

type PlaystateServiceApiPostUsersByUseridPlayingitemsByIdOpts struct {
    CanSeek optional.Bool
    AudioStreamIndex optional.Int32
    SubtitleStreamIndex optional.Int32
    PlayMethod optional.Interface
    LiveStreamId optional.String
    PlaySessionId optional.String
}

func (a *PlaystateServiceApiService) PostUsersByUseridPlayingitemsById(ctx context.Context, userId string, id string, mediaSourceId string, localVarOptionals *PlaystateServiceApiPostUsersByUseridPlayingitemsByIdOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayingItems/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
	if localVarOptionals != nil && localVarOptionals.CanSeek.IsSet() {
		localVarQueryParams.Add("CanSeek", parameterToString(localVarOptionals.CanSeek.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioStreamIndex.IsSet() {
		localVarQueryParams.Add("AudioStreamIndex", parameterToString(localVarOptionals.AudioStreamIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleStreamIndex.IsSet() {
		localVarQueryParams.Add("SubtitleStreamIndex", parameterToString(localVarOptionals.SubtitleStreamIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlayMethod.IsSet() {
		localVarQueryParams.Add("PlayMethod", parameterToString(localVarOptionals.PlayMethod.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.LiveStreamId.IsSet() {
		localVarQueryParams.Add("LiveStreamId", parameterToString(localVarOptionals.LiveStreamId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlaySessionId.IsSet() {
		localVarQueryParams.Add("PlaySessionId", parameterToString(localVarOptionals.PlaySessionId.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports that a user has stopped playing an item
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param userId User Id
 * @param id Item Id
 * @param mediaSourceId The id of the MediaSource
 * @param nextMediaType The next media type that will play
 * @param optional nil or *PlaystateServiceApiPostUsersByUseridPlayingitemsByIdDeleteOpts - Optional Parameters:
     * @param "PositionTicks" (optional.Int64) -  Optional. The position, in ticks, where playback stopped. 1ms &#x3D; 10000 ticks.
     * @param "LiveStreamId" (optional.String) - 
     * @param "PlaySessionId" (optional.String) - 

*/

type PlaystateServiceApiPostUsersByUseridPlayingitemsByIdDeleteOpts struct {
    PositionTicks optional.Int64
    LiveStreamId optional.String
    PlaySessionId optional.String
}

func (a *PlaystateServiceApiService) PostUsersByUseridPlayingitemsByIdDelete(ctx context.Context, userId string, id string, mediaSourceId string, nextMediaType string, localVarOptionals *PlaystateServiceApiPostUsersByUseridPlayingitemsByIdDeleteOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayingItems/{Id}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
	localVarQueryParams.Add("NextMediaType", parameterToString(nextMediaType, ""))
	if localVarOptionals != nil && localVarOptionals.PositionTicks.IsSet() {
		localVarQueryParams.Add("PositionTicks", parameterToString(localVarOptionals.PositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.LiveStreamId.IsSet() {
		localVarQueryParams.Add("LiveStreamId", parameterToString(localVarOptionals.LiveStreamId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlaySessionId.IsSet() {
		localVarQueryParams.Add("PlaySessionId", parameterToString(localVarOptionals.PlaySessionId.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
/*
PlaystateServiceApiService Reports a user&#x27;s playback progress
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body OnPlaybackProgress
 * @param mediaSourceId The id of the MediaSource
 * @param userId User Id
 * @param id Item Id
 * @param optional nil or *PlaystateServiceApiPostUsersByUseridPlayingitemsByIdProgressOpts - Optional Parameters:
     * @param "PositionTicks" (optional.Int64) -  Optional. The current position, in ticks. 1ms &#x3D; 10000 ticks.
     * @param "IsPaused" (optional.Bool) -  Indicates if the player is paused.
     * @param "IsMuted" (optional.Bool) -  Indicates if the player is muted.
     * @param "AudioStreamIndex" (optional.Int32) - 
     * @param "SubtitleStreamIndex" (optional.Int32) - 
     * @param "VolumeLevel" (optional.Int32) -  Scale of 0-100
     * @param "PlayMethod" (optional.Interface of PlayMethod) - 
     * @param "LiveStreamId" (optional.String) - 
     * @param "PlaySessionId" (optional.String) - 
     * @param "RepeatMode" (optional.Interface of RepeatMode) - 
     * @param "SubtitleOffset" (optional.Int32) - 
     * @param "PlaybackRate" (optional.Float64) - 

*/

type PlaystateServiceApiPostUsersByUseridPlayingitemsByIdProgressOpts struct {
    PositionTicks optional.Int64
    IsPaused optional.Bool
    IsMuted optional.Bool
    AudioStreamIndex optional.Int32
    SubtitleStreamIndex optional.Int32
    VolumeLevel optional.Int32
    PlayMethod optional.Interface
    LiveStreamId optional.String
    PlaySessionId optional.String
    RepeatMode optional.Interface
    SubtitleOffset optional.Int32
    PlaybackRate optional.Float64
}

func (a *PlaystateServiceApiService) PostUsersByUseridPlayingitemsByIdProgress(ctx context.Context, body ApiOnPlaybackProgress, mediaSourceId string, userId string, id string, localVarOptionals *PlaystateServiceApiPostUsersByUseridPlayingitemsByIdProgressOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{UserId}/PlayingItems/{Id}/Progress"
	localVarPath = strings.Replace(localVarPath, "{"+"UserId"+"}", fmt.Sprintf("%v", userId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
	if localVarOptionals != nil && localVarOptionals.PositionTicks.IsSet() {
		localVarQueryParams.Add("PositionTicks", parameterToString(localVarOptionals.PositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPaused.IsSet() {
		localVarQueryParams.Add("IsPaused", parameterToString(localVarOptionals.IsPaused.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMuted.IsSet() {
		localVarQueryParams.Add("IsMuted", parameterToString(localVarOptionals.IsMuted.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioStreamIndex.IsSet() {
		localVarQueryParams.Add("AudioStreamIndex", parameterToString(localVarOptionals.AudioStreamIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleStreamIndex.IsSet() {
		localVarQueryParams.Add("SubtitleStreamIndex", parameterToString(localVarOptionals.SubtitleStreamIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VolumeLevel.IsSet() {
		localVarQueryParams.Add("VolumeLevel", parameterToString(localVarOptionals.VolumeLevel.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlayMethod.IsSet() {
		localVarQueryParams.Add("PlayMethod", parameterToString(localVarOptionals.PlayMethod.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.LiveStreamId.IsSet() {
		localVarQueryParams.Add("LiveStreamId", parameterToString(localVarOptionals.LiveStreamId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlaySessionId.IsSet() {
		localVarQueryParams.Add("PlaySessionId", parameterToString(localVarOptionals.PlaySessionId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.RepeatMode.IsSet() {
		localVarQueryParams.Add("RepeatMode", parameterToString(localVarOptionals.RepeatMode.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleOffset.IsSet() {
		localVarQueryParams.Add("SubtitleOffset", parameterToString(localVarOptionals.SubtitleOffset.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PlaybackRate.IsSet() {
		localVarQueryParams.Add("PlaybackRate", parameterToString(localVarOptionals.PlaybackRate.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json", "application/xml"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	if ctx != nil {
		// API Key Authentication
		if auth, ok := ctx.Value(ContextAPIKey).(APIKey); ok {
			var key string
			if auth.Prefix != "" {
				key = auth.Prefix + " " + auth.Key
			} else {
				key = auth.Key
			}
			
			localVarQueryParams.Add("api_key", key)
		}
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
