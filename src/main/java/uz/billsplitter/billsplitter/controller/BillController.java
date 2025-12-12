package uz.billsplitter.billsplitter.controller;
//
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.billsplitter.billsplitter.service.impl.BillService;


@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/bills")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)

public class BillController {

    BillService billService;

    @PostMapping("/splitting")
    public ResponseEntity<?> split(@RequestBody OrderRequestDto requestDto) {
        return ResponseEntity.ok(billService.split(requestDto));
    }

}