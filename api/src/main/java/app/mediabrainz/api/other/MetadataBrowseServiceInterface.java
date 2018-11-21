package app.mediabrainz.api.other;

import io.reactivex.Flowable;
import retrofit2.adapter.rxjava2.Result;
import app.mediabrainz.api.model.xml.Metadata;

/**
 * Created by Alex on 06.12.2017.
 */

public interface MetadataBrowseServiceInterface {

    Flowable<Result<Metadata>> browseRating();
    Flowable<Result<Metadata>> browseTag();

}
