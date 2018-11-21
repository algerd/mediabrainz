package app.mediabrainz.api.lookup;

import io.reactivex.Flowable;
import retrofit2.adapter.rxjava2.Result;
import app.mediabrainz.api.model.Url;

/**
 * Created by Alex on 16.11.2017.
 */

public class UrlLookupService extends BaseLookupService<Url, LookupServiceInterface.EmptyIncType> {

    public UrlLookupService(String mbid) {
        super(mbid);
    }

    @Override
    public Flowable<Result<Url>> lookup() {
        return getJsonRetrofitService().lookupUrl(getMbid(), getParams());
    }

}
