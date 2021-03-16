import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MethodStepTest {

    final BaseSteps steps = new BaseSteps();

    private static final String REPOSITORY = "AnkaNik/qa_courses_07";
    private static final String ISSUE_NUMBER = "#1";
    private static final String ISSUE_TITLE = "Test Issue HW05";
   // private static final String NEW_ISSUE= "/AnkaNik/qa_course_07/issues/new/choose";

    @Test
    public void testIssueSearch() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepositoryFromSearch(REPOSITORY);
        steps.openRepositoryIssues();
        steps.shouldSeeIssueWithTitle(ISSUE_TITLE);
    }

    @Test
    @Disabled
    public void testIssueCreate() {
        final String title = "Новая задача";

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepositoryFromSearch(REPOSITORY);
        steps.openRepositoryIssues();
        steps.createIssueWithTitle(ISSUE_TITLE);
    }
}