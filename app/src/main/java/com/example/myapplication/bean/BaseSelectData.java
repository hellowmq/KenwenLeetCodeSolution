package com.example.myapplication.bean;

import com.contrarywind.interfaces.IPickerViewData;

/**
 * @author ifans.wen
 * @date 2020/4/23
 * @description
 */
public class BaseSelectData implements BaseSelectType, IPickerViewData {

    public BaseSelectData(String typeId, String value) {
        this.typeId = typeId;
        this.value = value;
    }

    String typeId;
    String value;

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getSelectType() {
        return this.typeId;
    }

    @Override
    public String getSelectValue() {
        return getValue();
    }

    @Override
    public String getPickerViewText() {
        return getValue();
    }
}
