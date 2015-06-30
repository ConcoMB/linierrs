package ar.com.conco.bastanete.callback;

import retrofit.client.Response;

public class EmptyCallback extends WoloxCallback<Void> {

    @Override
    public void success(Void aVoid, Response response) {
        //Do nothing...
    }
}
