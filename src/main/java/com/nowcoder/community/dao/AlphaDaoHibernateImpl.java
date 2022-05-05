package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Ma Tengfei
 * @create 2022-05-05 16:29
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
