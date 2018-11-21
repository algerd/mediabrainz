package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Artist;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetArtistCommunicator {
    Artist getArtist();
    String getArtistMbid();
}
