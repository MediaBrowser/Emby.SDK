
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
	"github.com/antihax/optional"
)

// Linger please
var (
	_ context.Context
)

type ChannelServiceApiService service
/*
ChannelServiceApiService Gets available channels
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *ChannelServiceApiGetChannelsOpts - Optional Parameters:
     * @param "UserId" (optional.String) -  User Id
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
@return QueryResultBaseItemDto
*/

type ChannelServiceApiGetChannelsOpts struct {
    UserId optional.String
    StartIndex optional.Int32
    Fields optional.String
    Limit optional.Int32
    EnableImages optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    EnableUserData optional.Bool
}

func (a *ChannelServiceApiService) GetChannels(ctx context.Context, localVarOptionals *ChannelServiceApiGetChannelsOpts) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Channels"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
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
			var v QueryResultBaseItemDto
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
