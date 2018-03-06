package org.sourcelab.kafka.connect.apiclient.request.put;

import com.sun.xml.internal.rngom.util.Uri;

import java.io.IOException;

/**
 * Defines request to pause a connector.
 */
public final class PutConnectorPause implements PutRequest<Boolean> {
    private final String connectorName;

    /**
     * Constructor.
     * @param connectorName Name of connector
     */
    public PutConnectorPause(final String connectorName) {
        if (connectorName == null) {
            throw new NullPointerException("connectorName parameter may not be null!");
        }
        this.connectorName = connectorName;
    }

    @Override
    public String getApiEndpoint() {
        return "/connectors/" + Uri.escapeDisallowedChars(connectorName) + "/pause";
    }

    @Override
    public Object getRequestBody() {
        return null;
    }

    @Override
    public Boolean parseResponse(final String responseStr) throws IOException {
        return true;
    }
}
