package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Release;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetReleaseCommunicator {
    Release getRelease();
    String getReleaseMbid();
}
