/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC
 */
public class PresentacionModel {
    
    private int preId;
    private int preMuId;
    private int preObId;
    private String preFechaInicio;

    public PresentacionModel(int preId, int preMuId, int preObId, String preFechaInicio) {
        this.preId = preId;
        this.preMuId = preMuId;
        this.preObId = preObId;
        this.preFechaInicio = preFechaInicio;
    }

    public int getPreId() {
        return preId;
    }

    public int getPreMuId() {
        return preMuId;
    }

    public int getPreObId() {
        return preObId;
    }

    public String getPreFechaInicio() {
        return preFechaInicio;
    }

    public void setPreFechaInicio(String preFechaInicio) {
        this.preFechaInicio = preFechaInicio;
    }
    
}
