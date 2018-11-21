package app.mediabrainz.communicator;

import java.util.List;

import app.mediabrainz.api.site.TagEntity;
import app.mediabrainz.api.site.TagServiceInterface;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetUserTagEntitiesCommunicator {

    List<TagEntity> getEntities(TagServiceInterface.UserTagType userTagType);

}
