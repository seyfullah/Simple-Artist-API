package io.swagger.api;

import io.swagger.model.Artist;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse400;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-31T13:25:28.354Z")

@Controller
public class ArtistsApiController implements ArtistsApi {

    private static final Logger log = LoggerFactory.getLogger(ArtistsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ArtistsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Artist>> artistsGet(@ApiParam(value = "Limits the number of items on a page") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Specifies the page number of the artists to be displayed") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Artist>>(objectMapper.readValue("[ {  \"artist_name\" : \"artist_name\",  \"albums_recorded\" : 0,  \"artist_genre\" : \"artist_genre\",  \"username\" : \"username\"}, {  \"artist_name\" : \"artist_name\",  \"albums_recorded\" : 0,  \"artist_genre\" : \"artist_genre\",  \"username\" : \"username\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Artist>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Artist>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> artistsPost(@ApiParam(value = "creates a new artist in our database"  )  @Valid @RequestBody Artist artist) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> artistsUsernameGet(@ApiParam(value = "",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{  \"artist_name\" : \"artist_name\",  \"albums_recorded\" : 0,  \"artist_genre\" : \"artist_genre\"}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

}
