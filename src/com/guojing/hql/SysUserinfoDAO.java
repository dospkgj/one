package com.guojing.hql;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for SysUserinfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.guojing.hql.SysUserinfo
  * @author MyEclipse Persistence Tools 
 */

public class SysUserinfoDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(SysUserinfoDAO.class);
		//property constants
	public static final String LOGIN_NAME = "loginName";
	public static final String PASS_WORD = "passWord";
	public static final String FULL_NAME = "fullName";
	public static final String SEX = "sex";
	public static final String POWER = "power";
	public static final String STATUS = "status";
	public static final String CREATER = "creater";
	public static final String IS_ONLINE = "isOnline";
	public static final String IDCARD_NO = "idcardNo";
	public static final String WORK_TEL = "workTel";
	public static final String QQ = "qq";
	public static final String HOUSE_TEL = "houseTel";
	public static final String MOBILE_TEL = "mobileTel";
	public static final String HOUSE_ADDR = "houseAddr";
	public static final String EMAIL = "email";
	public static final String REMARKS = "remarks";
	public static final String DEFAULT01 = "default01";
	public static final String DEFAULT02 = "default02";



    
    public void save(SysUserinfo transientInstance) {
        log.debug("saving SysUserinfo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(SysUserinfo persistentInstance) {
        log.debug("deleting SysUserinfo instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public SysUserinfo findById( java.lang.String id) {
        log.debug("getting SysUserinfo instance with id: " + id);
        try {
            SysUserinfo instance = (SysUserinfo) getSession()
                    .get("com.guojing.hql.SysUserinfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List<SysUserinfo> findByExample(SysUserinfo instance) {
        log.debug("finding SysUserinfo instance by example");
        try {
            List<SysUserinfo> results = (List<SysUserinfo>) getSession()
                    .createCriteria("com.guojing.hql.SysUserinfo")
                    .add( create(instance) )
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding SysUserinfo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from SysUserinfo as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List<SysUserinfo> findByLoginName(Object loginName
	) {
		return findByProperty(LOGIN_NAME, loginName
		);
	}
	
	public List<SysUserinfo> findByPassWord(Object passWord
	) {
		return findByProperty(PASS_WORD, passWord
		);
	}
	
	public List<SysUserinfo> findByFullName(Object fullName
	) {
		return findByProperty(FULL_NAME, fullName
		);
	}
	
	public List<SysUserinfo> findBySex(Object sex
	) {
		return findByProperty(SEX, sex
		);
	}
	
	public List<SysUserinfo> findByPower(Object power
	) {
		return findByProperty(POWER, power
		);
	}
	
	public List<SysUserinfo> findByStatus(Object status
	) {
		return findByProperty(STATUS, status
		);
	}
	
	public List<SysUserinfo> findByCreater(Object creater
	) {
		return findByProperty(CREATER, creater
		);
	}
	
	public List<SysUserinfo> findByIsOnline(Object isOnline
	) {
		return findByProperty(IS_ONLINE, isOnline
		);
	}
	
	public List<SysUserinfo> findByIdcardNo(Object idcardNo
	) {
		return findByProperty(IDCARD_NO, idcardNo
		);
	}
	
	public List<SysUserinfo> findByWorkTel(Object workTel
	) {
		return findByProperty(WORK_TEL, workTel
		);
	}
	
	public List<SysUserinfo> findByQq(Object qq
	) {
		return findByProperty(QQ, qq
		);
	}
	
	public List<SysUserinfo> findByHouseTel(Object houseTel
	) {
		return findByProperty(HOUSE_TEL, houseTel
		);
	}
	
	public List<SysUserinfo> findByMobileTel(Object mobileTel
	) {
		return findByProperty(MOBILE_TEL, mobileTel
		);
	}
	
	public List<SysUserinfo> findByHouseAddr(Object houseAddr
	) {
		return findByProperty(HOUSE_ADDR, houseAddr
		);
	}
	
	public List<SysUserinfo> findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	
	public List<SysUserinfo> findByRemarks(Object remarks
	) {
		return findByProperty(REMARKS, remarks
		);
	}
	
	public List<SysUserinfo> findByDefault01(Object default01
	) {
		return findByProperty(DEFAULT01, default01
		);
	}
	
	public List<SysUserinfo> findByDefault02(Object default02
	) {
		return findByProperty(DEFAULT02, default02
		);
	}
	

	public List findAll() {
		log.debug("finding all SysUserinfo instances");
		try {
			String queryString = "from SysUserinfo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public SysUserinfo merge(SysUserinfo detachedInstance) {
        log.debug("merging SysUserinfo instance");
        try {
            SysUserinfo result = (SysUserinfo) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(SysUserinfo instance) {
        log.debug("attaching dirty SysUserinfo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(SysUserinfo instance) {
        log.debug("attaching clean SysUserinfo instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}