/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoad;

/**
 *
 * @author lander
 */
public class DatosConexionBD {
    
    private String FOR_NAME="com.mysql.jdbc.Driver";
    private String CONNECTION="jdbc:mysql://192.168.33.10/";
    private String USERNAME="root";
    private String PASSWORD="root";
    private String CONNECTION_SCHEMA="jdbc:mysql://192.168.33.10/proyectoAd?noAccessToProcedureBodies=true";

    public String getCONNECTION_SCHEMA() {
        return CONNECTION_SCHEMA;
    }

    public String getFOR_NAME() {
        return FOR_NAME;
    }

    public String getCONNECTION() {
        return CONNECTION;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
    
    
    
    
}// class
