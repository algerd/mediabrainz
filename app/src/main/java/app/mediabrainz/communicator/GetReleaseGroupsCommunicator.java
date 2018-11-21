package app.mediabrainz.communicator;

import java.util.List;

import app.mediabrainz.api.model.ReleaseGroup;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetReleaseGroupsCommunicator {
    List<ReleaseGroup> getReleaseGroups();
}
