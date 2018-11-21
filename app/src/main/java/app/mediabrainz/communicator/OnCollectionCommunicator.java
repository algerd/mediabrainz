package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Collection;

/**
 * Created by Alex on 22.03.2018.
 */

public interface OnCollectionCommunicator {
    void onCollection(Collection collection);
}
