package app.mediabrainz.functions;

/**
 * Created by Alex on 19.12.2017.
 */

public interface Consumer<T> {

    void accept(T t);
}
