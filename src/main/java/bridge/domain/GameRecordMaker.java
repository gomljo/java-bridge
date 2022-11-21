package bridge.domain;

import bridge.constant.GameRecordFormat;

import java.util.ArrayList;
import java.util.List;

public class GameRecordMaker {
    private final List<List<String>> TOTAL_RESULT;
    private final int ZERO=0;
    
    private int recordLength;

    public GameRecordMaker(){
        recordLength=ZERO;
        TOTAL_RESULT=List.of(new ArrayList<>(), new ArrayList<>());
    }
    private boolean isRecordLengthOverOne(){
        return recordLength==ZERO;
    }

}