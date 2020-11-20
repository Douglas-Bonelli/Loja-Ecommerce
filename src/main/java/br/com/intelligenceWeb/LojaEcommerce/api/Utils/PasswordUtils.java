package br.com.intelligenceWeb.LojaEcommerce.api.Utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	
	
	public PasswordUtils() {
	}

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);

	public static String gerarBCrypt(String senha){

		if ( senha == null ) {
	             return senha;
	        }

	        log.info("Gerando hash com o BCrypt.");
	        BCryptPasswordEncoder bCriprtEncoder = new BCryptPasswordEncoder();
	        return bCriprtEncoder.encode(senha);

	};

}
