package com.sxhy.saas.service.suser;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sxhy.saas.entity.simpleuser.SimpleUser;
import com.sxhy.saas.repo.user.SimpleUserResJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class SUserServiceImpl implements SUserService {


    @Autowired
    private SimpleUserResJpa simpleUserResJpa;

    @Override
    public boolean insertSimpleUser(SimpleUser simpleUser) {
//        SimpleUser save = simpleUserResJpa.save(simpleUser);
//        System.out.println(save.getOrderCompanyUnionId());
//        System.out.println(save.getsId());


        Example<SimpleUser> example = Example.of(simpleUser);
        Optional<SimpleUser> one = simpleUserResJpa.findOne(example);
        System.out.println(one);

        Optional<SimpleUser> byId = simpleUserResJpa.findById(2);
        System.out.println(byId);

        return false;
    }
}
