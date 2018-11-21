package app.mediabrainz.api.lastfm.model;

import com.squareup.moshi.Json;

/**
 * Created by Alex on 30.01.2018.
 */

public class Tag {

    @Json(name = "name")
    private String name;

    @Json(name = "url")
    private String url;

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
