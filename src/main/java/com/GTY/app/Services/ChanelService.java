package com.GTY.app.Services;
import com.GTY.app.Model.Chanel;

import java.util.Base64;
import java.util.List;
import java.util.Optional;


import com.GTY.app.Repository.ChanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChanelService {
    @Autowired
    private ChanelRepository chanelRepository;

    public Chanel setChanel(Chanel chanel){
        chanel.setPhoto(Base64.getDecoder().decode(chanel.getPhoto()));
        return chanelRepository.save(chanel);
    }
    public List<Chanel> getAllChanel(){
        return chanelRepository.findAll();
    }
    public Chanel getChanelByID(long id){
        Optional<Chanel> chanel=chanelRepository.findById(id);
        return chanel.orElse(null);
    }
    public Chanel updateChanel(Chanel chanel){
        Chanel existingChanel = chanelRepository.findById(chanel.getId()).orElse(null);

        if (existingChanel != null) {
            existingChanel.setChanelName(chanel.getChanelName());
            existingChanel.setPhoto(Base64.getDecoder().decode(chanel.getPhoto()));
            existingChanel.setStreamId(chanel.getStreamId());

            return chanelRepository.save(existingChanel);
        } else {
            return null;
        }

    }
    public void deleteChanel(long id){
        chanelRepository.deleteById(id);
    }


}
