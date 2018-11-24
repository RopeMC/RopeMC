package de.ropemc.api.wrapper.net.minecraft.util;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.PublicKey;
import java.security.PrivateKey;
import java.security.KeyPair;
import de.ropemc.api.wrapper.WrappedClass;

@WrappedClass("net.minecraft.util.CryptManager")
public interface CryptManager {

    byte[] cipherOperation(int var0, Key var1, byte[] var2);

    Cipher createNetCipherInstance(int var0, Key var1);

    SecretKey createNewSharedKey();

    Cipher createTheCipherInstance(int var0, String var1, Key var2);

    PublicKey decodePublicKey(byte[] var0);

    byte[] decryptData(Key var0, byte[] var1);

    SecretKey decryptSharedKey(PrivateKey var0, byte[] var1);

    byte[] digestOperation(String var0, byte[][] var1);

    byte[] encryptData(Key var0, byte[] var1);

    KeyPair generateKeyPair();

    byte[] getServerIdHash(String var0, PublicKey var1, SecretKey var2);

}
