
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

type ItemRefreshServiceApiService service
/*
ItemRefreshServiceApiService Refreshes metadata for an item
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param optional nil or *ItemRefreshServiceApiPostItemsByIdRefreshOpts - Optional Parameters:
     * @param "Recursive" (optional.Bool) -  Indicates if the refresh should occur recursively.
     * @param "MetadataRefreshMode" (optional.Interface of MetadataRefreshMode) -  Specifies the metadata refresh mode
     * @param "ImageRefreshMode" (optional.Interface of MetadataRefreshMode) -  Specifies the image refresh mode
     * @param "ReplaceAllMetadata" (optional.Bool) -  Determines if metadata should be replaced. Only applicable if mode is FullRefresh
     * @param "ReplaceAllImages" (optional.Bool) -  Determines if images should be replaced. Only applicable if mode is FullRefresh

*/

type ItemRefreshServiceApiPostItemsByIdRefreshOpts struct {
    Recursive optional.Bool
    MetadataRefreshMode optional.Interface
    ImageRefreshMode optional.Interface
    ReplaceAllMetadata optional.Bool
    ReplaceAllImages optional.Bool
}

func (a *ItemRefreshServiceApiService) PostItemsByIdRefresh(ctx context.Context, id string, localVarOptionals *ItemRefreshServiceApiPostItemsByIdRefreshOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Refresh"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MetadataRefreshMode.IsSet() {
		localVarQueryParams.Add("MetadataRefreshMode", parameterToString(localVarOptionals.MetadataRefreshMode.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageRefreshMode.IsSet() {
		localVarQueryParams.Add("ImageRefreshMode", parameterToString(localVarOptionals.ImageRefreshMode.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ReplaceAllMetadata.IsSet() {
		localVarQueryParams.Add("ReplaceAllMetadata", parameterToString(localVarOptionals.ReplaceAllMetadata.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ReplaceAllImages.IsSet() {
		localVarQueryParams.Add("ReplaceAllImages", parameterToString(localVarOptionals.ReplaceAllImages.Value(), ""))
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
