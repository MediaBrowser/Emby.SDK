
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

type LiveTvServiceApiService service
/*
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) DeleteLivetvChannelmappingoptions(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappingOptions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) DeleteLivetvChannelmappings(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappings"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService Deletes a listing provider
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiDeleteLivetvListingprovidersOpts - Optional Parameters:
     * @param "Id" (optional.String) -  Provider id

*/

type LiveTvServiceApiDeleteLivetvListingprovidersOpts struct {
    Id optional.String
}

func (a *LiveTvServiceApiService) DeleteLivetvListingproviders(ctx context.Context, localVarOptionals *LiveTvServiceApiDeleteLivetvListingprovidersOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Id.IsSet() {
		localVarQueryParams.Add("Id", parameterToString(localVarOptionals.Id.Value(), ""))
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
LiveTvServiceApiService Deletes a live tv recording
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Recording Id

*/
func (a *LiveTvServiceApiService) DeleteLivetvRecordingsById(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings/{Id}"
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
LiveTvServiceApiService Cancels a live tv series timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Timer Id

*/
func (a *LiveTvServiceApiService) DeleteLivetvSeriestimersById(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/SeriesTimers/{Id}"
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
LiveTvServiceApiService Cancels a live tv timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Timer Id

*/
func (a *LiveTvServiceApiService) DeleteLivetvTimersById(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers/{Id}"
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
LiveTvServiceApiService Deletes a tuner host
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiDeleteLivetvTunerhostsOpts - Optional Parameters:
     * @param "Id" (optional.String) -  Tuner host id

*/

type LiveTvServiceApiDeleteLivetvTunerhostsOpts struct {
    Id optional.String
}

func (a *LiveTvServiceApiService) DeleteLivetvTunerhosts(ctx context.Context, localVarOptionals *LiveTvServiceApiDeleteLivetvTunerhostsOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/TunerHosts"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Id.IsSet() {
		localVarQueryParams.Add("Id", parameterToString(localVarOptionals.Id.Value(), ""))
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
LiveTvServiceApiService Gets available recording options
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return ApiAvailableRecordingOptions
*/
func (a *LiveTvServiceApiService) GetLivetvAvailablerecordingoptions(ctx context.Context) (ApiAvailableRecordingOptions, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue ApiAvailableRecordingOptions
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/AvailableRecordingOptions"

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
			var v ApiAvailableRecordingOptions
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) GetLivetvChannelmappingoptions(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappingOptions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) GetLivetvChannelmappings(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappings"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService Gets available live tv channels.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvChannelsOpts - Optional Parameters:
     * @param "Type_" (optional.Interface of LiveTvChannelType) -  Optional filter by channel type.
     * @param "IsLiked" (optional.Bool) -  Filter by channels that are liked, or not.
     * @param "IsDisliked" (optional.Bool) -  Filter by channels that are disliked, or not.
     * @param "EnableFavoriteSorting" (optional.Bool) -  Incorporate favorite and like status into channel sorting.
     * @param "AddCurrentProgram" (optional.Bool) -  Optional. Adds current program info to each channel
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.
@return QueryResultBaseItemDto
*/

type LiveTvServiceApiGetLivetvChannelsOpts struct {
    Type_ optional.Interface
    IsLiked optional.Bool
    IsDisliked optional.Bool
    EnableFavoriteSorting optional.Bool
    AddCurrentProgram optional.Bool
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) GetLivetvChannels(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvChannelsOpts) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Channels"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Type_.IsSet() {
		localVarQueryParams.Add("Type", parameterToString(localVarOptionals.Type_.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLiked.IsSet() {
		localVarQueryParams.Add("IsLiked", parameterToString(localVarOptionals.IsLiked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsDisliked.IsSet() {
		localVarQueryParams.Add("IsDisliked", parameterToString(localVarOptionals.IsDisliked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableFavoriteSorting.IsSet() {
		localVarQueryParams.Add("EnableFavoriteSorting", parameterToString(localVarOptionals.EnableFavoriteSorting.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AddCurrentProgram.IsSet() {
		localVarQueryParams.Add("AddCurrentProgram", parameterToString(localVarOptionals.AddCurrentProgram.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
/*
LiveTvServiceApiService Gets a live tv channel
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Channel Id
 * @param optional nil or *LiveTvServiceApiGetLivetvChannelsByIdOpts - Optional Parameters:
     * @param "UserId" (optional.String) -  Optional attach user data.
@return BaseItemDto
*/

type LiveTvServiceApiGetLivetvChannelsByIdOpts struct {
    UserId optional.String
}

func (a *LiveTvServiceApiService) GetLivetvChannelsById(ctx context.Context, id string, localVarOptionals *LiveTvServiceApiGetLivetvChannelsByIdOpts) (BaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue BaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Channels/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
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
			var v BaseItemDto
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
LiveTvServiceApiService Gets live tv channel tags
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvChanneltagsOpts - Optional Parameters:
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.
@return QueryResultBaseItemDto
*/

type LiveTvServiceApiGetLivetvChanneltagsOpts struct {
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) GetLivetvChanneltags(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvChanneltagsOpts) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelTags"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
/*
LiveTvServiceApiService Gets live tv channel tag prefixes
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvChanneltagsPrefixesOpts - Optional Parameters:
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.
@return []ApiTagItem
*/

type LiveTvServiceApiGetLivetvChanneltagsPrefixesOpts struct {
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) GetLivetvChanneltagsPrefixes(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvChanneltagsPrefixesOpts) ([]ApiTagItem, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []ApiTagItem
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelTags/Prefixes"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
			var v []ApiTagItem
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
LiveTvServiceApiService Gets the epg.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvEPGOpts - Optional Parameters:
     * @param "Type_" (optional.Interface of LiveTvChannelType) -  Optional filter by channel type.
     * @param "IsLiked" (optional.Bool) -  Filter by channels that are liked, or not.
     * @param "IsDisliked" (optional.Bool) -  Filter by channels that are disliked, or not.
     * @param "EnableFavoriteSorting" (optional.Bool) -  Incorporate favorite and like status into channel sorting.
     * @param "AddCurrentProgram" (optional.Bool) -  Optional. Adds current program info to each channel
     * @param "ChannelIds" (optional.String) -  The channels to return guide information for.
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.
@return QueryResultApiEpgRow
*/

type LiveTvServiceApiGetLivetvEPGOpts struct {
    Type_ optional.Interface
    IsLiked optional.Bool
    IsDisliked optional.Bool
    EnableFavoriteSorting optional.Bool
    AddCurrentProgram optional.Bool
    ChannelIds optional.String
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) GetLivetvEPG(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvEPGOpts) (QueryResultApiEpgRow, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultApiEpgRow
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/EPG"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Type_.IsSet() {
		localVarQueryParams.Add("Type", parameterToString(localVarOptionals.Type_.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLiked.IsSet() {
		localVarQueryParams.Add("IsLiked", parameterToString(localVarOptionals.IsLiked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsDisliked.IsSet() {
		localVarQueryParams.Add("IsDisliked", parameterToString(localVarOptionals.IsDisliked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableFavoriteSorting.IsSet() {
		localVarQueryParams.Add("EnableFavoriteSorting", parameterToString(localVarOptionals.EnableFavoriteSorting.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AddCurrentProgram.IsSet() {
		localVarQueryParams.Add("AddCurrentProgram", parameterToString(localVarOptionals.AddCurrentProgram.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ChannelIds.IsSet() {
		localVarQueryParams.Add("ChannelIds", parameterToString(localVarOptionals.ChannelIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
			var v QueryResultApiEpgRow
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
LiveTvServiceApiService Gets the top level live tv folder
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return BaseItemDto
*/
func (a *LiveTvServiceApiService) GetLivetvFolder(ctx context.Context) (BaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue BaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Folder"

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
			var v BaseItemDto
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
LiveTvServiceApiService Gets guide info
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return LiveTvGuideInfo
*/
func (a *LiveTvServiceApiService) GetLivetvGuideinfo(ctx context.Context) (LiveTvGuideInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvGuideInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/GuideInfo"

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
			var v LiveTvGuideInfo
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
LiveTvServiceApiService Gets available live tv services.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return LiveTvLiveTvInfo
*/
func (a *LiveTvServiceApiService) GetLivetvInfo(ctx context.Context) (LiveTvLiveTvInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvLiveTvInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Info"

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
			var v LiveTvLiveTvInfo
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
LiveTvServiceApiService Gets current listing providers
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param channelId Channel id
@return []LiveTvListingsProviderInfo
*/
func (a *LiveTvServiceApiService) GetLivetvListingproviders(ctx context.Context, channelId string) ([]LiveTvListingsProviderInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []LiveTvListingsProviderInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ChannelId", parameterToString(channelId, ""))
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
			var v []LiveTvListingsProviderInfo
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
LiveTvServiceApiService Gets listing provider
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return []ApiListingProviderTypeInfo
*/
func (a *LiveTvServiceApiService) GetLivetvListingprovidersAvailable(ctx context.Context) ([]ApiListingProviderTypeInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []ApiListingProviderTypeInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders/Available"

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
			var v []ApiListingProviderTypeInfo
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
LiveTvServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return LiveTvListingsProviderInfo
*/
func (a *LiveTvServiceApiService) GetLivetvListingprovidersDefault(ctx context.Context) (LiveTvListingsProviderInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvListingsProviderInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders/Default"

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
			var v LiveTvListingsProviderInfo
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
LiveTvServiceApiService Gets available lineups
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvListingprovidersLineupsOpts - Optional Parameters:
     * @param "Id" (optional.String) -  Provider id
     * @param "Type_" (optional.String) -  Provider Type
     * @param "Location" (optional.String) -  Location
     * @param "Country" (optional.String) -  Country
@return []NameIdPair
*/

type LiveTvServiceApiGetLivetvListingprovidersLineupsOpts struct {
    Id optional.String
    Type_ optional.String
    Location optional.String
    Country optional.String
}

func (a *LiveTvServiceApiService) GetLivetvListingprovidersLineups(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvListingprovidersLineupsOpts) ([]NameIdPair, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []NameIdPair
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders/Lineups"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Id.IsSet() {
		localVarQueryParams.Add("Id", parameterToString(localVarOptionals.Id.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Type_.IsSet() {
		localVarQueryParams.Add("Type", parameterToString(localVarOptionals.Type_.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Location.IsSet() {
		localVarQueryParams.Add("Location", parameterToString(localVarOptionals.Location.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Country.IsSet() {
		localVarQueryParams.Add("Country", parameterToString(localVarOptionals.Country.Value(), ""))
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
			var v []NameIdPair
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
LiveTvServiceApiService Gets available lineups
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().

*/
func (a *LiveTvServiceApiService) GetLivetvListingprovidersSchedulesdirectCountries(ctx context.Context) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders/SchedulesDirect/Countries"

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
LiveTvServiceApiService Gets the channel management list
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvManageChannelsOpts - Optional Parameters:
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Name, StartDate
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
@return QueryResultChannelManagementInfo
*/

type LiveTvServiceApiGetLivetvManageChannelsOpts struct {
    StartIndex optional.Int32
    Limit optional.Int32
    SortBy optional.String
    SortOrder optional.String
}

func (a *LiveTvServiceApiService) GetLivetvManageChannels(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvManageChannelsOpts) (QueryResultChannelManagementInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultChannelManagementInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Manage/Channels"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
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
			var v QueryResultChannelManagementInfo
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
LiveTvServiceApiService Gets available live tv epgs..
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvProgramsOpts - Optional Parameters:
     * @param "ChannelIds" (optional.String) -  The channels to return guide information for.
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.

*/

type LiveTvServiceApiGetLivetvProgramsOpts struct {
    ChannelIds optional.String
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) GetLivetvPrograms(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvProgramsOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Programs"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ChannelIds.IsSet() {
		localVarQueryParams.Add("ChannelIds", parameterToString(localVarOptionals.ChannelIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
LiveTvServiceApiService Gets available live tv epgs..
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvProgramsRecommendedOpts - Optional Parameters:
     * @param "UserId" (optional.String) -  Optional filter by user id.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "IsAiring" (optional.Bool) -  Optional. Filter by programs that are currently airing, or not.
     * @param "HasAired" (optional.Bool) -  Optional. Filter by programs that have completed airing, or not.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "GenreIds" (optional.String) -  The genres to return guide information for.
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
@return QueryResultBaseItemDto
*/

type LiveTvServiceApiGetLivetvProgramsRecommendedOpts struct {
    UserId optional.String
    Limit optional.Int32
    IsAiring optional.Bool
    HasAired optional.Bool
    IsSeries optional.Bool
    IsMovie optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    EnableImages optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    GenreIds optional.String
    Fields optional.String
    EnableUserData optional.Bool
}

func (a *LiveTvServiceApiService) GetLivetvProgramsRecommended(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvProgramsRecommendedOpts) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Programs/Recommended"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsAiring.IsSet() {
		localVarQueryParams.Add("IsAiring", parameterToString(localVarOptionals.IsAiring.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasAired.IsSet() {
		localVarQueryParams.Add("HasAired", parameterToString(localVarOptionals.HasAired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
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
	if localVarOptionals != nil && localVarOptionals.GenreIds.IsSet() {
		localVarQueryParams.Add("GenreIds", parameterToString(localVarOptionals.GenreIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
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
/*
LiveTvServiceApiService Gets live tv recordings
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvRecordingsOpts - Optional Parameters:
     * @param "ChannelId" (optional.String) -  Optional filter by channel id.
     * @param "Status" (optional.Interface of LiveTvRecordingStatus) -  Optional filter by recording status.
     * @param "IsInProgress" (optional.Bool) -  Optional filter by recordings that are in progress, or not.
     * @param "SeriesTimerId" (optional.String) -  Optional filter by recordings belonging to a series timer
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.

*/

type LiveTvServiceApiGetLivetvRecordingsOpts struct {
    ChannelId optional.String
    Status optional.Interface
    IsInProgress optional.Bool
    SeriesTimerId optional.String
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) GetLivetvRecordings(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvRecordingsOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ChannelId.IsSet() {
		localVarQueryParams.Add("ChannelId", parameterToString(localVarOptionals.ChannelId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Status.IsSet() {
		localVarQueryParams.Add("Status", parameterToString(localVarOptionals.Status.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsInProgress.IsSet() {
		localVarQueryParams.Add("IsInProgress", parameterToString(localVarOptionals.IsInProgress.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesTimerId.IsSet() {
		localVarQueryParams.Add("SeriesTimerId", parameterToString(localVarOptionals.SeriesTimerId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
LiveTvServiceApiService Gets a live tv recording
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Recording Id
 * @param optional nil or *LiveTvServiceApiGetLivetvRecordingsByIdOpts - Optional Parameters:
     * @param "UserId" (optional.String) -  Optional attach user data.
@return BaseItemDto
*/

type LiveTvServiceApiGetLivetvRecordingsByIdOpts struct {
    UserId optional.String
}

func (a *LiveTvServiceApiService) GetLivetvRecordingsById(ctx context.Context, id string, localVarOptionals *LiveTvServiceApiGetLivetvRecordingsByIdOpts) (BaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue BaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
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
			var v BaseItemDto
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
LiveTvServiceApiService Gets recording folders
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvRecordingsFoldersOpts - Optional Parameters:
     * @param "UserId" (optional.String) -  Optional filter by user and attach user data.
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
@return []BaseItemDto
*/

type LiveTvServiceApiGetLivetvRecordingsFoldersOpts struct {
    UserId optional.String
    Fields optional.String
    EnableImages optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    EnableUserData optional.Bool
}

func (a *LiveTvServiceApiService) GetLivetvRecordingsFolders(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvRecordingsFoldersOpts) ([]BaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []BaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings/Folders"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
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
			var v []BaseItemDto
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
LiveTvServiceApiService Gets live tv recording groups
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return QueryResultBaseItemDto
*/
func (a *LiveTvServiceApiService) GetLivetvRecordingsGroups(ctx context.Context) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings/Groups"

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
/*
LiveTvServiceApiService Gets live tv recordings
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return QueryResultBaseItemDto
*/
func (a *LiveTvServiceApiService) GetLivetvRecordingsSeries(ctx context.Context) (QueryResultBaseItemDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultBaseItemDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings/Series"

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
/*
LiveTvServiceApiService Gets live tv series timers
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvSeriestimersOpts - Optional Parameters:
     * @param "SortBy" (optional.String) -  Optional. Sort by SortName or Priority
     * @param "SortOrder" (optional.Interface of SortOrder) -  Optional. Sort in Ascending or Descending order
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
@return QueryResultLiveTvSeriesTimerInfoDto
*/

type LiveTvServiceApiGetLivetvSeriestimersOpts struct {
    SortBy optional.String
    SortOrder optional.Interface
    StartIndex optional.Int32
    Limit optional.Int32
}

func (a *LiveTvServiceApiService) GetLivetvSeriestimers(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvSeriestimersOpts) (QueryResultLiveTvSeriesTimerInfoDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultLiveTvSeriesTimerInfoDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/SeriesTimers"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
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
			var v QueryResultLiveTvSeriesTimerInfoDto
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
LiveTvServiceApiService Gets a live tv series timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Timer Id
@return LiveTvTimerInfoDto
*/
func (a *LiveTvServiceApiService) GetLivetvSeriestimersById(ctx context.Context, id string) (LiveTvTimerInfoDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvTimerInfoDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/SeriesTimers/{Id}"
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
			var v LiveTvTimerInfoDto
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
LiveTvServiceApiService Gets live tv timers
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvTimersOpts - Optional Parameters:
     * @param "ChannelId" (optional.String) -  Optional filter by channel id.
     * @param "SeriesTimerId" (optional.String) -  Optional filter by timers belonging to a series timer
@return QueryResultLiveTvTimerInfoDto
*/

type LiveTvServiceApiGetLivetvTimersOpts struct {
    ChannelId optional.String
    SeriesTimerId optional.String
}

func (a *LiveTvServiceApiService) GetLivetvTimers(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvTimersOpts) (QueryResultLiveTvTimerInfoDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultLiveTvTimerInfoDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ChannelId.IsSet() {
		localVarQueryParams.Add("ChannelId", parameterToString(localVarOptionals.ChannelId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesTimerId.IsSet() {
		localVarQueryParams.Add("SeriesTimerId", parameterToString(localVarOptionals.SeriesTimerId.Value(), ""))
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
			var v QueryResultLiveTvTimerInfoDto
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
LiveTvServiceApiService Gets a live tv timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Timer Id
@return LiveTvTimerInfoDto
*/
func (a *LiveTvServiceApiService) GetLivetvTimersById(ctx context.Context, id string) (LiveTvTimerInfoDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvTimerInfoDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers/{Id}"
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
			var v LiveTvTimerInfoDto
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
LiveTvServiceApiService Gets default values for a new timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiGetLivetvTimersDefaultsOpts - Optional Parameters:
     * @param "ProgramId" (optional.String) -  Optional, to attach default values based on a program.
@return LiveTvSeriesTimerInfoDto
*/

type LiveTvServiceApiGetLivetvTimersDefaultsOpts struct {
    ProgramId optional.String
}

func (a *LiveTvServiceApiService) GetLivetvTimersDefaults(ctx context.Context, localVarOptionals *LiveTvServiceApiGetLivetvTimersDefaultsOpts) (LiveTvSeriesTimerInfoDto, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvSeriesTimerInfoDto
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers/Defaults"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ProgramId.IsSet() {
		localVarQueryParams.Add("ProgramId", parameterToString(localVarOptionals.ProgramId.Value(), ""))
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
			var v LiveTvSeriesTimerInfoDto
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
LiveTvServiceApiService Gets tuner hosts
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return []LiveTvTunerHostInfo
*/
func (a *LiveTvServiceApiService) GetLivetvTunerhosts(ctx context.Context) ([]LiveTvTunerHostInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []LiveTvTunerHostInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/TunerHosts"

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
			var v []LiveTvTunerHostInfo
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
LiveTvServiceApiService Gets tuner hosts
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param type_ Type
@return LiveTvTunerHostInfo
*/
func (a *LiveTvServiceApiService) GetLivetvTunerhostsDefaultByType(ctx context.Context, type_ string) (LiveTvTunerHostInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvTunerHostInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/TunerHosts/Default/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

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
			var v LiveTvTunerHostInfo
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
LiveTvServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return []NameIdPair
*/
func (a *LiveTvServiceApiService) GetLivetvTunerhostsTypes(ctx context.Context) ([]NameIdPair, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []NameIdPair
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/TunerHosts/Types"

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
			var v []NameIdPair
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
LiveTvServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
@return []LiveTvTunerHostInfo
*/
func (a *LiveTvServiceApiService) GetLivetvTunersDiscvover(ctx context.Context) ([]LiveTvTunerHostInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []LiveTvTunerHostInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Tuners/Discvover"

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
			var v []LiveTvTunerHostInfo
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) HeadLivetvChannelmappingoptions(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappingOptions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) HeadLivetvChannelmappings(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappings"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) PostLivetvChannelmappingoptions(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappingOptions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body SetChannelMapping
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) PostLivetvChannelmappings(ctx context.Context, body ApiSetChannelMapping, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappings"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService Adds a listing provider
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body ListingsProviderInfo: 
@return LiveTvListingsProviderInfo
*/
func (a *LiveTvServiceApiService) PostLivetvListingproviders(ctx context.Context, body LiveTvListingsProviderInfo) (LiveTvListingsProviderInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvListingsProviderInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders"

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
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

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
			var v LiveTvListingsProviderInfo
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
LiveTvServiceApiService Deletes a listing provider
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiPostLivetvListingprovidersDeleteOpts - Optional Parameters:
     * @param "Id" (optional.String) -  Provider id

*/

type LiveTvServiceApiPostLivetvListingprovidersDeleteOpts struct {
    Id optional.String
}

func (a *LiveTvServiceApiService) PostLivetvListingprovidersDelete(ctx context.Context, localVarOptionals *LiveTvServiceApiPostLivetvListingprovidersDeleteOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ListingProviders/Delete"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Id.IsSet() {
		localVarQueryParams.Add("Id", parameterToString(localVarOptionals.Id.Value(), ""))
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
LiveTvServiceApiService Sets a channel disabled or not
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body SetChannelDisabled
 * @param id
@return QueryResultChannelManagementInfo
*/
func (a *LiveTvServiceApiService) PostLivetvManageChannelsByIdDisabled(ctx context.Context, body ApiSetChannelDisabled, id string) (QueryResultChannelManagementInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultChannelManagementInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Manage/Channels/{Id}/Disabled"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

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
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

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
			var v QueryResultChannelManagementInfo
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
LiveTvServiceApiService Sets a channel sort index
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body SetChannelSortIndex
 * @param id
@return QueryResultChannelManagementInfo
*/
func (a *LiveTvServiceApiService) PostLivetvManageChannelsByIdSortindex(ctx context.Context, body ApiSetChannelSortIndex, id string) (QueryResultChannelManagementInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue QueryResultChannelManagementInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Manage/Channels/{Id}/SortIndex"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

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
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

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
			var v QueryResultChannelManagementInfo
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
LiveTvServiceApiService Gets available live tv epgs..
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body BaseItemsRequest: 
 * @param optional nil or *LiveTvServiceApiPostLivetvProgramsOpts - Optional Parameters:
     * @param "ChannelIds" (optional.String) -  The channels to return guide information for.
     * @param "ArtistType" (optional.String) -  Artist or AlbumArtist
     * @param "MaxOfficialRating" (optional.String) -  Optional filter by maximum official rating (PG, PG-13, TV-MA, etc).
     * @param "HasThemeSong" (optional.Bool) -  Optional filter by items with theme songs.
     * @param "HasThemeVideo" (optional.Bool) -  Optional filter by items with theme videos.
     * @param "HasSubtitles" (optional.Bool) -  Optional filter by items with subtitles.
     * @param "HasSpecialFeature" (optional.Bool) -  Optional filter by items with special features.
     * @param "HasTrailer" (optional.Bool) -  Optional filter by items with trailers.
     * @param "AdjacentTo" (optional.String) -  Optional. Return items that are siblings of a supplied item.
     * @param "MinIndexNumber" (optional.Int32) -  Optional filter by minimum index number.
     * @param "MinStartDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxStartDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinEndDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxEndDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "MinPlayers" (optional.Int32) -  Optional filter by minimum number of game players.
     * @param "MaxPlayers" (optional.Int32) -  Optional filter by maximum number of game players.
     * @param "ParentIndexNumber" (optional.Int32) -  Optional filter by parent index number.
     * @param "HasParentalRating" (optional.Bool) -  Optional filter by items that have or do not have a parental rating
     * @param "IsHD" (optional.Bool) -  Optional filter by items that are HD or not.
     * @param "IsUnaired" (optional.Bool) -  Optional filter by items that are unaired episodes or not.
     * @param "MinCommunityRating" (optional.Float64) -  Optional filter by minimum community rating.
     * @param "MinCriticRating" (optional.Float64) -  Optional filter by minimum critic rating.
     * @param "AiredDuringSeason" (optional.Int32) -  Gets all episodes that aired during a season, including specials.
     * @param "MinPremiereDate" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSaved" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MinDateLastSavedForUser" (optional.String) -  Optional. The minimum premiere date. Format &#x3D; ISO
     * @param "MaxPremiereDate" (optional.String) -  Optional. The maximum premiere date. Format &#x3D; ISO
     * @param "HasOverview" (optional.Bool) -  Optional filter by items that have an overview or not.
     * @param "HasImdbId" (optional.Bool) -  Optional filter by items that have an imdb id or not.
     * @param "HasTmdbId" (optional.Bool) -  Optional filter by items that have a tmdb id or not.
     * @param "HasTvdbId" (optional.Bool) -  Optional filter by items that have a tvdb id or not.
     * @param "ExcludeItemIds" (optional.String) -  Optional. If specified, results will be filtered by exxcluding item ids. This allows multiple, comma delimeted.
     * @param "StartIndex" (optional.Int32) -  Optional. The record index to start at. All items with a lower index will be dropped from the results.
     * @param "Limit" (optional.Int32) -  Optional. The maximum number of records to return
     * @param "Recursive" (optional.Bool) -  When searching within folders, this determines whether or not the search will be recursive. true/false
     * @param "SearchTerm" (optional.String) -  Enter a search term to perform a search request
     * @param "SortOrder" (optional.String) -  Sort Order - Ascending,Descending
     * @param "ParentId" (optional.String) -  Specify this to localize the search to a specific item or folder. Omit to use the root
     * @param "Fields" (optional.String) -  Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimeted. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines
     * @param "ExcludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "IncludeItemTypes" (optional.String) -  Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimeted.
     * @param "AnyProviderIdEquals" (optional.String) -  Optional. If specified, result will be filtered to contain only items which match at least one of the specified IDs. Each provider ID must be in the form &#x27;prov.id&#x27;, e.g. &#x27;imdb.tt123456&#x27;. This allows multiple, comma delimeted value pairs.
     * @param "Filters" (optional.String) -  Optional. Specify additional filters to apply. This allows multiple, comma delimeted. Options: IsFolder, IsNotFolder, IsUnplayed, IsPlayed, IsFavorite, IsResumable, Likes, Dislikes
     * @param "IsFavorite" (optional.Bool) -  Optional filter by items that are marked as favorite, or not.
     * @param "IsMovie" (optional.Bool) -  Optional filter for movies.
     * @param "IsSeries" (optional.Bool) -  Optional filter for series.
     * @param "IsFolder" (optional.Bool) -  Optional filter for folders.
     * @param "IsNews" (optional.Bool) -  Optional filter for news.
     * @param "IsKids" (optional.Bool) -  Optional filter for kids.
     * @param "IsSports" (optional.Bool) -  Optional filter for sports.
     * @param "IsNew" (optional.Bool) -  Optional filter for IsNew.
     * @param "IsPremiere" (optional.Bool) -  Optional filter for IsPremiere.
     * @param "IsNewOrPremiere" (optional.Bool) -  Optional filter for IsNewOrPremiere.
     * @param "IsRepeat" (optional.Bool) -  Optional filter for IsRepeat.
     * @param "ProjectToMedia" (optional.Bool) -  ProjectToMedia
     * @param "MediaTypes" (optional.String) -  Optional filter by MediaType. Allows multiple, comma delimited.
     * @param "ImageTypes" (optional.String) -  Optional. If specified, results will be filtered based on those containing image types. This allows multiple, comma delimited.
     * @param "SortBy" (optional.String) -  Optional. Specify one or more sort orders, comma delimeted. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime
     * @param "IsPlayed" (optional.Bool) -  Optional filter by items that are played, or not.
     * @param "Genres" (optional.String) -  Optional. If specified, results will be filtered based on genre. This allows multiple, pipe delimeted.
     * @param "OfficialRatings" (optional.String) -  Optional. If specified, results will be filtered based on OfficialRating. This allows multiple, pipe delimeted.
     * @param "Tags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "ExcludeTags" (optional.String) -  Optional. If specified, results will be filtered based on tag. This allows multiple, pipe delimeted.
     * @param "Years" (optional.String) -  Optional. If specified, results will be filtered based on production year. This allows multiple, comma delimeted.
     * @param "EnableImages" (optional.Bool) -  Optional, include image information in output
     * @param "EnableUserData" (optional.Bool) -  Optional, include user data
     * @param "ImageTypeLimit" (optional.Int32) -  Optional, the max number of images to return, per image type
     * @param "EnableImageTypes" (optional.String) -  Optional. The image types to include in the output.
     * @param "Person" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonIds" (optional.String) -  Optional. If specified, results will be filtered to include only those containing the specified person.
     * @param "PersonTypes" (optional.String) -  Optional. If specified, along with Person, results will be filtered to include only those containing the specified person and PersonType. Allows multiple, comma-delimited
     * @param "Studios" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "StudioIds" (optional.String) -  Optional. If specified, results will be filtered based on studio. This allows multiple, pipe delimeted.
     * @param "Artists" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "ArtistIds" (optional.String) -  Optional. If specified, results will be filtered based on artist. This allows multiple, pipe delimeted.
     * @param "Albums" (optional.String) -  Optional. If specified, results will be filtered based on album. This allows multiple, pipe delimeted.
     * @param "Ids" (optional.String) -  Optional. If specific items are needed, specify a list of item id&#x27;s to retrieve. This allows multiple, comma delimited.
     * @param "VideoTypes" (optional.String) -  Optional filter by VideoType (videofile, dvd, bluray, iso). Allows multiple, comma delimeted.
     * @param "Containers" (optional.String) -  Optional filter by Container. Allows multiple, comma delimeted.
     * @param "AudioCodecs" (optional.String) -  Optional filter by AudioCodec. Allows multiple, comma delimeted.
     * @param "AudioLayouts" (optional.String) -  Optional filter by AudioLayout. Allows multiple, comma delimeted.
     * @param "VideoCodecs" (optional.String) -  Optional filter by VideoCodec. Allows multiple, comma delimeted.
     * @param "ExtendedVideoTypes" (optional.String) -  Optional filter by ExtendedVideoType. Allows multiple, comma delimeted.
     * @param "SubtitleCodecs" (optional.String) -  Optional filter by SubtitleCodec. Allows multiple, comma delimeted.
     * @param "Path" (optional.String) -  Optional filter by Path.
     * @param "UserId" (optional.String) -  User Id
     * @param "MinOfficialRating" (optional.String) -  Optional filter by minimum official rating (PG, PG-13, TV-MA, etc).
     * @param "IsLocked" (optional.Bool) -  Optional filter by items that are locked.
     * @param "IsPlaceHolder" (optional.Bool) -  Optional filter by items that are placeholders
     * @param "HasOfficialRating" (optional.Bool) -  Optional filter by items that have official ratings
     * @param "GroupItemsIntoCollections" (optional.Bool) -  Whether or not to hide items behind their boxsets.
     * @param "Is3D" (optional.Bool) -  Optional filter by items that are 3D, or not.
     * @param "SeriesStatus" (optional.String) -  Optional filter by Series Status. Allows multiple, comma delimeted.
     * @param "NameStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "ArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "AlbumArtistStartsWithOrGreater" (optional.String) -  Optional filter by items whose name is sorted equally or greater than a given input string.
     * @param "NameStartsWith" (optional.String) -  Optional filter by items whose name is sorted equally than a given input string.
     * @param "NameLessThan" (optional.String) -  Optional filter by items whose name is equally or lesser than a given input string.

*/

type LiveTvServiceApiPostLivetvProgramsOpts struct {
    ChannelIds optional.String
    ArtistType optional.String
    MaxOfficialRating optional.String
    HasThemeSong optional.Bool
    HasThemeVideo optional.Bool
    HasSubtitles optional.Bool
    HasSpecialFeature optional.Bool
    HasTrailer optional.Bool
    AdjacentTo optional.String
    MinIndexNumber optional.Int32
    MinStartDate optional.String
    MaxStartDate optional.String
    MinEndDate optional.String
    MaxEndDate optional.String
    MinPlayers optional.Int32
    MaxPlayers optional.Int32
    ParentIndexNumber optional.Int32
    HasParentalRating optional.Bool
    IsHD optional.Bool
    IsUnaired optional.Bool
    MinCommunityRating optional.Float64
    MinCriticRating optional.Float64
    AiredDuringSeason optional.Int32
    MinPremiereDate optional.String
    MinDateLastSaved optional.String
    MinDateLastSavedForUser optional.String
    MaxPremiereDate optional.String
    HasOverview optional.Bool
    HasImdbId optional.Bool
    HasTmdbId optional.Bool
    HasTvdbId optional.Bool
    ExcludeItemIds optional.String
    StartIndex optional.Int32
    Limit optional.Int32
    Recursive optional.Bool
    SearchTerm optional.String
    SortOrder optional.String
    ParentId optional.String
    Fields optional.String
    ExcludeItemTypes optional.String
    IncludeItemTypes optional.String
    AnyProviderIdEquals optional.String
    Filters optional.String
    IsFavorite optional.Bool
    IsMovie optional.Bool
    IsSeries optional.Bool
    IsFolder optional.Bool
    IsNews optional.Bool
    IsKids optional.Bool
    IsSports optional.Bool
    IsNew optional.Bool
    IsPremiere optional.Bool
    IsNewOrPremiere optional.Bool
    IsRepeat optional.Bool
    ProjectToMedia optional.Bool
    MediaTypes optional.String
    ImageTypes optional.String
    SortBy optional.String
    IsPlayed optional.Bool
    Genres optional.String
    OfficialRatings optional.String
    Tags optional.String
    ExcludeTags optional.String
    Years optional.String
    EnableImages optional.Bool
    EnableUserData optional.Bool
    ImageTypeLimit optional.Int32
    EnableImageTypes optional.String
    Person optional.String
    PersonIds optional.String
    PersonTypes optional.String
    Studios optional.String
    StudioIds optional.String
    Artists optional.String
    ArtistIds optional.String
    Albums optional.String
    Ids optional.String
    VideoTypes optional.String
    Containers optional.String
    AudioCodecs optional.String
    AudioLayouts optional.String
    VideoCodecs optional.String
    ExtendedVideoTypes optional.String
    SubtitleCodecs optional.String
    Path optional.String
    UserId optional.String
    MinOfficialRating optional.String
    IsLocked optional.Bool
    IsPlaceHolder optional.Bool
    HasOfficialRating optional.Bool
    GroupItemsIntoCollections optional.Bool
    Is3D optional.Bool
    SeriesStatus optional.String
    NameStartsWithOrGreater optional.String
    ArtistStartsWithOrGreater optional.String
    AlbumArtistStartsWithOrGreater optional.String
    NameStartsWith optional.String
    NameLessThan optional.String
}

func (a *LiveTvServiceApiService) PostLivetvPrograms(ctx context.Context, body ApiBaseItemsRequest, localVarOptionals *LiveTvServiceApiPostLivetvProgramsOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Programs"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.ChannelIds.IsSet() {
		localVarQueryParams.Add("ChannelIds", parameterToString(localVarOptionals.ChannelIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistType.IsSet() {
		localVarQueryParams.Add("ArtistType", parameterToString(localVarOptionals.ArtistType.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxOfficialRating.IsSet() {
		localVarQueryParams.Add("MaxOfficialRating", parameterToString(localVarOptionals.MaxOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeSong.IsSet() {
		localVarQueryParams.Add("HasThemeSong", parameterToString(localVarOptionals.HasThemeSong.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasThemeVideo.IsSet() {
		localVarQueryParams.Add("HasThemeVideo", parameterToString(localVarOptionals.HasThemeVideo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSubtitles.IsSet() {
		localVarQueryParams.Add("HasSubtitles", parameterToString(localVarOptionals.HasSubtitles.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasSpecialFeature.IsSet() {
		localVarQueryParams.Add("HasSpecialFeature", parameterToString(localVarOptionals.HasSpecialFeature.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTrailer.IsSet() {
		localVarQueryParams.Add("HasTrailer", parameterToString(localVarOptionals.HasTrailer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AdjacentTo.IsSet() {
		localVarQueryParams.Add("AdjacentTo", parameterToString(localVarOptionals.AdjacentTo.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinIndexNumber.IsSet() {
		localVarQueryParams.Add("MinIndexNumber", parameterToString(localVarOptionals.MinIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinStartDate.IsSet() {
		localVarQueryParams.Add("MinStartDate", parameterToString(localVarOptionals.MinStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxStartDate.IsSet() {
		localVarQueryParams.Add("MaxStartDate", parameterToString(localVarOptionals.MaxStartDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinEndDate.IsSet() {
		localVarQueryParams.Add("MinEndDate", parameterToString(localVarOptionals.MinEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxEndDate.IsSet() {
		localVarQueryParams.Add("MaxEndDate", parameterToString(localVarOptionals.MaxEndDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPlayers.IsSet() {
		localVarQueryParams.Add("MinPlayers", parameterToString(localVarOptionals.MinPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPlayers.IsSet() {
		localVarQueryParams.Add("MaxPlayers", parameterToString(localVarOptionals.MaxPlayers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentIndexNumber.IsSet() {
		localVarQueryParams.Add("ParentIndexNumber", parameterToString(localVarOptionals.ParentIndexNumber.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasParentalRating.IsSet() {
		localVarQueryParams.Add("HasParentalRating", parameterToString(localVarOptionals.HasParentalRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHD.IsSet() {
		localVarQueryParams.Add("IsHD", parameterToString(localVarOptionals.IsHD.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsUnaired.IsSet() {
		localVarQueryParams.Add("IsUnaired", parameterToString(localVarOptionals.IsUnaired.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCommunityRating.IsSet() {
		localVarQueryParams.Add("MinCommunityRating", parameterToString(localVarOptionals.MinCommunityRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinCriticRating.IsSet() {
		localVarQueryParams.Add("MinCriticRating", parameterToString(localVarOptionals.MinCriticRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AiredDuringSeason.IsSet() {
		localVarQueryParams.Add("AiredDuringSeason", parameterToString(localVarOptionals.AiredDuringSeason.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinPremiereDate.IsSet() {
		localVarQueryParams.Add("MinPremiereDate", parameterToString(localVarOptionals.MinPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSaved.IsSet() {
		localVarQueryParams.Add("MinDateLastSaved", parameterToString(localVarOptionals.MinDateLastSaved.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinDateLastSavedForUser.IsSet() {
		localVarQueryParams.Add("MinDateLastSavedForUser", parameterToString(localVarOptionals.MinDateLastSavedForUser.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxPremiereDate.IsSet() {
		localVarQueryParams.Add("MaxPremiereDate", parameterToString(localVarOptionals.MaxPremiereDate.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOverview.IsSet() {
		localVarQueryParams.Add("HasOverview", parameterToString(localVarOptionals.HasOverview.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasImdbId.IsSet() {
		localVarQueryParams.Add("HasImdbId", parameterToString(localVarOptionals.HasImdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTmdbId.IsSet() {
		localVarQueryParams.Add("HasTmdbId", parameterToString(localVarOptionals.HasTmdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasTvdbId.IsSet() {
		localVarQueryParams.Add("HasTvdbId", parameterToString(localVarOptionals.HasTvdbId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemIds.IsSet() {
		localVarQueryParams.Add("ExcludeItemIds", parameterToString(localVarOptionals.ExcludeItemIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StartIndex.IsSet() {
		localVarQueryParams.Add("StartIndex", parameterToString(localVarOptionals.StartIndex.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Limit.IsSet() {
		localVarQueryParams.Add("Limit", parameterToString(localVarOptionals.Limit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Recursive.IsSet() {
		localVarQueryParams.Add("Recursive", parameterToString(localVarOptionals.Recursive.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SearchTerm.IsSet() {
		localVarQueryParams.Add("SearchTerm", parameterToString(localVarOptionals.SearchTerm.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortOrder.IsSet() {
		localVarQueryParams.Add("SortOrder", parameterToString(localVarOptionals.SortOrder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ParentId.IsSet() {
		localVarQueryParams.Add("ParentId", parameterToString(localVarOptionals.ParentId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Fields.IsSet() {
		localVarQueryParams.Add("Fields", parameterToString(localVarOptionals.Fields.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeItemTypes.IsSet() {
		localVarQueryParams.Add("ExcludeItemTypes", parameterToString(localVarOptionals.ExcludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeItemTypes.IsSet() {
		localVarQueryParams.Add("IncludeItemTypes", parameterToString(localVarOptionals.IncludeItemTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AnyProviderIdEquals.IsSet() {
		localVarQueryParams.Add("AnyProviderIdEquals", parameterToString(localVarOptionals.AnyProviderIdEquals.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Filters.IsSet() {
		localVarQueryParams.Add("Filters", parameterToString(localVarOptionals.Filters.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFavorite.IsSet() {
		localVarQueryParams.Add("IsFavorite", parameterToString(localVarOptionals.IsFavorite.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsMovie.IsSet() {
		localVarQueryParams.Add("IsMovie", parameterToString(localVarOptionals.IsMovie.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSeries.IsSet() {
		localVarQueryParams.Add("IsSeries", parameterToString(localVarOptionals.IsSeries.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsFolder.IsSet() {
		localVarQueryParams.Add("IsFolder", parameterToString(localVarOptionals.IsFolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNews.IsSet() {
		localVarQueryParams.Add("IsNews", parameterToString(localVarOptionals.IsNews.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsKids.IsSet() {
		localVarQueryParams.Add("IsKids", parameterToString(localVarOptionals.IsKids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsSports.IsSet() {
		localVarQueryParams.Add("IsSports", parameterToString(localVarOptionals.IsSports.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNew.IsSet() {
		localVarQueryParams.Add("IsNew", parameterToString(localVarOptionals.IsNew.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPremiere.IsSet() {
		localVarQueryParams.Add("IsPremiere", parameterToString(localVarOptionals.IsPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsNewOrPremiere.IsSet() {
		localVarQueryParams.Add("IsNewOrPremiere", parameterToString(localVarOptionals.IsNewOrPremiere.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsRepeat.IsSet() {
		localVarQueryParams.Add("IsRepeat", parameterToString(localVarOptionals.IsRepeat.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ProjectToMedia.IsSet() {
		localVarQueryParams.Add("ProjectToMedia", parameterToString(localVarOptionals.ProjectToMedia.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MediaTypes.IsSet() {
		localVarQueryParams.Add("MediaTypes", parameterToString(localVarOptionals.MediaTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypes.IsSet() {
		localVarQueryParams.Add("ImageTypes", parameterToString(localVarOptionals.ImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SortBy.IsSet() {
		localVarQueryParams.Add("SortBy", parameterToString(localVarOptionals.SortBy.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlayed.IsSet() {
		localVarQueryParams.Add("IsPlayed", parameterToString(localVarOptionals.IsPlayed.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Genres.IsSet() {
		localVarQueryParams.Add("Genres", parameterToString(localVarOptionals.Genres.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.OfficialRatings.IsSet() {
		localVarQueryParams.Add("OfficialRatings", parameterToString(localVarOptionals.OfficialRatings.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tags.IsSet() {
		localVarQueryParams.Add("Tags", parameterToString(localVarOptionals.Tags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExcludeTags.IsSet() {
		localVarQueryParams.Add("ExcludeTags", parameterToString(localVarOptionals.ExcludeTags.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Years.IsSet() {
		localVarQueryParams.Add("Years", parameterToString(localVarOptionals.Years.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImages.IsSet() {
		localVarQueryParams.Add("EnableImages", parameterToString(localVarOptionals.EnableImages.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableUserData.IsSet() {
		localVarQueryParams.Add("EnableUserData", parameterToString(localVarOptionals.EnableUserData.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ImageTypeLimit.IsSet() {
		localVarQueryParams.Add("ImageTypeLimit", parameterToString(localVarOptionals.ImageTypeLimit.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageTypes.IsSet() {
		localVarQueryParams.Add("EnableImageTypes", parameterToString(localVarOptionals.EnableImageTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Person.IsSet() {
		localVarQueryParams.Add("Person", parameterToString(localVarOptionals.Person.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonIds.IsSet() {
		localVarQueryParams.Add("PersonIds", parameterToString(localVarOptionals.PersonIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.PersonTypes.IsSet() {
		localVarQueryParams.Add("PersonTypes", parameterToString(localVarOptionals.PersonTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Studios.IsSet() {
		localVarQueryParams.Add("Studios", parameterToString(localVarOptionals.Studios.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StudioIds.IsSet() {
		localVarQueryParams.Add("StudioIds", parameterToString(localVarOptionals.StudioIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Artists.IsSet() {
		localVarQueryParams.Add("Artists", parameterToString(localVarOptionals.Artists.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistIds.IsSet() {
		localVarQueryParams.Add("ArtistIds", parameterToString(localVarOptionals.ArtistIds.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Albums.IsSet() {
		localVarQueryParams.Add("Albums", parameterToString(localVarOptionals.Albums.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Ids.IsSet() {
		localVarQueryParams.Add("Ids", parameterToString(localVarOptionals.Ids.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoTypes.IsSet() {
		localVarQueryParams.Add("VideoTypes", parameterToString(localVarOptionals.VideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Containers.IsSet() {
		localVarQueryParams.Add("Containers", parameterToString(localVarOptionals.Containers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioCodecs.IsSet() {
		localVarQueryParams.Add("AudioCodecs", parameterToString(localVarOptionals.AudioCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AudioLayouts.IsSet() {
		localVarQueryParams.Add("AudioLayouts", parameterToString(localVarOptionals.AudioLayouts.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.VideoCodecs.IsSet() {
		localVarQueryParams.Add("VideoCodecs", parameterToString(localVarOptionals.VideoCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ExtendedVideoTypes.IsSet() {
		localVarQueryParams.Add("ExtendedVideoTypes", parameterToString(localVarOptionals.ExtendedVideoTypes.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SubtitleCodecs.IsSet() {
		localVarQueryParams.Add("SubtitleCodecs", parameterToString(localVarOptionals.SubtitleCodecs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Path.IsSet() {
		localVarQueryParams.Add("Path", parameterToString(localVarOptionals.Path.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.UserId.IsSet() {
		localVarQueryParams.Add("UserId", parameterToString(localVarOptionals.UserId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MinOfficialRating.IsSet() {
		localVarQueryParams.Add("MinOfficialRating", parameterToString(localVarOptionals.MinOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsLocked.IsSet() {
		localVarQueryParams.Add("IsLocked", parameterToString(localVarOptionals.IsLocked.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsPlaceHolder.IsSet() {
		localVarQueryParams.Add("IsPlaceHolder", parameterToString(localVarOptionals.IsPlaceHolder.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.HasOfficialRating.IsSet() {
		localVarQueryParams.Add("HasOfficialRating", parameterToString(localVarOptionals.HasOfficialRating.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GroupItemsIntoCollections.IsSet() {
		localVarQueryParams.Add("GroupItemsIntoCollections", parameterToString(localVarOptionals.GroupItemsIntoCollections.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Is3D.IsSet() {
		localVarQueryParams.Add("Is3D", parameterToString(localVarOptionals.Is3D.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.SeriesStatus.IsSet() {
		localVarQueryParams.Add("SeriesStatus", parameterToString(localVarOptionals.SeriesStatus.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("NameStartsWithOrGreater", parameterToString(localVarOptionals.NameStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("ArtistStartsWithOrGreater", parameterToString(localVarOptionals.ArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AlbumArtistStartsWithOrGreater.IsSet() {
		localVarQueryParams.Add("AlbumArtistStartsWithOrGreater", parameterToString(localVarOptionals.AlbumArtistStartsWithOrGreater.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameStartsWith.IsSet() {
		localVarQueryParams.Add("NameStartsWith", parameterToString(localVarOptionals.NameStartsWith.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.NameLessThan.IsSet() {
		localVarQueryParams.Add("NameLessThan", parameterToString(localVarOptionals.NameLessThan.Value(), ""))
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
/*
LiveTvServiceApiService Deletes a live tv recording
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Recording Id

*/
func (a *LiveTvServiceApiService) PostLivetvRecordingsByIdDelete(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Recordings/{Id}/Delete"
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
LiveTvServiceApiService Creates a live tv series timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body SeriesTimerInfo: 

*/
func (a *LiveTvServiceApiService) PostLivetvSeriestimers(ctx context.Context, body LiveTvSeriesTimerInfo) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/SeriesTimers"

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
LiveTvServiceApiService Updates a live tv series timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body SeriesTimerInfo: 
 * @param id

*/
func (a *LiveTvServiceApiService) PostLivetvSeriestimersById(ctx context.Context, body LiveTvSeriesTimerInfo, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/SeriesTimers/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

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
LiveTvServiceApiService Cancels a live tv series timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Timer Id

*/
func (a *LiveTvServiceApiService) PostLivetvSeriestimersByIdDelete(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/SeriesTimers/{Id}/Delete"
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
LiveTvServiceApiService Creates a live tv timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body TimerInfoDto: 

*/
func (a *LiveTvServiceApiService) PostLivetvTimers(ctx context.Context, body LiveTvTimerInfoDto) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers"

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
LiveTvServiceApiService Updates a live tv timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body TimerInfoDto: 
 * @param id

*/
func (a *LiveTvServiceApiService) PostLivetvTimersById(ctx context.Context, body LiveTvTimerInfoDto, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers/{Id}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)

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
LiveTvServiceApiService Cancels a live tv timer
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Timer Id

*/
func (a *LiveTvServiceApiService) PostLivetvTimersByIdDelete(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Timers/{Id}/Delete"
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
LiveTvServiceApiService Adds a tuner host
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body TunerHostInfo: 
@return LiveTvTunerHostInfo
*/
func (a *LiveTvServiceApiService) PostLivetvTunerhosts(ctx context.Context, body LiveTvTunerHostInfo) (LiveTvTunerHostInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue LiveTvTunerHostInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/TunerHosts"

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
	localVarHttpHeaderAccepts := []string{"application/json", "application/xml"}

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
			var v LiveTvTunerHostInfo
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
LiveTvServiceApiService Deletes a tuner host
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *LiveTvServiceApiPostLivetvTunerhostsDeleteOpts - Optional Parameters:
     * @param "Id" (optional.String) -  Tuner host id

*/

type LiveTvServiceApiPostLivetvTunerhostsDeleteOpts struct {
    Id optional.String
}

func (a *LiveTvServiceApiService) PostLivetvTunerhostsDelete(ctx context.Context, localVarOptionals *LiveTvServiceApiPostLivetvTunerhostsDeleteOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/TunerHosts/Delete"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Id.IsSet() {
		localVarQueryParams.Add("Id", parameterToString(localVarOptionals.Id.Value(), ""))
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
LiveTvServiceApiService Resets a tv tuner
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Tuner Id

*/
func (a *LiveTvServiceApiService) PostLivetvTunersByIdReset(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/Tuners/{Id}/Reset"
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) PutLivetvChannelmappingoptions(ctx context.Context, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Put")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappingOptions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
LiveTvServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body SetChannelMapping
 * @param providerId Provider id

*/
func (a *LiveTvServiceApiService) PutLivetvChannelmappings(ctx context.Context, body ApiSetChannelMapping, providerId string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Put")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/LiveTv/ChannelMappings"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("ProviderId", parameterToString(providerId, ""))
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
