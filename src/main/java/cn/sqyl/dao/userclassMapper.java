package cn.sqyl.dao;

import cn.sqyl.dataobject.userclass;

public interface userclassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userclass
     *
     * @mbg.generated Mon May 10 21:11:49 CST 2021
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userclass
     *
     * @mbg.generated Mon May 10 21:11:49 CST 2021
     */
    int insert(userclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userclass
     *
     * @mbg.generated Mon May 10 21:11:49 CST 2021
     */
    int insertSelective(userclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userclass
     *
     * @mbg.generated Mon May 10 21:11:49 CST 2021
     */
    userclass selectByPrimaryKey(Integer userid);
    userclass selectByUserAccount(String account);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userclass
     *
     * @mbg.generated Mon May 10 21:11:49 CST 2021
     */
    int updateByPrimaryKeySelective(userclass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userclass
     *
     * @mbg.generated Mon May 10 21:11:49 CST 2021
     */
    int updateByPrimaryKey(userclass record);


}