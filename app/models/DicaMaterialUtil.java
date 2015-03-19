package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Entity;

@Entity
public class DicaMaterialUtil extends Dica {

	private String urlDoMaterial;
	
	public DicaMaterialUtil() {}
	
	public DicaMaterialUtil(String url) {
		this.urlDoMaterial = url;
	}

	public String getUrlDoMaterial() {
		return urlDoMaterial;
	}

	public void setUrlDoMaterial(String urlDoMaterial) {
		this.urlDoMaterial = urlDoMaterial;
	}
	
	
//	public static final Matcher WEB  = Pattern.compile(
//			new StringBuilder()
//				.append("((?:(http|https|Http|Https|rtsp|Rtsp):")
//				.append("\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)")
//					.append("\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_")
//					.append("\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?")
//					.append("((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}\\.)+")   // named host
//					.append("(?:")   // plus top level domain
//					.append("(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])")
//					.append("|(?:biz|b[abdefghijmnorstvwyz])")
//					.append("|(?:cat|com|coop|c[acdfghiklmnoruvxyz])")
//					.append("|d[ejkmoz]")
//					.append("|(?:edu|e[cegrstu])")
//					.append("|f[ijkmor]")
//					.append("|(?:gov|g[abdefghilmnpqrstuwy])")
//					.append("|h[kmnrtu]")
//					.append("|(?:info|int|i[delmnoqrst])")
//					.append("|(?:jobs|j[emop])")
//					.append("|k[eghimnrwyz]")
//					.append("|l[abcikrstuvy]")
//					.append("|(?:mil|mobi|museum|m[acdghklmnopqrstuvwxyz])")
//					.append("|(?:name|net|n[acefgilopruz])")
//					.append("|(?:org|om)")
//					.append("|(?:pro|p[aefghklmnrstwy])")
//					.append("|qa")
//					.append("|r[eouw]")
//					.append("|s[abcdeghijklmnortuvyz]")
//					.append("|(?:tel|travel|t[cdfghjklmnoprtvwz])")
//					.append("|u[agkmsyz]")
//					.append("|v[aceginu]")
//					.append("|w[fs]")
//					.append("|y[etu]")
//					.append("|z[amw]))")
//					.append("|(?:(?:25[0-5]|2[0-4]") // or ip address
//					.append("[0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]")
//					.append("|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1]")
//					.append("[0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}")
//					.append("|[1-9][0-9]|[0-9])))")
//					.append("(?:\\:\\d{1,5})?)") // plus option port number
//					.append("(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~")  // plus option query params
//					.append("\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?")
//					.append("(?:\\b|$)").toString()
//				).matcher("");
	
	
	
//
//	public void isDicaValida(String urlDoMaterial) throws Exception{
//		if (urlDoMaterial == null) {
//			throw new Exception("Url não pode ser nulo");
//		}
//		if (urlDoMaterial.trim().equals("")) {
//			throw new Exception("Url não pode ser vazio");
//		}
////		if (WEB.matcher(url).matches()) { //Decidir o tamanho
//	//		throw new Exception("Url inválida");
//	//	}
//		this.urlDoMaterial = urlDoMaterial;
//	}

	@Override
	public int compareTo(Dica o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String exibir() {
		// TODO Auto-generated method stub
		return null;
	}

}
