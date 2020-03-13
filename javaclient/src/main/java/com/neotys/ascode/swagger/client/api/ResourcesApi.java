package com.neotys.ascode.swagger.client.api;

import com.google.gson.reflect.TypeToken;
import com.neotys.ascode.swagger.client.*;
import com.neotys.ascode.swagger.client.model.ArrayOfReservationDefinition;
import com.neotys.ascode.swagger.client.model.ArrayOfZoneDefinition;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourcesApi {
    private ApiClient apiClient;

    public ResourcesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ResourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getReservations
     * @param fromDateTime Date-time with an offset of the beginning of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param toDateTime Date-time with an offset of the end of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param limit The maximum number of elements returned by this call. The maximum must be less than or equal to 200. (optional, default to 50)
     * @param offset The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. (optional, default to 0)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getReservationsCall(String fromDateTime, String toDateTime, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resources/reservations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromDateTime != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fromDateTime", fromDateTime));
        if (toDateTime != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("toDateTime", toDateTime));
        if (limit != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "NeoloadAuthorizer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getReservationsValidateBeforeCall(String fromDateTime, String toDateTime, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = getReservationsCall(fromDateTime, toDateTime, limit, offset, progressListener, progressRequestListener);
        return call;





    }

    /**
     * Lists reservations
     * Lists the reservations.
     * @param fromDateTime Date-time with an offset of the beginning of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param toDateTime Date-time with an offset of the end of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param limit The maximum number of elements returned by this call. The maximum must be less than or equal to 200. (optional, default to 50)
     * @param offset The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. (optional, default to 0)
     * @return ArrayOfReservationDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ArrayOfReservationDefinition getReservations(String fromDateTime, String toDateTime, Integer limit, Integer offset) throws ApiException {
        ApiResponse<ArrayOfReservationDefinition> resp = getReservationsWithHttpInfo(fromDateTime, toDateTime, limit, offset);
        return resp.getData();
    }

    /**
     * Lists reservations
     * Lists the reservations.
     * @param fromDateTime Date-time with an offset of the beginning of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param toDateTime Date-time with an offset of the end of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param limit The maximum number of elements returned by this call. The maximum must be less than or equal to 200. (optional, default to 50)
     * @param offset The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. (optional, default to 0)
     * @return ApiResponse&lt;ArrayOfReservationDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ArrayOfReservationDefinition> getReservationsWithHttpInfo(String fromDateTime, String toDateTime, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = getReservationsValidateBeforeCall(fromDateTime, toDateTime, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<ArrayOfReservationDefinition>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists reservations (asynchronously)
     * Lists the reservations.
     * @param fromDateTime Date-time with an offset of the beginning of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param toDateTime Date-time with an offset of the end of the search. Format YYYY-MM-DDTHH:mm:ssZ&lt;br/&gt; Example 2020-01-01T09:00:00+00:00 (optional)
     * @param limit The maximum number of elements returned by this call. The maximum must be less than or equal to 200. (optional, default to 50)
     * @param offset The offset of the first element to return. Starting at this offset, the query will return a maximum of &#x27;limit&#x27; elements. (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getReservationsAsync(String fromDateTime, String toDateTime, Integer limit, Integer offset, final ApiCallback<ArrayOfReservationDefinition> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getReservationsValidateBeforeCall(fromDateTime, toDateTime, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ArrayOfReservationDefinition>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZones
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZonesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resources/zones";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "NeoloadAuthorizer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getZonesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = getZonesCall(progressListener, progressRequestListener);
        return call;





    }

    /**
     * List all zones
     * Lists the zones.
     * @return ArrayOfZoneDefinition
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ArrayOfZoneDefinition getZones() throws ApiException {
        ApiResponse<ArrayOfZoneDefinition> resp = getZonesWithHttpInfo();
        return resp.getData();
    }

    /**
     * List all zones
     * Lists the zones.
     * @return ApiResponse&lt;ArrayOfZoneDefinition&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ArrayOfZoneDefinition> getZonesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getZonesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ArrayOfZoneDefinition>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all zones (asynchronously)
     * Lists the zones.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZonesAsync(final ApiCallback<ArrayOfZoneDefinition> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getZonesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ArrayOfZoneDefinition>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}