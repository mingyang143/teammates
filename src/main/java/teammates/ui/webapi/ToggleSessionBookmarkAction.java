package teammates.ui.webapi;

import teammates.common.exception.EntityDoesNotExistException;
import teammates.common.util.Const;
import teammates.ui.output.MessageOutput;
import teammates.ui.request.InvalidHttpRequestBodyException;
import teammates.storage.sqlentity.FeedbackSession;
import teammates.common.exception.InvalidParametersException;

public class ToggleSessionBookmarkAction extends Action {
    @Override
    AuthType getMinAuthLevel() {
        return AuthType.LOGGED_IN;
    }

    @Override
    void checkSpecificAccessControl() {
        // As long as user is logged in, they can bookmark sessions they have access to
    }

    @Override
    public JsonResult execute() throws InvalidHttpRequestBodyException, InvalidOperationException {
        String courseId = getNonNullRequestParamValue(Const.ParamsNames.COURSE_ID);
        String feedbackSessionName = getNonNullRequestParamValue(Const.ParamsNames.FEEDBACK_SESSION_NAME);
        FeedbackSession session = sqlLogic.getFeedbackSession(feedbackSessionName, courseId);
        try {
            session.setBookmarked(!session.isBookmarked());
            sqlLogic.updateFeedbackSession(session);
        } catch (EntityDoesNotExistException | InvalidParametersException e) {
            throw new InvalidOperationException(e.getMessage());
        }

        String message = session.isBookmarked() ? "Session bookmarked" : "Session unbookmarked";
        return new JsonResult(new MessageOutput(message));
    }
}   