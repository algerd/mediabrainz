package app.mediabrainz.communicator;

import app.mediabrainz.api.model.BaseLookupEntity;

public interface OnDeleteEntityFromCollection {

    void onDelete(BaseLookupEntity entity);

}
