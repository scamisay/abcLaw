package com.abc.openlaw.service;

import com.abc.openlaw.domain.Law;
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

    public List<Law> findAll(){
        return lawRepository.findAll();
    }

    public Law save(Law aLaw){
        return lawRepository.save(aLaw);
    }
}
