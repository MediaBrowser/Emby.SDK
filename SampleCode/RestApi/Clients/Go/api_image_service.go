
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

type ImageServiceApiService service
/*
ImageServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiDeleteItemsByIdImagesByTypeOpts - Optional Parameters:
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiDeleteItemsByIdImagesByTypeOpts struct {
    Index optional.Int32
}

func (a *ImageServiceApiService) DeleteItemsByIdImagesByType(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiDeleteItemsByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index

*/
func (a *ImageServiceApiService) DeleteItemsByIdImagesByTypeByIndex(ctx context.Context, id string, type_ ImageType, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiDeleteUsersByIdImagesByTypeOpts - Optional Parameters:
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiDeleteUsersByIdImagesByTypeOpts struct {
    Index optional.Int32
}

func (a *ImageServiceApiService) DeleteUsersByIdImagesByType(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiDeleteUsersByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param index Image Index

*/
func (a *ImageServiceApiService) DeleteUsersByIdImagesByTypeByIndex(ctx context.Context, id string, type_ ImageType, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Delete")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetArtistsByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetArtistsByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetArtistsByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiGetArtistsByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Artists/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetArtistsByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetArtistsByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetArtistsByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetArtistsByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Artists/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetGamegenresByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetGamegenresByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetGamegenresByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiGetGamegenresByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/GameGenres/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetGamegenresByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetGamegenresByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetGamegenresByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetGamegenresByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/GameGenres/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetGenresByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetGenresByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetGenresByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiGetGenresByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Genres/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetGenresByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetGenresByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetGenresByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetGenresByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Genres/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService Gets information about an item&#x27;s images
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
@return []ImageInfo
*/
func (a *ImageServiceApiService) GetItemsByIdImages(ctx context.Context, id string) ([]ImageInfo, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue []ImageInfo
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images"
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
			var v []ImageInfo
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetItemsByIdImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetItemsByIdImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetItemsByIdImagesByType(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiGetItemsByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetItemsByIdImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetItemsByIdImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetItemsByIdImagesByTypeByIndex(ctx context.Context, id string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetItemsByIdImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param percentPlayed
 * @param unPlayedCount
 * @param id Item Id
 * @param maxWidth The maximum image width to return.
 * @param maxHeight The maximum image height to return.
 * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers.
 * @param format Determines the output foramt of the image - original,gif,jpg,png
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountOpts - Optional Parameters:
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountOpts struct {
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(ctx context.Context, percentPlayed int32, unPlayedCount int32, id string, maxWidth int32, maxHeight int32, tag string, format string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}"
	localVarPath = strings.Replace(localVarPath, "{"+"PercentPlayed"+"}", fmt.Sprintf("%v", percentPlayed), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"UnPlayedCount"+"}", fmt.Sprintf("%v", unPlayedCount), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MaxWidth"+"}", fmt.Sprintf("%v", maxWidth), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MaxHeight"+"}", fmt.Sprintf("%v", maxHeight), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Tag"+"}", fmt.Sprintf("%v", tag), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetMusicgenresByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetMusicgenresByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetMusicgenresByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiGetMusicgenresByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/MusicGenres/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetMusicgenresByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetMusicgenresByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetMusicgenresByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetMusicgenresByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/MusicGenres/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetPersonsByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetPersonsByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetPersonsByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiGetPersonsByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Persons/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetPersonsByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetPersonsByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetPersonsByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetPersonsByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Persons/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetStudiosByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetStudiosByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetStudiosByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiGetStudiosByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Studios/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetStudiosByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetStudiosByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetStudiosByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetStudiosByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Studios/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiGetUsersByIdImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiGetUsersByIdImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) GetUsersByIdImagesByType(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiGetUsersByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiGetUsersByIdImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiGetUsersByIdImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) GetUsersByIdImagesByTypeByIndex(ctx context.Context, id string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiGetUsersByIdImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadArtistsByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadArtistsByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadArtistsByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiHeadArtistsByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Artists/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadArtistsByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadArtistsByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadArtistsByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadArtistsByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Artists/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadGamegenresByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadGamegenresByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadGamegenresByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiHeadGamegenresByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/GameGenres/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadGamegenresByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadGamegenresByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadGamegenresByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadGamegenresByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/GameGenres/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadGenresByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadGenresByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadGenresByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiHeadGenresByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Genres/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadGenresByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadGenresByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadGenresByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadGenresByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Genres/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadItemsByIdImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadItemsByIdImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadItemsByIdImagesByType(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiHeadItemsByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadItemsByIdImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadItemsByIdImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadItemsByIdImagesByTypeByIndex(ctx context.Context, id string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadItemsByIdImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param percentPlayed
 * @param unPlayedCount
 * @param id Item Id
 * @param maxWidth The maximum image width to return.
 * @param maxHeight The maximum image height to return.
 * @param tag Optional. Supply the cache tag from the item object to receive strong caching headers.
 * @param format Determines the output foramt of the image - original,gif,jpg,png
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountOpts - Optional Parameters:
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountOpts struct {
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcount(ctx context.Context, percentPlayed int32, unPlayedCount int32, id string, maxWidth int32, maxHeight int32, tag string, format string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadItemsByIdImagesByTypeByIndexByTagByFormatByMaxwidthByMaxheightByPercentplayedByUnplayedcountOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}/{Tag}/{Format}/{MaxWidth}/{MaxHeight}/{PercentPlayed}/{UnPlayedCount}"
	localVarPath = strings.Replace(localVarPath, "{"+"PercentPlayed"+"}", fmt.Sprintf("%v", percentPlayed), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"UnPlayedCount"+"}", fmt.Sprintf("%v", unPlayedCount), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MaxWidth"+"}", fmt.Sprintf("%v", maxWidth), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"MaxHeight"+"}", fmt.Sprintf("%v", maxHeight), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Tag"+"}", fmt.Sprintf("%v", tag), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Format"+"}", fmt.Sprintf("%v", format), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadMusicgenresByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadMusicgenresByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadMusicgenresByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiHeadMusicgenresByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/MusicGenres/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadMusicgenresByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadMusicgenresByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadMusicgenresByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadMusicgenresByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/MusicGenres/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadPersonsByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadPersonsByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadPersonsByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiHeadPersonsByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Persons/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadPersonsByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadPersonsByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadPersonsByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadPersonsByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Persons/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadStudiosByNameImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadStudiosByNameImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadStudiosByNameImagesByType(ctx context.Context, name string, type_ ImageType, localVarOptionals *ImageServiceApiHeadStudiosByNameImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Studios/{Name}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param name Item name
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadStudiosByNameImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadStudiosByNameImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadStudiosByNameImagesByTypeByIndex(ctx context.Context, name string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadStudiosByNameImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Studios/{Name}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Name"+"}", fmt.Sprintf("%v", name), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiHeadUsersByIdImagesByTypeOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiHeadUsersByIdImagesByTypeOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
    Index optional.Int32
}

func (a *ImageServiceApiService) HeadUsersByIdImagesByType(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiHeadUsersByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param index Image Index
 * @param optional nil or *ImageServiceApiHeadUsersByIdImagesByTypeByIndexOpts - Optional Parameters:
     * @param "MaxWidth" (optional.Int32) -  The maximum image width to return.
     * @param "MaxHeight" (optional.Int32) -  The maximum image height to return.
     * @param "Width" (optional.Int32) -  The fixed image width to return.
     * @param "Height" (optional.Int32) -  The fixed image height to return.
     * @param "Quality" (optional.Int32) -  Optional quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
     * @param "Tag" (optional.String) -  Optional. Supply the cache tag from the item object to receive strong caching headers.
     * @param "CropWhitespace" (optional.Bool) -  Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
     * @param "EnableImageEnhancers" (optional.Bool) -  Enable or disable image enhancers such as cover art.
     * @param "Format" (optional.String) -  Determines the output foramt of the image - original,gif,jpg,png
     * @param "BackgroundColor" (optional.String) -  Optional. Apply a background color for transparent images.
     * @param "ForegroundLayer" (optional.String) -  Optional. Apply a foreground layer on top of the image.
     * @param "AutoOrient" (optional.Bool) -  Set to true to force normalization of orientation in the event the renderer does not support it.
     * @param "KeepAnimation" (optional.Bool) -  Set to true to retain image animation (when supported).

*/

type ImageServiceApiHeadUsersByIdImagesByTypeByIndexOpts struct {
    MaxWidth optional.Int32
    MaxHeight optional.Int32
    Width optional.Int32
    Height optional.Int32
    Quality optional.Int32
    Tag optional.String
    CropWhitespace optional.Bool
    EnableImageEnhancers optional.Bool
    Format optional.String
    BackgroundColor optional.String
    ForegroundLayer optional.String
    AutoOrient optional.Bool
    KeepAnimation optional.Bool
}

func (a *ImageServiceApiService) HeadUsersByIdImagesByTypeByIndex(ctx context.Context, id string, type_ ImageType, index int32, localVarOptionals *ImageServiceApiHeadUsersByIdImagesByTypeByIndexOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Head")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.MaxWidth.IsSet() {
		localVarQueryParams.Add("MaxWidth", parameterToString(localVarOptionals.MaxWidth.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxHeight.IsSet() {
		localVarQueryParams.Add("MaxHeight", parameterToString(localVarOptionals.MaxHeight.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Width.IsSet() {
		localVarQueryParams.Add("Width", parameterToString(localVarOptionals.Width.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Height.IsSet() {
		localVarQueryParams.Add("Height", parameterToString(localVarOptionals.Height.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Quality.IsSet() {
		localVarQueryParams.Add("Quality", parameterToString(localVarOptionals.Quality.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Tag.IsSet() {
		localVarQueryParams.Add("Tag", parameterToString(localVarOptionals.Tag.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.CropWhitespace.IsSet() {
		localVarQueryParams.Add("CropWhitespace", parameterToString(localVarOptionals.CropWhitespace.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnableImageEnhancers.IsSet() {
		localVarQueryParams.Add("EnableImageEnhancers", parameterToString(localVarOptionals.EnableImageEnhancers.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Format.IsSet() {
		localVarQueryParams.Add("Format", parameterToString(localVarOptionals.Format.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.BackgroundColor.IsSet() {
		localVarQueryParams.Add("BackgroundColor", parameterToString(localVarOptionals.BackgroundColor.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.ForegroundLayer.IsSet() {
		localVarQueryParams.Add("ForegroundLayer", parameterToString(localVarOptionals.ForegroundLayer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.AutoOrient.IsSet() {
		localVarQueryParams.Add("AutoOrient", parameterToString(localVarOptionals.AutoOrient.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.KeepAnimation.IsSet() {
		localVarQueryParams.Add("KeepAnimation", parameterToString(localVarOptionals.KeepAnimation.Value(), ""))
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
ImageServiceApiService Uploads an image for an item, must be base64 encoded.
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body Binary stream
 * @param id Item Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiPostItemsByIdImagesByTypeOpts - Optional Parameters:
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiPostItemsByIdImagesByTypeOpts struct {
    Index optional.Int32
}

func (a *ImageServiceApiService) PostItemsByIdImagesByType(ctx context.Context, body Object, id string, type_ ImageType, localVarOptionals *ImageServiceApiPostItemsByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/octet-stream"}

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
ImageServiceApiService Uploads an image for an item, must be base64 encoded.
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body Binary stream
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index

*/
func (a *ImageServiceApiService) PostItemsByIdImagesByTypeByIndex(ctx context.Context, body Object, id string, type_ ImageType, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/octet-stream"}

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
ImageServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index

*/
func (a *ImageServiceApiService) PostItemsByIdImagesByTypeByIndexDelete(ctx context.Context, id string, type_ ImageType, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

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
ImageServiceApiService Updates the index for an item image
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index
 * @param newIndex The new image index

*/
func (a *ImageServiceApiService) PostItemsByIdImagesByTypeByIndexIndex(ctx context.Context, id string, type_ ImageType, index int32, newIndex int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}/Index"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("NewIndex", parameterToString(newIndex, ""))
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
ImageServiceApiService Updates the index for an item image
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param index Image Index
 * @param url The url for the new image

*/
func (a *ImageServiceApiService) PostItemsByIdImagesByTypeByIndexUrl(ctx context.Context, id string, type_ ImageType, index int32, url string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/{Index}/Url"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("Url", parameterToString(url, ""))
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
ImageServiceApiService
Requires authentication as administrator
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id Item Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiPostItemsByIdImagesByTypeDeleteOpts - Optional Parameters:
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiPostItemsByIdImagesByTypeDeleteOpts struct {
    Index optional.Int32
}

func (a *ImageServiceApiService) PostItemsByIdImagesByTypeDelete(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiPostItemsByIdImagesByTypeDeleteOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Items/{Id}/Images/{Type}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
ImageServiceApiService Uploads an image for an item, must be base64 encoded.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body Binary stream
 * @param id User Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiPostUsersByIdImagesByTypeOpts - Optional Parameters:
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiPostUsersByIdImagesByTypeOpts struct {
    Index optional.Int32
}

func (a *ImageServiceApiService) PostUsersByIdImagesByType(ctx context.Context, body Object, id string, type_ ImageType, localVarOptionals *ImageServiceApiPostUsersByIdImagesByTypeOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/octet-stream"}

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
ImageServiceApiService Uploads an image for an item, must be base64 encoded.
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body Binary stream
 * @param id User Id
 * @param type_ Image Type
 * @param index Image Index

*/
func (a *ImageServiceApiService) PostUsersByIdImagesByTypeByIndex(ctx context.Context, body Object, id string, type_ ImageType, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}/{Index}"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/octet-stream"}

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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param index Image Index

*/
func (a *ImageServiceApiService) PostUsersByIdImagesByTypeByIndexDelete(ctx context.Context, id string, type_ ImageType, index int32) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}/{Index}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Index"+"}", fmt.Sprintf("%v", index), -1)

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
ImageServiceApiService
Requires authentication as user
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param id User Id
 * @param type_ Image Type
 * @param optional nil or *ImageServiceApiPostUsersByIdImagesByTypeDeleteOpts - Optional Parameters:
     * @param "Index" (optional.Int32) -  Image Index

*/

type ImageServiceApiPostUsersByIdImagesByTypeDeleteOpts struct {
    Index optional.Int32
}

func (a *ImageServiceApiService) PostUsersByIdImagesByTypeDelete(ctx context.Context, id string, type_ ImageType, localVarOptionals *ImageServiceApiPostUsersByIdImagesByTypeDeleteOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/Users/{Id}/Images/{Type}/Delete"
	localVarPath = strings.Replace(localVarPath, "{"+"Id"+"}", fmt.Sprintf("%v", id), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"Type"+"}", fmt.Sprintf("%v", type_), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.Index.IsSet() {
		localVarQueryParams.Add("Index", parameterToString(localVarOptionals.Index.Value(), ""))
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
