package com.wsdjeg.mysqlvim;

import com.wsdjeg.mysqlvim.SQLUtils;

public class MysqlVi {
    public static void main(String[] args) {
        switch (args[0]) {
            case MVRequest.LOGIN:
                if (args.length==3) {
                    try {
                        SQLUtils.getConnection(args[1],args[2]);
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }else{
                    //TODO
                }
                break;
            case MVRequest.LOGOUT:
                break;
            case MVRequest.USE:
                break;
        }
    }
}