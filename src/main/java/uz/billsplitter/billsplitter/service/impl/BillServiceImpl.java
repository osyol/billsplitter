package uz.billsplitter.billsplitter.service.impl;
//
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.billsplitter.billsplitter.dto.request.OrderRequestDto;
import uz.billsplitter.billsplitter.dto.response.OrderResponseDto;
import uz.billsplitter.billsplitter.service.BillService;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/billsplitter")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)


public class BillServiceImpl implements BillService {
    @Override
    public OrderResponseDto split(OrderRequestDto dto){
        return null;
    }
}
