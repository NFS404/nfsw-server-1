package br.com.soapboxrace.xmpp.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMPP_RouteEntrantResultType", propOrder = { "eventDurationInMilliseconds", "eventSessionId",
		"finishReason", "personaId", "ranking", "bestLapDurationInMilliseconds", "topSpeed" })
@XmlRootElement(name = "RouteEntrantResult")
public class XMPP_RouteEntrantResultType {
	@XmlElement(name = "EventDurationInMilliseconds")
	private Long eventDurationInMilliseconds;
	@XmlElement(name = "EventSessionId")
	private Long eventSessionId;
	@XmlElement(name = "FinishReason")
	private Integer finishReason;
	@XmlElement(name = "PersonaId")
	private Long personaId;
	@XmlElement(name = "Ranking")
	private Short ranking;
	@XmlElement(name = "BestLapDurationInMilliseconds")
	private Long bestLapDurationInMilliseconds;
	@XmlElement(name = "TopSpeed")
	private Float topSpeed;

	public Long getEventDurationInMilliseconds() {
		return eventDurationInMilliseconds;
	}

	public void setEventDurationInMilliseconds(Long eventDurationInMilliseconds) {
		this.eventDurationInMilliseconds = eventDurationInMilliseconds;
	}

	public Long getEventSessionId() {
		return eventSessionId;
	}

	public void setEventSessionId(Long eventSessionId) {
		this.eventSessionId = eventSessionId;
	}

	public Integer getFinishReason() {
		return finishReason;
	}

	public void setFinishReason(Integer finishReason) {
		this.finishReason = finishReason;
	}

	public Long getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}

	public Short getRanking() {
		return ranking;
	}

	public void setRanking(Short ranking) {
		this.ranking = ranking;
	}

	public Long getBestLapDurationInMilliseconds() {
		return bestLapDurationInMilliseconds;
	}

	public void setBestLapDurationInMilliseconds(Long bestLapDurationInMilliseconds) {
		this.bestLapDurationInMilliseconds = bestLapDurationInMilliseconds;
	}

	public Float getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Float topSpeed) {
		this.topSpeed = topSpeed;
	}
}