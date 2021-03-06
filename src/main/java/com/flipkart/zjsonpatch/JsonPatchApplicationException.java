package com.flipkart.zjsonpatch;

/**
 * User: holograph
 * Date: 03/08/16
 */
public class JsonPatchApplicationException extends RuntimeException {
    public JsonPatchApplicationException(String message) {
        super(message);
    }

    public JsonPatchApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public JsonPatchApplicationException(Throwable cause) {
        super(cause);
    }
}
