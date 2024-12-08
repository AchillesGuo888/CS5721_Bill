package com.example.hotel.service.bill;

import com.example.hotel.dto.request.PayBillRequestDTO;
import com.example.hotel.exception.BizException;


public interface BillService {

  /**
   * Pay bill
   *
   * @param requestDTO
   * @throws BizException
   */
  Boolean payBill(PayBillRequestDTO requestDTO) throws BizException;

}
