package asw1009.requests;

/**
 * Richiesta di ricerca Task.
 *
 * @author ASW1009
 */
public class PollingRequest {

    private SearchTasksRequest searchRequestViewModel;
    private int[] taskIds;

    public SearchTasksRequest getSearchRequestViewModel() {
        return this.searchRequestViewModel;
    }

    public void setSearchRequestViewModel(SearchTasksRequest searchRequestViewModel) {
        this.searchRequestViewModel = searchRequestViewModel;
    }

    public int[] getTaskIds() {
        return this.taskIds;
    }

    public void setTaskIds(int[] taskIds) {
        this.taskIds = taskIds;
    }
}
