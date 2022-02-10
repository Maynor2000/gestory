package security;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "maynor alvarez acopa";
		byte[] nombreByte = nombre.getBytes();
		
		try {
			for(byte a:uncryp(encryp(nombreByte,"hola soy german"),"hola soy german"))System.out.print((char)a);
			
		} catch (InvalidKeyException | UnsupportedEncodingException | NoSuchAlgorithmException | NoSuchPaddingException
				| IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	private static SecretKeySpec llave(String clave) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		byte[] claveBytes = clave.getBytes("UTF-8");
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		claveBytes = md.digest(claveBytes);
		claveBytes = Arrays.copyOf(claveBytes, 16);
		SecretKeySpec key = new SecretKeySpec(claveBytes,"AES");
		
		return key;
	}
	public static byte[] encryp(byte[] message,String key) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec sks= llave(key);
		Cipher c = Cipher.getInstance("AES");
		c.init(Cipher.ENCRYPT_MODE, sks);
		byte[] messageEncryp = c.doFinal(message);

		return messageEncryp;
		
	}
	public static byte[] uncryp(byte[] message,String key) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec sks= llave(key);
		Cipher c = Cipher.getInstance("AES");
		c.init(Cipher.DECRYPT_MODE, sks);
		byte[] messageEncryp = c.doFinal(message);

		return messageEncryp;
		
	}
}
