/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.records;


import com.databasir.dao.tables.SysKey;
import com.databasir.dao.tables.pojos.SysKeyPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysKeyRecord extends UpdatableRecordImpl<SysKeyRecord> implements Record6<Integer, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>databasir.sys_key.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>databasir.sys_key.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>databasir.sys_key.rsa_public_key</code>.
     */
    public void setRsaPublicKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>databasir.sys_key.rsa_public_key</code>.
     */
    public String getRsaPublicKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>databasir.sys_key.rsa_private_key</code>.
     */
    public void setRsaPrivateKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>databasir.sys_key.rsa_private_key</code>.
     */
    public String getRsaPrivateKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>databasir.sys_key.aes_key</code>.
     */
    public void setAesKey(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>databasir.sys_key.aes_key</code>.
     */
    public String getAesKey() {
        return (String) get(3);
    }

    /**
     * Setter for <code>databasir.sys_key.update_at</code>.
     */
    public void setUpdateAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>databasir.sys_key.update_at</code>.
     */
    public LocalDateTime getUpdateAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>databasir.sys_key.create_at</code>.
     */
    public void setCreateAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>databasir.sys_key.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return SysKey.SYS_KEY.ID;
    }

    @Override
    public Field<String> field2() {
        return SysKey.SYS_KEY.RSA_PUBLIC_KEY;
    }

    @Override
    public Field<String> field3() {
        return SysKey.SYS_KEY.RSA_PRIVATE_KEY;
    }

    @Override
    public Field<String> field4() {
        return SysKey.SYS_KEY.AES_KEY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SysKey.SYS_KEY.UPDATE_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SysKey.SYS_KEY.CREATE_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getRsaPublicKey();
    }

    @Override
    public String component3() {
        return getRsaPrivateKey();
    }

    @Override
    public String component4() {
        return getAesKey();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdateAt();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getRsaPublicKey();
    }

    @Override
    public String value3() {
        return getRsaPrivateKey();
    }

    @Override
    public String value4() {
        return getAesKey();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdateAt();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateAt();
    }

    @Override
    public SysKeyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SysKeyRecord value2(String value) {
        setRsaPublicKey(value);
        return this;
    }

    @Override
    public SysKeyRecord value3(String value) {
        setRsaPrivateKey(value);
        return this;
    }

    @Override
    public SysKeyRecord value4(String value) {
        setAesKey(value);
        return this;
    }

    @Override
    public SysKeyRecord value5(LocalDateTime value) {
        setUpdateAt(value);
        return this;
    }

    @Override
    public SysKeyRecord value6(LocalDateTime value) {
        setCreateAt(value);
        return this;
    }

    @Override
    public SysKeyRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysKeyRecord
     */
    public SysKeyRecord() {
        super(SysKey.SYS_KEY);
    }

    /**
     * Create a detached, initialised SysKeyRecord
     */
    public SysKeyRecord(Integer id, String rsaPublicKey, String rsaPrivateKey, String aesKey, LocalDateTime updateAt, LocalDateTime createAt) {
        super(SysKey.SYS_KEY);

        setId(id);
        setRsaPublicKey(rsaPublicKey);
        setRsaPrivateKey(rsaPrivateKey);
        setAesKey(aesKey);
        setUpdateAt(updateAt);
        setCreateAt(createAt);
    }

    /**
     * Create a detached, initialised SysKeyRecord
     */
    public SysKeyRecord(SysKeyPojo value) {
        super(SysKey.SYS_KEY);

        if (value != null) {
            setId(value.getId());
            setRsaPublicKey(value.getRsaPublicKey());
            setRsaPrivateKey(value.getRsaPrivateKey());
            setAesKey(value.getAesKey());
            setUpdateAt(value.getUpdateAt());
            setCreateAt(value.getCreateAt());
        }
    }
}
