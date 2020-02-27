package io.liuwuji.jcartadministrationback.controller;

import io.liuwuji.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.liuwuji.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.liuwuji.jcartadministrationback.dto.out.PageOutDTO;
import io.liuwuji.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.liuwuji.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
