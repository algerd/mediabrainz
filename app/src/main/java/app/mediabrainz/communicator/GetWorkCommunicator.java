package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Work;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetWorkCommunicator {
    Work getWork();

    String getWorkMbid();
}
