package service;

import java.util.ArrayList;

import vo.ClientVO;
import vo.ResultMessage;

public interface ClientService {
	public ResultMessage regist(String id, String password);
	public ResultMessage login(String id, String password);
	public ArrayList<ClientVO> selfshow();
	public ResultMessage edit(String cont);
	public ResultMessage Member(String birthday, String coid);
	public ArrayList<ClientVO> findcredit();
	public ArrayList<ClientVO> findByName(String HotelsNames);
	public ArrayList<ClientVO> findByAddress(String circleNames);
	public ArrayList<ClientVO> findByHistroy(String startTime, String endTime);
	public ResultMessage Createorder(String id, String hotelid, String createtime, 
										String starttime, String endtime, String price);
	public ResultMessage Comment(int star, String comments);
}
