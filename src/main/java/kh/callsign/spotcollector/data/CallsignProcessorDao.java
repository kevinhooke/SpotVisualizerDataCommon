package kh.callsign.spotcollector.data;

import kh.radio.spotparser.domain.Spot;

public interface CallsignProcessorDao {

	public void create(Spot spot);

	public boolean existsSpotBySpotterAndTimestamp(Spot spot);
	
	public Spot findSpotBySpotterAndTimestamp(Spot spot);


}
