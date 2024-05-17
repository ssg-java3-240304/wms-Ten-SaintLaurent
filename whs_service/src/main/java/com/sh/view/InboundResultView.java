package com.sh.view;

import com.sh.model.dto.InboundDto;

public class InboundResultView {
    // 입고 정보 조회 출력
    public static void displayInb(InboundDto inboundDto) {
        if(inboundDto == null) {
            System.out.println("> 조회된 정보가 없습니다.");
        }
        else {
            System.out.println("----------------------------");
            System.out.println("INB_ID_PK : " + inboundDto.getInbIdPk());
            System.out.println("SEL_ID_PK : " + inboundDto.getSelIdPk());
            System.out.println("FAC_ID_PK : " + inboundDto.getFacIdPk());
            System.out.println("WHS_ID_PK : " + inboundDto.getWhsIdPk());
            System.out.println("INB_ITEM_ID_PK : " + inboundDto.getInbItemIdPk());
            System.out.println("INB_ITEM_CAT_PK : " + inboundDto.getInbItemCatPk());
            System.out.println("INB_ITEM_NM : " + inboundDto.getInbItemNM());
            System.out.println("INB_ITEM_VOL : " + inboundDto.getInbItemVol());
            System.out.println("INB_ITEM_PRICE : " + inboundDto.getInbItemPrice());
            System.out.println("INB_ITEM_CNT : " + inboundDto.getInbItemCnt());
            System.out.println("INB_ITEM_EXPIRATION_DT : " + inboundDto.getInbItemExpirationDt());
            System.out.println("----------------------------");
        }
    }
}