package org.o2.registersvc.creditcheck;

import org.o2.registersvc.creditcheck.beans.CreditCheckRequest;
import org.o2.registersvc.creditcheck.beans.CreditCheckResponse;

public interface CreditCheckSvcClient {

	CreditCheckResponse getCreditScore(CreditCheckRequest creditReq);
}
