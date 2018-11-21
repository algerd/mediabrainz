package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Tag;

import java.util.List;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetTagsCommunicator {

    List<Tag> getTags();
}
