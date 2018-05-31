package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Artist;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Returns a list of artists
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void artistsGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<Artist> response = api.artistsGet(limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lets a user post a new artist
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void artistsPostTest() throws ApiException {
        Artist artist = null;
        api.artistsPost(artist);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Obtain information about an artist from his or her unique username
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void artistsUsernameGetTest() throws ApiException {
        String username = null;
        InlineResponse200 response = api.artistsUsernameGet(username);

        // TODO: test validations
    }
    
}
