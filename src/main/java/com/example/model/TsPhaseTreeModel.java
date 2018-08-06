package com.example.model;

import com.example.entity.TsPhase;
import lombok.Data;

import java.util.List;

@Data
public class TsPhaseTreeModel extends TsPhase {
    private List<TsPhaseTreeModel> childrenTsPhase;
}
