package com.abc.openlaw.domain;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scamisay on 07/02/16.
 */
public class Law {

    @Id
    private String id;

    private List<LawVersion> versions;

    public void addNewLawVersion(LawVersion aLawVersion){
        if(aLawVersion == null){
            throw new RuntimeException("LawVersion is mandatory");
        }
        if(!aLawVersion.isNew()){
            throw new RuntimeException("LawVersion must be new");
        }
        if(versions == null){
            versions = new ArrayList<LawVersion>();
        }
        versions.add(aLawVersion);
    }
}
