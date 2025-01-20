package teammates.ui.webapi;

import org.apache.http.HttpStatus;

public class GetSessionBookmarkAction extends Action {
    @Override
    AuthType getMinAuthLevel() {
        return AuthType.PUBLIC;
    }

    @Override
    void checkSpecificAccessControl() {
        // As long as user is logged in, they can bookmark sessions they have access to
    }

    @Override
    public JsonResult execute() throws InvalidOperationException {
        return new JsonResult("isBookmarked", HttpStatus.SC_OK);
        }
    }


