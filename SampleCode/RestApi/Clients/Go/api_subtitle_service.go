
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

type SubtitleServiceApiService service
/*
SubtitleServiceApiService Deletes an external subtitle file
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index

*/
func (a *SubtitleServiceApiService) DeleteItemsByIdSubtitlesByIndex(ctx context.Context, id string, mediaSourceId string, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Subtitles/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
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
SubtitleServiceApiService Deletes an external subtitle file
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index

*/
func (a *SubtitleServiceApiService) DeleteVideosByIdSubtitlesByIndex(ctx context.Context, id string, mediaSourceId string, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Videos/{Id}/Subtitles/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param startPositionTicks StartPositionTicks
 * @param optional nil or *SubtitleServiceApiGetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts - Optional Parameters:
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiGetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts struct {
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, startPositionTicks int64, localVarOptionals *SubtitleServiceApiGetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"StartPositionTicks"+"}", fmt.Sprintf("%v", startPositionTicks), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param optional nil or *SubtitleServiceApiGetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts - Optional Parameters:
     * @param "StartPositionTicks" (optional.Int64) -  StartPositionTicks
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiGetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts struct {
    StartPositionTicks optional.Int64
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, localVarOptionals *SubtitleServiceApiGetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.StartPositionTicks.IsSet() {
		localVarQueryParams.Add("StartPositionTicks", parameterToString(localVarOptionals.StartPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param language Language
 * @param optional nil or *SubtitleServiceApiGetItemsByIdRemotesearchSubtitlesByLanguageOpts - Optional Parameters:
     * @param "IsPerfectMatch" (optional.Bool) -  IsPerfectMatch
     * @param "IsForced" (optional.Bool) -  IsForced
     * @param "IsHearingImpaired" (optional.Bool) -  IsHearingImpaired
@return []RemoteSubtitleInfo
*/

type SubtitleServiceApiGetItemsByIdRemotesearchSubtitlesByLanguageOpts struct {
    IsPerfectMatch optional.Bool
    IsForced optional.Bool
    IsHearingImpaired optional.Bool
}

func (a *SubtitleServiceApiService) GetItemsByIdRemotesearchSubtitlesByLanguage(ctx context.Context, id string, mediaSourceId string, language string, localVarOptionals *SubtitleServiceApiGetItemsByIdRemotesearchSubtitlesByLanguageOpts) ([]RemoteSubtitleInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []RemoteSubtitleInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/RemoteSearch/Subtitles/{Language}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Language"+"}", fmt.Sprintf("%v", language), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
	if localVarOptionals != nil && localVarOptionals.IsPerfectMatch.IsSet() {
		localVarQueryParams.Add("IsPerfectMatch", parameterToString(localVarOptionals.IsPerfectMatch.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsForced.IsSet() {
		localVarQueryParams.Add("IsForced", parameterToString(localVarOptionals.IsForced.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IsHearingImpaired.IsSet() {
		localVarQueryParams.Add("IsHearingImpaired", parameterToString(localVarOptionals.IsHearingImpaired.Value(), ""))
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
			var v []RemoteSubtitleInfo
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
SubtitleServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id

*/
func (a *SubtitleServiceApiService) GetProvidersSubtitlesSubtitlesById(ctx context.Context, id string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Providers/Subtitles/Subtitles/{Id}"
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param startPositionTicks StartPositionTicks
 * @param optional nil or *SubtitleServiceApiGetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts - Optional Parameters:
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiGetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts struct {
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, startPositionTicks int64, localVarOptionals *SubtitleServiceApiGetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"StartPositionTicks"+"}", fmt.Sprintf("%v", startPositionTicks), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param optional nil or *SubtitleServiceApiGetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts - Optional Parameters:
     * @param "StartPositionTicks" (optional.Int64) -  StartPositionTicks
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiGetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts struct {
    StartPositionTicks optional.Int64
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, localVarOptionals *SubtitleServiceApiGetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.StartPositionTicks.IsSet() {
		localVarQueryParams.Add("StartPositionTicks", parameterToString(localVarOptionals.StartPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param startPositionTicks StartPositionTicks
 * @param optional nil or *SubtitleServiceApiHeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts - Optional Parameters:
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiHeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts struct {
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) HeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, startPositionTicks int64, localVarOptionals *SubtitleServiceApiHeadItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"StartPositionTicks"+"}", fmt.Sprintf("%v", startPositionTicks), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param optional nil or *SubtitleServiceApiHeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts - Optional Parameters:
     * @param "StartPositionTicks" (optional.Int64) -  StartPositionTicks
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiHeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts struct {
    StartPositionTicks optional.Int64
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) HeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, localVarOptionals *SubtitleServiceApiHeadItemsByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.StartPositionTicks.IsSet() {
		localVarQueryParams.Add("StartPositionTicks", parameterToString(localVarOptionals.StartPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param startPositionTicks StartPositionTicks
 * @param optional nil or *SubtitleServiceApiHeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts - Optional Parameters:
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiHeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts struct {
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) HeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, startPositionTicks int64, localVarOptionals *SubtitleServiceApiHeadVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"StartPositionTicks"+"}", fmt.Sprintf("%v", startPositionTicks), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService Gets subtitles in a specified format.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index
 * @param format Format
 * @param optional nil or *SubtitleServiceApiHeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts - Optional Parameters:
     * @param "StartPositionTicks" (optional.Int64) -  StartPositionTicks
     * @param "EndPositionTicks" (optional.Int64) -  EndPositionTicks
     * @param "CopyTimestamps" (optional.Bool) -  CopyTimestamps

*/

type SubtitleServiceApiHeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts struct {
    StartPositionTicks optional.Int64
    EndPositionTicks optional.Int64
    CopyTimestamps optional.Bool
}

func (a *SubtitleServiceApiService) HeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat(ctx context.Context, id string, mediaSourceId string, index int32, format string, localVarOptionals *SubtitleServiceApiHeadVideosByIdByMediasourceidSubtitlesByIndexStreamByFormatOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MediaSourceId"+"}", fmt.Sprintf("%v", mediaSourceId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.StartPositionTicks.IsSet() {
		localVarQueryParams.Add("StartPositionTicks", parameterToString(localVarOptionals.StartPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EndPositionTicks.IsSet() {
		localVarQueryParams.Add("EndPositionTicks", parameterToString(localVarOptionals.EndPositionTicks.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CopyTimestamps.IsSet() {
		localVarQueryParams.Add("CopyTimestamps", parameterToString(localVarOptionals.CopyTimestamps.Value(), ""))
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
SubtitleServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param subtitleId SubtitleId
@return SubtitlesSubtitleDownloadResult
*/
func (a *SubtitleServiceApiService) PostItemsByIdRemotesearchSubtitlesBySubtitleid(ctx context.Context, id string, mediaSourceId string, subtitleId string) (SubtitlesSubtitleDownloadResult, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue SubtitlesSubtitleDownloadResult
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"SubtitleId"+"}", fmt.Sprintf("%v", subtitleId), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
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
			var v SubtitlesSubtitleDownloadResult
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
SubtitleServiceApiService Deletes an external subtitle file
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index

*/
func (a *SubtitleServiceApiService) PostItemsByIdSubtitlesByIndexDelete(ctx context.Context, id string, mediaSourceId string, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Subtitles/{Index}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
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
SubtitleServiceApiService Deletes an external subtitle file
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param mediaSourceId MediaSourceId
 * @param index The subtitle stream index

*/
func (a *SubtitleServiceApiService) PostVideosByIdSubtitlesByIndexDelete(ctx context.Context, id string, mediaSourceId string, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Videos/{Id}/Subtitles/{Index}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("MediaSourceId", parameterToString(mediaSourceId, ""))
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
