package service;

import java.util.ArrayList;

import vo.AccountVO;
import vo.ResultMessage;

public interface AccountService {
	public ResultMessage add(AccountVO vo);
	public ResultMessage delete(String accountNum);
	public ResultMessage update(AccountVO vo);
	public ArrayList<AccountVO>show();
	public ArrayList<AccountVO>findByName(String name);
	public ArrayList<AccountVO> findByID(String ID);

}
