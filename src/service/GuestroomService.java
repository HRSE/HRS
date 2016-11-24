package service;

import vo.GuestroomsVO;
import vo.HotelsVO;
import vo.ResultMessage;

public interface GuestroomService {
	public GuestroomsVO findByGuestrooms(int GuestroomsType);
	public ResultMessage add (GuestroomsVO vo);
	public ResultMessage update(GuestroomsVO vo);
	public GuestroomsVO checkIn(String roomNumber, String checkInTime, String checkOutTime);
	public HotelsVO checkOut(String roomNumber);
	public HotelsVO checkOffline(String roomNumber, String checkInTime, String checkOutTime);
	public GuestroomsVO findByNumber(String roomNumber);
	
}
