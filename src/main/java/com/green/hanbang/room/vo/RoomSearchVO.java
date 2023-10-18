package com.green.hanbang.room.vo;

import lombok.Data;

@Data
public class RoomSearchVO {
    private String searchPropertyTypeCode;
    private String searchSubPropertyTypeCode;
    private int searchRoomSizePMin;
    private int searchRoomSizePMax;
    private double searchRoomSizeMMin;
    private double searchRoomSizeMMax;
    private int searchFloor;
    private String searchTradeTypeCode;
    private int searchMonthlyLeaseMax;
    private int searchDeposit;
    private int searchJeonseCost;
    private int searchMaintenanceCost;
    private String searchDetailOptions;
    private String searchAddr;

}
