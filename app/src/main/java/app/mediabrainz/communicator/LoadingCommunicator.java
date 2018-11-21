package app.mediabrainz.communicator;

/**
 * Created by Alex on 20.03.2018.
 */

public interface LoadingCommunicator {

    void viewProgressLoading(boolean isView);

    void showConnectionWarning(Throwable t);
}
