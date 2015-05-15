/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.protocol.jabber.extensions.gtalk;

import net.java.sip.communicator.impl.protocol.jabber.extensions.AbstractPacketExtension;

/**
 * Created by Ivan Valchev (ivan.valchev@estafet.com) on 4/1/15.
 */
public class GroupPacketExtension extends AbstractPacketExtension {

    public static final String ELEMENT_NAME = "group";

    public static final String NAMESPACE = "google:jingle";

    public GroupPacketExtension() {
        super(NAMESPACE, ELEMENT_NAME);
    }

    public String getType() {
        return getAttributeAsString("type");
    }
}
