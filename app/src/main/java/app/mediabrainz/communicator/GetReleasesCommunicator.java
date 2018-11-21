package app.mediabrainz.communicator;

import java.util.List;

import app.mediabrainz.api.model.Release;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetReleasesCommunicator {
    List<Release> getReleases();
}
