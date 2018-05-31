# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/stikic/SimpleArtistAPI/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**artistsGet**](DefaultApi.md#artistsGet) | **GET** /artists | 
[**artistsPost**](DefaultApi.md#artistsPost) | **POST** /artists | 
[**artistsUsernameGet**](DefaultApi.md#artistsUsernameGet) | **GET** /artists/{username} | 


<a name="artistsGet"></a>
# **artistsGet**
> List&lt;Artist&gt; artistsGet(limit, offset)



Returns a list of artists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: UserSecurity
HttpBasicAuth UserSecurity = (HttpBasicAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setUsername("YOUR USERNAME");
UserSecurity.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limits the number of items on a page
Integer offset = 56; // Integer | Specifies the page number of the artists to be displayed
try {
    List<Artist> result = apiInstance.artistsGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#artistsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limits the number of items on a page | [optional]
 **offset** | **Integer**| Specifies the page number of the artists to be displayed | [optional]

### Return type

[**List&lt;Artist&gt;**](Artist.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="artistsPost"></a>
# **artistsPost**
> artistsPost(artist)



Lets a user post a new artist

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: UserSecurity
HttpBasicAuth UserSecurity = (HttpBasicAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setUsername("YOUR USERNAME");
UserSecurity.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Artist artist = new Artist(); // Artist | creates a new artist in our database
try {
    apiInstance.artistsPost(artist);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#artistsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **artist** | [**Artist**](Artist.md)| creates a new artist in our database | [optional]

### Return type

null (empty response body)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="artistsUsernameGet"></a>
# **artistsUsernameGet**
> InlineResponse200 artistsUsernameGet(username)



Obtain information about an artist from his or her unique username

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: UserSecurity
HttpBasicAuth UserSecurity = (HttpBasicAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setUsername("YOUR USERNAME");
UserSecurity.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String username = "username_example"; // String | 
try {
    InlineResponse200 result = apiInstance.artistsUsernameGet(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#artistsUsernameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

