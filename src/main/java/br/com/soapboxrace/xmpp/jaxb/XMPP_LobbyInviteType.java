package br.com.soapboxrace.xmpp.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMPP_LobbyInviteType", propOrder = { "eventId", "inviteLifetimeInMilliseconds", "invitedByPersonaId",
		"isPrivate", "lobbyInviteId" })
public class XMPP_LobbyInviteType {

	@XmlElement(name = "EventId")
	protected long eventId;
	@XmlElement(name = "InviteLifetimeInMilliseconds")
	protected long inviteLifetimeInMilliseconds = 10000;
	@XmlElement(name = "InvitedByPersonaId")
	protected long invitedByPersonaId = 0;
	@XmlElement(name = "IsPrivate", required = true)
	protected boolean isPrivate = false;
	@XmlElement(name = "LobbyInviteId")
	protected long lobbyInviteId;

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public long getInviteLifetimeInMilliseconds() {
		return inviteLifetimeInMilliseconds;
	}

	public void setInviteLifetimeInMilliseconds(long inviteLifetimeInMilliseconds) {
		this.inviteLifetimeInMilliseconds = inviteLifetimeInMilliseconds;
	}

	public long getInvitedByPersonaId() {
		return invitedByPersonaId;
	}

	public void setInvitedByPersonaId(long invitedByPersonaId) {
		this.invitedByPersonaId = invitedByPersonaId;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public long getLobbyInviteId() {
		return lobbyInviteId;
	}

	public void setLobbyInviteId(long lobbyInviteId) {
		this.lobbyInviteId = lobbyInviteId;
	}

}
