package app.mediabrainz.communicator;

import java.util.List;

import app.mediabrainz.api.model.Collection;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetCollectionsCommunicator {
    List<Collection> getCollections();
}
