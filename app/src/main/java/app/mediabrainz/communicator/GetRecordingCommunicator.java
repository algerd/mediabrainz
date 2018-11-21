package app.mediabrainz.communicator;

import app.mediabrainz.api.model.Recording;

/**
 * Created by Alex on 20.03.2018.
 */

public interface GetRecordingCommunicator {
    Recording getRecording();
    String getRecordingMbid();
}
