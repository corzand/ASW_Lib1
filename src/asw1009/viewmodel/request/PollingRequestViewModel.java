package asw1009.viewmodel.request;

/**
 * View Model di richiesta di ricerca Task.
 *
 * @author ASW1009
 */
public class PollingRequestViewModel {

    private SearchTasksRequestViewModel searchRequestViewModel;
    private int[] taskIds;

    public SearchTasksRequestViewModel getSearchRequestViewModel() {
        return this.searchRequestViewModel;
    }

    public void setSearchRequestViewModel(SearchTasksRequestViewModel searchRequestViewModel) {
        this.searchRequestViewModel = searchRequestViewModel;
    }

    public int[] getTaskIds() {
        return this.taskIds;
    }

    public void setTaskIds(int[] taskIds) {
        this.taskIds = taskIds;
    }
}
