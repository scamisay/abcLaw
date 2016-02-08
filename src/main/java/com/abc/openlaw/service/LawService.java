package com.abc.openlaw.service;

import com.abc.openlaw.domain.LawVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.openlaw.repository.LawRepository;

import java.util.List;

/**
 * Created by scamisay on 05/02/16.
 */
@Service
public class LawService {

    @Autowired
    private LawRepository lawRepository;

    public List<LawVersion> findAll(){
        return lawRepository.findAll();
    }

    public LawVersion save(LawVersion aLaw){
        return lawRepository.save(aLaw);
    }
}
