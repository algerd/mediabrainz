package app.mediabrainz.communicator;

import app.mediabrainz.api.model.ReleaseGroup;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetReleaseGroupCommunicator {
    ReleaseGroup getReleaseGroup();
    String getReleaseGroupMbid();
}
