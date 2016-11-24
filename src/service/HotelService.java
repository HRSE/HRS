package service;

import java.util.ArrayList;

import vo.HotelsVO;
import vo.ResultMessage;

public interface HotelService {
	public HotelsVO findByGuestrooms(int GuestroomsTypes);
	public HotelsVO findByStar(int stars);
	public HotelsVO findByMarksRank(String min,String max);
	public ArrayList<HotelsVO> makeDealOutInf();
	public ResultMessage change(HotelsVO vo);
	public ResultMessage update(HotelsVO vo);
	public HotelsVO findByName(String HotelsNames);
	public HotelsVO findByAddress(String circleNames);
	public HotelsVO findByHistroy(String startTime, String endTime);
	public ArrayList<HotelsVO> showAllHistroy();
	public ArrayList<HotelsVO> showForPrice();
	public ArrayList<HotelsVO> showForStar();
	public ArrayList<HotelsVO> showForMark();
	public ArrayList<HotelsVO> makeDealInInf();

}
