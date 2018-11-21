package app.mediabrainz.api.wiki;

import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.adapter.rxjava2.Result;
import app.mediabrainz.api.wiki.model.Wikipedia;

/**
 * Created by Alex on 29.01.2018.
 */

public interface WikiServiceInterface {

    Flowable<Result<Wikipedia>> getWikiMobileview(String pageName);

    Flowable<Result<Wikipedia>> getWikiMobileview(int section, String pageName, String prop);

    Flowable<Result<Map<String, String>>> getWikiSitelinks(String q, String... langs);

    Flowable<Result<String>> getWikiSiteTitle(String q, String lang);
}
