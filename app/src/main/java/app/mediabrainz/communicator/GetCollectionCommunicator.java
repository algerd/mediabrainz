package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Collection;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetCollectionCommunicator {
    Collection getCollection();

    String getCollectionMbid();
}
