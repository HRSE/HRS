package service;



import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.OrdersVO;
import vo.ResultMessage;

public interface OrdersService {
	public ResultMessage add(OrdersVO vo);
	public ResultMessage delete(String OrdersNum);
	public ResultMessage update(OrdersVO vo);
	public ResultMessage evaluate(OrdersVO vo);
	public ArrayList<OrdersVO> show();
	public ArrayList<OrdersVO> findByHotel(String HotelID)throws RemoteException;
	public ArrayList<OrdersVO> findByID(String OrdersID)throws RemoteException;
	public ArrayList<OrdersVO> findByUser(String UserID)throws RemoteException;
	public ArrayList<OrdersVO> findByTime(String startTime,String endTime)throws RemoteException;
	public ArrayList<OrdersVO> findByState(int state)throws RemoteException;
	
}
