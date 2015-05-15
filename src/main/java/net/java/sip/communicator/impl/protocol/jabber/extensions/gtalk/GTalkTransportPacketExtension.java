/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.protocol.jabber.extensions.gtalk;

import net.java.sip.communicator.impl.protocol.jabber.extensions.jingle.IceUdpTransportPacketExtension;
import org.jivesoftware.smack.packet.PacketExtension;

import java.util.List;

/**
 * An {@link net.java.sip.communicator.impl.protocol.jabber.extensions.AbstractPacketExtension} implementation for transport elements.
 *
 * @author Sebastien Vincent
 */
public class GTalkTransportPacketExtension
    extends IceUdpTransportPacketExtension
{
    /**
     * The name of the "transport" element.
     */
    public static final String NAMESPACE
        = "http://www.google.com/transport/p2p";
    /**
     * The name of the "transport" element.
     */
    public static final String ELEMENT_NAME = "transport";

    /**
     * Creates a new {@link net.java.sip.communicator.impl.protocol.jabber.extensions.jingle.RawUdpTransportPacketExtension} instance.
     */
    public GTalkTransportPacketExtension()
    {
        super(NAMESPACE, ELEMENT_NAME);
    }
}
