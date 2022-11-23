package com.teacher.sqlitedatabase;

import android.util.Log;

import java.security.MessageDigest;

public class SupportLogic {
    public static String GetHashedPassword(String password){
        return password;
/* todo
        MessageDigest md;

        try{
            md = MessageDigest.getInstance("SHA-256");

            // Add password bytes to digest
            md.update(password.getBytes());

            // Get the hash's bytes
            byte[] bytes = md.digest();

            // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            // Get complete hashed password in hex format
            return sb.toString();
        }catch (Exception ex){
            Log.d("SupportLogic", "GetHashedPassword: HasAlgorithmFailed");
        }
        return null;
        */

    }
}
