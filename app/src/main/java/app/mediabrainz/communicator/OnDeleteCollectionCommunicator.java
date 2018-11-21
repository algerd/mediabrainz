package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Collection;

/**
 * Created by Alex on 22.03.2018.
 */

public interface OnDeleteCollectionCommunicator {
    void onDeleteCollection(Collection deletedCollection);
}
