package com.ciget;

import java.util.List;

public class DataServiceImpl implements DataService {
    @Override
    public List<TaxEntity> getTaxes() {
        return List.of(new TaxEntity(10), new TaxEntity(20));
    }
}
