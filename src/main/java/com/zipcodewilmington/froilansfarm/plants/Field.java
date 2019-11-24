package com.zipcodewilmington.froilansfarm.plants;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> rows;

    public Field() {
        rows = new ArrayList<>();
    }

    public void makeRow() {
        rows.add(new CropRow());
    }

    public CropRow getRow(Integer rowNum) {
        return rows.get(rowNum);
    }
    public Integer getNumOfRows(){
        return rows.size();
    }
}
