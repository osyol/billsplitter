package uz.billsplitter.billsplitter.service;

import uz.billsplitter.billsplitter.dto.response.OrderResponseDto;
import uz.billsplitter.billsplitter.dto.request.OrderRequestDto;

public interface BillService {

    OrderResponseDto split(OrderRequestDto dto);

}
