package service;

import java.util.ArrayList;

import vo.OrdersVO;
import vo.ResultMessage;
import vo.StrategiesVO;

public interface MarketingService {
	public ResultMessage Strategiesadd(StrategiesVO vo);
	public ResultMessage Strategiesadelete(StrategiesVO vo);
	public ResultMessage Strategiesupdate(StrategiesVO vo);
	public ArrayList <StrategiesVO> Strategiesshow();
	public ArrayList <OrdersVO> Abnormalordersshow();
	public ArrayList <OrdersVO> AbnormalordersfindByID(String ID);
	public ResultMessage Abnormalorderscancel (StrategiesVO vo,float  amount);
	public ResultMessage Creditchange(String id,float amount);

}
