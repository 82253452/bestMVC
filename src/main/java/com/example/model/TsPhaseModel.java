package com.example.model;

import com.example.entity.TsPhase;
import lombok.Data;

import java.util.List;

@Data
public class TsPhaseModel {
    private TsPhase tsPhase;
    private List<TsPhase> childrenTsPhase;
}
