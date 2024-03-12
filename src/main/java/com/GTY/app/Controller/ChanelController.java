package com.GTY.app.Controller;

import com.GTY.app.Model.Chanel;
import com.GTY.app.Services.ChanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/chanel")
public class ChanelController {
    @Autowired
   private ChanelService chanelService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Chanel saveChanel(@RequestBody Chanel chanel){
        return chanelService.setChanel(chanel);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Chanel> getChanels(){
        return chanelService.getAllChanel();
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Chanel updateChanel(@RequestBody Chanel chanel){
        return chanelService.updateChanel(chanel);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteChanel(@PathVariable  long id){
        chanelService.deleteChanel(id);
    }
    @GetMapping("/getChanel/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Chanel getChanelById(@PathVariable long id){
        return chanelService.getChanelByID(id);
    }

}
