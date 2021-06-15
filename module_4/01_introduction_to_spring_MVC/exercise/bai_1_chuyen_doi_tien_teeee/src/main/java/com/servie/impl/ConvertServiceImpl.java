package com.servie.impl;

import com.servie.IConvertService;
import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements IConvertService {
    @Override
    public int convert(int a, int b) {
        return a*b;
    }
}
