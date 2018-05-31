/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.12-1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Artist;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-31T13:25:28.354Z")

@Api(value = "artists", description = "the artists API")
public interface ArtistsApi {

    @ApiOperation(value = "", nickname = "artistsGet", notes = "Returns a list of artists", response = Artist.class, responseContainer = "List", authorizations = {
        @Authorization(value = "UserSecurity")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned a list of artists", response = Artist.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    @RequestMapping(value = "/artists",
        method = RequestMethod.GET)
    ResponseEntity<List<Artist>> artistsGet(@ApiParam(value = "Limits the number of items on a page") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Specifies the page number of the artists to be displayed") @Valid @RequestParam(value = "offset", required = false) Integer offset);


    @ApiOperation(value = "", nickname = "artistsPost", notes = "Lets a user post a new artist", authorizations = {
        @Authorization(value = "UserSecurity")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created a new artist"),
        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    @RequestMapping(value = "/artists",
        method = RequestMethod.POST)
    ResponseEntity<Void> artistsPost(@ApiParam(value = "creates a new artist in our database"  )  @Valid @RequestBody Artist artist);


    @ApiOperation(value = "", nickname = "artistsUsernameGet", notes = "Obtain information about an artist from his or her unique username", response = InlineResponse200.class, authorizations = {
        @Authorization(value = "UserSecurity")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully returned an artist", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    @RequestMapping(value = "/artists/{username}",
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> artistsUsernameGet(@ApiParam(value = "",required=true) @PathVariable("username") String username);

}
