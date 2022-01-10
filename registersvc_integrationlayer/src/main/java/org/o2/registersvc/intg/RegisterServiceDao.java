package org.o2.registersvc.intg;

import org.o2.registersvc.intg.beans.RegisterServiceDaoReq;
import org.o2.registersvc.intg.beans.RegisterServiceDaoRes;

public interface RegisterServiceDao {

	 RegisterServiceDaoRes enrollment(RegisterServiceDaoReq daoReq);
}
