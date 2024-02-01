/*
 * Emby Server REST API
 * 
 */

package EmbyClient.Java;

import io.swagger.client.model.AuthenticateUser;
import io.swagger.client.model.AuthenticateUserByName;
import io.swagger.client.model.AuthenticationAuthenticationResult;
import io.swagger.client.model.CreateUserByName;
import io.swagger.client.model.ForgotPassword;
import io.swagger.client.model.ForgotPasswordPin;
import io.swagger.client.model.ForgotPasswordResult;
import io.swagger.client.model.NameIdPair;
import io.swagger.client.model.PinRedeemResult;
import io.swagger.client.model.QueryResultUserDto;
import io.swagger.client.model.UpdateUserPassword;
import io.swagger.client.model.UserConfiguration;
import io.swagger.client.model.UserDto;
import io.swagger.client.model.UserPolicy;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UserServiceApi
 */
@Ignore
public class UserServiceApiTest {

    private final UserServiceApi api = new UserServiceApi();

    /**
     * Deletes a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByIdTest() throws Exception {
        String id = null;
        api.deleteUsersById(id);

        // TODO: test validations
    }
    /**
     * Clears audio or subtitle track selections for a user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteUsersByIdTrackselectionsByTracktypeTest() throws Exception {
        String id = null;
        String trackType = null;
        api.deleteUsersByIdTrackselectionsByTracktype(id, trackType);

        // TODO: test validations
    }
    /**
     * Gets a user by Id
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByIdTest() throws Exception {
        String id = null;
        UserDto response = api.getUsersById(id);

        // TODO: test validations
    }
    /**
     * Gets a typed user setting
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersByUseridTypedsettingsByKeyTest() throws Exception {
        String key = null;
        String userId = null;
        api.getUsersByUseridTypedsettingsByKey(key, userId);

        // TODO: test validations
    }
    /**
     * Gets a list of users
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersItemaccessTest() throws Exception {
        Boolean isHidden = null;
        Boolean isDisabled = null;
        Integer startIndex = null;
        Integer limit = null;
        String nameStartsWithOrGreater = null;
        String sortOrder = null;
        QueryResultUserDto response = api.getUsersItemaccess(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder);

        // TODO: test validations
    }
    /**
     * Gets a list of users
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersPrefixesTest() throws Exception {
        Boolean isHidden = null;
        Boolean isDisabled = null;
        Integer startIndex = null;
        Integer limit = null;
        String nameStartsWithOrGreater = null;
        String sortOrder = null;
        List<NameIdPair> response = api.getUsersPrefixes(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder);

        // TODO: test validations
    }
    /**
     * Gets a list of publicly visible users for display on a login screen.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersPublicTest() throws Exception {
        List<UserDto> response = api.getUsersPublic();

        // TODO: test validations
    }
    /**
     * Gets a list of users
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersQueryTest() throws Exception {
        Boolean isHidden = null;
        Boolean isDisabled = null;
        Integer startIndex = null;
        Integer limit = null;
        String nameStartsWithOrGreater = null;
        String sortOrder = null;
        QueryResultUserDto response = api.getUsersQuery(isHidden, isDisabled, startIndex, limit, nameStartsWithOrGreater, sortOrder);

        // TODO: test validations
    }
    /**
     * Authenticates a user
     *
     * Authenticate a user by nane and password. A 200 status code indicates success, while anything in the 400 or 500 range indicates failure --- Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersAuthenticatebynameTest() throws Exception {
        AuthenticateUserByName body = null;
        String xEmbyAuthorization = null;
        AuthenticationAuthenticationResult response = api.postUsersAuthenticatebyname(body, xEmbyAuthorization);

        // TODO: test validations
    }
    /**
     * Updates a user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdTest() throws Exception {
        UserDto body = null;
        String id = null;
        api.postUsersById(body, id);

        // TODO: test validations
    }
    /**
     * Authenticates a user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdAuthenticateTest() throws Exception {
        AuthenticateUser body = null;
        String id = null;
        AuthenticationAuthenticationResult response = api.postUsersByIdAuthenticate(body, id);

        // TODO: test validations
    }
    /**
     * Updates a user configuration
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdConfigurationTest() throws Exception {
        UserConfiguration body = null;
        String id = null;
        api.postUsersByIdConfiguration(body, id);

        // TODO: test validations
    }
    /**
     * Updates a user configuration
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdConfigurationPartialTest() throws Exception {
        Object body = null;
        String id = null;
        api.postUsersByIdConfigurationPartial(body, id);

        // TODO: test validations
    }
    /**
     * Deletes a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdDeleteTest() throws Exception {
        String id = null;
        api.postUsersByIdDelete(id);

        // TODO: test validations
    }
    /**
     * Updates a user&#x27;s password
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdPasswordTest() throws Exception {
        UpdateUserPassword body = null;
        String id = null;
        api.postUsersByIdPassword(body, id);

        // TODO: test validations
    }
    /**
     * Updates a user policy
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdPolicyTest() throws Exception {
        UserPolicy body = null;
        String id = null;
        api.postUsersByIdPolicy(body, id);

        // TODO: test validations
    }
    /**
     * Clears audio or subtitle track selections for a user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByIdTrackselectionsByTracktypeDeleteTest() throws Exception {
        String id = null;
        String trackType = null;
        api.postUsersByIdTrackselectionsByTracktypeDelete(id, trackType);

        // TODO: test validations
    }
    /**
     * Updates a typed user setting
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersByUseridTypedsettingsByKeyTest() throws Exception {
        Object body = null;
        String userId = null;
        String key = null;
        api.postUsersByUseridTypedsettingsByKey(body, userId, key);

        // TODO: test validations
    }
    /**
     * Initiates the forgot password process for a local user
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersForgotpasswordTest() throws Exception {
        ForgotPassword body = null;
        ForgotPasswordResult response = api.postUsersForgotpassword(body);

        // TODO: test validations
    }
    /**
     * Redeems a forgot password pin
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersForgotpasswordPinTest() throws Exception {
        ForgotPasswordPin body = null;
        PinRedeemResult response = api.postUsersForgotpasswordPin(body);

        // TODO: test validations
    }
    /**
     * Creates a user
     *
     * Requires authentication as administrator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postUsersNewTest() throws Exception {
        CreateUserByName body = null;
        UserDto response = api.postUsersNew(body);

        // TODO: test validations
    }
}
